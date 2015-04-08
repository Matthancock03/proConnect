package models;

import java.sql.Connection;
import java.sql.Statement;
import java.util.*;
import java.io.*;
import java.sql.*;
import play.db.*;


public class Forum {

  public String forumId;
  public String ownerId;
  public String topicHeader;
  public String body;
  public Forum[] responses;

  public Forum (){

  }

  public Forum (String forId, String header, String topBody){
    forumId = forId;
    header = topicHeader;
    body = topBody;
  }

}
