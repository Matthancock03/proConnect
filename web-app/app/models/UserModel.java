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
public class UserModel  extends Model{

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


  public String profilePicture;

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


  public static UserModel loadUserModel(Identity user){
    //this.id = user.id;
    String userEmail = user.email().get() != null ? user.email().get() : "No email provided";
    Logger.debug(userEmail);
    UserModel newUserModel = UserModel.find.where().eq("email", userEmail).findUnique();

    if(newUserModel == null){
      /*newUserModel = new UserModel();
      newUserModel.email = userEmail;
      newUserModel.userName = user != null ? user.fullName() : "Guest";
      newUserModel.loginProvider = user.identityId().providerId() != null ? user.identityId().providerId() : "No provider";
      newUserModel.save();
      Logger.debug("UserModel id: " + Long.toString(newUserModel.id));
      */
    }

    return newUserModel;
  }

  public static UserModel loadUserModel(String email){
    //this.id = user.id;
    Logger.debug("Find email: email");
    UserModel newUserModel = UserModel.find.where().eq("email", email).findUnique();

    if(newUserModel == null){
      newUserModel = new UserModel();
      /*
      newUserModel.email = userEmail;
      newUserModel.userName = user != null ? user.fullName() : "Guest";
      newUserModel.loginProvider = user.identityId().providerId() != null ? user.identityId().providerId() : "No provider";
      newUserModel.save();
      Logger.debug("UserModel id: " + Long.toString(newUserModel.id));
      */
    }

    return newUserModel;
  }


  public static void saveUserModel(UserModel user){


  }

  public static void uploadPic(){

  }

  public static Finder<Long,UserModel> find = new Finder<Long,UserModel>(
  Long.class, UserModel.class
);

}
