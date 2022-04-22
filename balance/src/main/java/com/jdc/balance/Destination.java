package com.jdc.balance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Destination {

	private HttpServletRequest req;
	private HttpServletResponse resp;
	private String viewName;
	private String pageTitle;
	private String viewTitle;
	private String activeMenu;

	public HttpServletRequest getReq() {
		return req;
	}

	public void setReq(HttpServletRequest req) {
		this.req = req;
	}

	public HttpServletResponse getResp() {
		return resp;
	}

	public void setResp(HttpServletResponse resp) {
		this.resp = resp;
	}

	public String getViewName() {
		return viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

	public String getPageTitle() {
		return pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	public String getViewTitle() {
		return viewTitle;
	}

	public void setViewTitle(String viewTitle) {
		this.viewTitle = viewTitle;
	}

	public String getActiveMenu() {
		return activeMenu;
	}

	public void setActiveMenu(String activeMenu) {
		this.activeMenu = activeMenu;
	}

	private Destination(HttpServletRequest req, HttpServletResponse resp, String viewName, String pageTitle,
			String viewTitle, String actionMenu) {
		super();
		this.req = req;
		this.resp = resp;
		this.viewName = viewName;
		this.pageTitle = pageTitle;
		this.viewTitle = viewTitle;
		this.activeMenu = actionMenu;
	}
	
	public static class Builder{
		
		private HttpServletRequest req;
		private HttpServletResponse resp;
		private String viewName;
		private String pageTitle;
		private String viewTitle;
		private String activeMenu;
		
		
		
		public Builder req(HttpServletRequest req) {
			this.req = req;
			return this;
		}



		public Builder resp(HttpServletResponse resp) {
			this.resp = resp;
			return this;
		}



		public Builder viewName(String viewName) {
			this.viewName = viewName;
			return this;
		}



		public Builder pageTitle(String pageTitle) {
			this.pageTitle = pageTitle;
			return this;
		}



		public Builder viewTitle(String viewTitle) {
			this.viewTitle = viewTitle;
			return this;
		}



		public Builder activeMenu(String activeMenu) {
			this.activeMenu = activeMenu;
			return this;
		}



		public  Destination build() {
			return new Destination(req, resp, viewName, pageTitle, viewTitle, activeMenu);
		}
	}
}
