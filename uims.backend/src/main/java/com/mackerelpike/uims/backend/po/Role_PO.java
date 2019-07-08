package com.mackerelpike.uims.backend.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户角色
 * @author David
 *
 */
public class Role_PO extends PersistenObject implements Serializable 
{
	private static final long serialVersionUID = -4215040149351941926L;
	
	private long id;
	
	private String name;
	
	private List<Privilege_PO> privileges = new ArrayList<Privilege_PO>();
	
	private List<User_PO> users = new ArrayList<User_PO>();
	
	public Role_PO()
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

	public List<Privilege_PO> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(List<Privilege_PO> privileges) {
		this.privileges = privileges;
	}

	public List<User_PO> getUsers() {
		return users;
	}

	public void setUsers(List<User_PO> users) {
		this.users = users;
	}
	
}