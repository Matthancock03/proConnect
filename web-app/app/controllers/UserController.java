package controllers;

import play.*;
import play.api.libs.json.JsPath;
import play.mvc.*;
import play.data.Form;
import views.html.*;
import plugins.*;
import models.*;
import play.Logger;
import securesocial.core.*;
import securesocial.*;
import securesocial.core.java.SecureSocial;
import java.util.*;

/**
 * This class extends the Controller class functionality to route webpages within the application.
 * @author Proconnectors
 *
 */
public class UserController extends Controller{

@SecureSocial.UserAwareAction
public static Result sendMessage(){

      UserModel user;

      Identity userID = (Identity) ctx().args.get(SecureSocial.USER_KEY); //Gets user properties from Secure Social
      Logger.debug("sendMessage Identity name: " + userID.fullName());
      Logger.debug("sendMessage Identity email: " + userID.email().get());

      user = UserModel.loadUserModel(userID);
      Logger.debug("sendMessage After Load User: " + user.userName);
                                   //Loads user values into UserModel model.
      return ok(profileEdit.render(user));
}

public static Result searchUser(String name){
  List<UserModel> user = UserModel.findByName(name);

    if(user == null){
      user = new ArrayList();
    }

  return ok("User Found");
}

public static Result premiumSearchUser(String name){
    List<UserModel> user = UserModel.findByName(name);

    if(user == null){
      user = new ArrayList();
    }

  return ok("User Found");
}


}
