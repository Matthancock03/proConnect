package controllers;

import play.*;
import play.mvc.*;
import play.libs.WS;
import play.mvc.Result;
import play.libs.F.Function;
import play.libs.F.Promise;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;


public class NewsFeed extends Controller {
	public static String feedUrl = "http://api.feedzilla.com/v1/categories/26/articles.json";

	public static Promise<Result> feedZilla() {
    final Promise<Result> resultPromise = WS.url("http://api.feedzilla.com/v1/categories/26/articles.json").get().map(
            new Function<WS.Response, Result>() {
                public Result apply(WS.Response response) {
                    return ok("Feed title:" + response.asJson());
                }
            }
    );
    return resultPromise;
	}

	public static Promise<JsonNode> feedTest(){
		Promise<JsonNode> jsonPromise = WS.url(feedUrl).get().map(
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