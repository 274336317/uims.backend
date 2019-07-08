package com.mackerelpike.uims.backend.service;

import com.mackerelpike.uims.backend.po.User_PO;

public interface IUserManageService 
{
	public void add(User_PO user);
	
	public void update(User_PO user);
	
	public User_PO find(String userName);
	
	public void delete(long id);
}
