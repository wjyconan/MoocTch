package cn.com.gridinfo.gridinfo_tch.bean;

import java.util.List;

/**
 * Created by WJY on 2016/2/20.
 */
public class TchClassList {

	/**
	 * ret : 0
	 * msg : ok
	 * data : [{"classname":"九班","njmc":"2016","bjid":"1003143997295184","uid":"1003143997294121","type":"1","bjbm":"9","identitytype":"2","schoolid":"1003143997288692","gradeid":"9","xd":"21","duty":"2"},{"classname":"123","njmc":"2016","bjid":"100014551795176","uid":"1003143997294121","type":"2","bjbm":"h2IxZMkZKP","identitytype":"2","schoolid":"1003143997288692","gradeid":"13","xd":"31","duty":"2"}]
	 */

	private int ret;
	private String msg;
	/**
	 * classname : 九班
	 * njmc : 2016
	 * bjid : 1003143997295184
	 * uid : 1003143997294121
	 * type : 1
	 * bjbm : 9
	 * identitytype : 2
	 * schoolid : 1003143997288692
	 * gradeid : 9
	 * xd : 21
	 * duty : 2
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
		private String classname;
		private String njmc;
		private String bjid;
		private String uid;
		private String type;
		private String bjbm;
		private String identitytype;
		private String schoolid;
		private String gradeid;
		private String xd;
		private String duty;

		public void setClassname(String classname) {
			this.classname = classname;
		}

		public void setNjmc(String njmc) {
			this.njmc = njmc;
		}

		public void setBjid(String bjid) {
			this.bjid = bjid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		public void setType(String type) {
			this.type = type;
		}

		public void setBjbm(String bjbm) {
			this.bjbm = bjbm;
		}

		public void setIdentitytype(String identitytype) {
			this.identitytype = identitytype;
		}

		public void setSchoolid(String schoolid) {
			this.schoolid = schoolid;
		}

		public void setGradeid(String gradeid) {
			this.gradeid = gradeid;
		}

		public void setXd(String xd) {
			this.xd = xd;
		}

		public void setDuty(String duty) {
			this.duty = duty;
		}

		public String getClassname() {
			return classname;
		}

		public String getNjmc() {
			return njmc;
		}

		public String getBjid() {
			return bjid;
		}

		public String getUid() {
			return uid;
		}

		public String getType() {
			return type;
		}

		public String getBjbm() {
			return bjbm;
		}

		public String getIdentitytype() {
			return identitytype;
		}

		public String getSchoolid() {
			return schoolid;
		}

		public String getGradeid() {
			return gradeid;
		}

		public String getXd() {
			return xd;
		}

		public String getDuty() {
			return duty;
		}
	}
}
