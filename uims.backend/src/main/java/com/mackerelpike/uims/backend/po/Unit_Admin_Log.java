package com.mackerelpike.uims.backend.po;

import java.io.Serializable;
import java.util.Date;

public class Unit_Admin_Log implements Serializable 
{
	private static final long serialVersionUID = -8774713329644108759L;

	private long id;
	
	private Unit_Admin_PO admin;
	
	private Date date;
	
	private String ip;
	
	private String device;
	
	private String cotents;
	
	public Unit_Admin_Log()
	{
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Unit_Admin_PO getAdmin() {
		return admin;
	}

	public void setAdmin(Unit_Admin_PO admin) {
		this.admin = admin;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getCotents() {
		return cotents;
	}

	public void setCotents(String cotents) {
		this.cotents = cotents;
	}
}