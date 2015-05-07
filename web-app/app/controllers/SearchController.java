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
    String skill = requestData.get("skill");
    String profession = requestData.get("profession");
    String queryName = requestData.get("searchParameter");

    if(skill != null && skill.equals("true")){
      return searchBySkill(queryName);
    }


    if(profession != null && profession.equals("true")){
      return searchByProfession(queryName);
    }

    Logger.debug("Search Bind Results: " + queryName);
    List<UserModel> users = UserModel.findByName(queryName);
    return ok(search.render(users));
  }

  public static Result jobSearch(){


      DynamicForm requestData = Form.form().bindFromRequest();
      String company = requestData.get("company");
      String industry = requestData.get("industry");
      String queryName = requestData.get("searchParameter");

      if(company != null && company.equals("true")){
        return searchByCompany(queryName);
      }


      if(industry != null && industry.equals("true")){
        return searchByIndustry(queryName);
      }

      Logger.debug("Search Bind Results: " + queryName);
      List<UserModel> users = UserModel.findByName(queryName);
      return ok(search.render(users));
    }

  public static Result searchByProfession(String queryName){
    List<UserModel> users = UserModel.findByName(queryName);

    return ok("Search By Profession");
  }

  public static Result searchBySkill(String queryName){
    List<UserModel> users = UserModel.findByName(queryName);

    return ok("Search By Skill");
  }

  public static Result searchByCompany(String queryName){
    List<UserModel> users = UserModel.findByName(queryName);

    return ok("Search By Company");
  }

  public static Result searchByIndustry(String queryName){
    List<UserModel> users = UserModel.findByName(queryName);

    return ok("Search By Industry");
  }

  @SecureSocial.UserAwareAction
  public static Result loadSearchedProfile(String email){
    boolean isConnected;
    Identity userID;

    try{
        userID = (Identity) ctx().args.get(SecureSocial.USER_KEY); //Gets user properties from Secure Social
        Logger.debug(userID.identityId().providerId());
    }catch(Exception e){
        return ok(splash.render());
    }

    UserModel temp = UserModel.loadUserModel(userID);
    UserModel user = UserModel.loadUserModel(email);
    isConnected = Connection.isConnected(temp.id, user.id);
    Logger.debug("Load Searched Profile " + isConnected);

    return ok(searchedProfile.render(user, isConnected));
  }

  @SecureSocial.UserAwareAction
  public static Result loadProfile(Long id){
    boolean isConnected;
    Identity userID;

    try{
        userID = (Identity) ctx().args.get(SecureSocial.USER_KEY); //Gets user properties from Secure Social
        Logger.debug(userID.identityId().providerId());
    }catch(Exception e){
        return ok(splash.render());
    }
    UserModel temp = UserModel.loadUserModel(userID);
    UserModel user = UserModel.loadUserById(id);
    isConnected = Connection.isConnected(temp.id, id);

    return ok(searchedProfile.render(user, isConnected));
  }

}
