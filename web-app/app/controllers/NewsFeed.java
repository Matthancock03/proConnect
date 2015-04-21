package controllers;

import play.*;
import play.mvc.*;
import play.libs.WS;
import play.mvc.Result;
import play.libs.F.Function;
import play.libs.F.Promise;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import views.html.*;
import models.FeedItem;
import play.Logger;
import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;



public class NewsFeed extends Controller {

	public static Promise<Result> feedZilla() {
    final Promise<Result> resultPromise = WS.url("http://api.feedzilla.com/v1/categories/30/articles.json")
		.setQueryParameter("count","10" ).setQueryParameter("order", "date").get().map(
            new Function<WS.Response, Result>() {
                public Result apply(WS.Response response) {
									Logger.debug(response.getBody());
									JsonNode json = response.asJson();



									List feeds = new ArrayList();
									FeedItem[] feedItems = new FeedItem[11];
									FeedItem feedItem = new FeedItem();
									FeedItem feedItem2 = new FeedItem();
									FeedItem feedItem3 = new FeedItem();
									FeedItem feedItem4 = new FeedItem();
									FeedItem feedItem5 = new FeedItem();
									FeedItem feedItem6 = new FeedItem();

 									JsonNode rootNode = json.path("articles");
									JsonNode newNode = rootNode.path("publish_date");
									int x = 0;
									for (JsonNode item : rootNode) {
										feedItems[x] = new FeedItem();
										feedItems[x].publish_date = item.get("publish_date").textValue();
										feedItems[x].source = item.get("source").textValue();
										feedItems[x].source_url = item.get("source_url").textValue();
										feedItems[x].summary = item.get("summary").textValue();
										feedItems[x].title = item.get("title").textValue();
										feedItems[x].url = item.get("url").textValue();
										feeds.add(feedItems[x]);
										x++;
										Logger.debug(item.get("publish_date").textValue());
										}



									feedItems[2].publish_date =  json.findPath("publish_date").textValue();
									feedItem2.source = json.findPath("source").textValue();
									feedItem2.source_url = json.findPath("source_url").textValue();
									feedItem2.summary = json.findPath("summary").textValue();
									feedItem2.title = json.findPath("title").textValue();
									feedItem2.url = json.findPath("url").textValue();

									feedItem3.publish_date =  json.findPath("publish_date").textValue();
									feedItem3.source = json.findPath("source").textValue();
									feedItem3.source_url = json.findPath("source_url").textValue();
									feedItem3.summary = json.findPath("summary").textValue();
									feedItem3.title = json.findPath("title").textValue();
									feedItem3.url = json.findPath("url").textValue();

									feedItem4.publish_date =  json.findPath("publish_date").textValue();
									feedItem4.source = json.findPath("source").textValue();
									feedItem4.source_url = json.findPath("source_url").textValue();
									feedItem4.summary = json.findPath("summary").textValue();
									feedItem4.title = json.findPath("title").textValue();
									feedItem4.url = json.findPath("url").textValue();

									feedItem5.publish_date =  json.findPath("publish_date").textValue();
									feedItem5.source = json.findPath("source").textValue();
									feedItem5.source_url = json.findPath("source_url").textValue();
									feedItem5.summary = json.findPath("summary").textValue();
									feedItem5.title = json.findPath("title").textValue();
									feedItem5.url = json.findPath("url").textValue();

									feedItem6.publish_date =  json.findPath("publish_date").textValue();
									feedItem6.source = json.findPath("source").textValue();
									feedItem6.source_url = json.findPath("source_url").textValue();
									feedItem6.summary = json.findPath("summary").textValue();
									feedItem6.title = json.findPath("title").textValue();
									feedItem6.url = json.findPath("url").textValue();

									feeds.add(feedItem);
									feeds.add(feedItem2);
									feeds.add(feedItem3);
									feeds.add(feedItem4);
									feeds.add(feedItem5);
									feeds.add(feedItem6);
									Logger.debug("rootNode = "+ json.findPath("publish_date").textValue());
									Logger.debug("idNode = "+ json.findPath("publish_date").textValue());

                    return ok(home.render(feeds));
                }
            }
    );
    return resultPromise;
	}

	public static Promise<JsonNode> feedTest(){
		Promise<JsonNode> jsonPromise = WS.url("http://api.feedzilla.com/v1/categories/30/articles.json").setQueryParameter("count","2" ).get().map(
        new Function<WS.Response, JsonNode>() {
            public JsonNode apply(WS.Response response) {
                JsonNode json = response.asJson();
                return json;
            }
        	}
		);
		return jsonPromise;
	}

}
