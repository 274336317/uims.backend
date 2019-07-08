package com.mackerelpike.uims.backend.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 资源
 * @author David
 *
 */
public class Resource_PO extends PersistenObject implements Serializable 
{
	private static final long serialVersionUID = -7042965476605043083L;
	
	private long id;
	
	private String name;
	
	private Resource_PO parent;
	
	private Organization_PO organization;
	
	private List<Privilege_PO> privileges = new ArrayList<Privilege_PO>();
	
	public Resource_PO()
	{
		
	}

	public List<Privilege_PO> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(List<Privilege_PO> privileges) {
		this.privileges = privileges;
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

	public Resource_PO getParent() {
		return parent;
	}

	public void setParent(Resource_PO parent) {
		this.parent = parent;
	}

	public Organization_PO getOrganization() {
		return organization;
	}

	public void setOrganization(Organization_PO organization) {
		this.organization = organization;
	}	
}