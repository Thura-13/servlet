<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<form class="form-inline">
	<div class="form-group">
		<label for="">Category</label>
		<input class="input" type="text" placeholder="Search Category" />
	</div>
	<div class="form-group">
		<label for="">Date From</label> <input class="input" type="date" />
	</div>
	<div class="form-group">
		<label for="">Date To</label> <input class="input" type="date" />
	</div>
	<div class="form-group">
		<button class="btn btn-text">Search</button>
		<a href="<%= getpath("/employee-transaction-edit") %>" class="btn btn-text">Add New</a>
	</div>
</form>

<table>
	<thead>
		<tr>
			<th>Date</th>
			<th>Employee</th>
			<th>Category</th>
			<th>Approve</th>
			<th class="right">Items</th>
			<th class="right">Amount</th>
		</tr>
	</thead>
	<tbody>
		<% for(int i=0;i<10;i++) {%>
			<tr>
				<td><a href="<%=getpath("/employee-transaction-detail")%>">21-02-22</a></td>
				<td>Min Lwin</td>
				<td>Programming</td>
				<td>Yes</td>
				<td class="right">5</td>
				<td class="right">500000 MMK</td>
			</tr>
		<%} %>
	</tbody>
</table>

<%! String getpath(String path){
		return getServletContext().getContextPath().concat(path);
	}	
%>
	
