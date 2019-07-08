package com.mackerelpike.uims.backend.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 单位下的组织结构
 * @author David
 *
 */
public class Organization_PO extends PersistenObject implements Serializable 
{
	private static final long serialVersionUID = -8300221188821659056L;
	
	private long id;
	
	private String name;
	
	private Organization_PO parent;
	
	//所属单位
	private Unit_PO unit;
	
	//下级组织
	private List<Organization_PO> children = new ArrayList<Organization_PO>();
	
	private List<User_PO> users = new ArrayList<User_PO>();
	
	private List<Resource_PO> resources = new ArrayList<Resource_PO>();
	
	public Organization_PO()
	{
		
	}

	public List<Resource_PO> getResources() {
		return resources;
	}

	public void setResources(List<Resource_PO> resources) {
		this.resources = resources;
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

	public Organization_PO getParent() {
		return parent;
	}

	public void setParent(Organization_PO parent) {
		this.parent = parent;
	}

	public Unit_PO getUnit() {
		return unit;
	}

	public void setUnit(Unit_PO unit) {
		this.unit = unit;
	}

	public List<Organization_PO> getChildren() {
		return children;
	}

	public void setChildren(List<Organization_PO> children) {
		this.children = children;
	}

	public List<User_PO> getUsers() {
		return users;
	}

	public void setUsers(List<User_PO> users) {
		this.users = users;
	}

}
