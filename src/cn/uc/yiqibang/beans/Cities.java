package cn.uc.yiqibang.beans;

public class Cities {
	
	private int id;
	private String cityid;
	private String city;
	private String provinceid;
	public Cities(int id, String cityid, String city, String provinceid) {
		super();
		this.id = id;
		this.cityid = cityid;
		this.city = city;
		this.provinceid = provinceid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCityid() {
		return cityid;
	}
	public void setCityid(String cityid) {
		this.cityid = cityid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvinceid() {
		return provinceid;
	}
	public void setProvinceid(String provinceid) {
		this.provinceid = provinceid;
	}
	
	
}
