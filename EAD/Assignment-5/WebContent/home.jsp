<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<div align = "center">
	<form action = "" method = "get">
		<%if(request.getAttribute("Message")!=null){ %>
			<p style = 'color:red; font-size: 120%'><%=request.getAttribute("Message") %></p>
		<%} %>
		<table>
		<div style="float:right">
		<input type ="submit" value = "Logout" onClick = "form.action = 'Logout'">
	</div>
	<tr>
	<td>
	</br>
	</td>
	</tr>
	<tr>
	<td>
		<p style = 'color:blue; font-size: 120%'>Add New Product To Cart</p>
		<input type = "submit" value = "Add New Product" onClick = "form.action = 'displayProduct'">
		</td>
	</tr>	
	<tr>
		<td>
			<p style = 'color:blue; font-size: 120%'>View Your Cart</p>
		</td>
	</tr>
	<tr>
		<td>
			<input type = "submit" value = "View Cart" onClick = "form.action = 'viewCart'">
		</td>
	</tr>
	<tr>
		<td>
		<p style = 'color:blue; font-size: 120%'>Update Your Cart</p>
		</td>
	</tr>
	<tr>
		<td>
		<input type = "submit" value = "Edit Cart" onClick = "form.action = 'viewCart'">
		</td>
	</tr>
		</table>
	</form>
</div>
</body>
</html>