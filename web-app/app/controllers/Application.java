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
    return ok(forum.render());
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
    JDBC jdbc = new JDBC();
    jdbc.createConnection();
    return ok(splash.render());
  }


  /**This produces a HTTP result for the help page.
 * @return a 200 response that will render the help page on the screen.
 */
public static Result help(){
    return ok(help.render());
  }

  /**This produces a HTTP result for the search page.
 * @return a 200 response that will render the search page on the screen
 */
public static Result search(){
    return ok(search.render());
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
       Identity user = (Identity) ctx().args.get(SecureSocial.USER_KEY);
       return ok("index.render(user)");
   }

   /**This checks to see if the current user is an authenticated user or not.
 * @return a 200 response indicating the current user's name, email, and provider.
 */
@SecureSocial.UserAwareAction
   public static Result userAware() {
       Identity user = (Identity) ctx().args.get(SecureSocial.USER_KEY);

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
