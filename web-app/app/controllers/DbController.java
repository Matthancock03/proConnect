package controllers;


import play.*;
import play.api.libs.json.JsPath;
import play.mvc.*;
import views.html.*;
import play.data.*;
import play.Logger;
import securesocial.core.*;
import securesocial.*;
import securesocial.core.java.SecureSocial;
import play.mvc.BodyParser;
import play.libs.Json;
import play.libs.Json.*;
import java.util.*;
import static play.libs.Json.toJson;
import org.json.JSONArray;
import org.json.JSONObject;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.databind.JsonNode;
import play.mvc.Result;
import models.*;
import play.libs.F.Function;
import play.libs.F.Promise;
import play.libs.WS;
import play.mvc.Http.MultipartFormData.*;
import play.mvc.Http.*;
import java.io.File;
import java.nio.file.Files;



/**This class extends the Controller package's functionality to allow the database controller to access the information stored in the database.
 * @author Proconnectors
 *
e  */
public class DbController extends Controller{

  @SecureSocial.UserAwareAction
  public static Result editProfile(){
    UserModel user;
    Identity userID = (Identity) ctx().args.get(SecureSocial.USER_KEY); //Gets user properties from Secure Social
    user = UserModel.loadUserModel(userID);
    Logger.debug(user.userName);                              //Loads user values into UserModel model.

    return ok(profileEdit.render(user));
  }


  @SecureSocial.UserAwareAction
  public static Result profileMain(){
    UserModel user;
   Form<UserModel> userForm = Form.form(UserModel.class);
   Identity userID;

   try{
       userID = (Identity) ctx().args.get(SecureSocial.USER_KEY); //Gets user properties from Secure Social
       Logger.debug(userID.identityId().providerId());
   }catch(Exception e){
       return ok(splash.render());
   }

   user = UserModel.loadUserModel(userID);
   Form<UserModel> userFilled =  Form.form(UserModel.class).fill(user);
    return ok(profileMain.render(userFilled,user));
  }

  @SecureSocial.UserAwareAction
  public static Promise<Result>  saveUser(){ // Saves user submission from editProfile page
    Form<UserModel> user = Form.form(UserModel.class);
    UserModel userData = user.bindFromRequest().get();
    UserModel dbUserModel = UserModel.loadUserModel(userData.email);

    /*Logger.debug("Form Name " + userData.userName );
    Logger.debug("Form Email " + userData.email );
    Logger.debug("Form Password: " + dbUserModel.password);
    Logger.debug( "Save UserModel id: " +  Long.toString(userData.id));
    Logger.debug( "DbUserModel id: " +  Long.toString(dbUserModel.id));
*/

    try{
  MultipartFormData body = request().body().asMultipartFormData();
  MultipartFormData.FilePart picture = body.getFile("profilePicture");
    if (picture != null) {
      String fileName = picture.getFilename();
      String contentType = picture.getContentType();
      File file = picture.getFile();
      dbUserModel.profilePicture = com.google.common.io.Files.toByteArray(file);
      Logger.debug("Image captured!");
    } else {
      Logger.debug("Unable to capture image.");
    }
  }catch(Exception e){
    Logger.debug("Form Error.");
  }


    Logger.debug("Before Merge: " + dbUserModel.password);
    Logger.debug( "Save UserModel id: " +  Long.toString(userData.id));
    Logger.debug( "DbUserModel id: " +  Long.toString(dbUserModel.id));
    mergeResults(dbUserModel,userData);
    Logger.debug("After Merge: " + dbUserModel.userName);
    dbUserModel.update();

    final Promise<Result> resultPromise = WS.url("http://api.usatoday.com/open/articles/topnews/tech?api_key=9hapmrud874jnvas9q8nprtr")
		.setQueryParameter("count","20" ).setQueryParameter("encoding", "json")
		.setQueryParameter("days", "7").setQueryParameter("api_key", "9hapmrud874jnvas9q8nprtr").get().map(
            new Function<WS.Response, Result>() {
                public Result apply(WS.Response response) {

									JsonNode json = response.asJson();
									List feeds = new ArrayList();
									FeedItem[] feedItems = new FeedItem[21];
 									JsonNode rootNode = json.path("stories");
 									UserModel user = new UserModel();

									int x = 0;
									for (JsonNode item : rootNode) { //Loads results from api call to JsonNode. Stores in FeedItem
										feedItems[x] = new FeedItem();
										feedItems[x].publish_date = item.get("pubDate").textValue();
										feedItems[x].source = item.get("link").textValue();
										feedItems[x].source_url = item.get("link").textValue();
										feedItems[x].summary = item.get("description").textValue();
										feedItems[x].title = item.get("title").textValue();
										feedItems[x].url = item.get("link").textValue();
										feeds.add(feedItems[x]);
										x++;
										//Logger.debug(item.get("pubDate").textValue());
										}


                    return ok(home.render(feeds, dbUserModel));
                }
            }
    );
    return resultPromise;
	}

  public static Result getFormData(){
    Form<UserModel> user = Form.form(UserModel.class);
    UserModel userData = user.bindFromRequest().get();
    return ok("Form Sucessful");
  }

  public static Result getProfilePic(String email){
    UserModel user = UserModel.loadUserModel(email);
    return ok(user.profilePicture);
  }

    private static void mergeResults(UserModel out, UserModel in){ // Merges Form submission with current UserModel
      out.userName = in.userName;
      out.experience = in.experience;
      out.education = in.education;
      out.projects = in.projects;
      out.aboutMe = in.aboutMe;
      out.recentSchool = in.recentSchool;
      out.currentEmployer = in.currentEmployer;
      out.location = in.location;
      out.password = in.password;

    }
}
