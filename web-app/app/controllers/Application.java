package controllers;

import com.fasterxml.jackson.databind.node.*;
import play.*;
import play.api.libs.json.JsPath;
import play.mvc.*;
import play.libs.Json;
import play.data.Form;
import views.html.*;
import java.util.*;
import models.*;
import play.Logger;
import play.libs.EventSource;


public class Application extends Controller{


  public static Result register(){
    return ok("Registered!");
  }

  public static Result login(){


    return ok("Logged In!");
  }


}
