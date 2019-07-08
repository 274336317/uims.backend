package com.mackerelpike.uims.backend.po;

import java.io.Serializable;

/**
 * 资源所拥有的权限
 * @author David
 *
 */
public class Privilege_PO extends PersistenObject implements Serializable 
{
	private static final long serialVersionUID = -6111818024155475160L;
	
	private long id;
	
	private String number;
	
	private String name;
	
	private Resource_PO resource;
	
	public Privilege_PO()
	{
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Resource_PO getResource() {
		return resource;
	}

	public void setResource(Resource_PO resource) {
		this.resource = resource;
	}
}
