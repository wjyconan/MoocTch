package cn.com.gridinfo.gridinfo_tch.bean;

/**
 * Created by WJY on 2016/2/19.
 */
public class StatusReturn {
	/**
	 * ret : 0
	 * msg : ok
	 */

	private int ret;
	private String msg;

	public void setRet(int ret) {
		this.ret = ret;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getRet() {
		return ret;
	}

	public String getMsg() {
		return msg;
	}
}
