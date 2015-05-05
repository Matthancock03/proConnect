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
import play.libs.F.Function;
import play.libs.F.Promise;
import models.*;

/**This class extends the Controller class functionality to allow the Android application to authenticate users.
 * @author Proconnectors
 *
 */
public class Android extends Controller{

  /**
   * This checks login information for the android platform typed in by the user.
 * @param name the name of the user attempting to login
 * @param password the password of the user attempting to login
 * @return an 200 response that will display if a user logged in successfully.
 */
  @BodyParser.Of(BodyParser.Json.class)
  public static Result androidLogin(String email, String password) {
    ObjectNode result = Json.newObject();

        UserModel user = UserModel.loadUserModel(email);

            if(user == null){
              result.put("Rejected", "User Not Found");
              return ok(result);
            }
            Logger.debug(user.password + " url: " + password );

            if(user.password.equals(password)){
            JsonNode jsonUser = Json.toJson(user);
            Logger.debug(user.password + " url: " + password );
            return ok(jsonUser);
          }else{
            result.put("Rejected", "Invalid Password");
            }

        return ok(result);
  }

  @BodyParser.Of(BodyParser.Json.class)
  public static Result androidSaveUser() {
    JsonNode json = request().body().asJson();
    if(json == null) {
        return ok("Bind Failed");
    }

    String email = json.get("email").textValue();
    UserModel user;
    try{
      user = UserModel.loadUserModel(email);
      user.userName = json.get("userName").textValue();
      user.currentEmployer = json.get("currentEmployer").textValue();
      user.recentSchool = json.get("recentSchool").textValue();
      user.headline = json.get("headline").textValue();
      user.location = json.get("location").textValue();
      user.aboutMe = json.get("aboutMe").textValue();
      user.experience = json.get("experience").textValue();
      user.projects = json.get("projects").textValue();
      user.education = json.get("education").textValue();
      user.creditCard = json.get("creditCard").textValue();
      user.save();
    }catch(Exception e){
      return ok("Save Failed. Invalid data.");
    }
catch (Exception e){
  System.out.println("Exception");

<<<<<<< HEAD
}
    user.userName = json.get("userName").textValue();


=======
>>>>>>> b3a22e47a1a7935bbebab4765ffc738bee4e6801
   return ok("Bind Sucessful");
  }


  /**This creates a HTTP response in regards to creating a new account on the Android platform.
 * @param name the name of the user
 * @param password the password of the user
 * @return a 200 response that will allow for the account to be created or not
 */
public static Result androidCreateAccount(String email, String password){

    UserModel user = UserModel.loadUserModel(email);
    ObjectNode result = Json.newObject();
    if(user != null){
      result.put("Rejected", "User Exists");
    }else{
      user = new UserModel();
      user.email = email;
      user.password = password;
      user.save();
      result.put("Accepted", "Account Created");
    }
    return ok(result);
  }

}
