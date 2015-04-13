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



public class Application extends Controller{

  public static Result about(){
    return ok(about.render());
  }

  public static Result forum(){
    return ok(forum.render());
  }
  public static Result connections(){
    return ok(connections.render());
  }
  public static Result splashPage(){
    return ok(splash.render());
  }


  public static Result help(){
    return ok(help.render());
  }

  public static Result search(){
    return ok(search.render());
  }

  @SecureSocial.SecuredAction
   public static Result index() {
       Identity user = (Identity) ctx().args.get(SecureSocial.USER_KEY);
       return ok("index.render(user)");
   }

   @SecureSocial.UserAwareAction
   public static Result userAware() {
       Identity user = (Identity) ctx().args.get(SecureSocial.USER_KEY);

       final String userName = user != null ? user.fullName() : "guest";
       final String email = user.email().get() != null ? user.email().get() : "No email provided";
       final String provider = user.identityId().providerId() != null ? user.identityId().providerId() : "No provider";
       return ok("Hello " + userName + " " + email + " " + provider);
   }

   @SecureSocial.SecuredAction(ajaxCall = true)
   public static Result ajaxCall() {
       return ok("{'Matt': 'Hancock'}");
   }
}
