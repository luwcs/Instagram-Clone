package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("0ijumOEJyYo4xXhCxpOvrcuqec9QZfqAi05JZyvx")
                .clientKey("WJ0TyT52Za1dWsYJeUmKh8PQrMFNg2MrrI0yzW4b")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
