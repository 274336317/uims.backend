package com.mackerelpike.uims.backend.po;

import java.io.Serializable;

/**
 * 所有持久化类的超类
 * @author David
 *
 */
public abstract class PersistenObject implements Serializable 
{

	private static final long serialVersionUID = -6424526899730445972L;
	
	//对象的版本号，用于实现乐观锁
	private int version;
	
	//对象是否被使能
	private boolean enabled;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}