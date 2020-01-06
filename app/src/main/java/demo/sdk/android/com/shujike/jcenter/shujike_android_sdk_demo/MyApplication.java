package demo.sdk.android.com.shujike.jcenter.shujike_android_sdk_demo;

import android.app.Application;

import com.shujike.analysis.SjkAgent;

/**
 * Created by kevin on 2017/12/8.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {

        super.onCreate();

        SjkAgent.setDebugEnabled(true);

        SjkAgent.setBaseUrl("https://t.shujike.com", "https://a.shujike.com", "ftp.shujike.com");

        SjkAgent.init(this);
    }
}