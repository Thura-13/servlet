package com.jdc.balance.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdc.balance.BaseController;
import com.jdc.balance.Destination;

@WebServlet("/manager-balance")
public class BalanceController extends BaseController{

	private static final long serialVersionUID = 1L;


	@Override
	protected void process(HttpServletRequest req, HttpServletResponse resp,String path) throws ServletException, IOException {
		search(req, resp);
	}
	
	void search(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		Destination.Builder builder = new Destination.Builder();
		builder.req(req)
		.resp(resp)
		.viewName("manager/reports")
		.pageTitle("Balance Report")
		.viewTitle("Balance Report")
		.activeMenu("reports");
		
		nevigate(builder.build());
	}


}
