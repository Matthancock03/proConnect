package controllers;

import play.api.db.DB;
import anorm.Sql;
import anorm.SqlParser;
import play.*;
import play.api.libs.json.JsPath;
import play.mvc.*;
import views.formData.*;
import views.html.*;
import play.data.*;


public class DbController extends Controller{


  public static Result loginPage(){
    Form<loginFormData> formData = Form.form(loginFormData.class);
    return ok(login.render("", loginForm(), signUpForm()));
  }

  public static Form loginForm(){
    Form<loginFormData> formData = Form.form(loginFormData.class);
    return formData;
  }

  public static Form signUpForm(){
    Form<signUpFormData> formData = Form.form(signUpFormData.class);
    return formData;
  }

  public static Result loginUser(){
    Form<loginFormData> formData = Form.form(loginFormData.class).bindFromRequest();
    loginFormData user = formData.get();
    System.out.println(user.email + "  " + user.password);
    return ok("");
  }

  public static Result signUpUser(){
    Form<signUpFormData> formData = Form.form(signUpFormData.class).bindFromRequest();
    signUpFormData user = formData.get();
    System.out.println(user.email + "  " + user.password + "  " + user.passwordVerification);
    return ok("");
  }

}
