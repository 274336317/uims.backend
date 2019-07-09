package com.mackerelpike.uims.backend.dao;

import java.util.List;

import com.mackerelpike.uims.backend.po.User_PO;
import com.mackerelpike.uims.backend.utils.Result_VO;

public interface IUserDao 
{
	public User_PO find(String name);
	
	public Result_VO<User_PO> update(User_PO user);
	
	public void delete(User_PO user);
	
	public Result_VO<User_PO> add(User_PO user);
	
	public List<User_PO> getList(int limit, int offset);
}