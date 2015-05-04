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
public class Application extends Controller{

/**
 * This produces a HTTP result for the about page.
 * @return a 200 response that will render the about page on the screen.
 */
  public static Result about(){
    return ok(about.render());
  }

/**This produces a HTTP result for the forum page.
 * @return a 200 response that will render the forum page on the screen.
 */
public static Result forum(){
  List<Forum> forumList = new ArrayList();
  Forum forumIt = new Forum();
  forumIt.topicHeader = "How to Prepare for an Interview";
  forumIt.body = "Interviews could be stressful. You can build confidence and ace your interview with these 7 simple and easy steps and give a great first impression to the employer.";
  forumList.add(forumIt);

    return ok(forum.render(forumList));
  }

public static Result forumItem(){
  Forum forumIt = new Forum();
  try{
    Long idNumber =  new Long(000000000001);
    forumIt = Forum.getForumItem(idNumber);
  }catch(Exception e){
  forumIt.topicHeader = "How to Prepare for an Interview";
  forumIt.body = "Interviews could be stressful. You can build confidence and ace your interview with these 7 simple and easy steps and give a great first impression to the employer.";
  }
  return ok(forumItem.render(forumIt));
}
  /**This produces a HTTP result for the connections page.
 * @return a 200 response that will render the connections page on the screen.
 */
public static Result connections(){
    return ok(connections.render());
  }

  /**This produces a HTTP result for the splash page.
 * @return a 200 response that will render the splash page on the screen.
 */
public static Result splashPage(){
    return ok(splash.render());
  }


  /**This produces a HTTP result for the help page.
 * @return a 200 response that will render the help page on the screen.
 */
public static Result help(){
    return ok(help.render());
  }

  @SecureSocial.UserAwareAction
  public static Result systemEntry(){
    Identity userID;
    try{
        userID = (Identity) ctx().args.get(SecureSocial.USER_KEY); //Gets user properties from Secure Social
        Logger.debug(userID.identityId().providerId());
    }catch(Exception e){
        return ok(splash.render());
    }
    UserModel newUserModel;

    if(userID.identityId().providerId() == "twitter"){//Checks if login method is twitter as twitter does not provide email.

    }

    newUserModel = UserModel.loadUserModel(userID);

    if(newUserModel == null){
      newUserModel = new UserModel();
     Logger.debug("UserModel Not Found");

     newUserModel.password = "";
     newUserModel.userName = userID != null ? userID.fullName() : "guest";
     newUserModel.email = userID.email().get() != null ? userID.email().get() : "No email provided";
     newUserModel.loginProvider = userID.identityId().providerId() != null ? userID.identityId().providerId() : "No provider";

     Form<UserModel> userFilled =  Form.form(UserModel.class).fill(newUserModel);
     Logger.debug("UserModel Form passed");
     Logger.debug(newUserModel.userName);
     newUserModel.save();
      return ok(profileMain.render(userFilled, newUserModel));
    }

    return DbController.editProfile();
}



  /**This produces a HTTP result for the search page.
 * @return a 200 response that will render the search page on the screen
 */
@SecureSocial.UserAwareAction
public static Result search(){
    UserModel user;
    Identity userID = (Identity) ctx().args.get(SecureSocial.USER_KEY); //Gets user properties from Secure Social
    user = UserModel.loadUserModel(userID);
    Logger.debug(user.userName);
    return ok(search.render(user));
  }

  /**This produces a HTTP result for the messages page.
 * @return a 200 response that will render the messages page on the screen.
 */
public static Result message(){
    return ok(message.render());
  }


  /**This checks to see if there is an authenticated user.
 * @return a 200 response indicating the authenticate user.
 */
   @SecureSocial.SecuredAction
   public static Result index() {
     try{
       Identity userID = (Identity) ctx().args.get(SecureSocial.USER_KEY); //Gets user properties from Secure Social
     }catch(Exception e){
         return ok(splash.render());
     }
     return ok("index.render(user)");
   }

   /**This checks to see if the current user is an authenticated user or not.
 * @return a 200 response indicating the current user's name, email, and provider.
 */
@SecureSocial.UserAwareAction
   public static Result userAware() {
       Identity user;
       try{
         user = (Identity) ctx().args.get(SecureSocial.USER_KEY); //Gets user properties from Secure Social
       }catch(Exception e){
           return ok(splash.render());
       }
       final String userName = user != null ? user.fullName() : "guest";
       final String email = user.email().get() != null ? user.email().get() : "No email provided";
       final String provider = user.identityId().providerId() != null ? user.identityId().providerId() : "No provider";
       return ok("Hello " + userName + " " + email + " " + provider);
   }

   /**This will redirect the webpage to a forbidden error.
 * @return a 200 response indicating an error.
 */
@SecureSocial.SecuredAction(ajaxCall = true)
   public static Result ajaxCall() {
       return ok("{'Matt': 'Hancock'}");
   }
}
