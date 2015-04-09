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

public class JBDC
{
  	private static String driver;
  	private static String url;
  	private static String username;
  	private static String password;
  	private static Connection con;
  	private static Statement stmt;
  	private static String query;
  	private static ResultSet rs = null;
	private static PreparedStatement prepareStmt;
 	
	/*
	Function to create a connection to database
	*/
	static void createConnection()
  	{
		String url = "postgres://vtzlbwlzomypny:WcZuJmUgpzHV5L_kaYFfEXjhDd@ec2-184-73-221-47.compute-1.amazonaws.com:5432/dcn8fp0jefq7ef";
		Properties props = new Properties();
		props.setProperty("user","vtzlbwlzomypny ");
		props.setProperty("password","WcZuJmUgpzHV5L_kaYFfEXjhDd");
		props.setProperty("ssl","true");
		try
		{
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, props);                  //Create the connection
			stmt = con.createStatement();                                                 //Create a statement
      	}//end try
      	catch (Exception e) 
  	    {
  	        System.out.println("Exception in main()");
  	        e.printStackTrace();
  	     }//end catch      
  	}// end createConnection
  
	/*
	Function to close the connection to database
	*/
  	static void closeConnection()
  	{
	  	try
		{
			if(rs != null)
			  	rs.close();										//Close the result set after we are done with the result set
	      	stmt.close();										//Close the statement after we are done with the statement
	      	con.close();                                        //Close the connection after we are done with everything
	  	}catch (Exception e)
	  	{
		  	System.out.println("Exception in main()");
	    	e.printStackTrace();}
  	}//end closeConnection
	
	/*
	Function for authenticating user
	*/
	static String authenticateCustID(String email, String password) 
  	{
		String actualPassword = null;
	  	try
		{
		//Check if account exists
		query = "select password from Account where account.email = " + "'" + email + "'";
	  	rs = stmt.executeQuery(query);
	  	if(!checkIfAccountExist(email))
			return "No such account";

		//Check if passwords match
	  	while(rs.next()) 
	  		actualPassword = rs.getString(1);
		
		if(password.equals(actualPassword))
			return null;
		else
			return "Wrong passowrd";
	  	}catch (SQLException e)
		{
			System.out.println("Error!");
			e.printStackTrace();}//end catch
		return null;
  	}//authenticateCustID

	static boolean createAccount(String fName, String lName, String email, String password, boolean recruiter)
  	{
	  	try
		{
			if(checkIfAccountExist(email))
				return false;
			prepareStmt = con.prepareStatement ("Insert into Account (firstname, lastname, email, password, recruiter) values (?, ?, ?, ?, ?)");
			prepareStmt.setString(1, fName);
			prepareStmt.setString(2, lName);  
			prepareStmt.setString(3, email);
			prepareStmt.setString(4, password);
			if (recruiter)	
				prepareStmt.setString(5, "Y");
			else
				prepareStmt.setString(5, "N");
			rs = prepareStmt.executeQuery();
	
		}catch (SQLException e) 
		{
			System.out.println("Error!");
			e.printStackTrace();
			return false;}//end catch
	  return true;
  }//edn createCustID
	
	static int getId (String email) 
	{
		try 
		{
			prepareStmt = con.prepareStatement("Select id from account where account.email = ?");
			prepareStmt.setString(1, email);
			rs = prepareStmt.executeQuery();
			if(rs.next())
				return rs.getInt(1);
		}catch (SQLException e) 
		{
		System.out.println("Error!");
		e.printStackTrace();}
		return 0;
	}//getID
	
	static boolean checkIfAccountExist(String email)
  	{
	  	try 
		{
			prepareStmt = con.prepareStatement("Select * from account where account.email = ?");
			prepareStmt.setString(1, email);
			rs = prepareStmt.executeQuery();
			if(rs.next())
				return true;
		}catch (SQLException e) 
		{
		System.out.println("Error!");
		e.printStackTrace();}
	  return false;
  	}//end checkIfAccountExist
	
	static boolean checkMember (int forumid, int id)
	{
		try 
		{			
			prepareStmt = con.prepareStatement("Select * from forummember where forummember.forumid = ? AND forummember.memberid = ? ");
			prepareStmt.setInt(1, forumid);
			prepareStmt.setInt(2, id);
			rs = prepareStmt.executeQuery();
			
			if(rs.next())
				return true;
		}catch (SQLException e) 
		{
		System.out.println("Error!");
		e.printStackTrace();}
	  return false;
	}//checkMember
	
	static boolean createForum (int host, String forumName)
	{
		try 
		{
			//Creating a new forum
			prepareStmt = con.prepareStatement("select forumid from NEW TABLE (Insert into forum (forumname, hostid) values (?, ?))");
			prepareStmt.setString(1, forumName);
			prepareStmt.setInt(2, host);
			rs = prepareStmt.executeQuery();
			
			//Adding host user into the created forum
			prepareStmt = con.prepareStatement("Insert into forumMember (forumid, memberid) values (?, ?)");
			prepareStmt.setInt(1, rs.getInt(1));
			prepareStmt.setInt(2, host);
			rs = prepareStmt.executeQuery();
	
		}catch (SQLException e) 
		{
		System.out.println("Error!");
		e.printStackTrace();
		return false;}
	  return true;
	}//createForum
	
	static boolean addMember (int forumid, int member)
	{
		try 
		{			
			if(checkMember(forumid, member))
				return false;
			//Adding host user into the created forum
			prepareStmt = con.prepareStatement("Insert into forumMember (forumid, memberid) values (?, ?)");
			prepareStmt.setInt(1, forumid);
			prepareStmt.setInt(2, member);
			rs = prepareStmt.executeQuery();
		}catch (SQLException e) 
		{
		System.out.println("Error!");
		e.printStackTrace();
		return false;}//end catch
	  return true;
	}//addMember
	
}//JBDC class
