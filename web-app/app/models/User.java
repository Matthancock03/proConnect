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






public class User{


  public String id;
  public String firstName;
  public String lastName;
  public String email;
  public String loginProvider;
  public byte[] profilePicture;



  public void loadUser(Identity user){
    //this.id = user.id;
    firstName = user.fullName();
    lastName = user.fullName();
    loginProvider = user.identityId().providerId();
    email = user.email().get();

  }

public static void uploadPic(){

}

}
