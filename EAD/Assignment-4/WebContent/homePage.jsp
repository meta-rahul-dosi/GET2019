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
		Connection connection = dbconn.connectDB();

		int empID = (int) session.getAttribute("empID");

		String queryForEmpDetails = "SELECT * FROM emp_details WHERE empID = '"
				+ empID + "';";

		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(queryForEmpDetails);
		resultSet.next();
		String fullName = resultSet.getString(1);
		String gender = resultSet.getString(2);
		String email = resultSet.getString(3);
		String contact = resultSet.getString(5);
		String organization = resultSet.getString(6);

		session.setAttribute("fullName", fullName);
		session.setAttribute("gender", gender);
		session.setAttribute("email", email);
		session.setAttribute("contact", contact);
		session.setAttribute("organization", organization);
	%>

	<div>
            <h1>Employee Details</h1>
            <hr><br/><br/>
            <form  action="EditDetails.jsp" method="post">
                    Full name:
                    <input type="text" name="fullName" value="<%=fullName%>"  readonly/><br/><br/>

                    Gender:
                    <input type="type" name="gender" value="<%=gender%>" readonly/><br/><br/>           

                    Email Id:
                    <input type="email" id="email" name="email"  readonly/>
                    <br/><br>

                    Contact Number:
                    <input type="text"  id="contact" name="contact"  readonly/><br/><br/>

					Organization:
					<input name="organization" value="<%=organization%>"  readonly/><br/><br/>
                	
                    <input type="submit" value="EDIT"/>
                               
            </form>
        </div>            
</body>
</html>
