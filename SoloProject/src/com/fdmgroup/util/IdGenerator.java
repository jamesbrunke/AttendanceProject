package com.fdmgroup.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IdGenerator {

	private static int id;
	
	public static int generate() {
		
		String query = "Select MAX(USER_ID) FROM ATTENDENCE_USER";
		try(Connection connection = DataSource.getSoleInstance().getConnection();
				PreparedStatement ps =connection.prepareStatement(query))
		{
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				id = rs.getInt("max(user_id)");
			}
	
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return id + 1;
	}

}
