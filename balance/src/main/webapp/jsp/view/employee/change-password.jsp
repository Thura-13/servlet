<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <form method="post" class="form w-440">
    	
    	<label for="oldPassword">Old Password</label>
    	<input type="text" id="oldPassword" name="oldPassword" placeholder="Enter Old Password" />
    	
    	<label for="newPassword">New Password</label>
    	<input type="text" id="newPassword" name="newPassword" placeholder="Enter New Password" />
    	
    	<label for="confirmPassword">Confirm Password</label>
    	<input type="text" id="confirmPassword" name="confirmPassword" placeholder="Enter New Password Again" />
    	
    	<button class="btn" type="submit">Change Password</button>
    </form>