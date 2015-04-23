package models;

import java.sql.Connection;
import java.sql.Statement;
import java.util.*;
import java.io.*;
import java.sql.*;
import play.db.*;


/**This class sets up aspects of the Forum module.
 * @author Proconnectors
 *
 */
public class Forum {

  public String forumId;
  public String ownerId;
  public String topicHeader;
  public String body;
  public Forum[] responses;

  /**Constructor to create a Forum.
 * 
 */
public Forum (){

  }

  /**This constructs a forum with a forum id, header, and body.
 * @param forId the id number of the selected forum
 * @param header the name of the topic header for the selected topic.
 * @param topBody the body of the selected topic in the selected forum.
 */
public Forum (String forId, String header, String topBody){
    forumId = forId;
    header = topicHeader;
    body = topBody;
  }

}
