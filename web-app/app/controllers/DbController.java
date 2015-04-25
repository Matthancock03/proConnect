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




/**This class extends the Controller package's functionality to allow the database controller to access the information stored in the database.
 * @author Proconnectors
 *
 */
public class DbController extends Controller{

  @SecureSocial.UserAwareAction
  public static Result editProfile(){
    User user = new User();
              try{
                  Identity userID = (Identity) ctx().args.get(SecureSocial.USER_KEY); //Gets user properties from Secure Social
                  user = User.loadUser(userID);
                  Logger.debug(user.userName);                              //Loads user values into User model.
                  } catch (Exception e){
                    Logger.debug("Null Pointer");
                  }
    return ok(profileEdit.render(user));
  }
  @SecureSocial.UserAwareAction
  public static Result profileMain(){
    User user = new User();
    Form<User> userForm = Form.form(User.class);

              try{
                  Identity userID = (Identity) ctx().args.get(SecureSocial.USER_KEY); //Gets user properties from Secure Social
                  user = User.loadUser(userID);
                  Form<User> userFilled =  Form.form(User.class).fill(user);
                  Logger.debug("User Form passed");
                  Logger.debug(user.userName);
                  Logger.debug(userForm.field("userName").value());
                  return ok(profileMain.render(userFilled));                             //Loads user values into User model.
                  } catch (Exception e){
                    Logger.debug("Null Pointer");
                  }

    return ok(profileMain.render(userForm));
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
