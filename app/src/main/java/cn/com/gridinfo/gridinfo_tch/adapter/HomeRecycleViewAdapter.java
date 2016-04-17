package cn.com.gridinfo.gridinfo_tch.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.com.gridinfo.gridinfo_tch.R;
import cn.com.gridinfo.gridinfo_tch.bean.ArticleHotBean;

/**
 * Created by wjy on 2016/4/15.
 */
public class HomeRecycleViewAdapter extends RecyclerView.Adapter {

    private List<ArticleHotBean> list;
    private Context context;

    public HomeRecycleViewAdapter(Context context, List<ArticleHotBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getItemViewType(int position) {
        return Integer.parseInt(list.get(position).getStyle());
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case 1:
                view = LayoutInflater.from(context).inflate(R.layout.item_home_fragment_recycleview_little_img, parent, false);
                return new ViewHolderCaseLittleOne(view);
            case 2:
                view = LayoutInflater.from(context).inflate(R.layout.item_home_fragment_recycleview_one_img, parent, false);
                return new ViewHolderCaseOne(view);
            case 3:
                view = LayoutInflater.from(context).inflate(R.layout.item_home_fragment_recycleview_three_img, parent, false);
                return new ViewHolderCaseThree(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ViewHolderCaseLittleOne) {
            ((ViewHolderCaseLittleOne) holder).txtTitle.setText(list.get(position).getTitle());
            Uri uri = Uri.parse(list.get(position).getImg().get(0));
            ((ViewHolderCaseLittleOne) holder).imgItemFirst.setImageURI(uri);
            if (!TextUtils.isEmpty(list.get(position).getType()) && list.get(position).getType().equals("ad")) {
                Drawable drawable = context.getResources().getDrawable(R.mipmap.tch_icon_hot);
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                ((ViewHolderCaseLittleOne) holder).txtSubject.setCompoundDrawables(drawable, null, null, null);
                if (!TextUtils.isEmpty(list.get(position).getUser())) {
                    ((ViewHolderCaseLittleOne) holder).txtSubject.setText(list.get(position).getUser());
                }
            } else {
                if (!TextUtils.isEmpty(list.get(position).getUser())) {
                    String str = list.get(position).getUser() + "   " + list.get(position).getGood_num() + "赞   " + list.get(position).getFromNowTime();
                    ((ViewHolderCaseLittleOne) holder).txtSubject.setText(str);
                } else {
                    String str = list.get(position).getGood_num() + "赞   " + list.get(position).getFromNowTime();
                    ((ViewHolderCaseLittleOne) holder).txtSubject.setText(str);
                }
            }
        } else if (holder instanceof ViewHolderCaseOne) {
            ((ViewHolderCaseOne) holder).txtTitle.setText(list.get(position).getTitle());
            Uri uri = Uri.parse(list.get(position).getImg().get(0));
            ((ViewHolderCaseOne) holder).imgItemFirst.setImageURI(uri);
            if (!TextUtils.isEmpty(list.get(position).getType()) && list.get(position).getType().equals("ad")) {
                Drawable drawable = context.getResources().getDrawable(R.mipmap.tch_icon_hot);
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                ((ViewHolderCaseOne) holder).txtSubject.setCompoundDrawables(drawable, null, null, null);
                if (!TextUtils.isEmpty(list.get(position).getUser())) {
                    ((ViewHolderCaseOne) holder).txtSubject.setText(list.get(position).getUser());
                }
            } else {
                if (!TextUtils.isEmpty(list.get(position).getUser())) {
                    String str = list.get(position).getUser() + "   " + list.get(position).getGood_num() + "赞   " + list.get(position).getFromNowTime();
                    ((ViewHolderCaseOne) holder).txtSubject.setText(str);
                } else {
                    String str = list.get(position).getGood_num() + "赞   " + list.get(position).getFromNowTime();
                    ((ViewHolderCaseOne) holder).txtSubject.setText(str);
                }
            }
        } else if (holder instanceof ViewHolderCaseThree) {
            ((ViewHolderCaseThree) holder).txtTitle.setText(list.get(position).getTitle());
            for (int i = 0; i < list.get(position).getImg().size(); i++) {
                Uri uri = Uri.parse(list.get(position).getImg().get(i));
                ((ViewHolderCaseThree) holder).imgItemFirst.setImageURI(uri);
            }
            if (!TextUtils.isEmpty(list.get(position).getType()) && list.get(position).getType().equals("ad")) {
                Drawable drawable = context.getResources().getDrawable(R.mipmap.tch_icon_hot);
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                ((ViewHolderCaseThree) holder).txtSubject.setCompoundDrawables(drawable, null, null, null);
                if (!TextUtils.isEmpty(list.get(position).getUser())) {
                    ((ViewHolderCaseThree) holder).txtSubject.setText(list.get(position).getUser());
                }
            } else {
                if (!TextUtils.isEmpty(list.get(position).getUser())) {
                    String str = list.get(position).getUser() + "   " + list.get(position).getGood_num() + "赞   " + list.get(position).getFromNowTime();
                    ((ViewHolderCaseThree) holder).txtSubject.setText(str);
                } else {
                    String str = list.get(position).getGood_num() + "赞   " + list.get(position).getFromNowTime();
                    ((ViewHolderCaseThree) holder).txtSubject.setText(str);
                }
            }
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class ViewHolderCaseLittleOne extends RecyclerView.ViewHolder {
        @Bind(R.id.txtTitle)
        TextView txtTitle;
        @Bind(R.id.imgItemFirst)
        SimpleDraweeView imgItemFirst;
        @Bind(R.id.txtSubject)
        TextView txtSubject;

        ViewHolderCaseLittleOne(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    class ViewHolderCaseOne extends RecyclerView.ViewHolder {
        @Bind(R.id.txtTitle)
        TextView txtTitle;
        @Bind(R.id.imgItemFirst)
        SimpleDraweeView imgItemFirst;
        @Bind(R.id.txtSubject)
        TextView txtSubject;

        ViewHolderCaseOne(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    class ViewHolderCaseThree extends RecyclerView.ViewHolder {
        @Bind(R.id.txtTitle)
        TextView txtTitle;
        @Bind(R.id.imgItemFirst)
        SimpleDraweeView imgItemFirst;
        @Bind(R.id.imgItemSecond)
        SimpleDraweeView imgItemSecond;
        @Bind(R.id.imgItemThird)
        SimpleDraweeView imgItemThird;
        @Bind(R.id.txtSubject)
        TextView txtSubject;

        ViewHolderCaseThree(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

}
