package demo.sdk.android.com.shujike.jcenter.shujike_android_sdk_demo;

import android.app.Application;
import android.os.Build;
import android.widget.Toast;

import com.shujike.analysis.SjkAgent;

public class MyApplication extends Application {
    @Override
    public void onCreate() {

        super.onCreate();

        SjkAgent.setDebugEnabled(true);

        SjkAgent.setBaseUrl("https://t.shujike.com", "https://a.shujike.com", "ftp.shujike.com");

        SjkAgent.init(this);
    }
}