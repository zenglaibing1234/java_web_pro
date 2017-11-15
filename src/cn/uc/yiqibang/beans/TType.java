package cn.uc.yiqibang.beans;

public class TType {
	
	private int id;
	private String t_name;
	public TType(int id, String t_name) {
		super();
		this.id = id;
		this.t_name = t_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	
	
}
