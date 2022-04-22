package com.jdc.balance.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdc.balance.BaseController;
import com.jdc.balance.Destination;
import com.jdc.balance.Destination.Builder;

@WebServlet({
	"/manager-employee-search",
	"/manager-employee-save",
	"/manager-employee-edit"
	
})
public class EmployeeController extends BaseController{

	private static final long serialVersionUID = 1L;

	@Override
	protected void process(HttpServletRequest req, HttpServletResponse resp, String path) throws ServletException, IOException {
		switch(path) {
		case "/manager-employee-search" -> search(req, resp);
		case "/manager-employee-save" -> save(req, resp);
		case "/manager-employee-edit" -> edit(req, resp);
		}
	}
	
	private void search(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Destination.Builder builder = new Destination.Builder();
		builder.req(req).
		resp(resp).
		viewName("manager/employees").
		pageTitle("Employee").viewTitle("Employee Management").
		activeMenu("employee");
		
		nevigate(builder.build());
	}
	
	private void save(HttpServletRequest req, HttpServletResponse resp) {
		
	}
	
	private void edit(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		if(isPostRequest(req)) {
			
//			TODO Save Employee
			redirect(resp,"/manager-employee-search");
		}else {
			
//			TODO Edit Employee
			String action = req.getParameter("id") == null  ? "Add Employee" : "Edit Employee";
			Destination.Builder builder = new Destination.Builder();
			builder.req(req).
			resp(resp).
			viewName("manager/employee-edit").
			pageTitle("Employee-Edit").viewTitle(action).
			activeMenu("employee");
			
			nevigate(builder.build());
		}
	}

}
