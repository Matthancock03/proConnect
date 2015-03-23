package models;


import java.sql.Connection;
import java.sql.Statement;
import play.db.*;
import anorm.*;
import anorm.Sql;
import java.sql.DriverManager;
import anorm.SqlParser;
import controllers.*;
import org.mindrot.jbcrypt.BCrypt;
import java.net.*;

public class LoginDB{

  public static void getConnection(){

    try{
    URI dbUri = new URI(System.getenv("DATABASE_URL"));
    String username = dbUri.getUserInfo().split(":")[0];
    String password = dbUri.getUserInfo().split(":")[1];
    String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();
    Connection connection = DriverManager.getConnection(dbUrl, username, password);
    } catch (Exception ex) {
            //Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
        }

  }
}
