package cn.com.gridinfo.gridinfo_tch.bean;

import java.util.List;

/**
 * Created by WJY on 2016/2/22.
 */
public class CityList {

	/**
	 * ret : 0
	 * msg : ok
	 * data : [{"id":"110000","name":"北京市","pid":"0","isparent":"true","isParent":"true"},{"id":"120000","name":"天津市","pid":"0","isparent":"true","isParent":"true"},{"id":"130000","name":"河北省","pid":"0","isparent":"true","isParent":"true"},{"id":"140000","name":"山西省","pid":"0","isparent":"true","isParent":"true"},{"id":"150000","name":"内蒙古","pid":"0","isparent":"true","isParent":"true"},{"id":"210000","name":"辽宁省","pid":"0","isparent":"true","isParent":"true"},{"id":"220000","name":"吉林省","pid":"0","isparent":"true","isParent":"true"},{"id":"230000","name":"黑龙江","pid":"0","isparent":"true","isParent":"true"},{"id":"310000","name":"上海市","pid":"0","isparent":"true","isParent":"true"},{"id":"320000","name":"江苏省","pid":"0","isparent":"true","isParent":"true"},{"id":"330000","name":"浙江省","pid":"0","isparent":"true","isParent":"true"},{"id":"340000","name":"安徽省","pid":"0","isparent":"true","isParent":"true"},{"id":"350000","name":"福建省","pid":"0","isparent":"true","isParent":"true"},{"id":"360000","name":"江西省","pid":"0","isparent":"true","isParent":"true"},{"id":"370000","name":"山东省","pid":"0","isparent":"true","isParent":"true"},{"id":"410000","name":"河南省","pid":"0","isparent":"true","isParent":"true"},{"id":"420000","name":"湖北省","pid":"0","isparent":"true","isParent":"true"},{"id":"430000","name":"湖南省","pid":"0","isparent":"true","isParent":"true"},{"id":"440000","name":"广东省","pid":"0","isparent":"true","isParent":"true"},{"id":"450000","name":"广西省","pid":"0","isparent":"true","isParent":"true"},{"id":"460000","name":"海南省","pid":"0","isparent":"true","isParent":"true"},{"id":"500000","name":"重庆市","pid":"0","isparent":"true","isParent":"true"},{"id":"510000","name":"四川省","pid":"0","isparent":"true","isParent":"true"},{"id":"520000","name":"贵州省","pid":"0","isparent":"true","isParent":"true"},{"id":"530000","name":"云南省","pid":"0","isparent":"true","isParent":"true"},{"id":"540000","name":"西　藏","pid":"0","isparent":"true","isParent":"true"},{"id":"610000","name":"陕西省","pid":"0","isparent":"true","isParent":"true"},{"id":"620000","name":"甘肃省","pid":"0","isparent":"true","isParent":"true"},{"id":"630000","name":"青海省","pid":"0","isparent":"true","isParent":"true"},{"id":"640000","name":"宁　夏","pid":"0","isparent":"true","isParent":"true"},{"id":"650000","name":"新　疆","pid":"0","isparent":"true","isParent":"true"},{"id":"710000","name":"台湾省","pid":"0","isparent":"true","isParent":"true"},{"id":"810000","name":"香　港","pid":"0","isparent":"true","isParent":"true"},{"id":"820000","name":"澳　门","pid":"0","isparent":"true","isParent":"true"}]
	 */

	private int ret;
	private String msg;
	/**
	 * id : 110000
	 * name : 北京市
	 * pid : 0
	 * isparent : true
	 * isParent : true
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
		private String pid;
		private String isparent;
		private String isParent;

		public void setId(String id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setPid(String pid) {
			this.pid = pid;
		}

		public void setIsparent(String isparent) {
			this.isparent = isparent;
		}

		public void setIsParent(String isParent) {
			this.isParent = isParent;
		}

		public String getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public String getPid() {
			return pid;
		}

		public String getIsparent() {
			return isparent;
		}

		public String getIsParent() {
			return isParent;
		}
	}
}
