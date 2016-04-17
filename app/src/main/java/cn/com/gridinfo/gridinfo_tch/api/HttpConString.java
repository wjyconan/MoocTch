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
public interface HttpConString {

    //获取热门文章
    @GET("http://zhpj.12xue.com/index.php?r=article%2Flist&page=0&limit=10&app=tec&type=&categoryA=index&categoryB=&tag=")
    Call<String> getArticle();
}
