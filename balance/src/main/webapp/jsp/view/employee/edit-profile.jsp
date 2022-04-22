<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <form class="form w-440" method="post">
    	<label for="">Employee Code</label>
    	<input type="text" value="EMP001" readonly="readonly" />
    	
    	<label for="">Employee Name</label>
    	<input type="text" name="employeeName" placeholder="Enter Employee Name" />
    	
    	<label for="">Employee Phone</label>
    	<input type="text" name="employeePhone" placeholder="Enter Employee Phone" />
    	
    	<label for="">Email Address</label>
    	<input type="text" name="emailAddress" placeholder="Enter Email Address" />
    	
    	<button class="btn" type="submit">Save Profile</button>
    </form>