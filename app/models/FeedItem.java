package models;

import java.sql.Connection;
import java.sql.Statement;
import java.util.*;
import java.io.*;
import java.sql.*;
import play.db.*;
import com.fasterxml.jackson.databind.JsonNode;


public class FeedItem {

  public String publish_date = "";
  public String source = "";
  public String source_url = "";
  public String summary = "";
  public String title = "";
  public String url = "";
  public String[] comments;

  public FeedItem(){

  }

  public FeedItem(JsonNode node){

  }

public static FeedItem[] getFeedArray(){
    FeedItem[] feedArray = new FeedItem[10];
    return feedArray;
  }
}