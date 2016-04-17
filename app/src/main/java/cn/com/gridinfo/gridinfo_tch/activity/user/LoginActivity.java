package cn.com.gridinfo.gridinfo_tch.activity.user;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.view.View;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import cn.com.gridinfo.gridinfo_tch.R;
import cn.com.gridinfo.gridinfo_tch.activity.TchHomeActivity;
import cn.com.gridinfo.gridinfo_tch.activity.reg.RegisterActivity;
import cn.com.gridinfo.gridinfo_tch.bean.LoginInfo;
import cn.com.gridinfo.gridinfo_tch.utils.BaseActivity;
import cn.com.gridinfo.gridinfo_tch.utils.Http;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LoginActivity extends BaseActivity {


    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.editAccount)
    TextInputEditText editAccount;
    @Bind(R.id.editPsw)
    TextInputEditText editPsw;
    @Bind(R.id.parent)
    CoordinatorLayout parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        initView();
        initAllListener();
    }

    private void initAllListener() {
        toBack();
    }

    private void initView() {
        toolbar.setNavigationIcon(R.mipmap.toolbar_back);
        setSupportActionBar(toolbar);

        editAccount.setText(loadData(this, "loginAccount"));
        editPsw.setText(loadData(this, "password"));
    }

    // 返回键
    private void toBack() {
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                showSuccessWithStatus(true);
                finish();
//                showWithStatus(true);
            }
        });
    }

    // 登录网络请求
    private void httpLogin() {
        Http.HTTPCON.toLogin(editAccount.getText().toString(), editPsw.getText().toString(),
                Http.CLIENT_ID, Http.CLIENT_SECRET, Http.TOKEN).enqueue(new Callback<LoginInfo>() {
            @Override
            public void onResponse(Call<LoginInfo> call, Response<LoginInfo> response) {
                if (response.body().getRet() == 0) {
                    Toast.makeText(LoginActivity.this, "登录成功!", Toast.LENGTH_SHORT).show();
                    saveData(LoginActivity.this, "loginAccount", editAccount.getText().toString());
                    saveData(LoginActivity.this, "password", editPsw.getText().toString());
                    Http.TOKEN = response.body().getAccess_token();
                    showWithStatus(false);
                    openActivity(TchHomeActivity.class);
                    finish();
                } else {
                    String msg = response.body().getMsg();
                    showErrorMsg(msg);
                }
            }

            @Override
            public void onFailure(Call<LoginInfo> call, Throwable t) {
                showErrorMsg(t.toString());
            }
        });
    }

    // 密码是否显示监听事件
    @OnCheckedChanged(R.id.scShowPsw)
    void isShowPsw(boolean Checked) {
        if (Checked) {
            editPsw.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
        } else {
            editPsw.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        }
    }

    // SnackBar 显示错误信息
    private void showErrorMsg(String msg) {
        Snackbar.make(parent, msg, Snackbar.LENGTH_LONG)
                .setAction(getString(R.string.snackbar_retry), new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        httpLogin();
                    }
                }).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }

    @OnClick({R.id.btnLogin, R.id.btnReg, R.id.txtForgetPsw, R.id.txtWeChatLogin, R.id.txtQQLogin, R.id.txtSinaLogin})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnLogin:
                showWithStatus(true);
                hintKb(editPsw);
                httpLogin();
                break;
            case R.id.txtForgetPsw:
                break;
            case R.id.txtWeChatLogin:
                break;
            case R.id.txtQQLogin:
                break;
            case R.id.txtSinaLogin:
                break;
            case R.id.btnReg:
                openActivity(RegisterActivity.class);
                break;
        }
    }
}
