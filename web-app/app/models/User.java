package models;

import play.data.validation.Constraints;
import play.data.*;
import securesocial.core.java.SecureSocial;
import java.sql.Connection;
import java.sql.Statement;
import java.util.*;
import java.io.*;
import java.sql.*;
import play.db.*;





public class User extends Model{


  public String id;
  public String firstName;
  public String lastName;
  public String email;
  public String loginProvider;
  public byte[] profilePicture;



  public static void loadUser(Identity user){
    //this.id = user.id;
    this.firstName = user.fullName();
    this.lastName = user.fullName();
    this.loginProvider = user.identityId().providerId();
    this.email = user.email().get();

  }

public static void uploadPic(){

}

}
