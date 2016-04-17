package cn.com.gridinfo.gridinfo_tch.utils;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

import com.bigkoo.svprogresshud.SVProgressHUD;

import static android.content.SharedPreferences.Editor;

/**
 * Created by wjy on 2016/3/15.
 */
public class BaseActivity extends AppCompatActivity {

    private SVProgressHUD mSVProgressHUD;

    public void show(boolean show) {
        mSVProgressHUD.show();
    }

    public void showWithMaskType(SVProgressHUD.SVProgressHUDMaskType type) {
        mSVProgressHUD.showWithMaskType(type);
//        mSVProgressHUD.showWithMaskType(SVProgressHUD.SVProgressHUDMaskType.Black);
//        mSVProgressHUD.showWithMaskType(SVProgressHUD.SVProgressHUDMaskType.BlackCancel);
//        mSVProgressHUD.showWithMaskType(SVProgressHUD.SVProgressHUDMaskType.Clear);
//        mSVProgressHUD.showWithMaskType(SVProgressHUD.SVProgressHUDMaskType.ClearCancel);
//        mSVProgressHUD.showWithMaskType(SVProgressHUD.SVProgressHUDMaskType.Gradient);
//        mSVProgressHUD.showWithMaskType(SVProgressHUD.SVProgressHUDMaskType.GradientCancel);
    }

    protected void showWithStatus(boolean show) {
        if (show) {
            mSVProgressHUD = new SVProgressHUD(this);
            mSVProgressHUD.showWithStatus("加载中...");
        } else if (mSVProgressHUD != null) {
            mSVProgressHUD.dismiss();
        }
    }

    protected void showInfoWithStatus(boolean show, String str) {
        if (show) {
            mSVProgressHUD = new SVProgressHUD(this);
            mSVProgressHUD.showInfoWithStatus(str, SVProgressHUD.SVProgressHUDMaskType.None);
        } else if (mSVProgressHUD != null) {
            mSVProgressHUD.dismiss();
        }
    }

    public void showSuccessWithStatus(boolean show) {
        if (show) {
            mSVProgressHUD = new SVProgressHUD(this);
            mSVProgressHUD.showSuccessWithStatus("恭喜，提交成功！");
        } else if (mSVProgressHUD != null) {
            mSVProgressHUD.dismiss();
        }
    }

    public void showErrorWithStatus(boolean show, String str) {
        if (show) {
            mSVProgressHUD = new SVProgressHUD(this);
            mSVProgressHUD.showErrorWithStatus(str, SVProgressHUD.SVProgressHUDMaskType.GradientCancel);
        } else if (mSVProgressHUD != null) {
            mSVProgressHUD.dismiss();
        }
    }

    private int progress = 0;
    private final Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            progress = progress + 5;
            if (mSVProgressHUD.getProgressBar().getMax() != mSVProgressHUD.getProgressBar().getProgress()) {
                mSVProgressHUD.getProgressBar().setProgress(progress);
                mSVProgressHUD.setText("进度 " + progress + "%");

                mHandler.sendEmptyMessageDelayed(0, 500);
            } else {
                mSVProgressHUD.dismiss();
            }

        }
    };

    public void showWithProgress(boolean show) {
        progress = 0;
        mSVProgressHUD.getProgressBar().setProgress(progress);//先重设了进度再显示，避免下次再show会先显示上一次的进度位置所以要先将进度归0
        mSVProgressHUD.showWithProgress("进度 " + progress + "%", SVProgressHUD.SVProgressHUDMaskType.Black);
        mHandler.sendEmptyMessageDelayed(0, 500);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
            if (mSVProgressHUD != null && mSVProgressHUD.isShowing()) {
                mSVProgressHUD.dismiss();
                mHandler.removeCallbacksAndMessages(null);
                return false;
            }
        }

        return super.onKeyDown(keyCode, event);

    }

    protected void showLongToast(String pMsg) {
        Toast.makeText(this, pMsg, Toast.LENGTH_LONG).show();
    }

    protected void showShortToast(String pMsg) {
        Toast.makeText(this, pMsg, Toast.LENGTH_SHORT).show();
    }

    protected void openActivity(Class<?> pClass) {
        openActivity(pClass, null);
    }

    private void openActivity(Class<?> pClass, Bundle pBundle) {
        Intent intent = new Intent(this, pClass);
        if (pBundle != null) {
            intent.putExtras(pBundle);
        }
        startActivity(intent);
    }

    protected String loadData(Context context, String key) {
        SharedPreferences sp = context.getSharedPreferences("config", MODE_PRIVATE);
        return sp.getString(key, "");
    }

    protected void saveData(Context context, String key, String value) {
        SharedPreferences sp = context.getSharedPreferences("config", MODE_PRIVATE);
        Editor editor = sp.edit();
        editor.putString(key, value);
        editor.apply();
    }

    //获取版本号(内部识别号)
    protected String getVersionCode(Context context) {
        try {
            PackageInfo pi = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return pi.versionCode + "";
        } catch (PackageManager.NameNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "";
        }
    }

    // 隐藏键盘
    protected void hintKb(EditText editText) {
        InputMethodManager inputMethodManager = (InputMethodManager) this.getApplicationContext().
                getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0); //隐藏
    }

    // SnackBar 显示错误信息
    protected void showErrorMsg(View view, String msg) {
        showErrorMsg(view, msg, null, null);
    }

    protected void showErrorMsg(View view, String msg, int action, View.OnClickListener listener) {
        Snackbar.make(view, msg, Snackbar.LENGTH_LONG).setAction(action, listener).show();
    }

    protected void showErrorMsg(View view, String msg, String action, View.OnClickListener listener) {
        Snackbar.make(view, msg, Snackbar.LENGTH_LONG).setAction(action, listener).show();
    }

}
