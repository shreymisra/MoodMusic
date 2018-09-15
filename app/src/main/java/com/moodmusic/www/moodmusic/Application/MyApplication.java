package com.moodmusic.www.moodmusic.Application;

import android.app.Application;

import com.moodmusic.www.moodmusic.Utils.DbHandler;
import com.moodmusic.www.moodmusic.Utils.Utils;

/**
 * Created by anurag on 5/10/17.
 */

public class MyApplication extends Application {
    public static MyApplication context;

    public static MyApplication getAppContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        DbHandler.initialize(this);
        Utils.initialize(this);
    }
}