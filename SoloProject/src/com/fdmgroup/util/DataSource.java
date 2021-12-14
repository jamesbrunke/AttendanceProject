package com.fdmgroup.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DataSource {
	private static DataSource soleInstance;
	private ComboPooledDataSource cpds;
	
	private DataSource()
	{
		cpds=new ComboPooledDataSource();
		Properties properties = new Properties();
		
		try {
			FileReader filereader = new FileReader("DbConfig.properties");
			properties.load(filereader);
			
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		//provide URL, username, and password
		cpds.setJdbcUrl(properties.getProperty("db.connection.url"));
		cpds.setUser(properties.getProperty("db.connection.user"));
		cpds.setPassword(properties.getProperty("db.connection.password"));
		
		cpds.setInitialPoolSize(5);
		cpds.setMaxPoolSize(10);
	}
	
	public static DataSource getSoleInstance()
	{
		if (soleInstance ==null)
		{
			soleInstance=new DataSource();
		}
		return soleInstance;
	}
	
	public Connection getConnection() throws SQLException
	{
		return cpds.getConnection();
	}

}
