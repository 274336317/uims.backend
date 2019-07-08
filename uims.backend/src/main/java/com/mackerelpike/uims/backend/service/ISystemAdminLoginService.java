package com.mackerelpike.uims.backend.service;

public interface ISystemAdminLoginService 
{
	public boolean login(String name, String password);
	
	public void logout(String name);
}
