package models;

import play.data.validation.Constraints;
import play.data.*;
import securesocial.core.java.SecureSocial;
import scala.Option;
import securesocial.core.*;
import securesocial.*;
import securesocial.core.java.SecureSocial;
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
import views.html.*;



@Entity
public class Connection extends Model{

  @Id
  public Long connectId;
  public Long userId;
  public Long connectionId;

  @SecureSocial.UserAwareAction
  public static List<UserModel> connections(UserModel user){

    List<UserModel> connects = new ArrayList();
    List<Connection> connectionIds = Connection.find.where().eq("userId", user.id).findList();

    for(Connection connect: connectionIds){
      UserModel tempUserModel = UserModel.loadUserById(connect.connectionId);
      connects.add(tempUserModel);
    }

    return connects;
  }


  public static List<UserModel> androidConnections(UserModel user){

    List<UserModel> connects = new ArrayList();
    List<Connection> connectionIds = Connection.find.where().eq("userId", user.id).findList();

    for(Connection connect: connectionIds){
      UserModel tempUserModel = UserModel.loadUserById(connect.connectionId);
      connects.add(tempUserModel);
    }

    return connects;
  }

  public static boolean isConnected(Long id1, Long id2){
    Connection connect1 = Connection.find.where().eq("userId", id1).eq("connectionId", id2).findUnique();
    Connection connect2 = Connection.find.where().eq("userId", id2).eq("connectionId", id1).findUnique();


    if(connect1 == null && connect2 == null){
      return false;
    }
    return true;
  }

  public static void remove(Long id1, Long id2){
    Connection connect1 = Connection.find.where().eq("userId", id1).eq("connectionId", id2).findUnique();
    Connection connect2 = Connection.find.where().eq("userId", id2).eq("connectionId", id1).findUnique();


    if(connect1 != null){
      connect1.delete();
    }

    if(connect2 != null){
      connect2.delete();
    }

  }

  public static Finder<Long,Connection> find = new Finder<Long,Connection>(
  Long.class, Connection.class
);

}
