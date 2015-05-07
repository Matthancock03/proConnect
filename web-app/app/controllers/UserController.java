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
      boolean isConnected;
      DynamicForm requestData = Form.form().bindFromRequest();
      String messageHead = requestData.get("messageTitle");
      String messageContent = requestData.get("messageBody");
      String email = requestData.get("email");

      Logger.debug("Message Title: " + messageHead + " Message Body: " + messageContent + " Recipient email: " + email);
      UserModel user;
      UserModel sender;

      try{
      Identity userID = (Identity) ctx().args.get(SecureSocial.USER_KEY); //Gets user properties from Secure Social
      sender = UserModel.loadUserModel(userID);
      user = UserModel.loadUserModel(email);
    }catch(Exception e){
      return ok(splash.render());
    }

      message.senderId = sender.id;
      message.senderName = sender.userName;
      message.recipientId = user.id;
      message.messageTitle = messageHead;
      message.messageBody = messageContent;
      message.isRead = false;
      message.save();


      isConnected = Connection.isConnected(sender.id, user.id);

      return ok(searchedProfile.render(user, isConnected));
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

@SecureSocial.UserAwareAction
public static Result addConnection(String email){
  boolean isConnected;
  Logger.debug("Add Connection email: " + email);
    Connection connection;
    UserModel connectee;
    UserModel connector;

    try{
    Identity userID = (Identity) ctx().args.get(SecureSocial.USER_KEY); //Gets user properties from Secure Social
    connector = UserModel.loadUserModel(userID);
    connectee = UserModel.loadUserModel(email);
  }catch(Exception e){
    return ok(splash.render());
    }


    Connection connect = new Connection();
    Connection connect1 = new Connection();
    connect.userId = connector.id;
    connect.connectionId = connectee.id;
    connect1.userId = connectee.id;
    connect1.connectionId = connector.id;

    connect.save();
    connect1.save();

    isConnected = Connection.isConnected(connector.id, connectee.id);

  return ok(searchedProfile.render(connectee, isConnected));
}

@SecureSocial.UserAwareAction
public static Result removeConnection(String email){
  boolean isConnected;
  Logger.debug("Add Connection email: " + email);
    Connection connection;
    UserModel connectee;
    UserModel connector;

    try{
        Identity userID = (Identity) ctx().args.get(SecureSocial.USER_KEY); //Gets user properties from Secure Social
        connector = UserModel.loadUserModel(userID);
        connectee = UserModel.loadUserModel(email);
      }catch(Exception e){
        return ok(splash.render());
    }

      Connection.remove(connector.id, connectee.id);
      isConnected = Connection.isConnected(connector.id, connectee.id);


    /*Connection connect = new Connection();
    Connection connect1 = new Connection();
    connect.userId = connector.id;
    connect.connectionId = connectee.id;
    connect1.userId = connectee.id;
    connect1.connectionId = connector.id;

    connect.save();
    connect1.save();*/

  return ok(searchedProfile.render(connectee, isConnected));
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


public static List<UserModel> getConnections(String email){
  Logger.debug("Get Connections email: " + email);
  UserModel user;
  try{
    user = UserModel.loadUserModel(email);
    }catch(Exception e){
      List<UserModel> connects = new ArrayList();
      return connects;
    }

  List<UserModel> connections = Connection.connections(user);

  return connections;
}

public static List<UserModel> getAndroidConnections(String email){
  Logger.debug("Get Connections email: " + email);
  UserModel user;
  try{
    user = UserModel.loadUserModel(email);
    }catch(Exception e){
      List<UserModel> connects = new ArrayList();
      return connects;
    }

  List<UserModel> connections = Connection.androidConnections(user);

  return connections;
}


}
