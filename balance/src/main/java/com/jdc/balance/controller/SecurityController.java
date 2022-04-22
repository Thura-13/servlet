package com.jdc.balance.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdc.balance.BaseController;
import com.jdc.balance.Destination;
import com.jdc.balance.Destination.Builder;
import com.jdc.balance.security.LoginUser;

@WebServlet({
	"/login",
	"/logout"
})
public class SecurityController extends BaseController{


	private static final long serialVersionUID = 1L;

	@Override
	protected void process(HttpServletRequest req, HttpServletResponse resp, String path) throws IOException, ServletException {
		switch(path) {
		case "/login" -> login(req, resp);
		case "/logout" -> logout(req, resp);

		}
	}
	
	private void login(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		if(isPostRequest(req)) {
//			To Do Action
			
			getLoginInfo(req).setLogin(true);
			redirect(resp, "/employee/home");
		}else {
			Destination.Builder builder = new Destination.Builder();
			builder.req(req).resp(resp).viewName("login");
			nevigate(builder.build());
		}
	}

	private void logout(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		getLoginInfo(req).setLogin(false);
		redirect(resp,"/login");
		
		
	}
	
	
}
