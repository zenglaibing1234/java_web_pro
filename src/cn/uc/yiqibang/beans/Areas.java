package cn.uc.yiqibang.beans;

public class Areas {
	
	private int id;
	private String areaid;
	private String area;
	private String cityid;
	public Areas(int id, String areaid, String area, String cityid) {
		super();
		this.id = id;
		this.areaid = areaid;
		this.area = area;
		this.cityid = cityid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAreaid() {
		return areaid;
	}
	public void setAreaid(String areaid) {
		this.areaid = areaid;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCityid() {
		return cityid;
	}
	public void setCityid(String cityid) {
		this.cityid = cityid;
	}
	
}
