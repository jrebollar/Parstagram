package com.example.parstagram;

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
                .applicationId("lv7R0WNiGoSOUZQdkKz5CrMFytchGBLuDgPIOfMJ")
                .clientKey("NTGfQA8sAcRwHeNlw7vpluUtHACm8tnVRr69pQgS")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}