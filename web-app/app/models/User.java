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
public class User extends Model{

  @Id
  public long id;

  @Version
  public java.util.Date version;

  public String userName;

  @Constraints.Required
  @Column(unique=true)
  public String email;

  public String currentEmployer;
  public String recentSchool;
  public String location;
  public String aboutMe;

  @Lob
  public byte[] profilePicture;

  public String loginProvider;
  public String secret;
  public String avatarUrl;
  public String authMethod;

  public String experience;
  public String education;
  public String projects;
  //public List<String> experience = new ArrayList<String>();
  //public List<String> education = new ArrayList<String>();
  //public List<String> projects = new ArrayList<String>();


  public static User loadUser(Identity user){
    //this.id = user.id;
    String userEmail = user.email().get() != null ? user.email().get() : "No email provided";
    Logger.debug(userEmail);
    User newUser = User.find.where().eq("email", userEmail).findUnique();

    if(newUser == null){
      /*newUser = new User();
      newUser.email = userEmail;
      newUser.userName = user != null ? user.fullName() : "Guest";
      newUser.loginProvider = user.identityId().providerId() != null ? user.identityId().providerId() : "No provider";
      newUser.save();
      Logger.debug("User id: " + Long.toString(newUser.id));
      */
    }

    return newUser;
  }

  public static User loadUser(String email){
    //this.id = user.id;
    Logger.debug("Find email: email");
    User newUser = User.find.where().eq("email", email).findUnique();

    if(newUser == null){
      newUser = new User();
      /*
      newUser.email = userEmail;
      newUser.userName = user != null ? user.fullName() : "Guest";
      newUser.loginProvider = user.identityId().providerId() != null ? user.identityId().providerId() : "No provider";
      newUser.save();
      Logger.debug("User id: " + Long.toString(newUser.id));
      */
    }

    return newUser;
  }


  public static void saveUser(User user){


  }

  public static void uploadPic(){

  }

  public static Finder<Long,User> find = new Finder<Long,User>(
  Long.class, User.class
);

}
