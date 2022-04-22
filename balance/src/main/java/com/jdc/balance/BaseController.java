package com.jdc.balance;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdc.balance.security.LoginUser;

public abstract class BaseController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected abstract void process(HttpServletRequest req, HttpServletResponse resp, String path)
			throws IOException, ServletException;

	protected void nevigate(com.jdc.balance.Destination destination)
			throws ServletException, IOException {
		String content = String.format("/jsp/view/%s.jsp", destination.getViewName());
		
		destination.getReq().setAttribute("content", content);
		destination.getReq().setAttribute("page-title", destination.getPageTitle());
		destination.getReq().setAttribute("view-title", destination.getViewTitle());
		destination.getReq().setAttribute("active-menu", destination.getActiveMenu());
		getServletContext().getRequestDispatcher("/jsp/template.jsp").forward(destination.getReq(), destination.getResp());
	}

	protected void redirect(HttpServletResponse resp, String path) throws IOException {
		resp.sendRedirect(getServletContext().getContextPath().concat(path));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp, req.getServletPath());
	}
	
	protected LoginUser getLoginInfo(HttpServletRequest req) {
		LoginUser loginInfo =(LoginUser) req.getSession(true).getAttribute("loginInfo");
		if(loginInfo == null) {
			 loginInfo = new LoginUser();
			 req.getSession().setAttribute("loginInfo", loginInfo);
		}
		
		return loginInfo;

	}
	
	protected boolean isPostRequest(HttpServletRequest req) {
		return "POST".equals(req.getMethod());
	}

	
}
