package com.yaoxiaowen.learndemo.util;


import android.util.Log;

public class LogUtil {

    public static String PREFIX = "ywlog ";

    public static boolean DEBUG = true;

    public static void v(String TAG, String msg) {
        if (!DEBUG) return;
        Log.v(PREFIX + TAG, msg);
    }

    public static void d(String TAG, String msg) {
        if (!DEBUG) return;
        String NewTAG = PREFIX + TAG;
        Log.d(NewTAG, msg);
    }

    public static void i(String TAG, String msg) {
        Log.i(PREFIX + TAG, msg);
    }

    public static void w(String TAG, String msg) {
        Log.w(PREFIX + TAG, msg);
    }


    public static void e(String TAG, String msg) {
        Log.e(PREFIX + TAG, msg);
    }


}
