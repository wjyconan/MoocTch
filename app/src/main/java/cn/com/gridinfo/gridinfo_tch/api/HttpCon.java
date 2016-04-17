package cn.com.gridinfo.gridinfo_tch.api;

import java.util.List;

import cn.com.gridinfo.gridinfo_tch.bean.AvatarBean;
import cn.com.gridinfo.gridinfo_tch.bean.CityList;
import cn.com.gridinfo.gridinfo_tch.bean.ClassListsBean;
import cn.com.gridinfo.gridinfo_tch.bean.ColleagBean;
import cn.com.gridinfo.gridinfo_tch.bean.GradeList;
import cn.com.gridinfo.gridinfo_tch.bean.LoginInfo;
import cn.com.gridinfo.gridinfo_tch.bean.RegistInfo;
import cn.com.gridinfo.gridinfo_tch.bean.SchoolCodeInfo;
import cn.com.gridinfo.gridinfo_tch.bean.SchoolList;
import cn.com.gridinfo.gridinfo_tch.bean.StatusReturn;
import cn.com.gridinfo.gridinfo_tch.bean.SubListsBean;
import cn.com.gridinfo.gridinfo_tch.bean.TchClassList;
import cn.com.gridinfo.gridinfo_tch.bean.TchParent;
import cn.com.gridinfo.gridinfo_tch.bean.TchSubjectList;
import cn.com.gridinfo.gridinfo_tch.bean.UserBaseInfo;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Query;

/**
 * Created by WJY on 2016/1/20.
 */
public interface HttpCon {


    String source = "teacher_android";
    String version = "3.0.0";

    //登录
    @Headers({"Source:" + source, "Version:" + version})
    @FormUrlEncoded
    @POST("/user/login")
    Call<LoginInfo> toLogin(@Field("account") String account, @Field("password") String password,
                            @Field("client_id") String client_id, @Field("client_secret") String client_secret, @Header("Token") String token);

    //注册
    @Headers({"Source:" + source, "Version:" + version})
    @FormUrlEncoded
    @POST("/user/register")
    Call<RegistInfo> getRegistInfo(@Field("identitytype") int identitytype, @Field("password") String password, @Field("realname") String realname,
                                   @Field("telephone") String telephone, @Header("Token") String token);

    //获取用户基本信息
    @Headers({"Source:" + source, "Version:" + version})
    @GET("/User/baseinfo")
    Call<UserBaseInfo> getUserAllInfo(@Query("identitytype") int identitytype, @Query("uid") String uid, @Header("Token") String token);


    //修改用户基础信息
    @Headers({"Source:" + source, "Version:" + version})
    @FormUrlEncoded
    @PUT("/User/info")
    Call<StatusReturn> chageUserInfo(@Field("uid") String uid, @Field("realname") String realname, @Field("username") String username,
                                     @Field("telephone") String telephone, @Field("sex") String sex, @Header("Token") String token);

    //修改用户基础信息
    @Headers({"Source:" + source, "Version:" + version})
    @FormUrlEncoded
    @PUT("/User/data")
    Call<StatusReturn> chageUserData(@Field("uid") String uid, @Field("birthday") String birthday, @Field("sfzjh") String sfzjh,
                                     @Field("jtzz") String jtzz, @Field("gxqm") String gxqm, @Header("Token") String token);

    //获取教师任课班级列表
    @Headers({"Source:" + source, "Version:" + version})
    @GET("/User/class")
    Call<TchClassList> getTchClassList(@Query("uid") String uid, @Header("Token") String token);

    //获取省市区列表
    @Headers({"Source:" + source, "Version:" + version})
    @GET("/Area/lists")
    Call<CityList> getCityList(@Query("pid") String pid, @Header("Token") String token);

    //获取学校
    @Headers({"Source:" + source, "Version:" + version})
    @GET("/School/lists")
    Call<SchoolList> getSchoolList(@Query("area") String pid, @Header("Token") String token);

    //根据学校选年级列表
    @Headers({"Source:" + source, "Version:" + version})
    @GET("/School/gradeinfos")
    Call<GradeList> getGradeList(@Query("xd") String xd, @Query("xz") String xz, @Header("Token") String token);

    //将用户添加到学校
    @Headers({"Source:" + source, "Version:" + version})
    @FormUrlEncoded
    @POST("/School/users")
    Call<StatusReturn> addUserToSch(@Field("identitytype") int identitytype, @Field("uid") String uid,
                                    @Field("schoolid") String schoolid, @Header("Token") String token);

    //添加任课班级
    @Headers({"Source:" + source, "Version:" + version})
    @FormUrlEncoded
    @POST("/Class/info")
    Call<StatusReturn> addTchClass(@Field("schoolid") String schoolid, @Field("uid") String uid,
                                   @Field("xd") String xd, @Field("bjmc") String bjmc, @Field("njmc") String njmc,
                                   @Field("type") String type, @Header("Token") String token);

    //删除班级信息
    @Headers({"Source:" + source, "Version:" + version})
    @DELETE("/Class/info")
    Call<StatusReturn> delTchClass(@Query("classid") String id, @Header("Token") String token);

    //获取用户头像
    @Headers({"Source:" + source, "Version:" + version})
    @GET("/User/avatar")
    Call<AvatarBean> getAvatar(@Query("uid") String uid, @Query("size") String size, @Header("Token") String token);

    //修改用户头像
    @Headers({"Source:" + source, "Version:" + version})
    @Multipart
    @POST("/User/face")
    Call<StatusReturn> updateAvater(@Part("uid") RequestBody uid, @Part(value = "uhead\"; filename=\"123.jpg", encoding = "utf-8") RequestBody file, @Header("Token") String token);

    //修改密码
    @Headers({"Source:" + source, "Version:" + version})
    @FormUrlEncoded
    @PUT("/User/password")
    Call<StatusReturn> updatePsw(@Field("uid") String uid, @Field("oldpassword") String oldpassword, @Field("newpassword") String newpassword, @Header("Token") String token);

    //获取同事通讯录
    @Headers({"Source:" + source, "Version:" + version})
    @GET("/Contact/tchColleague")
    Call<ColleagBean> getColleag(@Query("uid") String uid, @Header("Token") String token);

    //获取老师所教班级家长通讯录
    @Headers({"Source:" + source, "Version:" + version})
    @GET("/Contact/tchParents")
    Call<TchParent> getTchPar(@Query("uid") String uid, @Header("Token") String token);

    //发送验证码  register:注册,putinfo:修改信息,findpwd:找回密码
    @Headers({"Source:" + source, "Version:" + version})
    @FormUrlEncoded
    @POST("/Invitecode/send")
    Call<StatusReturn> sendCode(@Field("mobile") String mobile, @Field("type") String type, @Header("Token") String token);

    //检查验证码
    @Headers({"Source:" + source, "Version:" + version})
    @GET("/Invitecode/check")
    Call<StatusReturn> checkCode(@Query("mobile") String mobile, @Query("code") String code, @Query("type") String type, @Header("Token") String token);

//	//家长通知列表
//	@Headers({"Source:" + source, "Version:" + version})
//	@GET("/Notify/lists")
//	Call<ParentNewsBean> getParList(@Query("uid") String uid, @Query("p") String p, @Query("num") String num, @Header("Token") String token);

    //判断邀请码是否合法
    @Headers({"Source:" + source, "Version:" + version})
    @GET("/Invitecode/verify")
    Call<SchoolCodeInfo> verifyCode(@Query("code") String code, @Query("identity") String identity, @Header("Token") String token);

    //通过邀请码初始化用户信息
    @Headers({"Source:" + source, "Version:" + version})
    @FormUrlEncoded
    @PUT("/User/invitecode")
    Call<StatusReturn> initSchool(@Field("uid") String uid, @Field("code") String code, @Header("Token") String token);

    //教师所教科目列表
    @Headers({"Source:" + source, "Version:" + version})
    @GET("/Teacher/subjects")
    Call<TchSubjectList> getTchSubList(@Query("uid") String uid, @Header("Token") String token);

    //教师添加任课
    @Headers({"Source:" + source, "Version:" + version})
    @FormUrlEncoded
    @POST("/Teacher/subject")
    Call<StatusReturn> addTchSub(@Field("schoolid") String schoolid, @Field("uid") String uid, @Field("kmid[]") List<String> kmid,
                                 @Field("kmmc[]") List<String> kmmc, @Field("identitytype") int identitytype, @Header("Token") String token);

    //获取学校中所有科目
    @Headers({"Source:" + source, "Version:" + version})
    @GET("/School/subjects")
    Call<SubListsBean> getSubLists(@Query("schoolid") String schoolid, @Header("Token") String token);

    //获取系统班级名称列表
    @Headers({"Source:" + source, "Version:" + version})
    @GET("/Class/names")
    Call<ClassListsBean> getClsLists(@Header("Token") String token);

    //创建家长通知
    @Headers({"Source:" + source, "Version:" + version})
    @FormUrlEncoded
    @POST("/Notify/info")
    Call<StatusReturn> sendParNotify(@Field("content") String content, @Field("uid") String uid, @Field("schoolid") String schoolid,
                                     @Field("classinfo") String[][] cls,
                                     @Header("Token") String token);

    //获取热门文章
    @GET("http://zhpj.12xue.com/index.php?r=article%2Flist&page=0&limit=10&app=tec&type=&categoryA=index&categoryB=&tag=")
    Call<String> getArticle();
}
