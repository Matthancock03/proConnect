package controllers;

import play.api.db.DB;
import anorm.Sql;
import anorm.SqlParser;
import play.api.Play.current;
import sun.rmi.runtime.Log;
import org.mindrot.jbcrypt.BCrypt;
import play.*;
import play.api.libs.json.JsPath;
import play.mvc.*;
import views.formData.*;
import views.html.*;

public class DbController extends Controller{

  public static Result loginForm(){
    Form<loginFormData> formData = Form.form(loginFormData.class);
    return ok(login.render(formData));
  }

  public static Result loginUser(){
    Form<loginFormData> formData = Form.form(loginFormData.class).bindFromRequest();
    loginFormData user = formData.get();
    System.out.println(user.email + "  " + user.password);
    return ok(login.render(formData));
  }

  public static Result signUpForm(){
    Form<signUpFormData> formData = Form.form(signUpFormData.class);
    return ok(login.render(formData));
  }

  public static Result signUpUser(){
    Form<signUpFormData> formData = Form.form(signUpFormData.class).bindFromRequest();
    signUpFormData user = formData.get();
    System.out.println(user.email + "  " + user.password + "  " + user.passwordVerification);
    return ok(login.render(formData));
  }

}
