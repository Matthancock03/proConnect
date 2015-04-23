package models;

import java.sql.Connection;
import java.sql.Statement;
import java.util.*;
import java.io.*;
import java.sql.*;
import play.db.*;
import com.fasterxml.jackson.databind.JsonNode;


/**This class creates FeedItems for use with the NewsFeed.
 * @author Proconnectors
 *
 */

public class FeedItem {

  public String publish_date = "";
  public String source = "";
  public String source_url = "";
  public String summary = "";
  public String title = "";
  public String url = "";
  public String[] comments;

  /**Constructor to create a FeedItem.
 * 
 */
public FeedItem(){

  }

  /**Constructor to create a FeedItem via Json.
 * @param node a JsonNode that points to a specific feed item.
 */
public FeedItem(JsonNode node){

  }

/**Gets FeedItems for the feedArray.
 * @return an array called feedArray with 10 items.
 */
public static FeedItem[] getFeedArray(){
    FeedItem[] feedArray = new FeedItem[10];
    return feedArray;
  }
}
