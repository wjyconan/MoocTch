package cn.com.gridinfo.gridinfo_tch.bean;

import java.util.List;

/**
 * Created by WJY on 2016/3/4.
 */
public class TchSubjectList {

	/**
	 * ret : 0
	 * msg : ok
	 * data : [{"id":"488","schoolid":"1002143798910970506","kmmc":"语文","kmid":"1071"}]
	 */

	private int ret;
	private String msg;
	/**
	 * id : 488
	 * schoolid : 1002143798910970506
	 * kmmc : 语文
	 * kmid : 1071
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
		private String id;
		private String schoolid;
		private String kmmc;
		private String kmid;

		public void setId(String id) {
			this.id = id;
		}

		public void setSchoolid(String schoolid) {
			this.schoolid = schoolid;
		}

		public void setKmmc(String kmmc) {
			this.kmmc = kmmc;
		}

		public void setKmid(String kmid) {
			this.kmid = kmid;
		}

		public String getId() {
			return id;
		}

		public String getSchoolid() {
			return schoolid;
		}

		public String getKmmc() {
			return kmmc;
		}

		public String getKmid() {
			return kmid;
		}
	}
}
