package com.mackerelpike.uims.backend.service;

import com.mackerelpike.uims.backend.po.User_PO;
import com.mackerelpike.uims.backend.utils.Result_VO;

public interface IUserLoginService 
{
	public Result_VO<User_PO> login(String name, String password);
	
	public void logout(String name);
}
