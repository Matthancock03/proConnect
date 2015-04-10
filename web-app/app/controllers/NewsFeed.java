package controllers;

import play.*;
import play.mvc.*;
import play.libs.WS;
import play.mvc.Result;

import static play.libs.F.Function;
import static play.libs.F.Promise;
import play.mvc.BodyParser;
import play.libs.Json;
import play.libs.Json.*;
import static play.libs.Json.toJson;
import org.json.JSONArray;
import org.json.JSONObject;
import com.fasterxml.jackson.databind.node.*;

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

}