package cn.uc.yiqibang.beans;

import java.util.Date;

public class TUser {
	
	private int id;
	private String u_username;
	private String u_nickname;
	private String u_password;
	private boolean u_sex;
	private String u_bindtel;
	private String u_email;
	private String u_heading;
	private boolean u_state;
	private Date u_createtime;
	private Date u_birthday;
	public TUser(int id, String u_username, String u_nickname, String u_password, boolean u_sex, String u_bindtel,
			String u_email, String u_heading, boolean u_state, Date u_createtime, Date u_birthday) {
		super();
		this.id = id;
		this.u_username = u_username;
		this.u_nickname = u_nickname;
		this.u_password = u_password;
		this.u_sex = u_sex;
		this.u_bindtel = u_bindtel;
		this.u_email = u_email;
		this.u_heading = u_heading;
		this.u_state = u_state;
		this.u_createtime = u_createtime;
		this.u_birthday = u_birthday;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getU_username() {
		return u_username;
	}
	public void setU_username(String u_username) {
		this.u_username = u_username;
	}
	public String getU_nickname() {
		return u_nickname;
	}
	public void setU_nickname(String u_nickname) {
		this.u_nickname = u_nickname;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	public boolean isU_sex() {
		return u_sex;
	}
	public void setU_sex(boolean u_sex) {
		this.u_sex = u_sex;
	}
	public String getU_bindtel() {
		return u_bindtel;
	}
	public void setU_bindtel(String u_bindtel) {
		this.u_bindtel = u_bindtel;
	}
	public String getU_email() {
		return u_email;
	}
	public void setU_email(String u_email) {
		this.u_email = u_email;
	}
	public String getU_heading() {
		return u_heading;
	}
	public void setU_heading(String u_heading) {
		this.u_heading = u_heading;
	}
	public boolean isU_state() {
		return u_state;
	}
	public void setU_state(boolean u_state) {
		this.u_state = u_state;
	}
	public Date getU_createtime() {
		return u_createtime;
	}
	public void setU_createtime(Date u_createtime) {
		this.u_createtime = u_createtime;
	}
	public Date getU_birthday() {
		return u_birthday;
	}
	public void setU_birthday(Date u_birthday) {
		this.u_birthday = u_birthday;
	}
	
	
}
