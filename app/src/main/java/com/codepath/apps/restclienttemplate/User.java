package com.codepath.apps.restclienttemplate;

import org.json.JSONException;
import org.json.JSONObject;

public class User {

    public String name;
    public long vid;
    public String screenName;
    public String profilImageUrl;

    public static User fromJson(JSONObject jsonObject) throws JSONException {
        User user = new User();
        user.name = jsonObject.getString("name");
        user.vid = jsonObject.getLong("id");
        user.screenName = jsonObject.getString("screen_name");
        user.profilImageUrl = jsonObject.getString("profil_image_url");

        return user;
    }
}
