package cn.uc.yiqibang.beans;

public class Provinces {
	
	private int id;
	private String provinceid;
	private String province;
	public Provinces(int id, String provinceid, String province) {
		super();
		this.id = id;
		this.provinceid = provinceid;
		this.province = province;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvinceid() {
		return provinceid;
	}
	public void setProvinceid(String provinceid) {
		this.provinceid = provinceid;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	
}
