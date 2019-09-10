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
	<%if(request.getParameter("Product")==null){ %>
		<table>
			<h3>Select a product from list below </h3>
			<tr>
			<td>
					<%ArrayList<String> list = (ArrayList<String>)request.getAttribute("ProductList");
					int index=0;%>
				</td>
				<td>
					<b>Product Name &nbsp;&nbsp;&nbsp;&nbsp;</b>
				</td>
				<td>
					<b>Product Type &nbsp;&nbsp;&nbsp;&nbsp;</b>
				</td>
				<td>
					<b>Product Price &nbsp;&nbsp;&nbsp;&nbsp;</b>
				</td>
				<td>
					<b>Add Product Link &nbsp;&nbsp;&nbsp;&nbsp;</b>
				</td>
			</tr>
		
			<%for(index=0;index<list.size();index++){ %>
			<form action = "displayProducts.jsp" >
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
						<%=list.get(index) %>
					</td>
					<td>
						<input type ="submit" value ="Add to Cart"></br>
					</td>
				</tr>
				</form>
			<%} %>
       	</table>
		<a href='home.jsp'><p style = 'color:red; font-size: 120%'>Return To Homepage</p></a>
	
	<%}else{ %>
		<form action = "addToCart" method = "post">
			<%session.setAttribute("ProductCode",request.getParameter("Product")); %>
			Enter Product Quantity for Selected Product: <input type ="number" name = "Quantity" min = 1 max = 10 required></br>
			<a href='home.jsp'><p style = 'color:red; font-size: 120%'>Return To Homepage</p></a>
			<input type = "submit" value = "Add Product To Cart">
		</form>
	<%} %>
	</div>
</body>
</html>