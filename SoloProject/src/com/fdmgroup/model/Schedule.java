package com.fdmgroup.model;

import java.util.ArrayList;
import java.util.Date;

public class Schedule {
	
	private ArrayList<Date> timeSlots;

	public Schedule(ArrayList<Date> timeSlots) {
		super();
		this.timeSlots = timeSlots;
	}

	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Date> getTimeSlots() {
		return timeSlots;
	}

	public void setTimeSlots(ArrayList<Date> timeSlots) {
		this.timeSlots = timeSlots;
	}
	
	

}
