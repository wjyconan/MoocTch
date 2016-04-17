package cn.com.gridinfo.gridinfo_tch.bean;

import java.util.List;

/**
 * Created by WJY on 2016/2/23.
 */
public class GradeList {

	/**
	 * ret : 0
	 * msg : ok
	 * data : [2018,2017,2016,2015,2014,2013,2012,2011,2010]
	 */

	private int ret;
	private String msg;
	private List<Integer> data;

	public void setRet(int ret) {
		this.ret = ret;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setData(List<Integer> data) {
		this.data = data;
	}

	public int getRet() {
		return ret;
	}

	public String getMsg() {
		return msg;
	}

	public List<Integer> getData() {
		return data;
	}
}
