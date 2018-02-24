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
				<h1>User Registration</h1>
			</header>

			<p>
			<form method="post" action="./RegistrationServlet">
				<table>
					<tr>
						<td><label>First Name</label></td>
						<td><input type="text" id="firstName" name="firstName"
							placeholder="First Name" required="required"></td>
					</tr>
					<tr>
						<td><label>Last Name</label></td>
						<td><input type="text" id="lastName" name="lastName"
							placeholder="Last Name" required="required"></td>
					</tr>
					<tr>
						<td><label>Mobile</label></td>
						<td><input type="tel" id="mobile" name="mobile"
							placeholder="Mobile Number" required="required"></td>
					</tr>
					<tr>
						<td><label>Email Id</label></td>
						<td><input type="email" id="email" name="email"
							placeholder="Email Id" required="required"></td>
					</tr>
					<tr>
						<td><label>Password</label></td>
						<td><input type="password" id="password" name="password"
							placeholder="Password" required="required"></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td>
							<button type="submit">Sign Up</button>
						</td>
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
