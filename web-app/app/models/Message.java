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
  public Long recipientId;
  public String messageTitle;
  public String messageBody;
  public boolean isRead;
  Timestamp tstamp;


  public List<Message> getMessageArray(String userId){

    List<Message> messageArray = find.where().eq("senderId", userId).findList();
    return messageArray;
  }

  public static Finder<Long,Message> find = new Finder<Long,Message>(
      Long.class, Message.class
    );

}
