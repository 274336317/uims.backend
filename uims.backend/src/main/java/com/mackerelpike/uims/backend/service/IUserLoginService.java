package com.mackerelpike.uims.backend.service;

import com.mackerelpike.uims.backend.Result_VO;
import com.mackerelpike.uims.backend.po.User_PO;

public interface IUserLoginService 
{
	public Result_VO<User_PO> login(String name, String password);
	
	public void logout(String name);
}
