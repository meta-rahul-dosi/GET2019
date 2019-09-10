<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.sql.*, temp.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		DBConnection dbconn = new DBConnection();
		Connection conn = dbconn.connectDB();

		int friendID = (int) session.getAttribute("friendID");

		String queryToFetchFriendDetails = "SELECT fullName, gender, email, contact, organization FROM emp_details WHERE empID="
				+ friendID;
		Statement statement = conn.createStatement();
		ResultSet resultSet = statement
				.executeQuery(queryToFetchFriendDetails);
		resultSet.next();
		String friendName = resultSet.getString(1);
		String gender = resultSet.getString(2);
		String email = resultSet.getString(3);
		String contact = resultSet.getString(4);
		String organization = resultSet.getString(5);
	%>

	<div>
		<h1>Friend's Profile</h1>
		<hr>
		<br /> <br />
		<form action="" method="post">
			Full name: <input type="text" value="<%=friendName%>" name="fullName"
				onchange="fullNameValidation()" readonly /><br /> <br /> Gender:
			<input type="text" value="<%=gender%>" name="gender" /><br /> <br />
			Email Id: <input type="email" value="<%=email%>" name="email"
				onchange="emailValidation()" readonly /> <br /> <br> Contact
			Number: <input type="text" value="<%=contact%>" name="contact"
				pattern="[0-9]{8,}" onchange="contactValidation()" readonly /><br />
			<br /> Organization: <input type="text" value="<%=organization%>"
				name="organization" / readonly> <br> <br>
		</form>
	</div>

</body>
</html>