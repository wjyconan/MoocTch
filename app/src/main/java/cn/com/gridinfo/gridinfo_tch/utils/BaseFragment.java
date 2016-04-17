package cn.com.gridinfo.gridinfo_tch.utils;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.View;

import com.bigkoo.svprogresshud.SVProgressHUD;

/**
 * Created by wjy on 2016/4/16.
 */
public class BaseFragment extends Fragment {

    private SVProgressHUD mSVProgressHUD;
    private Context context;
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

    protected void showWithStatus(Context context,boolean show) {
        if (show) {
            mSVProgressHUD = new SVProgressHUD(context);
            mSVProgressHUD.showWithStatus("加载中...");
        } else if (mSVProgressHUD != null) {
            mSVProgressHUD.dismiss();
        }
    }
}
