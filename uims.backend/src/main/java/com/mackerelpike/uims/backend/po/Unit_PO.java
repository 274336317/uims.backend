package com.mackerelpike.uims.backend.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 组织单位
 * @author David
 *
 */
public class Unit_PO extends PersistenObject implements Serializable 
{
	private static final long serialVersionUID = -8621818972600818231L;
	
	private long id;
	
	private String name;
	
	private String description;
	
	private String address;
	
	private String phone_num;
	
	//创建日期
	private Date createdDate;
	
	public Unit_PO()
	{
		
	}

	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}

}