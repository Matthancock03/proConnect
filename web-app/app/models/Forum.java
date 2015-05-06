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

  @Lob
  public String body;
  @Lob
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

  public static void saveComment(){
    
  }

  public static void initializeForum(){

  Forum forum1 = new Forum();

  forum1.topicHeader = "How to Prepare for an Interview";
  forum1.body = "Interviews could be stressful. You can build confidence and ace your interview with these 7 simple and easy steps and give a great first impression to the employer.";
  forum1.imageUrl = "http://blog.peertransfer.com/wp-content/uploads/2013/04/Biz-Finding-A-Job-May-Mean-Getting-More-Niche.jpg";
  forum1.save();

  Forum forum2 = new Forum();
  forum2.topicHeader = "How to Get a Job With No Experience";
  forum2.body = "Having no experience for a job of your choice will not necessarily eliminate you from being a good candidate. Your dedication, communication skills, and work ethic play a big role. However, in order to stand out you will need to follow a few rules and strategies.";
  forum2.imageUrl = "http://usajobs.me/wp-content/uploads/2015/03/business-women-success.jpg";
  forum2.save();

  Forum forum3 = new Forum();
  forum3.topicHeader = "5 Tips for Choosing the Right Major";
  forum3.body = "They say choose your passion as your major and you will never have to work a day in your life. While this is true, there is more to knowing what major is right for you.";
  forum3.imageUrl = "http://collegeinformations.com/wp-content/uploads/2012/05/choosing-a-major.jpg";
  forum3.save();

  Forum forum4 = new Forum();
  forum4.topicHeader = "How to Grow your Network";
  forum4.body = "Whether you want to grow your business or get an entry job position, networking is one of the many crucial factors which you should practice like any other skill to master it.";
  forum4.imageUrl = "http://blog.nextsociety.com/wp-content/uploads/2014/09/entrepreneurship-networking-advice-1.jpg";
  forum4.save();

  Forum forum5 = new Forum();
  forum5.topicHeader = "10 Steps to Starting a Business";
  forum5.body = "Starting a business involves a lot of research, financial investment, and going through a series of legal work. These 10 steps can help you get your business started and also prepare and manage your business.";
  forum5.imageUrl = "https://media.licdn.com/mpr/mpr/p/8/005/081/32b/3e3556e.jpg";
  forum5.save();

  Forum forum6 = new Forum();
  forum6.topicHeader = "Study Tips";
  forum6.body = "Wondering why the all nighter before your final exam did not pay off and did not get you the grade you hoped for? Need to know how to study effectively? Then look no further. Any student can benefit from these tips and techniques.";
  forum6.imageUrl = "http://gomdl.com/wp-content/uploads/2013/03/Student-Studying.jpg";
  forum6.save();

  Forum forum7 = new Forum();
  forum7.topicHeader = "Beginner's Guide to Managing Your Finances";
  forum7.body = "Whether you want to admit it or not, money is a huge part of your life nowadays, thus knowing how to manage it will help you take controlof your life and get you ahead financially and socially.";
  forum7.imageUrl = "http://www.outsourcedcfo.co.za/wp-content/uploads/2014/02/financial-management.jpg";
  forum7.save();

  Forum forum8 = new Forum();
  forum8.topicHeader = "3 Ways to be More Successful";
  forum8.body = "It's human nature to desire success no matter where they are in life. However, it's easier said than done, hence not a lot of people are willing to do what is necessary to reach success.";
  forum8.imageUrl = "http://higherperspective.com/wp-content/uploads/2014/12/Successful-Business-Risk.jpg";
  forum8.save();

  Forum forum9 = new Forum();
  forum9.topicHeader = "General Discussion";
  forum9.body = "If you cannot find the forum looking for, you can either create your own forum or try this one. You can find a wide variety of topics and questions in this forum.";
  forum9.imageUrl = "https://venkyias.files.wordpress.com/2012/08/discussion1.jpg";
  forum9.save();
  }

  public static Finder<Long,Forum> find = new Finder<Long,Forum>(
    Long.class, Forum.class
  );


}
