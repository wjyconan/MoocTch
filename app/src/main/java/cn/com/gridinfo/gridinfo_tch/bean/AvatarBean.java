package cn.com.gridinfo.gridinfo_tch.bean;

/**
 * Created by WJY on 2016/2/24.
 */
public class AvatarBean {

	/**
	 * ret : 0
	 * msg : ok
	 * face : http://www.12xuedev.com/Common/images/face/small/noreg_0.jpg
	 * face_md5 : a8db92e84b71d8d34df05088b8dcdfe7
	 */

	private int ret;
	private String msg;
	private String face;
	private String face_md5;

	public void setRet(int ret) {
		this.ret = ret;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public void setFace_md5(String face_md5) {
		this.face_md5 = face_md5;
	}

	public int getRet() {
		return ret;
	}

	public String getMsg() {
		return msg;
	}

	public String getFace() {
		return face;
	}

	public String getFace_md5() {
		return face_md5;
	}
}
