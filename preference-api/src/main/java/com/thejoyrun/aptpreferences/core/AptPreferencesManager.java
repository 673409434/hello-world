package com.thejoyrun.aptpreferences.core;

import android.content.Context;

import com.thejoyrun.aptpreferences.AptParser;

public final class AptPreferencesManager {
    private static Context sContext;

    private static AptParser sAptParser;

    private static String sUserInfo;

    public static void init(Context context, AptParser aptParser) {
        sContext = context;
        sAptParser = aptParser;
    }

    public static Context getContext() {
        return sContext;
    }

    public static AptParser getAptParser() {
        return sAptParser;
    }

    public static void setUserInfo(String userInfo) {
        sUserInfo = userInfo;
    }

    public static String getUserInfo() {
        return sUserInfo;
    }
}
