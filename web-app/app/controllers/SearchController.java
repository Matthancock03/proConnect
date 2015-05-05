package controllers;

import play.*;
import play.api.libs.json.JsPath;
import play.mvc.*;
import play.data.Form;
import play.data.*;
import views.html.*;
import plugins.*;
import models.*;
import play.Logger;
import securesocial.core.*;
import securesocial.*;
import securesocial.core.java.SecureSocial;
import java.util.*;

public class SearchController extends Controller{

  /**This produces a HTTP result for the search page.
 * @return a 200 response that will render the search page on the screen
 */
public static Result search(){
    DynamicForm requestData = Form.form().bindFromRequest();
    String queryName = requestData.get("searchParameter");
    Logger.debug("Search Bind Results: " + queryName);
    List<UserModel> users = UserModel.findByName(queryName);

    return ok(search.render(users));
  }

  public static Result loadSearchedProfile(String email){
    UserModel user = UserModel.loadUserModel(email);
    return ok(searchedProfile.render(user));
  }

  public static Result loadProfile(Long id){
    UserModel user = UserModel.loadUserById(id);
    return ok(searchedProfile.render(user));
  }

}
