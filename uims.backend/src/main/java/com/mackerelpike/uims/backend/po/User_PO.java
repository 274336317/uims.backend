package com.mackerelpike.uims.backend.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户
 * @author David
 *
 */
public class User_PO extends PersistenObject implements Serializable 
{
	private static final long serialVersionUID = 5263718388172124693L;
	
	private long id;
	
	private String name;
	
	private String password;
	
	private String real_name;
	
	private String phone_num;
	
	private boolean enabled;
	
	private String last_login_time;
	
	private String last_login_ip;
	
	private String last_login_device;
	
	//用户所属的组织
	private List<Organization_PO> organizations = new ArrayList<Organization_PO>();
	
	public User_PO()
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

	public String getReal_name() {
		return real_name;
	}

	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
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

	public List<Organization_PO> getOrganizations() {
		return organizations;
	}

	public void setOrganizations(List<Organization_PO> organizations) {
		this.organizations = organizations;
	}

}