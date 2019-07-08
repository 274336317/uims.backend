package com.mackerelpike.uims.backend;

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
	
	public Result_VO()
	{
		
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