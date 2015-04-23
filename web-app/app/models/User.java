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






/**This class represents all aspects of a user.
 * @author Proconnectors
 *
 */
public class User{


//  public String id;
  public String firstName;
  public String lastName;
  public String userName;
  public String email;

  public String loginProvider;
  //public String token;
  public String secret;
  public String avatarUrl;
  public String authMethod;
//
  public String[] experience;
  public String[] education;
  public String[] projects;
  public String location;
  public String aboutMe;
  public byte[] profilePicture;



<<<<<<< HEAD
  public static User loadUser(Identity user){
=======
  /**Function to load details of the selected user.
 * @param user user is the selected user
 */
public void loadUser(Identity user){
>>>>>>> c67e7ddcf9a2dab5e48727619297c7ebd963d42c
    //this.id = user.id;
    User newUser = new User();
    newUser.userName = user != null ? user.fullName() : "guest";
    newUser.loginProvider = user.identityId().providerId() != null ? user.identityId().providerId() : "No provider";
    newUser.email = user.email().get() != null ? user.email().get() : "No email provided";
    return newUser;
  }

  /**Function to upload a picture for a user.
 * 
 */
public static void uploadPic(){

  }

}
