package cn.com.gridinfo.gridinfo_tch.bean;

import java.util.List;

/**
 * Created by WJY on 2016/3/6.
 */
public class ClassListsBean {

	/**
	 * ret : 0
	 * msg : ok
	 * data : [{"code":1,"name":"一班"},{"code":2,"name":"二班"},{"code":3,"name":"三班"},{"code":4,"name":"四班"},{"code":5,"name":"五班"},{"code":6,"name":"六班"},{"code":7,"name":"七班"},{"code":8,"name":"八班"},{"code":9,"name":"九班"},{"code":10,"name":"十班"},{"code":11,"name":"十一班"},{"code":12,"name":"十二班"},{"code":13,"name":"十三班"},{"code":14,"name":"十四班"},{"code":15,"name":"十五班"},{"code":16,"name":"十六班"},{"code":17,"name":"十七班"},{"code":18,"name":"十八班"},{"code":19,"name":"十九班"},{"code":20,"name":"二十班"},{"code":21,"name":"二十一班"},{"code":22,"name":"二十二班"},{"code":23,"name":"二十三班"},{"code":24,"name":"二十四班"},{"code":25,"name":"二十五班"},{"code":26,"name":"二十六班"},{"code":27,"name":"二十七班"},{"code":28,"name":"二十八班"},{"code":29,"name":"二十九班"},{"code":30,"name":"三十班"}]
	 */

	private int ret;
	private String msg;
	/**
	 * code : 1
	 * name : 一班
	 */

	private List<DataEntity> data;

	public void setRet(int ret) {
		this.ret = ret;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setData(List<DataEntity> data) {
		this.data = data;
	}

	public int getRet() {
		return ret;
	}

	public String getMsg() {
		return msg;
	}

	public List<DataEntity> getData() {
		return data;
	}

	public static class DataEntity {
		private int code;
		private String name;

		public void setCode(int code) {
			this.code = code;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getCode() {
			return code;
		}

		public String getName() {
			return name;
		}
	}
}
