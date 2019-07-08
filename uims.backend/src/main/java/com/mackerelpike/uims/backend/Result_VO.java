package com.mackerelpike.uims.backend;

import com.mackerelpike.uims.backend.utils.ErrorEnum;

/**
 * 表示方法调用后返回的结果
 * @author David
 *
 */
public class Result_VO<T> 
{
	private int errorCode;
	
	private String description;
	
	private T data;
	
	public static <T> Result_VO<T> GetSucc(T data)
	{
		return new Result_VO<T>(data, ErrorEnum.SUCC);
	}
	
	public static <T> Result_VO<T> GetResult(ErrorEnum error)
	{
		return new Result_VO<T>(null, error);
	}
	
	public Result_VO(T data, ErrorEnum error)
	{
		this.data = data;
		this.errorCode = error.getCode();
		this.description = error.getDescription();
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setData(T data) {
		this.data = data;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getDescription() {
		return description;
	}

	public T getData() {
		return data;
	}
}