<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="pattern.jpg">
	<div align="center">
	<h1>Login Page</h1>
	<%if(session.getAttribute("Error")!=null){ %>
	<p style = 'color:red; font-size: 120%'><%=session.getAttribute("Error") %></p><%session.removeAttribute("Error");%>
	<%} %>
	<%if(request.getAttribute("Error")!=null){ %>
	<p style = 'color:red; font-size: 120%'><%=request.getAttribute("Error") %></p><%request.removeAttribute("Error");%>
	<%} %>
	<form action = "Login" method="post" >
		<table>
			<h3>Enter Valid Credentials</h3>
			<tr>
				<td>
					<label for="userName">User Name : *</label>
				</td>
				<td>
					<input type ="text" id = "userName" name ="userName" placeholder = "User Name" maxlength="45" required>
				</td>
			</tr>
			<tr>
				<td>
					</br>
				</td>
			</tr>
			<tr>
                        <td>
                                <label for = "Password">Password : *</label>
                        </td>
                        <td>
                                <input type = "password" name = "password" id = "Password" placeholder = "Password" required="required"  maxlength="15">
                        </td>
            </tr>
                <tr>
				<td>
					</br>
				</td>
			</tr>
       	</table>
		<input type ="submit" value="Login">
	</form>
	</br>
	
	</div>
</body>
</html>