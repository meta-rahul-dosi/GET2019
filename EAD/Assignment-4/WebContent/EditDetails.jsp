<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String fullName = (String) session.getAttribute("fullName");
		String email = (String) session.getAttribute("email");
		String contact = (String) session.getAttribute("contact");
		String organization = (String) session.getAttribute("organization");
	%>

	<h2>Make Updations</h2>
	<hr>
	<br />
	<br />

	<form action="AfterEditingDetails" method="post">
                    Full name:
                    <input type="text" name="fullName" value="<%=fullName%>" onchange="fullNameValidation()"  required/><br/><br/>

                    Email Id:
                    <input type="email" id="email" name="email" value="<%=email%>" onchange="emailValidation()" required/>
                    <br/><br>

                    Password:
                    <input type="Password" name="password" onchange="passwordValidation()" required/><br/><br/>

                    Confirm Password:
                    <input type="Password" name="password" onchange="confirmPasswordValidation()" required/><br/><br/>

                    Contact Number:
                    <input type="text" name="contact" value="<%=contact %>" pattern="[0-9]{8,}" onchange="contactValidation()" required/><br/><br/>

					Organization:
					<select id="organization" name="organization" value="<%=organization%>" >
                    	<option name = "Metacube" value="Metacube">Metacube</option>
                    	<option name = "IN Time tec" value="IN Time tec">IN Time Tec</option>
                    	<option name = "Appirio"  value="Appirio">Appirio</option>
                    	<option name = "Pratham"  value="Pratham" >Pratham</option>
                	</select><br><br>
                	
                    <input type="submit" value="DONE"/>
                    <br/><br/>
</body>
</html>