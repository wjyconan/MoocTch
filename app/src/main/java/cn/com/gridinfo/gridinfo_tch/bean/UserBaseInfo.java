package cn.com.gridinfo.gridinfo_tch.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by WJY on 2016/2/18.
 */
public class UserBaseInfo {


	/**
	 * ret : 0
	 * msg : ok
	 * uid : 1000145286031341268
	 * username : lcq001
	 * password : 96e79218965eb72c92a549dd5a330112
	 * realname : 刘春强
	 * email : null
	 * telephone : 15963590681
	 * sex : 0
	 * identitytype : 2
	 * is_audit : 1
	 * is_active : 1
	 * is_init : 1
	 * create_time : 1452860313
	 * update_time : 1452860313
	 * status : 0
	 * birthday : null
	 * terminal : 电脑终端
	 * invite_code : 
	 * sfzjh : 
	 * familyid : null
	 * jtzz : null
	 * gxqm : null
	 * school : [{"id":"1002143804554287036","xxmc":"门头沟第十二中学","xxxz":"6","gzxz":"3","czxz":"3","area":"110109","class":[{"classname":"一班","njmc":"2012","bjid":"1000145286031341263","uid":"1000145286031341268","type":"1","bjbm":"23234132","identitytype":"2","schoolid":"1002143804554287036","gradeid":"1","xd":"31","duty":"2"}],"subject":[{"id":"484","schoolid":"1002143804554287036","kmmc":"化学","kmid":"1"}],"card":[{"card_id":"3265847","type":"1"}]}]
	 */

	private int ret;
	private String msg;
	private String uid;
	private String username;
	private String password;
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
	private String birthday;
	private String terminal;
	private String invite_code;
	private String sfzjh;
	private String familyid;
	private String jtzz;
	private String gxqm;
	/**
	 * id : 1002143804554287036
	 * xxmc : 门头沟第十二中学
	 * xxxz : 6
	 * gzxz : 3
	 * czxz : 3
	 * area : 110109
	 * class : [{"classname":"一班","njmc":"2012","bjid":"1000145286031341263","uid":"1000145286031341268","type":"1","bjbm":"23234132","identitytype":"2","schoolid":"1002143804554287036","gradeid":"1","xd":"31","duty":"2"}]
	 * subject : [{"id":"484","schoolid":"1002143804554287036","kmmc":"化学","kmid":"1"}]
	 * card : [{"card_id":"3265847","type":"1"}]
	 */

	private List<SchoolEntity> school;

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

	public void setPassword(String password) {
		this.password = password;
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

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public void setInvite_code(String invite_code) {
		this.invite_code = invite_code;
	}

	public void setSfzjh(String sfzjh) {
		this.sfzjh = sfzjh;
	}

	public void setFamilyid(String familyid) {
		this.familyid = familyid;
	}

	public void setJtzz(String jtzz) {
		this.jtzz = jtzz;
	}

	public void setGxqm(String gxqm) {
		this.gxqm = gxqm;
	}

	public void setSchool(List<SchoolEntity> school) {
		this.school = school;
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

	public String getPassword() {
		return password;
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

	public String getBirthday() {
		return birthday;
	}

	public String getTerminal() {
		return terminal;
	}

	public String getInvite_code() {
		return invite_code;
	}

	public String getSfzjh() {
		return sfzjh;
	}

	public String getFamilyid() {
		return familyid;
	}

	public String getJtzz() {
		return jtzz;
	}

	public String getGxqm() {
		return gxqm;
	}

	public List<SchoolEntity> getSchool() {
		return school;
	}

	public static class SchoolEntity {
		private String id;
		private String xxmc;
		private String xxxz;
		private String gzxz;
		private String czxz;
		private String area;
		/**
		 * classname : 一班
		 * njmc : 2012
		 * bjid : 1000145286031341263
		 * uid : 1000145286031341268
		 * type : 1
		 * bjbm : 23234132
		 * identitytype : 2
		 * schoolid : 1002143804554287036
		 * gradeid : 1
		 * xd : 31
		 * duty : 2
		 */

		@SerializedName("class")
		private List<ClassEntity> classX;
		/**
		 * id : 484
		 * schoolid : 1002143804554287036
		 * kmmc : 化学
		 * kmid : 1
		 */

		private List<SubjectEntity> subject;
		/**
		 * card_id : 3265847
		 * type : 1
		 */

		private List<CardEntity> card;

		public void setId(String id) {
			this.id = id;
		}

		public void setXxmc(String xxmc) {
			this.xxmc = xxmc;
		}

		public void setXxxz(String xxxz) {
			this.xxxz = xxxz;
		}

		public void setGzxz(String gzxz) {
			this.gzxz = gzxz;
		}

		public void setCzxz(String czxz) {
			this.czxz = czxz;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public void setClassX(List<ClassEntity> classX) {
			this.classX = classX;
		}

		public void setSubject(List<SubjectEntity> subject) {
			this.subject = subject;
		}

		public void setCard(List<CardEntity> card) {
			this.card = card;
		}

		public String getId() {
			return id;
		}

		public String getXxmc() {
			return xxmc;
		}

		public String getXxxz() {
			return xxxz;
		}

		public String getGzxz() {
			return gzxz;
		}

		public String getCzxz() {
			return czxz;
		}

		public String getArea() {
			return area;
		}

		public List<ClassEntity> getClassX() {
			return classX;
		}

		public List<SubjectEntity> getSubject() {
			return subject;
		}

		public List<CardEntity> getCard() {
			return card;
		}

		public static class ClassEntity {
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

		public static class SubjectEntity {
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

		public static class CardEntity {
			private String card_id;
			private String type;

			public void setCard_id(String card_id) {
				this.card_id = card_id;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getCard_id() {
				return card_id;
			}

			public String getType() {
				return type;
			}
		}
	}
}
