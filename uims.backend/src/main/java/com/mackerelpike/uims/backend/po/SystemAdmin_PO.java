package com.mackerelpike.uims.backend.po;

import java.io.Serializable;

/**
 * 系统管理员
 * @author David
 *
 */
public class SystemAdmin_PO extends PersistenObject implements Serializable 
{
	private static final long serialVersionUID = 3769707780921152025L;
	
	private long id;
	
	private String name;
	
	private String password;
	
	private String phone_number;
	
	private String last_login_time;
	
	private String last_login_ip;
	
	private String last_login_device;

	public SystemAdmin_PO()
	{
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getLast_login_time() {
		return last_login_time;
	}

	public void setLast_login_time(String last_login_time) {
		this.last_login_time = last_login_time;
	}

	public String getLast_login_ip() {
		return last_login_ip;
	}

	public void setLast_login_ip(String last_login_ip) {
		this.last_login_ip = last_login_ip;
	}

	public String getLast_login_device() {
		return last_login_device;
	}

	public void setLast_login_device(String last_login_device) {
		this.last_login_device = last_login_device;
	}
	
	
}
