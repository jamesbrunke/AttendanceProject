package com.fdmgroup.controller;

import com.fdmgroup.dao.IUserDao;
import com.fdmgroup.model.User;
import com.fdmgroup.view.DashboardView;
import com.fdmgroup.view.HomeView;

public class RegistrationController {
	
	private DashboardView dashboardView;
	private HomeView homeView;
	
	
	public DashboardView getDashboardView() {
		return dashboardView;
	}

	public void setDashboardView(DashboardView dashboardView) {
		this.dashboardView = dashboardView;
	}
	
	public HomeView getHomeView() {
		return homeView;
	}

	public void setHomeView(HomeView homeView) {
		this.homeView = homeView;
	}

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	private IUserDao userDao;
	
	public RegistrationController (DashboardView dashboardView, HomeView homeView, IUserDao userDao) 
	{
		super();
		this.dashboardView = dashboardView;
		this.homeView = homeView;
		this.userDao = userDao;
	}

	public RegistrationController()
	{
		super();
	}
	
	public void register(User u)
	{
		
		if(userDao.findByUsername(u.getUsername()) != null)
		{
			System.out.println("Username already taken");
			homeView.showRegisterOptions();
		}

		userDao.create(u);
		
		System.out.println("User Registered, Please Login");
		
		homeView.showLoginOptions(false);
		
	}
}
