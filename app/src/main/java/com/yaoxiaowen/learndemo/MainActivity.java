package com.yaoxiaowen.learndemo;

import android.app.Activity;
import android.os.Bundle;

import com.yaoxiaowen.learndemo.util.LogUtil;

public class MainActivity extends Activity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogUtil.i(TAG, "onCreate()");
    }
}
