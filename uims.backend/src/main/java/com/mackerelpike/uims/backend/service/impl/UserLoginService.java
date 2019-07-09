package com.mackerelpike.uims.backend.service.impl;

import com.mackerelpike.uims.backend.dao.IUserDao;
import com.mackerelpike.uims.backend.po.User_PO;
import com.mackerelpike.uims.backend.service.IUserLoginService;
import com.mackerelpike.uims.backend.utils.ErrorEnum;
import com.mackerelpike.uims.backend.utils.Result_VO;

public class UserLoginService implements IUserLoginService 
{
	private IUserDao userDao;
	
	public Result_VO<User_PO> login(String name, String password) 
	{
		Result_VO<User_PO> result = null; 
		
		User_PO user = this.userDao.find(name);
		
		if(user == null)
		{
			result = new Result_VO<User_PO>(null, ErrorEnum.OBJECT_NOT_EXIST);
		} else 
		{
			if(!user.getPassword().equals(password))
			{
				result = new Result_VO<User_PO>(null,ErrorEnum.PASSWORD_NOT_MATCH);
			}
			else
			{
				result = new Result_VO<User_PO>(user,ErrorEnum.SUCC);
			}
		}
		
		return result;
	}

	public void logout(String name) 
	{
		
	}

}
