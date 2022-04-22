<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

  <form action="" class="form w-440" method="post">
 
  		<label for="">Role</label>
  		<select>
  			<option value="Employee">Employee</option>
  			<option value="Manager">Manager</option>
  		</select>
 
  		<label for="">Code</label>
  		<input type="text"  placeholder="Enter Employee Code" />
  	
  	
  		<label for="">Phone</label>
  		<input type="text" placeholder="Enter Phone Number" />
  	
  		<label for="">Email</label>
  		<input type="text" placeholder="Enter Email" />
  		
  		<div class="row">
  			<div class="col">
  			<label style="display: block;" for="">Retiry Date</label>
  			<input style="width: 90%;" type="date"/>
  			</div>
  			<div class="col">
  			<label style="display: block;" for="">Entry Date</label>
  			<input style="width: 100%;" type="date"/>
  			</div>
  		</div>
	
	<button class="btn btn-text">Save</button>  	
  </form>