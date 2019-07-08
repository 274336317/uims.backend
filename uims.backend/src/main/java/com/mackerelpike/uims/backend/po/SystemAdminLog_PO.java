package com.mackerelpike.uims.backend.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统管理员
 * @author David
 *
 */
public class SystemAdminLog_PO implements Serializable
{
	private static final long serialVersionUID = -6504630926006312012L;
	
	private long id;
	
	private SystemAdmin_PO systemAdmin;
	
	private Date date;
	
	private String ip;
	
	private String device;
	
	private String cotents;
	
	public SystemAdminLog_PO()
	{
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public SystemAdmin_PO getSystemAdmin() {
		return systemAdmin;
	}

	public void setSystemAdmin(SystemAdmin_PO systemAdmin) {
		this.systemAdmin = systemAdmin;
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