package com.codepath.apps.restclienttemplate;

import org.json.JSONException;
import org.json.JSONObject;

public class Tweet {
    public String body;
    public long vid;
    public String createdAt;
    public com.codepath.apps.restclienttemplate.User user;
  //  public String getFormattedTimestamp;


    public  static  Tweet fromJson(JSONObject jsonObject) throws JSONException {
    Tweet tweet = new Tweet();
    tweet.body = jsonObject.getString("text");
    tweet.vid = jsonObject.getLong("id");
    tweet.createdAt = jsonObject.getString("created_at");
    tweet.user = com.codepath.apps.restclienttemplate.User.fromJson(jsonObject.getJSONObject("user"));
  //  tweet.getFormattedTimestamp = TimeFormatter.getTimeDifference(tweet.createdAt);

    return tweet;
    }

}
