package com.mackerelpike.uims.backend.service;

public interface IUserLoginService 
{
	public boolean login(String name, String password);
	
	public void logout(String name);
}
