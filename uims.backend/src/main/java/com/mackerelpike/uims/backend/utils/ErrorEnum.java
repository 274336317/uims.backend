package com.mackerelpike.uims.backend.utils;

public enum ErrorEnum 
{
	SUCC(1, "操作成功"),
	OBJECT_NOT_EXIST(1002,"对象不存在"),
	PASSWORD_NOT_MATCH(1003,"密码不匹配");
	
	//错误描述
	private String description;
	//错误编码
	private int code;
	
	private ErrorEnum(int code, String description)
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
