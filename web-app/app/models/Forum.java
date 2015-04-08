package models;

import java.sql.Connection;
import java.sql.Statement;
import java.util.*;
import java.io.*;
import java.sql.*;
import play.db.*;

public class Forum extends Model {

  public String forumId;
  public String ownerId;
  public String topicHeader;
  public String body;
  public Forum[] responses;

  forum (){

  }

  forum (String forId, String header, String topBody){
    this.forumId = forId;
    this.header = topicHeader;
    this.body = topBody;
  }

}
