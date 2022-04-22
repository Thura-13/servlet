<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!-- Header Info -->

<div class="balance-summary">
	<label for="">Balance Id</label>
	<input class="input" type="text" disabled="disabled" value="0004" />
	<label for="">Date</label>
	<input class="input"  type="date" />
	<label for="">Item</label>
	<input class="input" type="text" class="right"  />
	<label for="">Employee</label>
	<input class="input" type="text" placeholder="Enter Employee Name" />
	<label for="">Statu</label>
	<input class="input" type="text" value="Not Approve" />
	<label for="">Total</label>
	<input class="input" type="text" class="right"  />
</div>

<!-- Action -->

<div class="padd right">
	<a href="#" class="btn btn-text">Add Details</a>
	<a href="#" class="btn btn-text">Save</a>
</div>

<!-- Detail Info -->

<h3>Expense Details</h3>
<table>
	<thead>
		<tr>
			<th>Item</th>
			<th>Remark</th>
			<th class="w-number-input">Unit Price</th>
			<th class="w-number-input">Quantity</th>
			<th class="w-number-input">Total</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>
				<input class="input-text" type="text" placeholder="Enter Item"/>
			</td>
			<td>
				<input class="input-text" type="text" placeholder="Enter Remark" />
			</td>
			<td>
				<input class="input-number" type="number" />
			</td>
			<td>
				<input class="input-number" type="number" />
			</td>
			<td>
				<input class="input-number" type="number" />
			</td>
		</tr>
	</tbody>
</table>