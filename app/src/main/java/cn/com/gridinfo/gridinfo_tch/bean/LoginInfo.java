package cn.com.gridinfo.gridinfo_tch.bean;

import java.util.List;

/**
 * Created by WJY on 2016/1/20.
 */
public class LoginInfo {


	/**
	 * ret : 0
	 * msg : 
	 * uid : 1003143997294121958
	 * username : kfadmin
	 * realname : 开发管理
	 * email : 312625960@qq.com
	 * telephone : 15963590657
	 * sex : 2
	 * identitytype : 2
	 * is_audit : 1
	 * is_active : 1
	 * is_init : 1
	 * create_time : 1452910876
	 * update_time : 1453355848
	 * status : 0
	 * group : [{"title":"学校管理员","type":"0","group_id":"2"},{"title":"班主任","type":"0","group_id":"3"},{"title":"任课教师","type":"0","group_id":"4"},{"title":"普通教师","type":"0","group_id":"6"}]
	 * access_token : ab5fcadc015e22c4c354cc93b864723f
	 * expires_in : 86400
	 * scope : null
	 * refresh_token : 01739fc5a9bd5370b91138dd71796b31
	 */

	private int ret;
	private String msg;
	private String uid;
	private String username;
	private String realname;
	private String email;
	private String telephone;
	private String sex;
	private String identitytype;
	private String is_audit;
	private String is_active;
	private String is_init;
	private String create_time;
	private String update_time;
	private String status;
	private String access_token;
	private int expires_in;
	private Object scope;
	private String refresh_token;
	/**
	 * title : 学校管理员
	 * type : 0
	 * group_id : 2
	 */

	private List<GroupEntity> group;

	public void setRet(int ret) {
		this.ret = ret;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public void setEmail(String email) {
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

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}

	public void setScope(Object scope) {
		this.scope = scope;
	}

	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}

	public void setGroup(List<GroupEntity> group) {
		this.group = group;
	}

	public int getRet() {
		return ret;
	}

	public String getMsg() {
		return msg;
	}

	public String getUid() {
		return uid;
	}

	public String getUsername() {
		return username;
	}

	public String getRealname() {
		return realname;
	}

	public String getEmail() {
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

	public String getAccess_token() {
		return access_token;
	}

	public int getExpires_in() {
		return expires_in;
	}

	public Object getScope() {
		return scope;
	}

	public String getRefresh_token() {
		return refresh_token;
	}

	public List<GroupEntity> getGroup() {
		return group;
	}

	public static class GroupEntity {
		private String title;
		private String type;
		private String group_id;

		public void setTitle(String title) {
			this.title = title;
		}

		public void setType(String type) {
			this.type = type;
		}

		public void setGroup_id(String group_id) {
			this.group_id = group_id;
		}

		public String getTitle() {
			return title;
		}

		public String getType() {
			return type;
		}

		public String getGroup_id() {
			return group_id;
		}
	}
}