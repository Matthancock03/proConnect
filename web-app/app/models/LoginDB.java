package models;


import java.sql.Connection;
import java.sql.Statement;
import play.db.*;
import anorm.*;
import anorm.Sql;
import anorm.SqlParser;
import controllers.*;
import org.mindrot.jbcrypt.BCrypt;

public class LoginDB{

  URI dbUri = new URI(System.getenv("DATABASE_URL"));
  String username = dbUri.getUserInfo().split(":")[0];
  String password = dbUri.getUserInfo().split(":")[1];
  String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();
  Connection connection = DriverManager.getConnection(dbUrl, username, password);

  
}
