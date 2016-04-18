package cn.com.gridinfo.gridinfo_tch;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by wjy on 2016/3/15.
 */
public class GridinfoApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
