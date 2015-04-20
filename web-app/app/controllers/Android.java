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
import play.mvc.BodyParser;
import play.libs.Json;
import play.libs.Json.*;
import java.util.*;
import static play.libs.Json.toJson;
import org.json.JSONArray;
import org.json.JSONObject;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.databind.JsonNode;
import play.mvc.Result;
import play.libs.F.Function;
import play.libs.F.Promise;
import models.FeedItem;

public class Android extends Controller{
  @BodyParser.Of(BodyParser.Json.class)
  public static Result androidLogin(String name, String password) {
    ObjectNode result = Json.newObject();

        if(name == "denied" || name != ""){
          result.put("Accepted", "False");
        }else{
          result.put("Accepted", "True");
        }
        return ok(result);
  }

  public static Result androidCreateAccount(String name, String password){

    ObjectNode result = Json.newObject();
    if(name == "denied" || name != ""){
      result.put("Accepted", "False");
    }else{
      result.put("Accepted", "True");
    }
    return ok(result);
  }

}