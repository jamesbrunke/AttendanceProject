package com.fdmgroup.view;

import java.util.Scanner;

import com.fdmgroup.controller.AuthenticationController;
import com.fdmgroup.controller.ClassController;
import com.fdmgroup.controller.RegistrationController;
import com.fdmgroup.model.UserSession;

public class DashboardView {

	private Scanner scanner;
	private AuthenticationController authenticationController;
	private RegistrationController registrationController;
	private ClassController classController;
	
	public ClassController getClassController() {
		return classController;
	} 
	
	public void setClassController(ClassController classController) {
		this.classController = classController;
	}

	public DashboardView() {
		super();
	}
	
	public DashboardView(Scanner scanner) {
		super();
		this.scanner = scanner;
	}

	public DashboardView(Scanner scanner, AuthenticationController authenticationController, RegistrationController registrationController) {
		super();
		this.scanner = scanner;
		this.authenticationController = authenticationController;
		this.registrationController = registrationController;
	}

	public RegistrationController getRegistrationController() {
		return registrationController;
	}

	public void setRegistrationController(RegistrationController registrationController) {
		this.registrationController = registrationController;
	}

	public void showDashboard() {
		System.out.println("Welcome " + UserSession.getLoggedInUser().getFirstname() + " " + UserSession.getLoggedInUser().getLastname() + " " + UserSession.getLoggedInUser().getId()+ "!");
		System.out.println("Please select one of the options below: ");
		System.out.println("1) Logout");
		System.out.println("2) Add-Class");
		String userInput = scanner.nextLine();
		
		switch (userInput) {
		case "1":
			authenticationController.logout();
			break;
		case "2":
			System.out.println("Please enter the Class Id of the class you wish to add.");
			userInput=scanner.nextLine();
			Integer classId = Integer.parseInt(userInput);
			classController.addClass(classId);
			break;
			
		default:
			System.out.println("The input was invalid.");
			showDashboard();
		}
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public AuthenticationController getAuthenticationController() {
		return authenticationController;
	}

	public void setAuthenticationController(AuthenticationController authenticationController) {
		this.authenticationController = authenticationController;
	}
	
	
}



















