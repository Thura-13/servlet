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
	"/employee-transaction-search",
	"/employee-transaction-detail",
	"/employee-transaction-edit",
	"/manager-transaction-approve",
})
public class TransactionController extends BaseController{

	private static final long serialVersionUID = 1L;
	
	private static final String LIST_VIEW = "/employee/transaction";
	private static final String EDIT_VIEW = "/employee/transaction-edit";
	private static final String DETAIL_VIEW = "/employee/transaction-detail"; 

	private static final String SEARCH_ACTION = "/employee-transaction-search"; 
	private static final String DETAIL_ACTION = "/employee-transaction-detail"; 
	private static final String EDIT_ACTION = "/employee-transaction-edit";
	private static final String APPROVE_ACTION = "/manager-transaction-approve";
	
							
	@Override
	protected void process(HttpServletRequest req, HttpServletResponse resp, String path) throws ServletException, IOException {
		switch(path) {
		case SEARCH_ACTION -> search(req, resp);
		case DETAIL_ACTION -> showDetail(req, resp);
		case EDIT_ACTION -> edit(req, resp);
		case APPROVE_ACTION -> approve(req, resp);
		}
	}
	
	private void search(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		TODO Search Action
		nevigate(getDestinationBuilder(LIST_VIEW,"Income".equals(req.getParameter("type")))
				.req(req)
				.resp(resp)
				.build());
	}
	
	private void showDetail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		TODO Detail Action
		nevigate(getDestinationBuilder(DETAIL_VIEW,"Income".equals(req.getParameter("type")))
				.req(req)
				.resp(resp)
				.build());
		
	}
	


	private void edit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		if(isPostRequest(req)) {
//			TODO Save Action
			redirect(resp, DETAIL_VIEW);
		}else {
//			TODO Edit View Action
			nevigate(getDestinationBuilder(EDIT_VIEW,"Income".equals(req.getParameter("type")))
					.req(req)
					.resp(resp)
					.build());
		}
	}
	
	
	private void approve(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
//		TODO Approve Action
		redirect(resp, "/employee-transaction-search");
	}
	
	
	private Destination.Builder getDestinationBuilder(String viewName,boolean isIncome){
		
		Destination.Builder builder = new Destination.Builder();
		builder.viewName(viewName);
		
		if(isIncome) {
			builder.pageTitle("Daily Income")
			.viewTitle("Daily Income")
			.activeMenu("Income");
		}else {
			builder.pageTitle("Daily Expense")
			.viewTitle("Daily Expense")
			.activeMenu("Expense");
		}
		return builder;
}
	
	}	
