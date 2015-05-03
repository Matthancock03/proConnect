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
import java.util.*;
import javax.persistence.*;
import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.db.ebean.Model.Finder;



@Entity
public class Forum extends Model{

  @Id
  public Long   forumId;
  public String subId;
  public String ownerId;
  public String topicHeader;
  public String body;
  public String imageUrl;
  Timestamp cretimestamp;

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
public Forum (String header, String topBody){
    header = topicHeader;
    body = topBody;
  }

  public static List<Forum> getForumArray(){

    List<Forum> forumArray = Forum.find.all();
    return forumArray;
  }
  public static Forum getForumItem(Long id){

    Forum forumIt = Forum.find.where().eq("forumId",id).findUnique();
    return forumIt;
  }

  public static Finder<Long,Forum> find = new Finder<Long,Forum>(
    Long.class, Forum.class
  );

}
