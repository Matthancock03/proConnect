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
import static play.libs.Json.toJson;
import org.json.JSONArray;
import org.json.JSONObject;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.databind.JsonNode;
import play.mvc.Result;
import play.libs.F.Function;
import play.libs.F.Promise;
import models.FeedItem;


public class DbController extends Controller{

  public static Result editProfile(){

    return ok(profileEdit.render());
  }

  //@SecureSocial.SecuredAction
  public static Result home(){
    Promise<JsonNode> feedNode = NewsFeed.feedTest();
    FeedItem feedItem = new FeedItem();
    //JsonNode feed = feedNode.get(100000);
    
    return ok(home.render(feedItem));
  }

  @BodyParser.Of(BodyParser.Json.class)
  public static Result androidLogin(String name, String password) {

      ObjectNode result = Json.newObject();
        if(name != ""){
          result.put("Accepted", "True");
        }else{
          result.put("Accepted", "False");
        }
        return ok(result);
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
