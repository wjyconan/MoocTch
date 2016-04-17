package cn.com.gridinfo.gridinfo_tch.activity;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.com.gridinfo.gridinfo_tch.R;
import cn.com.gridinfo.gridinfo_tch.fragment.HomeFragment;
import cn.com.gridinfo.gridinfo_tch.utils.BaseActivity;

public class TchHomeActivity extends BaseActivity implements HomeFragment.OnFragmentInteractionListener {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.flayout)
    FrameLayout flayout;
    @Bind(R.id.txtHome)
    TextView txtHome;
    @Bind(R.id.txtSns)
    TextView txtSns;
    @Bind(R.id.txtIEdu)
    TextView txtIEdu;
    @Bind(R.id.txtMy)
    TextView txtMy;
    @Bind(R.id.parent)
    RelativeLayout parent;

    private Drawable drHome, drSns, drIEdu, drMy;
    private HomeFragment homeFragment;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tch_home);
        ButterKnife.bind(this);

        initView();

    }

    private void initView() {
        setSupportActionBar(toolbar);
        selectPosition(1);
    }

    private void clearPosition() {
        txtHome.setTextColor(getResources().getColor(R.color.black_text_color_54));
        txtSns.setTextColor(getResources().getColor(R.color.black_text_color_54));
        txtIEdu.setTextColor(getResources().getColor(R.color.black_text_color_54));
        txtMy.setTextColor(getResources().getColor(R.color.black_text_color_54));

        drHome = getResources().getDrawable(R.mipmap.tch_home_normal);
        drSns = getResources().getDrawable(R.mipmap.tch_sns_normal);
        drIEdu = getResources().getDrawable(R.mipmap.tch_i_education_normal);
        drMy = getResources().getDrawable(R.mipmap.tch_my_normal);
        drHome.setBounds(0, 0, drHome.getMinimumWidth(), drHome.getMinimumHeight());
        drSns.setBounds(0, 0, drSns.getMinimumWidth(), drSns.getMinimumHeight());
        drIEdu.setBounds(0, 0, drIEdu.getMinimumWidth(), drIEdu.getMinimumHeight());
        drMy.setBounds(0, 0, drMy.getMinimumWidth(), drMy.getMinimumHeight());
        txtHome.setCompoundDrawables(null, drHome, null, null);
        txtSns.setCompoundDrawables(null, drSns, null, null);
        txtIEdu.setCompoundDrawables(null, drIEdu, null, null);
        txtMy.setCompoundDrawables(null, drMy, null, null);
    }

    private void selectPosition(int i) {
        clearPosition();
        transaction = getSupportFragmentManager().beginTransaction();
        switch (i) {
            case 1:
                drHome = getResources().getDrawable(R.mipmap.tch_home_press);
                drHome.setBounds(0, 0, drHome.getMinimumWidth(), drHome.getMinimumHeight());
                txtHome.setTextColor(getResources().getColor(R.color.primary_color));
                txtHome.setCompoundDrawables(null, drHome, null, null);
                if (homeFragment == null) {
                    homeFragment = HomeFragment.newInstance("1", "1");
                    transaction.add(R.id.flayout, homeFragment, "HomeFragment");
                } else {
                    transaction.remove(homeFragment);
                    homeFragment = HomeFragment.newInstance("1", "1");
                    transaction.add(R.id.flayout, homeFragment, "HomeFragment");
                    transaction.show(homeFragment);
                }
                break;
            case 2:
                drSns = getResources().getDrawable(R.mipmap.tch_sns_press);
                drSns.setBounds(0, 0, drSns.getMinimumWidth(), drSns.getMinimumHeight());
                txtSns.setTextColor(getResources().getColor(R.color.primary_color));
                txtSns.setCompoundDrawables(null, drSns, null, null);
                break;
            case 3:
                drIEdu = getResources().getDrawable(R.mipmap.tch_i_education_press);
                drIEdu.setBounds(0, 0, drIEdu.getMinimumWidth(), drIEdu.getMinimumHeight());
                txtIEdu.setTextColor(getResources().getColor(R.color.primary_color));
                txtIEdu.setCompoundDrawables(null, drIEdu, null, null);
                break;
            case 4:
                drMy = getResources().getDrawable(R.mipmap.tch_my_press);
                drMy.setBounds(0, 0, drMy.getMinimumWidth(), drMy.getMinimumHeight());
                txtMy.setTextColor(getResources().getColor(R.color.primary_color));
                txtMy.setCompoundDrawables(null, drMy, null, null);
                break;
        }
        transaction.commit();
    }

    @OnClick({R.id.txtHome, R.id.txtSns, R.id.txtIEdu, R.id.txtMy})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.txtHome:
                selectPosition(1);
                break;
            case R.id.txtSns:
                selectPosition(2);
                break;
            case R.id.txtIEdu:
                selectPosition(3);
                break;
            case R.id.txtMy:
                selectPosition(4);
                break;
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
