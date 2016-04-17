package cn.com.gridinfo.gridinfo_tch.activity.user;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.com.gridinfo.gridinfo_tch.R;
import cn.com.gridinfo.gridinfo_tch.activity.TchHomeActivity;
import cn.com.gridinfo.gridinfo_tch.activity.reg.RegisterActivity;
import cn.com.gridinfo.gridinfo_tch.adapter.GuideViewPagerAdapter;
import cn.com.gridinfo.gridinfo_tch.utils.BaseActivity;

public class GuideActivity extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.vpGuide)
    ViewPager viewPager;
    @Bind(R.id.imgIndicator0)
    ImageView pointImage0;
    @Bind(R.id.imgIndicator1)
    ImageView pointImage1;
    @Bind(R.id.imgIndicator2)
    ImageView pointImage2;
    @Bind(R.id.imgIndicator3)
    ImageView pointImage3;
    @Bind(R.id.llayoutGuide)
    LinearLayout llayoutGuide;
    private GuideViewPagerAdapter vpAdapter;
    private ArrayList<View> views;
    private View view1, view2, view3, view4;
    private TextView txtSkip;
    private Button btnLogin, btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ButterKnife.bind(this);
        initView();
        initData();
    }

    /**
     * 初始化组件
     */
    private void initView() {
        LayoutInflater mLi = LayoutInflater.from(this);
        view1 = mLi.inflate(R.layout.guide_view01, null);
        view2 = mLi.inflate(R.layout.guide_view02, null);
        view3 = mLi.inflate(R.layout.guide_view03, null);
        view4 = mLi.inflate(R.layout.guide_view04, null);

        // 实例化ArrayList对象
        views = new ArrayList<View>();
        // 实例化ViewPager适配器
        vpAdapter = new GuideViewPagerAdapter(views);
        // 实例化开始按钮
        btnLogin = (Button) view4.findViewById(R.id.btnGoToLogin);
        txtSkip = (TextView) view4.findViewById(R.id.txtSkip);
        btnRegister = (Button) view4.findViewById(R.id.btnGoToRegister);
    }

    private void initData() {
        // 设置监听
        viewPager.setOnPageChangeListener(new MyOnPageChangeListener());
        // 设置适配器数据
        viewPager.setAdapter(vpAdapter);
        // 将要分页显示的View装入数组中
        views.add(view1);
        views.add(view2);
        views.add(view3);
        views.add(view4);
        vpAdapter.notifyDataSetChanged();

        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
        txtSkip.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnGoToLogin:
                startLogin();
                break;
            case R.id.btnGoToRegister:
                startRegister();
                break;
            case R.id.txtSkip:
                startHome();
                break;
        }
    }

    public class MyOnPageChangeListener implements ViewPager.OnPageChangeListener {

        @Override
        public void onPageScrollStateChanged(int arg0) {

        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {

        }

        @Override
        public void onPageSelected(int position) {
            pointImage0.setImageDrawable(getResources().getDrawable(R.mipmap.tch_page_indicator_unfocused));
            pointImage1.setImageDrawable(getResources().getDrawable(R.mipmap.tch_page_indicator_unfocused));
            pointImage2.setImageDrawable(getResources().getDrawable(R.mipmap.tch_page_indicator_unfocused));
            pointImage3.setImageDrawable(getResources().getDrawable(R.mipmap.tch_page_indicator_unfocused));
            switch (position) {
                case 0:
                    pointImage0.setImageDrawable(getResources().getDrawable(R.mipmap.tch_page_indicator_focused));
                    break;
                case 1:
                    pointImage1.setImageDrawable(getResources().getDrawable(R.mipmap.tch_page_indicator_focused));
                    break;
                case 2:
                    pointImage2.setImageDrawable(getResources().getDrawable(R.mipmap.tch_page_indicator_focused));
                    break;
                case 3:
                    pointImage3.setImageDrawable(getResources().getDrawable(R.mipmap.tch_page_indicator_focused));
                    break;
            }
        }
    }

    /**
     * 相应按钮点击事件
     */
    private void startLogin() {
        setGuided();//设置已经引导
        openActivity(LoginActivity.class);
        finish();
    }

    private void startHome() {
        setGuided();//设置已经引导
        openActivity(TchHomeActivity.class);
        finish();
    }

    private void startRegister() {
        setGuided();//设置已经引导
        openActivity(RegisterActivity.class);
        finish();
    }

    private void setGuided() {
        saveData(this, "versionCode", getVersionCode(this));
    }
}
