package cn.com.gridinfo.gridinfo_tch.activity.reg;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TextInputEditText;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.com.gridinfo.gridinfo_tch.R;
import cn.com.gridinfo.gridinfo_tch.bean.RegistInfo;
import cn.com.gridinfo.gridinfo_tch.bean.StatusReturn;
import cn.com.gridinfo.gridinfo_tch.utils.BaseActivity;
import cn.com.gridinfo.gridinfo_tch.utils.Http;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends BaseActivity {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.editPhoneNumber)
    TextInputEditText editPhoneNumber;
    @Bind(R.id.editInputCode)
    TextInputEditText editInputCode;
    @Bind(R.id.editPsw)
    TextInputEditText editPsw;
    @Bind(R.id.editRealname)
    EditText editRealname;
    @Bind(R.id.btnSendCode)
    Button btnSendCode;
    @Bind(R.id.parent)
    CoordinatorLayout parent;

    private TimeCount count;
    private String phoneNum;
    private String code;
    private String psw;
    private String realname;
    private final String type = "register";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);

        initView();
        initAllListener();
    }

    private void initAllListener() {
        toBack();
    }

    private void toBack() {
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initView() {
        toolbar.setNavigationIcon(R.mipmap.toolbar_back);
        setSupportActionBar(toolbar);
    }

    @OnClick({R.id.btnSendCode, R.id.btnCommit})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnSendCode:
                count = new TimeCount(60000, 1000);
                hintKb(editPhoneNumber);
                if (checkPhoneNum()) {
                    httpSendCode(phoneNum);
                }
                break;
            case R.id.btnCommit:
                hintKb(editRealname);
                if (checkPhoneNum() && checkCode() && checkPsw() && checkRealname()) {
                    httpCheckCode();
                }
                break;
        }
    }

    //验证码验证
    private void httpCheckCode() {
        Http.HTTPCON.checkCode(phoneNum, code, type, Http.TOKEN).enqueue(new Callback<StatusReturn>() {
            @Override
            public void onResponse(Call<StatusReturn> call, Response<StatusReturn> response) {
                if (response.body().getRet() == 0) {
                    httpReg();
                } else {
                    showErrorMsg(parent, response.body().getMsg());
                }
            }

            @Override
            public void onFailure(Call<StatusReturn> call, Throwable t) {
                showErrorMsg(parent, t.toString(), R.string.snackbar_retry, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        httpCheckCode();
                    }
                });
            }
        });
    }

    //注册
    private void httpReg() {
        Http.HTTPCON.getRegistInfo(Http.IDENTITYTYPE, psw, realname, phoneNum, null).enqueue(new Callback<RegistInfo>() {
            @Override
            public void onResponse(Call<RegistInfo> call, Response<RegistInfo> response) {
                if (response.body().getRet() == 0) {
                    Toast.makeText(RegisterActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
                } else {
                    showErrorMsg(parent, response.body().getMsg());
                }
            }

            @Override
            public void onFailure(Call<RegistInfo> call, Throwable t) {
                showErrorMsg(parent, t.toString(), R.string.snackbar_retry, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        httpReg();
                    }
                });
            }
        });
    }

    //发送验证码
    private void httpSendCode(final String phoneNum) {
        Http.HTTPCON.sendCode(phoneNum, type, Http.TOKEN).enqueue(new Callback<StatusReturn>() {
            @Override
            public void onResponse(Call<StatusReturn> call, Response<StatusReturn> response) {
                if (response.body().getRet() == 0) {
                    count.start();
                } else {
                    showErrorMsg(parent, response.body().getMsg());
                }
            }

            @Override
            public void onFailure(Call<StatusReturn> call, Throwable t) {
                showErrorMsg(parent, t.toString(), R.string.snackbar_retry, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        httpSendCode(phoneNum);
                    }
                });
            }
        });
    }

    //检查手机号是否合法
    private boolean checkPhoneNum() {
        String codeRule = "^0?(13|15|18|14|17)[0-9]{9}$";
        phoneNum = editPhoneNumber.getText().toString();
        if ("".equals(phoneNum)) {
            showErrorMsg(parent, "手机号不能为空");
            return false;
        } else {
            if (Pattern.compile(codeRule).matcher(phoneNum).matches()) {
                return true;
            } else {
                showErrorMsg(parent, "手机号不合法，请重新输入");
                return false;
            }
        }
    }

    //检查验证码是否合法
    private boolean checkCode() {
        code = editInputCode.getText().toString();
        if ("".equals(code)) {
            showErrorMsg(parent, "验证码不能为空");
            return false;
        } else {
            return true;
        }
    }

    //检查密码是否合法
    private boolean checkPsw() {
        psw = editPsw.getText().toString();
        if ("".equals(psw)) {
            showErrorMsg(parent, "密码不能为空");
            return false;
        } else if ((psw.length() < 6)) {
            showErrorMsg(parent, "密码长度不能小于6位");
            return false;
        } else {
            return true;
        }

    }

    //检查真实姓名是否合法
    private boolean checkRealname() {
        realname = editRealname.getText().toString();
        if ("".equals(realname)) {
            showErrorMsg(parent, "真实姓名不能为空");
            return false;
        } else if (realname.length() < 2) {
            showErrorMsg(parent, "真实姓名长度为2-30位");
            return false;
        } else if (Pattern.compile("^[a-z;A-Z]+$").matcher(realname).matches() ||
                Pattern.compile("^[\\u4e00-\\u9fa5]+$").matcher(realname).matches()) {
            return true;
        } else {
            showErrorMsg(parent, "真实姓名只能全为汉字或全为英文");
            return false;
        }
    }

    class TimeCount extends CountDownTimer {
        public TimeCount(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onFinish() {// 计时完毕
            btnSendCode.setText(R.string.register_get_code);
            btnSendCode.setClickable(true);
        }

        @Override
        public void onTick(long millisUntilFinished) {// 计时过程
            btnSendCode.setClickable(false);//防止重复点击
            String str = millisUntilFinished / 1000 + "s";
            btnSendCode.setText(str);
        }
    }
}
