package cn.com.gridinfo.gridinfo_tch.bean;

import java.util.List;

/**
 * Created by WJY on 2016/2/25.
 */
public class TchParent {

	/**
	 * ret : 0
	 * msg : ok
	 * name : 家长
	 * level : 0
	 * data : [{"name":"2015级一班 ","level":1,"data":[{"uid":"1033145308280423071","username":"5rZxsp8iUDxdUZMIwy","password":"96e79218965eb72c92a549dd5a330112","realname":"张筌洁","email":null,"telephone":"18562195932","sex":"0","identitytype":"4","is_audit":"1","is_active":"1","is_init":"1","create_time":"1456213831","update_time":"1456213831","status":"0","face":"http://www.12xuedev.com/Common/images/face/middle/noreg_0.jpg","face_md5":null},"......"]},"......"]
	 */

	private int ret;
	private String msg;
	private String name;
	private int level;
	/**
	 * name : 2015级一班 
	 * level : 1
	 * data : [{"uid":"1033145308280423071","username":"5rZxsp8iUDxdUZMIwy","password":"96e79218965eb72c92a549dd5a330112","realname":"张筌洁","email":null,"telephone":"18562195932","sex":"0","identitytype":"4","is_audit":"1","is_active":"1","is_init":"1","create_time":"1456213831","update_time":"1456213831","status":"0","face":"http://www.12xuedev.com/Common/images/face/middle/noreg_0.jpg","face_md5":null},"......"]
	 */

	private List<CdataEntity> data;

	public void setRet(int ret) {
		this.ret = ret;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void setData(List<CdataEntity> data) {
		this.data = data;
	}

	public int getRet() {
		return ret;
	}

	public String getMsg() {
		return msg;
	}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public List<CdataEntity> getData() {
		return data;
	}

	public static class CdataEntity {
		private String name;
		private int level;
		/**
		 * uid : 1033145308280423071
		 * username : 5rZxsp8iUDxdUZMIwy
		 * password : 96e79218965eb72c92a549dd5a330112
		 * realname : 张筌洁
		 * email : null
		 * telephone : 18562195932
		 * sex : 0
		 * identitytype : 4
		 * is_audit : 1
		 * is_active : 1
		 * is_init : 1
		 * create_time : 1456213831
		 * update_time : 1456213831
		 * status : 0
		 * face : http://www.12xuedev.com/Common/images/face/middle/noreg_0.jpg
		 * face_md5 : null
		 */

		private List<DataEntity> data;

		public void setName(String name) {
			this.name = name;
		}

		public void setLevel(int level) {
			this.level = level;
		}

		public void setData(List<DataEntity> data) {
			this.data = data;
		}

		public String getName() {
			return name;
		}

		public int getLevel() {
			return level;
		}

		public List<DataEntity> getData() {
			return data;
		}

		public static class DataEntity {
			private String uid;
			private String username;
			private String password;
			private String realname;
			private Object email;
			private String telephone;
			private String sex;
			private String identitytype;
			private String is_audit;
			private String is_active;
			private String is_init;
			private String create_time;
			private String update_time;
			private String status;
			private String face;
			private Object face_md5;

			public void setUid(String uid) {
				this.uid = uid;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public void setRealname(String realname) {
				this.realname = realname;
			}

			public void setEmail(Object email) {
				this.email = email;
			}

			public void setTelephone(String telephone) {
				this.telephone = telephone;
			}

			public void setSex(String sex) {
				this.sex = sex;
			}

			public void setIdentitytype(String identitytype) {
				this.identitytype = identitytype;
			}

			public void setIs_audit(String is_audit) {
				this.is_audit = is_audit;
			}

			public void setIs_active(String is_active) {
				this.is_active = is_active;
			}

			public void setIs_init(String is_init) {
				this.is_init = is_init;
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

			public void setFace(String face) {
				this.face = face;
			}

			public void setFace_md5(Object face_md5) {
				this.face_md5 = face_md5;
			}

			public String getUid() {
				return uid;
			}

			public String getUsername() {
				return username;
			}

			public String getPassword() {
				return password;
			}

			public String getRealname() {
				return realname;
			}

			public Object getEmail() {
				return email;
			}

			public String getTelephone() {
				return telephone;
			}

			public String getSex() {
				return sex;
			}

			public String getIdentitytype() {
				return identitytype;
			}

			public String getIs_audit() {
				return is_audit;
			}

			public String getIs_active() {
				return is_active;
			}

			public String getIs_init() {
				return is_init;
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

			public String getFace() {
				return face;
			}

			public Object getFace_md5() {
				return face_md5;
			}
		}
	}
}
