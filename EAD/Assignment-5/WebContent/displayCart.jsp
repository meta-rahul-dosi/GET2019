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
	
	<%if(session.getAttribute("Message")!=null){ %>
		<p style = 'color:blue; font-size: 120%'><%=session.getAttribute("Message") %><%session.removeAttribute("Message"); %></p>
		<%} %>
		<table>
			<h3>Cart </h3>
			<tr>
				<td>
					<%ArrayList<String> list = (ArrayList<String>)session.getAttribute("Cart");
					int index=0;
					session.removeAttribute("Cart"); %>
					<b></b>
				</td>
				<td>
					<b>Product Name&nbsp;&nbsp;&nbsp;&nbsp;</b>
				</td>
				<td>
					<b>Product Type&nbsp;&nbsp;&nbsp;&nbsp;</b>
				</td>
				<td>
					<b>Price Per Unit&nbsp;&nbsp;&nbsp;&nbsp;</b>
				</td>
				<td>
					<b>Quantity&nbsp;&nbsp;&nbsp;&nbsp;</b>
				</td>
				<td>
					<b>Update Quantity&nbsp;&nbsp;&nbsp;&nbsp;</b>
				</td>
				<td>
					<b>Delete Product&nbsp;&nbsp;&nbsp;&nbsp;</b>
				</td>
			</tr>
			<%for(index=0;index<list.size();index++){ %>
			<form action = "" >
				<tr>
					<td>
						<input type = "text" name = "Product" value ="<%=list.get(index++) %>" readonly="readonly" style = 'border-style:none; opacity:0'>
					</td>
					<td>
						<%=list.get(index++) %>
					</td>
					<td>
						<%=list.get(index++) %>
					</td>
					<td>
						<%=list.get(index++) %>
					</td>
					<td>
						<%=list.get(index) %>
					</td>
					<td>
						<input type = "submit" value='Update Quantity' onClick="this.form.action='getProductQuantityInCart'">
					</td>
					<td>
						<input type = "submit" value='Delete Product' onClick="this.form.action='deleteProduct'">
					</td>
				</tr>
				</form>
			<%} %>
			<a href='home.jsp'><p style = 'color:red; font-size: 120%'>Return To Homepage</p></a>
       	</table>
		
	
	</div>
</body>
</html>