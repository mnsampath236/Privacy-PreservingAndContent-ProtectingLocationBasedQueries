<%@page import="com.lbq.util.Constants"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
    	String regResp = (String) request.getAttribute("loginResp");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Operations</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<script type="text/javascript">
    	function validation() {
			var resp = '<%=regResp%>';
			alert(resp);
			if('<%=Constants.SUCCESS%>' == resp){
				alert("Login Success.");
			}else if('<%=Constants.FAIL%>' == resp){
				alert("Login Fail.");
			}
		}
    </script>
</head>
<body>
	<!-- Header -->
	<header id="header">
	<div class="inner">
		<a href="index.html" class="logo"><img
			src="./images/building_society.jpg"></a>
		<nav id="nav"> 
		 <a href="AdminHome.jsp">Home</a> 
		 <a href="index.html">Logout</a>
		</nav>
	</div>
	</header>
	<a href="#menu" class="navPanelToggle"><span class="fa fa-bars"></span></a>

	<!-- Main -->
	<section id="main">
	<div class="inner">
		<header class="major special">
		<h1>Admin Home Page</h1>
		</header>

		<p>
		<form action="./LoginAction" method="post" name="user_login">
			<table>
				<tr>
					<td><a href="./UsersControllPannel">View Users</a></td>
				</tr>
				<tr>
					<td><a href="deleteuser.jsp"></a></td>
				</tr>
			</table>
		</form>

	</div>
	</section>


	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>

</body>
</html>