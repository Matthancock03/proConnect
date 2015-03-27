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

  public static Result home(){
    return ok(home.render());
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

}
