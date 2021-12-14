package com.fdmgroup.controller;

import com.fdmgroup.dao.IClassDao;
import com.fdmgroup.dao.IUserDao;
import com.fdmgroup.model.UserSession;
import com.fdmgroup.view.DashboardView;
import com.fdmgroup.view.HomeView;

public class ClassController {
	
	private DashboardView dashboardView;
	private HomeView homeView;
	private IClassDao classDao;
	
	public IClassDao getClassDao() {
		return classDao;
	}

	public void setClassDao(IClassDao classDao) {
		this.classDao = classDao;
	}

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
	public ClassController(DashboardView dashboardView, HomeView homeView, IClassDao classDao) {
		super();
		this.dashboardView = dashboardView;
		this.homeView = homeView;
		this.classDao = classDao;
	}

	public ClassController() {
		super();
	}
 
	public void addClass(int classId)
	{
		
		if(classDao.findById(classId) != null)
		{
			classDao.addClass(classId);
			dashboardView.showDashboard();
		}
		
		System.out.println("Invalid Class ID");
		dashboardView.showDashboard();
		
	}
	

}
