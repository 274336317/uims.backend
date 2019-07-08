package com.mackerelpike.uims.backend.utils;

public enum Error 
{
	SUCC(1, "操作成功");
	
	//错误描述
	private String description;
	//错误编码
	private int code;
	
	private Error(int code, String description)
	{
		this.description = description;
		this.code = code;
	}
	
	public int getCode()
	{
		return code;
	}
	
	public String getDescription()
	{
		return this.description;
	}
}
