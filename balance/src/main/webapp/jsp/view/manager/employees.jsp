<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<form class="form-inline">
	<div class="form-group">
		<label for="">Role</label>
		<select class="input">
			<option value="All">All</option>
			<option value="Manager">Manager</option>
			<option value="Employee">Employee</option>
		</select>
	</div>
	<div class="form-group">
		<label for="">Name</label>
		<input class="input" type="text" name="name" placeholder="Search Name" />
	</div>
	<div class="form-group">
		<button class="btn btn-text" type="submit">Search</button>
		<a href="<%=getpath("/manager-employee-edit") %>" class="btn btn-text" href="">Add New</a>
	</div>
</form>    

<table>
	<thead>
		<tr>
			<th>Code</th>
			<th>Name</th>
			<th>Role</th>
			<th>Phone</th>
			<th>Registration</th>
			<th>Retire</th>
		</tr>
	</thead>
	<tbody>
		<%for(int i =0; i<10; i++) { %>
		<tr>
			<td>EMP001</td>
			<td>Aung Aung</td>
			<td>Manager</td>
			<td>09968677202</td>
			<td>22-03-2022</td>
			<td>04-05-2022</td>
		</tr>
		<% } %>
	</tbody>
</table>

<%! String getpath(String path){
		return getServletContext().getContextPath().concat(path);
	}	
%>
	