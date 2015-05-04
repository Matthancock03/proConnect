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
public class UserController extends Controller{

@SecureSocial.UserAwareAction
public static Result sendMessage(){

      Message message = new Message();
      DynamicForm requestData = Form.form().bindFromRequest();
      String messageHead = requestData.get("messageTitle");
      String messageContent = requestData.get("messageBody");
      String email = requestData.get("email");

      Logger.debug("Message Title: " + messageHead + " Message Body: " + messageContent + " Recipient email: " + email);
      UserModel user;
      UserModel sender;
      Identity userID = (Identity) ctx().args.get(SecureSocial.USER_KEY); //Gets user properties from Secure Social
      sender = UserModel.loadUserModel(userID);
      user = UserModel.loadUserModel(email);

      message.senderId = sender.id;
      message.recipientId = user.id;
      message.messageTitle = messageHead;
      message.messageBody = messageContent;
      message.isRead = false;
      message.save();

      return ok(searchedProfile.render(user));
}

@SecureSocial.UserAwareAction
public static Result replyMessage(){

      Message mess = new Message();
      DynamicForm requestData = Form.form().bindFromRequest();
      String messageHead = requestData.get("messageTitle");
      String messageContent = requestData.get("messageBody");

      UserModel sender;
      try{
      Identity userID = (Identity) ctx().args.get(SecureSocial.USER_KEY); //Gets user properties from Secure Social
      sender = UserModel.loadUserModel(userID);
      }catch(Exception e){
        return ok(splash.render());
      }

      /*String id = requestData.get("id");
      Long recipientId = Long.valueOf(String s).longValue(id);

      Logger.debug("Message Title: " + messageHead + " Message Body: " + messageContent + " Recipient email: " + email);

      message.senderId = sender.id;
      message.recipientId = recipientId;
      message.messageTitle = messageHead;
      message.messageBody = messageContent;
      message.isRead = false;
      message.save();
      */
        List<Message> messages = Message.getMessageArray(sender.id);
        return ok(message.render(messages));
}

public static Result searchUser(String name){
  List<UserModel> user = UserModel.findByName(name);

    if(user == null){
      user = new ArrayList();
    }

  return ok("User Found");
}

public static Result premiumSearchUser(String name){
    List<UserModel> user = UserModel.findByName(name);

    if(user == null){
      user = new ArrayList();
    }

  return ok("User Found");
}


}
