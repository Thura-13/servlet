<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Balance | <%=request.getAttribute("page-title") %></title>
<% String styleCss = request.getContextPath().concat("/assets/css/style.css"); %>
<link rel="stylesheet" href="<%=styleCss%>">
</head>

<body>
<jsp:useBean id="content" class="java.lang.String" scope="request"></jsp:useBean>

	<jsp:useBean id="loginInfo" class="com.jdc.balance.security.LoginUser"
		scope="session"></jsp:useBean>	

	<%
	if (loginInfo.isLogin()) {
	%>
		<!-- Employee Template -->
		
		<main class="employee">
		<header>
			<div class="brand-logo">
				Balance
			</div>
			<nav>
				<a class="<%=activeClass(request, "home") %>" href="<%=getpath("/employee/home")%>">Home</a>
				<a class="<%=activeClass(request, "reports") %>" href="<%=getpath("/manager-balance")%>">Balance Report</a>
				<a class="<%=activeClass(request, "Income") %>" href="<%=getpath("/employee-transaction-search?type=Income")%>">Income</a>
				<a class="<%=activeClass(request, "Expense") %>" href="<%=getpath("/employee-transaction-search?type=Expense")%>">Expense</a>
				<a class="<%=activeClass(request, "employee")%>" href="<%=getpath("/manager-employee-search")%>">Employees</a>
				<a href="<%=getpath("/logout")%>">Logout</a>
			</nav>
		</header>
			<aside class="box">
				
				<!-- user-profile -->
				<img class="user-profile" alt="" src="<%=getpath("/assets/image/user-profile.png")%>">
				
				<!-- user-information -->
				<div class="user-name">Aung Aung</div>
				<div class="user-role">Manager</div>
				
				<!-- user-action -->
				<div class="user-action">
					<a class="btn btn-text">Upload Photo</a>
					<a class="<%=activeClass(request, "home") %> btn btn-text" href="<%=getpath("/employee/edit-profile")%>">Edit Profile</a>
					<a class="<%=activeClass(request, "home") %> btn btn-text" href="<%=getpath("/employee/change-pass")%>">Change Password</a>
				</div>
			</aside>
			<section class="box">
			<div class="view-title">
				<%= request.getAttribute("view-title") %>
			</div>	
			<jsp:include page="<%= content %>"></jsp:include>
			</section>
		</main>

	<%
	} else {
		
	%>
		<main class="anonymous">
			<jsp:include page="<%=content %>"></jsp:include>
		</main>
	<%
	}
	%>
	
	<%! String getpath(String path){
		return getServletContext().getContextPath().concat(path);
	}	
		%>
	
	
	<%! String activeClass(HttpServletRequest req,String menu) {
			return menu.equals(req.getAttribute("active-menu"))? "active" : ""; }
		%>
	
</body>
</html>