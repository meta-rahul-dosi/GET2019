<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<%@page import = "java.util.ArrayList" %>
	<form action = "updateQuantity" >
			<h3>Update Product Quantity</h3>
			ProductCode : <%=session.getAttribute("ProductCode") %></br>
			Product Name : <%=session.getAttribute("Name") %><%session.removeAttribute("Name"); %></br>
			Current Product Quantity : <%=session.getAttribute("Quantity") %><%session.removeAttribute("Quantity"); %></br>
			New Quantity : </br>
			<input type = "number" name = "Quantity" min = 0 max = 10>
			<input type = "submit" value = "Update Quantity">
		</form>
	</div>
</body>
</html>