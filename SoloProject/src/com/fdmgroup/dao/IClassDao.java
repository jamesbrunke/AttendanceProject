package com.fdmgroup.dao;

import com.fdmgroup.model.Classes;
import com.fdmgroup.model.IStorable;
import com.fdmgroup.model.User;

public interface IClassDao extends IStorable {
	
	public Classes findById(int id);
	public Classes findByName(String name);
	public void addClass(int classId);

}
