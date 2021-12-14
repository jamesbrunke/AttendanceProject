package com.fdmgroup.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fdmgroup.model.Classes;
import com.fdmgroup.model.User;
import com.fdmgroup.model.UserSession;
import com.fdmgroup.util.DataSource;

public class ClassJdbcDao implements IClassDao{

	@Override
	public Classes findById(int id) {
		String query = "Select * FROM CLASSES WHERE class_id = ? ";
		Classes classes=null;
		
		try(Connection connection = DataSource.getSoleInstance().getConnection();
		PreparedStatement ps = connection.prepareStatement(query);)
		{
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				classes = new Classes(rs.getInt("class_id"),rs.getInt("schedule_id"),rs.getString("class_name"));
			}
		 
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return classes; //will return null if class ID doesnt exist
	}

	@Override
	public Classes findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addClass(int classId)
	{
		String update ="INSERT INTO ATTENDENCE_CLASS_LT(user_id,class_id) VALUES( ? , ?)";
		try(Connection connection = DataSource.getSoleInstance().getConnection();
				PreparedStatement ps = connection.prepareStatement(update);)
		{
			ps.setInt(1, UserSession.getLoggedInUser().getId());
			ps.setInt(2, classId);

			ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return;
	}
	
	

}
