<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String vehicleTypeCame = (String) session
				.getAttribute("vehicleType");
	   
	%>

	<div>
		<form align="center" action="PassPrice" method="GET">

			Vehicle Type is <input type="text" name="vehicleType"
				value="<%=vehicleTypeCame%>" readonly /><br/> <br/> 
				
			Pricing in
			<select name="currency">
				<option name="INR" value="INR">INR</option>
				<option name="USD" value="USD">USD</option>
				<option name="YEN" value="YEN">YEN</option>
			</select><br /> <br /> 
			
			Parking Plan basis 
			<select name="forTime">
				<option name="daily" value="daily">daily</option>
				<option name="monthly" value="monthly">monthly</option>
				<option name="yearly" value="yearly">yearly</option>
			</select><br /> <br />
			
			<input type="submit" value="Get Pass"/>
		
		</form>
	</div>
	
	
	<br />
	<br />

</body>
</html>