<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!-- Header Info -->

<div class="balance-summary">
	<label for="">Balance Id</label>
	<input class="input" type="text" disabled="disabled" value="0004" />
	<label for="">Date</label>
	<input class="input" type="text" disabled="disabled" value="21-03-22" />
	<label for="">Item</label>
	<input class="input" type="text" class="right" disabled="disabled" value="5" />
	<label for="">Employee</label>
	<input class="input" type="text" disabled="disabled" value="Min Lwin" />
	<label for="">Statu</label>
	<input class="input" type="text" disabled="disabled" value="Not Approve" />
	<label for="">Total</label>
	<input class="input" type="text" class="right" disabled="disabled" value="10000" />
</div>

<!-- Action -->

<div class="padd right">
	<a href="#" class="btn btn-text">Edit</a>
	<a href="#" class="btn btn-text">Approve</a>
</div>

<!-- Detail Info -->

<h3>Expense Details</h3>
<table>
	<thead>
		<tr>
			<th>Item</th>
			<th>Remark</th>
			<th class="right">Unit Price</th>
			<th class="right">Quantity</th>
			<th class="right">Total</th>
		</tr>
	</thead>
	<% for(int i =0;i<5;i++ ){
	%>
	<tbody>
		<tr>
			<td>Printing Paper</td>
			<td>Some Remark Message</td>
			<td class="right">2000</td>
			<td class="right">5</td>
			<td class="right">10000</td>
		</tr>
	</tbody>
	<% 
	}
	%>
</table>