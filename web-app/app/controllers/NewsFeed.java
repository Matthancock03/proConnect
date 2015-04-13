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
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;



public class NewsFeed extends Controller {

	public static Promise<Result> feedZilla() {
    final Promise<Result> resultPromise = WS.url("http://api.usatoday.com/open/articles/tech/home?days=0&page=0")
		.setQueryParameter("count","2" ).setQueryParameter("encoding","json" ).setQueryParameter("api_key","9hapmrud874jnvas9q8nprtr" ).get().map(
            new Function<WS.Response, Result>() {
                public Result apply(WS.Response response) {
									Logger.debug(response.getBody());
									JsonNode json = response.asJson();
									/*FeedItem feedItem = new FeedItem();
 									JsonNode rootNode = json.path("articles");
									JsonNode newNode = rootNode.path("publish_date");

									feedItem.publish_date =  json.findPath("publish_date").textValue();
							    feedItem.source = json.findPath("source").textValue();
							    feedItem.source_url = json.findPath("source_url").textValue();
							    feedItem.summary = json.findPath("summary").textValue();
							    feedItem.title = json.findPath("title").textValue();
							    feedItem.url = json.findPath("url").textValue();

									Logger.debug("rootNode = "+ json.findPath("publish_date").textValue());
									Logger.debug("idNode = "+ json.findPath("publish_date").textValue());
									*/
                    return ok(json);
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
