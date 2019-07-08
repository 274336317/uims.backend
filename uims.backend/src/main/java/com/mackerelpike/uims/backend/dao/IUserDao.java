package com.mackerelpike.uims.backend.dao;

import com.mackerelpike.uims.backend.Result_VO;
import com.mackerelpike.uims.backend.po.User_PO;

public interface IUserDao 
{
	public User_PO find(String name);
	
	public Result_VO<User_PO> update(User_PO user);
	
	public void delete(User_PO user);
	
	public Result_VO<User_PO> add(User_PO user);
}
