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
		int empID = (int) session.getAttribute("empID");
	%>
	<div>
		<form action="AddVehicle" method="GET">
			<h2>Add Vehicle</h2>
			Vehicle Name <input id="vehicleName" type="text" name="vehicleName"
				required /> </br>
			</br> Vehicle Type <select id="vehicleType" name="vehicleType" required />
			<option name="cycle" value="cycle">cycle</option>
			<option name="2wheeler" value="2wheeler">2wheeler</option>
			<option name="4wheeler" value="4wheeler">4wheeler</option>
			</select> </br>
			</br> Vehicle Number <input id="vehicleNumber" type="text"
				name="vehicleNumber" required /> </br>
			</br> Employee Id <input id="empID" type="text" name="empID"
				value="<%=empID%>" readonly /> </br>
			</br> Identification
			<textarea name="identification" cols="20"></textarea>
			</br>
			</br> <input type="submit" value="AddVehicle" />
		</form>
	</div>
</body>
</html>