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

  @Constraints.Required
  public String password;

  @Lob
  public byte[] profilePicture;

  public String loginProvider;
  public String secret;
  public String avatarUrl;
  public String authMethod;

  public String experience;
  public String education;
  public String projects;
  public boolean isPremium;
  //public List<String> experience = new ArrayList<String>();
  //public List<String> education = new ArrayList<String>();
  //public List<String> projects = new ArrayList<String>();


  public static UserModel loadUserModel(Identity user){
    Logger.debug("loadUserModel Identity email: " + user.email().get());
    String userEmail = user.email().get();
    UserModel newUserModel = UserModel.find.where().eq("email", userEmail).findUnique();
    Logger.debug("LoadUserModel UserModel email : " + userEmail);
    return newUserModel;
  }

  public static UserModel loadUserModel(String email){
    //this.id = user.id;
    Logger.debug("Find email: email");
    UserModel newUserModel = UserModel.find.where().eq("email", email).findUnique();

    return newUserModel;
  }

  public static List<UserModel> findByName(String name){
    List<UserModel> newUserModel = find.where().ilike("userName", "%" + name + "%").findList();
    return newUserModel;
  }


  public static Finder<Long,UserModel> find = new Finder<Long,UserModel>(
  Long.class, UserModel.class
);

}
