package cn.com.gridinfo.gridinfo_tch.bean;

import java.util.List;

/**
 * Created by WJY on 2016/3/5.
 */
public class SubListsBean {
	/**
	 * ret : 0
	 * msg : ok
	 * data : [{"id":"1","name":"化学","code":"1","pid":"0","type":"Subject","schoolid":"0","ext":"sys"},{"id":"243","name":"历史","code":"243","pid":"0","type":"Subject","schoolid":"0","ext":"sys"},"......"]
	 */

	private int ret;
	private String msg;
	/**
	 * id : 1
	 * name : 化学
	 * code : 1
	 * pid : 0
	 * type : Subject
	 * schoolid : 0
	 * ext : sys
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
		private String name;
		private String code;
		private String pid;
		private String type;
		private String schoolid;
		private String ext;

		public void setId(String id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public void setPid(String pid) {
			this.pid = pid;
		}

		public void setType(String type) {
			this.type = type;
		}

		public void setSchoolid(String schoolid) {
			this.schoolid = schoolid;
		}

		public void setExt(String ext) {
			this.ext = ext;
		}

		public String getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public String getCode() {
			return code;
		}

		public String getPid() {
			return pid;
		}

		public String getType() {
			return type;
		}

		public String getSchoolid() {
			return schoolid;
		}

		public String getExt() {
			return ext;
		}
	}
}
