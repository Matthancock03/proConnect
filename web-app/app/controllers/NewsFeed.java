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
import models.*;
import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.Logger;
import securesocial.core.*;
import securesocial.*;
import securesocial.core.java.SecureSocial;



/**This class allows for the NewsFeed to be created and implemented.
 * @author Proconnectors
 *
 */
public class NewsFeed extends Controller {

	/** This grabs the data and creates the homeFeed from that data.
	 * @return a promise<Result> that will allow the homeFeed to be constructed without blocking
	 */
	@SecureSocial.UserAwareAction
	public static Promise<Result> homeFeed() {
    final Promise<Result> resultPromise = WS.url("http://api.usatoday.com/open/articles/topnews/tech?api_key=9hapmrud874jnvas9q8nprtr")
		.setQueryParameter("count","20" ).setQueryParameter("encoding", "json")
		.setQueryParameter("days", "7").setQueryParameter("api_key", "9hapmrud874jnvas9q8nprtr").get().map(
            new Function<WS.Response, Result>() {
                public Result apply(WS.Response response) {
									JsonNode json = response.asJson();
									List feeds = new ArrayList();
									FeedItem[] feedItems = new FeedItem[21];
 									JsonNode rootNode = json.path("stories");
 									UserModel user = new UserModel();

									int x = 0;
									for (JsonNode item : rootNode) { //Loads results from api call to JsonNode. Stores in FeedItem
										feedItems[x] = new FeedItem();
										feedItems[x].publish_date = item.get("pubDate").textValue();
										feedItems[x].source = item.get("link").textValue();
										feedItems[x].source_url = item.get("link").textValue();
										feedItems[x].summary = item.get("description").textValue();
										feedItems[x].title = item.get("title").textValue();
										feedItems[x].url = item.get("link").textValue();
										feeds.add(feedItems[x]);
										x++;
										//Logger.debug(item.get("pubDate").textValue());
										}


 									try{
 									Identity userID = (Identity) ctx().args.get(SecureSocial.USER_KEY); //Gets user properties from Secure Social
									user = UserModel.loadUserModel(userID);
									user.save();                              //Loads user values into UserModel model.
									} catch (Exception e){
										return ok(splash.render());

									}

                    return ok(home.render(feeds, user));
                }
            }
    );
    return resultPromise;
	}

	/**This tests the homeFeed method.
	 * @return a Promise<JsonNode> that will construct the test without blocking.
	 */
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
