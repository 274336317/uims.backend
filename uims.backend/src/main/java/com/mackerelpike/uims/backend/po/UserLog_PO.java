package com.mackerelpike.uims.backend.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户日志
 * @author David
 *
 */
public class UserLog_PO implements Serializable
{
	private static final long serialVersionUID = -1936564870926199043L;

	private long id;
	
	private User_PO user;
	
	private Date date;
	
	private String ip;
	
	private String device;
	
	private String cotents;
	
	public UserLog_PO()
	{
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User_PO getUser() {
		return user;
	}

	public void setUser(User_PO user) {
		this.user = user;
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