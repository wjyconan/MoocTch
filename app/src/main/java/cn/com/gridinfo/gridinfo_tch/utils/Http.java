package cn.com.gridinfo.gridinfo_tch.utils;


import cn.com.gridinfo.gridinfo_tch.api.HttpCon;
import cn.com.gridinfo.gridinfo_tch.api.HttpConString;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by WJY on 2016/2/12.
 */
public class Http {

	public static String BASEURL = "http://api.12xue.com/";
//	public static String BASEURL = "http://api.12xuetest.com/";
//	private static final String BASEURL = "http://api.12xuedev.com/";
	public static final String CLIENT_ID = "12xue_tch";
	public static final String CLIENT_SECRET = "7e4602f8a5df3da01c5110e24b42b78f";
	private static final Retrofit RETROFIT= new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(BASEURL).build();
	private static final Retrofit RETROFIT_STRING = new Retrofit.Builder().addConverterFactory(ScalarsConverterFactory.create()).baseUrl(BASEURL).build();
	public static final HttpCon HTTPCON= RETROFIT.create(HttpCon.class);
	public static final HttpConString HTTPCON_STRING = RETROFIT_STRING.create(HttpConString.class);
	public static String TOKEN = "";
	public static final int IDENTITYTYPE = 2;

}
