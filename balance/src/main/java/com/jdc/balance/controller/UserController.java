package com.jdc.balance.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdc.balance.BaseController;
import com.jdc.balance.Destination;

@WebServlet({ "/employee/home", "/employee/change-pass", "/employee/edit-profile"})
public class UserController extends BaseController {

	private static final long serialVersionUID = 1L;

	@Override
	protected void process(HttpServletRequest req, HttpServletResponse resp, String path)
			throws ServletException, IOException {
		switch (path) {
		case "/employee/home" -> loadHome(req, resp);
		case "/employee/change-pass" -> changePassword(req, resp);
		case "/employee/edit-profile" -> editProfile(req, resp);
		}
	}

	private void loadHome(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Destination.Builder builder = new Destination.Builder();
		builder.req(req).resp(resp).viewName("employee/home").pageTitle("Employee").viewTitle("Dashboard")
				.activeMenu("home");
		nevigate(builder.build());
	}

	private void changePassword(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		if (isPostRequest(req)) {

//			To Do Save Passwrod
			
			redirect(resp, "/employee/home");
		} else {

			Destination.Builder builder = new Destination.Builder();
			builder.req(req).resp(resp).viewName("employee/change-password").pageTitle("home")
					.viewTitle("Change Password").activeMenu("home");
			nevigate(builder.build());
		}
	}

	private void editProfile(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		if(isPostRequest(req)) {
			
//			To Do Save Profile
			redirect(resp, "/employee/home");
		}else {
			Destination.Builder builder = new Destination.Builder();
			builder.req(req).resp(resp).viewName("employee/edit-profile").pageTitle("home").viewTitle("Edit Profile")
					.activeMenu("home");
			nevigate(builder.build());
			
		}
	}


}
