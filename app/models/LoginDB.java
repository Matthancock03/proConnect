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

public class LoginDB{


  public static void login(){

    try{
      Connection connection = DB.getConnection();
      Statement statement = connection.createStatement();
    }catch(SQLException e){
      }
  }


}
