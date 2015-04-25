package controllers;


import play.*;
import play.api.libs.json.JsPath;
import play.mvc.*;
import views.formData.*;
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




/**This class extends the Controller package's functionality to allow the database controller to access the information stored in the database.
 * @author Proconnectors
 *
 */
public class DbController extends Controller{

  @SecureSocial.UserAwareAction
  public static Result editProfile(){
    User user = new User();

    Identity userID = (Identity) ctx().args.get(SecureSocial.USER_KEY); //Gets user properties from Secure Social
    user = User.loadUser(userID);
    Logger.debug(user.userName);                              //Loads user values into User model.

    return ok(profileEdit.render(user));
  }
  @SecureSocial.UserAwareAction
  public static Result profileMain(){
    User user = new User();
    Form<User> userForm = Form.form(User.class);


   Identity userID = (Identity) ctx().args.get(SecureSocial.USER_KEY); //Gets user properties from Secure Social
   user = User.loadUser(userID);
   Form<User> userFilled =  Form.form(User.class).fill(user);
   Logger.debug("User Form passed");
   Logger.debug(user.userName);

    return ok(profileMain.render(userFilled));
  }

  @SecureSocial.UserAwareAction
  public static Promise<Result>  saveUser(){
    Form<User> user = Form.form(User.class);
    User userData = user.bindFromRequest().get();
    Logger.debug("User Form Bind Sucessful");
    Logger.debug(userData.userName);
    userData.save();

    final Promise<Result> resultPromise = WS.url("http://api.usatoday.com/open/articles/topnews/tech?api_key=9hapmrud874jnvas9q8nprtr")
		.setQueryParameter("count","20" ).setQueryParameter("encoding", "json")
		.setQueryParameter("days", "7").setQueryParameter("api_key", "9hapmrud874jnvas9q8nprtr").get().map(
            new Function<WS.Response, Result>() {
                public Result apply(WS.Response response) {

									JsonNode json = response.asJson();
									List feeds = new ArrayList();
									FeedItem[] feedItems = new FeedItem[21];
 									JsonNode rootNode = json.path("stories");
 									User user = new User();

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


 									try{
 									Identity userID = (Identity) ctx().args.get(SecureSocial.USER_KEY); //Gets user properties from Secure Social
									user = User.loadUser(userID);                                  //Loads user values into User model.
									} catch (Exception e){
										Logger.debug("Null Pointer homeFeed");

									}
									/*String userName = userID != null ? userID.fullName() : "guest";
									Logger.debug(userName);
									*/

                    return ok(home.render(feeds, user));
                }
            }
    );
    return resultPromise;
	}

  public static Result getFormData(){
    Form<User> user = Form.form(User.class);
    User userData = user.bindFromRequest().get();
    return ok("Form Sucessful");
  }
  /*public static Result loginUser(){
      Form<loginFormData> formData = Form.form(loginFormData.class).bindFromRequest();
      if (formData.hasErrors()) {
        Form<loginFormData> loginFormData = Form.form(loginFormData.class);
        Form<signUpFormData> signUpFormData = Form.form(signUpFormData.class);
        return badRequest(login.render("Ensure fields are filled correctly", loginFormData, signUpFormData));
    } else {
        loginFormData user = formData.get();
        //Logger.debug(user.email + "  " + user.password);
        return ok(home.render());
    }
  }
    public static Result loginPage(){
      Form<loginFormData> loginFormData = Form.form(loginFormData.class);
      Form<signUpFormData> signUpFormData = Form.form(signUpFormData.class);
      return ok(login.render("", loginFormData, signUpFormData));
    }
  public static Result signUpUser(){
      Form<signUpFormData> formData = Form.form(signUpFormData.class).bindFromRequest();
      if (formData.hasErrors()) {
        Form<loginFormData> loginFormData = Form.form(loginFormData.class);
        Form<signUpFormData> signUpFormData = Form.form(signUpFormData.class);
        return badRequest(login.render("Ensure fields are filled correctly", loginFormData, signUpFormData));
    } else {
      signUpFormData user = formData.get();
      //Logger.debug(user.email + "  " + user.password + "  " + user.passwordVerification);
      return ok("Registered!");
    }
  }
  */
}
