<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE HTML>

<html>
<head>
<title>Privacy-Preserving and Content-Protecting Location Based
	Queries</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
</head>

<body>

	<!-- Header -->
	<header id="header">
		<div class="inner">
			<a href="index.html" class="logo"><img
				src="./images/building_society.jpg"></a>
			<nav id="nav">
				<a href="index.html">Home</a> <a href="UserLogin.jsp">User Login</a>
				<a href="AdminLogin.jsp">Admin Login</a>
			</nav>
		</div>
	</header>
	<a href="#menu" class="navPanelToggle"><span class="fa fa-bars"></span></a>

	<!-- Main -->
	<section id="main">
		<div class="inner">
			<header class="major special">
				<h1>User Login</h1>
			</header>

			<p>
			<form method="post" action="./LoginServlet">
				<table>
					<tr>
						<td>User Name:</td>
						<td><input type="email" id="email" name="email"
							placeholder="User Name" required="required"></td>
					</tr>
					<tr>
						<td>Password:</td>
						<td><input type="password" id="password" name="password"
							placeholder="***********" required="required"></td>
					</tr>
					<tr>
						<td></td>
						<td><button type="submit">Sign In</button> <a href="./UserRegistration.jsp">Signup</a></td>
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