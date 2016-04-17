package cn.com.gridinfo.gridinfo_tch.bean;

import java.util.List;

/**
 * Created by WJY on 2016/2/23.
 */
public class SchoolList {

	/**
	 * ret : 0
	 * msg : ok
	 * data : [{"id":"1002143798597099273","xxmc":"思而学校1","area":"110105","level":null,"xxxz":"5","czxz":"4","gzxz":"3","jxny":null,"lxdh":null,"xxyzbm":null,"xxdz":"","create_time":"1437985970","update_time":"1453112227","status":"0"},{"id":"1002143798598440126","xxmc":"athena测试学校","area":"110105","level":null,"xxxz":"6","czxz":"3","gzxz":"3","jxny":null,"lxdh":null,"xxyzbm":null,"xxdz":"","create_time":"1437985984","update_time":"1437985984","status":"0"}]
	 */

	private int ret;
	private String msg;
	/**
	 * id : 1002143798597099273
	 * xxmc : 思而学校1
	 * area : 110105
	 * level : null
	 * xxxz : 5
	 * czxz : 4
	 * gzxz : 3
	 * jxny : null
	 * lxdh : null
	 * xxyzbm : null
	 * xxdz : 
	 * create_time : 1437985970
	 * update_time : 1453112227
	 * status : 0
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
		private String xxmc;
		private String area;
		private Object level;
		private String xxxz;
		private String czxz;
		private String gzxz;
		private Object jxny;
		private Object lxdh;
		private Object xxyzbm;
		private String xxdz;
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

		public void setXxyzbm(Object xxyzbm) {
			this.xxyzbm = xxyzbm;
		}

		public void setXxdz(String xxdz) {
			this.xxdz = xxdz;
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

		public Object getXxyzbm() {
			return xxyzbm;
		}

		public String getXxdz() {
			return xxdz;
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
