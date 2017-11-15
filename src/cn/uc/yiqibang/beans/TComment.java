package cn.uc.yiqibang.beans;

import java.util.Date;

public class TComment {
	
	private int id;
	private int t_n_id;
	private int t_u_id;
	private String c_content;
	private Date c_createtime;
	private int c_thumbscount;
	public TComment(int id, int t_n_id, int t_u_id, String c_content, Date c_createtime, int c_thumbscount) {
		super();
		this.id = id;
		this.t_n_id = t_n_id;
		this.t_u_id = t_u_id;
		this.c_content = c_content;
		this.c_createtime = c_createtime;
		this.c_thumbscount = c_thumbscount;
	}
	public TComment() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getT_n_id() {
		return t_n_id;
	}
	public void setT_n_id(int t_n_id) {
		this.t_n_id = t_n_id;
	}
	public int getT_u_id() {
		return t_u_id;
	}
	public void setT_u_id(int t_u_id) {
		this.t_u_id = t_u_id;
	}
	public String getC_content() {
		return c_content;
	}
	public void setC_content(String c_content) {
		this.c_content = c_content;
	}
	public Date getC_createtime() {
		return c_createtime;
	}
	public void setC_createtime(Date c_createtime) {
		this.c_createtime = c_createtime;
	}
	public int getC_thumbscount() {
		return c_thumbscount;
	}
	public void setC_thumbscount(int c_thumbscount) {
		this.c_thumbscount = c_thumbscount;
	}
	
	
}
