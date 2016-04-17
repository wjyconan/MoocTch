package cn.com.gridinfo.gridinfo_tch.activity.user;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import cn.com.gridinfo.gridinfo_tch.R;
import cn.com.gridinfo.gridinfo_tch.utils.BaseActivity;

public class LoadingActivity extends BaseActivity {

    private final Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = View.inflate(this, R.layout.activity_loading, null);
        setContentView(view);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
        view.startAnimation(animation);
        SkipListener listener = new SkipListener();
        animation.setAnimationListener(listener);
    }

    private void goLogin() {
        openActivity(LoginActivity.class);
        finish();
    }

    private void goGuide() {
        openActivity(GuideActivity.class);
        finish();
    }

    private void isFirstEnter() {
        if ("".equals(loadData(this, "versionCode")) || !getVersionCode(this).equals(loadData(this, "versionCode"))) {
            goGuide();
        } else {
            goLogin();
        }
    }

    private class SkipListener implements Animation.AnimationListener {

        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {
            mHandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    isFirstEnter();
                }
            }, 100);
        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    }
}
