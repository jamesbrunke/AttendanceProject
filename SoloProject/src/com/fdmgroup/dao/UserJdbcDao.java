package com.fdmgroup.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.fdmgroup.model.User;
import com.fdmgroup.util.DataSource;

public class UserJdbcDao implements IUserDao{
	
	@Override
	public User create(User t) {
		String stmt = "INSERT INTO ATTENDENCE_USER(user_id, username, password, firstname, lastname) VALUES (?, ?, ?,?, ?)";
		
		try(Connection connection = DataSource.getSoleInstance().getConnection();
				PreparedStatement ps = connection.prepareStatement(stmt);)
		{
			ps.setInt(1, t.getId());
			ps.setString(2, t.getUsername());
			ps.setString(3, t.getPassword());
			ps.setString(4, t.getFirstname());
			ps.setString(5, t.getLastname());
			
			ps.executeUpdate();
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return t;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User findByUsername(String username) {
		
		User user=null;
		String query = "Select * From ATTENDENCE_USER Where USERNAME= ? "; 
		
		try(Connection connection = DataSource.getSoleInstance().getConnection(); 
				PreparedStatement ps=connection.prepareStatement(query);)
		{
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			while (rs.next())
			{
				user = new User(rs.getInt("user_id"),rs.getString("username"),rs.getString("password"),rs.getString("firstname"),rs.getString("lastname"));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return user;
	}

	@Override
	public List<User> findByFirstname(String firstname) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
