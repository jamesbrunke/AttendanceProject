package com.fdmgroup.model;

public class Classes implements IStorable {
	
	private int id;
	private int scheduleId;
	private String className;

	
	
	
	public Classes(int id, int scheduleId, String className) {
		super();
		this.id = id;
		this.scheduleId = scheduleId;
		this.className = className;
	}
	
	public Classes() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSchedule() {
		return scheduleId;
	}
	public void setSchedule(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	

}
