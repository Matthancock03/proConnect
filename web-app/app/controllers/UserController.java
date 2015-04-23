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

/**This class extends the Controller package's functionality to allow the user access to some features.
 * @author Proconnectors
 *
 */
public class UserController extends Controller{

  /**This produces a HTTP result for when a user uploads a picture.
 * @return a 200 response that results in the picture to be uploaded.
 */
public static Result uploadPic(){
    return ok("No Picture yet");
  }

}
