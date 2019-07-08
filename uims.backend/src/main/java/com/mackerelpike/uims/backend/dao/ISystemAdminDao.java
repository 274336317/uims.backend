package com.mackerelpike.uims.backend.dao;

import com.mackerelpike.uims.backend.po.SystemAdmin_PO;

public interface ISystemAdminDao 
{
	public SystemAdmin_PO find(String name);
	
	public void add(SystemAdmin_PO systemAdmin);
	
	public void update(SystemAdmin_PO systemAdmin);
	
	public void delete(long id);
}