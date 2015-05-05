package controllers;

import play.*;
import play.api.libs.json.JsPath;
import play.mvc.*;
import play.data.*;
import views.html.*;
import plugins.*;
import models.*;
import play.Logger;
import securesocial.core.*;
import securesocial.*;
import securesocial.core.java.SecureSocial;
import java.util.*;

/**
 * This class extends the Controller class functionality to route webpages within the application.
 * @author Proconnectors
 *
 */
public class MessageController extends Controller{

  @SecureSocial.UserAwareAction
  public static Result message(){
    Identity userID;
    UserModel user;
    try{
      userID = (Identity) ctx().args.get(SecureSocial.USER_KEY); //Gets user properties from Secure Social
      user = UserModel.loadUserModel(userID);
    }catch(Exception e){
        return ok(splash.render());
    }

    List<Message> messages = Message.getMessageArray(user.id);
      return ok(message.render(messages));
    }

    @SecureSocial.UserAwareAction
    public static Result sentMessages(){
      Identity userID;
      UserModel user;
      try{
        userID = (Identity) ctx().args.get(SecureSocial.USER_KEY); //Gets user properties from Secure Social
        user = UserModel.loadUserModel(userID);
      }catch(Exception e){
          return ok(splash.render());
      }

      List<Message> messages = Message.getSentMessages(user.id);
        return ok(message.render(messages));
      }

    @SecureSocial.UserAwareAction
    public static Result deleteMessage(Long id){
      Logger.debug("Delete Message Id: " + id);
      Message messageD = Message.findMessage(id);
      messageD.delete();

      Identity userID;
      UserModel user;
      try{
            userID = (Identity) ctx().args.get(SecureSocial.USER_KEY); //Gets user properties from Secure Social
            user = UserModel.loadUserModel(userID);
          }catch(Exception e){
              return ok(splash.render());
          }
      List<Message> messages = Message.getMessageArray(user.id);
        return ok(message.render(messages));
      }


}
