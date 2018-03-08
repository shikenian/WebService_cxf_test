package com.test.vo;

import java.io.Serializable;

public class User implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4454056838551713684L;
	
	private String ID;
	private String name;
	private String age;
	private String desc;
	
	public String getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	public String getDesc() {
		return desc;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
