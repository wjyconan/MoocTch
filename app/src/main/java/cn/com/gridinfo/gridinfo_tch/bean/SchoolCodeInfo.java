package cn.com.gridinfo.gridinfo_tch.bean;

import java.util.List;

/**
 * Created by WJY on 2016/3/3.
 */
public class SchoolCodeInfo {


	/**
	 * ret : 0
	 * msg : ok
	 * id : 1000145698161913639
	 * schoolid : 1033144472316438957
	 * classid : null
	 * code : p0Q6UmhTFb
	 * type : null
	 * start_time : 1456934400
	 * end_time : 1465142399
	 * identity : 2
	 * create_time : 1456981619
	 * update_time : 1456981619
	 * status : 0
	 * schoolinfo : {"id":"1033144472316438957","xxmc":"耀华中学","area":"120101","level":null,"xxxz":"6","czxz":"3","gzxz":"3","jxny":null,"lxdh":null,"xxdz":"和平区南京路106号","xxyzbm":"300040","dzxx":null,"create_time":"1444723164","update_time":"1444723164","status":"0"}
	 * classinfo : []
	 */

	private int ret;
	private String msg;
	private String id;
	private String schoolid;
	private Object classid;
	private String code;
	private Object type;
	private String start_time;
	private String end_time;
	private String identity;
	private String create_time;
	private String update_time;
	private String status;
	/**
	 * id : 1033144472316438957
	 * xxmc : 耀华中学
	 * area : 120101
	 * level : null
	 * xxxz : 6
	 * czxz : 3
	 * gzxz : 3
	 * jxny : null
	 * lxdh : null
	 * xxdz : 和平区南京路106号
	 * xxyzbm : 300040
	 * dzxx : null
	 * create_time : 1444723164
	 * update_time : 1444723164
	 * status : 0
	 */

	private SchoolinfoEntity schoolinfo;
	private List<?> classinfo;

	public void setRet(int ret) {
		this.ret = ret;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSchoolid(String schoolid) {
		this.schoolid = schoolid;
	}

	public void setClassid(Object classid) {
		this.classid = classid;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setType(Object type) {
		this.type = type;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setSchoolinfo(SchoolinfoEntity schoolinfo) {
		this.schoolinfo = schoolinfo;
	}

	public void setClassinfo(List<?> classinfo) {
		this.classinfo = classinfo;
	}

	public int getRet() {
		return ret;
	}

	public String getMsg() {
		return msg;
	}

	public String getId() {
		return id;
	}

	public String getSchoolid() {
		return schoolid;
	}

	public Object getClassid() {
		return classid;
	}

	public String getCode() {
		return code;
	}

	public Object getType() {
		return type;
	}

	public String getStart_time() {
		return start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public String getIdentity() {
		return identity;
	}

	public String getCreate_time() {
		return create_time;
	}

	public String getUpdate_time() {
		return update_time;
	}

	public String getStatus() {
		return status;
	}

	public SchoolinfoEntity getSchoolinfo() {
		return schoolinfo;
	}

	public List<?> getClassinfo() {
		return classinfo;
	}

	public static class SchoolinfoEntity {
		private String id;
		private String xxmc;
		private String area;
		private Object level;
		private String xxxz;
		private String czxz;
		private String gzxz;
		private Object jxny;
		private Object lxdh;
		private String xxdz;
		private String xxyzbm;
		private Object dzxx;
		private String create_time;
		private String update_time;
		private String status;

		public void setId(String id) {
			this.id = id;
		}

		public void setXxmc(String xxmc) {
			this.xxmc = xxmc;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public void setLevel(Object level) {
			this.level = level;
		}

		public void setXxxz(String xxxz) {
			this.xxxz = xxxz;
		}

		public void setCzxz(String czxz) {
			this.czxz = czxz;
		}

		public void setGzxz(String gzxz) {
			this.gzxz = gzxz;
		}

		public void setJxny(Object jxny) {
			this.jxny = jxny;
		}

		public void setLxdh(Object lxdh) {
			this.lxdh = lxdh;
		}

		public void setXxdz(String xxdz) {
			this.xxdz = xxdz;
		}

		public void setXxyzbm(String xxyzbm) {
			this.xxyzbm = xxyzbm;
		}

		public void setDzxx(Object dzxx) {
			this.dzxx = dzxx;
		}

		public void setCreate_time(String create_time) {
			this.create_time = create_time;
		}

		public void setUpdate_time(String update_time) {
			this.update_time = update_time;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getId() {
			return id;
		}

		public String getXxmc() {
			return xxmc;
		}

		public String getArea() {
			return area;
		}

		public Object getLevel() {
			return level;
		}

		public String getXxxz() {
			return xxxz;
		}

		public String getCzxz() {
			return czxz;
		}

		public String getGzxz() {
			return gzxz;
		}

		public Object getJxny() {
			return jxny;
		}

		public Object getLxdh() {
			return lxdh;
		}

		public String getXxdz() {
			return xxdz;
		}

		public String getXxyzbm() {
			return xxyzbm;
		}

		public Object getDzxx() {
			return dzxx;
		}

		public String getCreate_time() {
			return create_time;
		}

		public String getUpdate_time() {
			return update_time;
		}

		public String getStatus() {
			return status;
		}
	}
}
