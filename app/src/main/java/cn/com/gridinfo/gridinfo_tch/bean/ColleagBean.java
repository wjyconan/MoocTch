package cn.com.gridinfo.gridinfo_tch.bean;


import java.util.List;

public class ColleagBean {

    /**
     * ret : 0
     * msg : ok
     * name : 同事
     * level : 0
     * data : [{"uid":"1033145308280422906","username":"zoufengls1","password":"96e79218965eb72c92a549dd5a330112","realname":"邹峰","email":null,"telephone":"18364555245","sex":"0","identitytype":"2","is_audit":"1","is_active":"1","is_init":"1","create_time":"1454650921","update_time":"1454650921","status":"0","birthday":null,"terminal":"","invite_code":"LUNK6yy9","sfzjh":"334340000808344","familyid":null,"gxqm":null,"jtzz":null,"id":"24","schoolid":"1002143798597099273","start_time":"1454650921","end_time":"1454650921","face":"http://www.12xuedev.com/Common/images/face/middle/noreg_0.jpg","face_md5":null},"......"]
     */

    private int ret;
    private String msg;
    private String name;
    private int level;
    /**
     * uid : 1033145308280422906
     * username : zoufengls1
     * password : 96e79218965eb72c92a549dd5a330112
     * realname : 邹峰
     * email : null
     * telephone : 18364555245
     * sex : 0
     * identitytype : 2
     * is_audit : 1
     * is_active : 1
     * is_init : 1
     * create_time : 1454650921
     * update_time : 1454650921
     * status : 0
     * birthday : null
     * terminal : 
     * invite_code : LUNK6yy9
     * sfzjh : 334340000808344
     * familyid : null
     * gxqm : null
     * jtzz : null
     * id : 24
     * schoolid : 1002143798597099273
     * start_time : 1454650921
     * end_time : 1454650921
     * face : http://www.12xuedev.com/Common/images/face/middle/noreg_0.jpg
     * face_md5 : null
     */

    private List<DataEntity> data;

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

    public void setData(List<DataEntity> data) {
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
        private Object birthday;
        private String terminal;
        private String invite_code;
        private String sfzjh;
        private Object familyid;
        private Object gxqm;
        private Object jtzz;
        private String id;
        private String schoolid;
        private String start_time;
        private String end_time;
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

        public void setBirthday(Object birthday) {
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

        public void setFamilyid(Object familyid) {
            this.familyid = familyid;
        }

        public void setGxqm(Object gxqm) {
            this.gxqm = gxqm;
        }

        public void setJtzz(Object jtzz) {
            this.jtzz = jtzz;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setSchoolid(String schoolid) {
            this.schoolid = schoolid;
        }

        public void setStart_time(String start_time) {
            this.start_time = start_time;
        }

        public void setEnd_time(String end_time) {
            this.end_time = end_time;
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

        public Object getBirthday() {
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

        public Object getFamilyid() {
            return familyid;
        }

        public Object getGxqm() {
            return gxqm;
        }

        public Object getJtzz() {
            return jtzz;
        }

        public String getId() {
            return id;
        }

        public String getSchoolid() {
            return schoolid;
        }

        public String getStart_time() {
            return start_time;
        }

        public String getEnd_time() {
            return end_time;
        }

        public String getFace() {
            return face;
        }

        public Object getFace_md5() {
            return face_md5;
        }
    }
}
