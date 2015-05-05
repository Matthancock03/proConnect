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

  public static void initializeForum(){

  Forum forum1 = new Forum();
  
  forum1.topicHeader = "How to Prepare for an Interview";
  forum1.body = "Interviews could be stressful. You can build confidence and ace your interview with these 7 simple and easy steps and give a great first impression to the employer.";
  forum1.imageUrl = "http://blog.peertransfer.com/wp-content/uploads/2013/04/Biz-Finding-A-Job-May-Mean-Getting-More-Niche.jpg";
  forum1.save();
  }

}
