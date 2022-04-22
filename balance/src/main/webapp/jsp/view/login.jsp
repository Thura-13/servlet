<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <section class="card">
    	<h2 class="login-title">Member Login</h2>
    	<form action="login" class="form" method="post">
    		
    		<!-- Email Address -->
    		<label for="">Email</label>	
    		<input type="text" placeholder="Enter member email" required="required"/>
    		
    		<!-- Password -->
    		<label for="">Password</label>	
    		<input type="password" placeholder="Enter member password" required="required"/>

    		<!-- Login Button -->
    		<button type="submit">Login</button>
    	</form>
    </section>