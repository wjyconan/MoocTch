package cn.com.gridinfo.gridinfo_tch.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wjy on 2016/4/15.
 */
public class ArticleHotBean {


    /**
     * share_num : 0
     * updatedAt : 2016-04-15T08:57:38.080Z
     * objectId : 57104b0171cfe400675469c3
     * good_num : 220
     * release : 0
     * comment_num : 0
     * read_num : 11025
     * createdAt : 2016-04-15 09:59
     * type : article
     * title : 教育部长：没有安全，教育改革发展无从谈起
     * style : 1
     * app : ["tec"]
     * categoryA : index
     * tag : education policy
     * user : 12xue-szx
     * img : ["http://ac-o3a5mpty.clouddn.com/e432ce237e2f427eb95b.jpg"]
     * categoryB :
     * fromNowTime : 9小时前
     * url : http://zhpj.12xue.com/index.php?r=article%2Fshow&id=57104b0171cfe400675469c3
     */

    private int share_num;
    private String updatedAt;
    private String objectId;
    private int good_num;
    private int release;
    private int comment_num;
    private int read_num;
    private String createdAt;
    private String type;
    private String title;
    private String style;
    private String categoryA;
    private String tag;
    private String user;
    private String categoryB;
    private String fromNowTime;
    private String url;
    private List<String> app;
    private List<String> img;

    public static ArticleHotBean objectFromData(String str) {

        return new Gson().fromJson(str, ArticleHotBean.class);
    }

    public static ArticleHotBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), ArticleHotBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<ArticleHotBean> arrayArticleHotBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<ArticleHotBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<ArticleHotBean> arrayArticleHotBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<ArticleHotBean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public int getShare_num() {
        return share_num;
    }

    public void setShare_num(int share_num) {
        this.share_num = share_num;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public int getGood_num() {
        return good_num;
    }

    public void setGood_num(int good_num) {
        this.good_num = good_num;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public int getComment_num() {
        return comment_num;
    }

    public void setComment_num(int comment_num) {
        this.comment_num = comment_num;
    }

    public int getRead_num() {
        return read_num;
    }

    public void setRead_num(int read_num) {
        this.read_num = read_num;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getCategoryA() {
        return categoryA;
    }

    public void setCategoryA(String categoryA) {
        this.categoryA = categoryA;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCategoryB() {
        return categoryB;
    }

    public void setCategoryB(String categoryB) {
        this.categoryB = categoryB;
    }

    public String getFromNowTime() {
        return fromNowTime;
    }

    public void setFromNowTime(String fromNowTime) {
        this.fromNowTime = fromNowTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getApp() {
        return app;
    }

    public void setApp(List<String> app) {
        this.app = app;
    }

    public List<String> getImg() {
        return img;
    }

    public void setImg(List<String> img) {
        this.img = img;
    }
}
