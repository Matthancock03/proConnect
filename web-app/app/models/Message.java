package models;

import play.data.validation.Constraints;
import play.data.*;
import securesocial.core.java.SecureSocial;
import scala.Option;
import securesocial.core.Identity;
import securesocial.core.IdentityId;
import securesocial.core.java.BaseUserService;
import java.sql.Connection;
import java.sql.Statement;
import java.util.*;
import java.io.*;
import java.sql.*;
import play.db.*;
import java.util.*;
import javax.persistence.*;
import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.db.ebean.Model.Finder;
import play.Logger;

@Entity
public class Message extends Model {

  @Id
  public Long messageId;
  public Long senderId;
  public String senderName;
  public Long recipientId;
  public String messageTitle;
  @Lob
  public String messageBody;
  public boolean isRead;

  @Version
  public java.util.Date tstamp;



  public static List<Message> getMessageArray(Long userId){
    Logger.debug("Get Message Array User Id: " + userId);
    List<Message> messageArray = find.where().eq("recipientId", userId).findList();
    return messageArray;
  }

  public static List<Message> getAndroidMessageArray(Long userId){
    Logger.debug("Get Message Array User Id: " + userId);
    List<Message> messageArray = find.where().eq("recipientId", userId).findList();
    return messageArray;
  }

  public static List<Message> getSentMessages(Long userId){
    Logger.debug("Get Sent Message User Id: " + userId);
    List<Message> messageArray = find.where().eq("senderId", userId).findList();
    return messageArray;
  }

  public static Message findMessage(Long messageId){

    Message messageArray = find.where().eq("messageId", messageId).findUnique();
    return messageArray;
  }




  public static Finder<Long,Message> find = new Finder<Long,Message>(
      Long.class, Message.class
    );

}
