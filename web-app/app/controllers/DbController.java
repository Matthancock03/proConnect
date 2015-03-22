package controllers;


import play.*;
import play.api.libs.json.JsPath;
import play.mvc.*;
import views.formData.*;
import views.html.*;
import play.data.*;
import play.Logger;


public class DbController extends Controller{


  public static Result loginPage(){
    Form<loginFormData> loginFormData = Form.form(loginFormData.class);
    Form<signUpFormData> signUpFormData = Form.form(signUpFormData.class);

    return ok(login.render("", loginFormData, signUpFormData));
  }

  public static Result loginUser(){
    Form<loginFormData> formData = Form.form(loginFormData.class).bindFromRequest();
    loginFormData user = formData.get();
    //Logger.debug(user.email + "  " + user.password);
    return ok("Logged In!");
  }

  public static Result signUpUser(){
    Form<signUpFormData> formData = Form.form(signUpFormData.class).bindFromRequest();
    signUpFormData user = formData.get();
    //Logger.debug(user.email + "  " + user.password + "  " + user.passwordVerification);
    return ok("Registered!");
  }

}
