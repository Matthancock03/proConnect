package models;


import java.sql.Connection;
import java.sql.Statement;
import java.util.*;
import java.io.*;
import java.sql.*;
import play.db.*;
import anorm.*;
import anorm.Sql;
import anorm.SqlParser;
import controllers.*;
import org.mindrot.jbcrypt.BCrypt;

/**This class allows for the login to the database.
 * @author Proconnectors
 *
 */
public class LoginDB{


  /**This function allows for the process of logging in to the database.
 * 
 */
public static void login(){

    try{
      Connection connection = DB.getConnection();
      Statement statement = connection.createStatement();
    }catch(SQLException e){
      }
  }


}
