<%@page import="com.lbq.model.User"%>
<%@page import="com.lbq.util.Constants"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	User user = (User) request.getAttribute("user");
	String userId = (String) request.getAttribute("userId");
	String loginResponse = (String) session.getAttribute("loginResponse");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Operations</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<script type="text/javascript">
	function validation() {
		var resp = '<%=loginResponse%>';
		
		if ('<%=Constants.SUCCESS%>' == resp) {
			alert("Login Success.");
		} else if ('<%=Constants.FAIL%>' == resp) {
			alert("Login Fail.");
			window.location = "./UserLogin.jsp";
		} else if ('<%=Constants.IN_ACTIVE%>' == resp) {
			alert("User not activated.");
			window.location = "./index.html";
		}
	}
</script>
</head>
<body onload="javascript:validation();">
	<!-- Header -->
	<div id="header">
		<div class="inner">
			<a href="index.html" class="logo"><img
				src="./images/building_society.jpg"></a>
			<div id="nav">
				<a href="#">Home</a><a href="index.html">Logout</a>
			</div>
		</div>
	</div>
	<a href="#menu" class="navPanelToggle"><span class="fa fa-bars"></span></a>

	<!-- Main -->
	<section id="main">
	<div class="inner">
		<header class="major special">
		<h1>User Home Page</h1>
		</header>

		<p>
		<table>
			<tr>
				<td><a href="./SearchAction">Search</a></td>
			</tr>
			<tr>
				<td><a href="./DeleteUserServlet?userid=<%=userId%>">DeleteUser</a></td>
			</tr>
		</table>

	</div>
	</section>


	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>

</body>
</html>