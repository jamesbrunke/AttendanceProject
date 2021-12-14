package com.fdmgroup.app;

import java.util.Scanner;

import com.fdmgroup.controller.AuthenticationController;
import com.fdmgroup.controller.ClassController;
import com.fdmgroup.controller.HomeController;
import com.fdmgroup.controller.RegistrationController;
import com.fdmgroup.dao.ClassJdbcDao;
import com.fdmgroup.dao.IClassDao;
import com.fdmgroup.dao.IUserDao;
import com.fdmgroup.dao.UserCollectionDao;
import com.fdmgroup.dao.UserJdbcDao;
import com.fdmgroup.view.DashboardView;
import com.fdmgroup.view.HomeView;

public class MainApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//IUserDao userDao = new UserCollectionDao();
		IUserDao userDao = new UserJdbcDao();
		IClassDao classDao = new ClassJdbcDao();
		
		//Views
		HomeView hv = new HomeView(scanner);
		DashboardView dv = new DashboardView(scanner);
		
		//Controllers
		HomeController hc = new HomeController();
		AuthenticationController ac = new AuthenticationController();
		RegistrationController rc = new RegistrationController();
		ClassController cc = new ClassController();
		
		hc.setHomeView(hv);
		ac.setDashboardView(dv);
		ac.setHomeView(hv);
		ac.setUserDao(userDao);
		rc.setDashboardView(dv);
		rc.setHomeView(hv);
		rc.setUserDao(userDao);
		cc.setHomeView(hv);
		cc.setDashboardView(dv);
		cc.setClassDao(classDao);
		
		hv.setAuthenticationController(ac);
		hv.setHomeController(hc);
		hv.setRegistrationController(rc);
		dv.setAuthenticationController(ac);
		dv.setRegistrationController(rc);
		hv.setClassController(cc);
		dv.setClassController(cc);
		
		
		
		hc.showHome();
		
		scanner.close();
	}
}









