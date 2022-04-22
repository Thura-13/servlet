<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<form class="form-inline">
	
	<div class="form-group">
		<label for="">Date From</label>
		<input class="input" type="date" placeholder="Search From" />
	</div>

	<div class="form-group">
		<label for="">Date To</label>
		<input class="input" type="date" placeholder="Search To" />
	</div>
	<button class="btn btn-text">Search</button>
</form>

<table>
	<thead>
		<tr>
			<th>Date</th>
			<th>Category</th>
			<th>Employee</th>
			<th class="right">Income</th>
			<th class="right">Expense</th>
			<th class="right">Balance</th>
		</tr>
	</thead>
	<tbody>
		<% for(int i=0;i<10;i++){ %>
		<tr>
			<td>22-02-2022</td>
			<td>Java Basic</td>
			<td>Min Lwin</td>
			<td class="right">150000 MMK</td>
			<td class="right">0 MMK</td>
			<td class="right">150000 MMK</td>
		</tr>
		<%} %>
	</tbody>
</table>