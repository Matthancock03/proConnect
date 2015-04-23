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




public class DbController extends Controller{

  public static Result editProfile(){

    return ok(profileEdit.render());
  }

  public static Result profileMain(){

    return ok(profileMain.render());
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
