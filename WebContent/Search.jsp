<!DOCTYPE HTML>
<%@page import="com.lbq.model.User"%>
<%
	User user = (User) session.getAttribute("user");
%>
<html>
<head>
<title>Privacy-Preserving and Content-Protecting Location Based
	Queries</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<script type="text/javascript">
console.info("user : " + "<%=(user != null) ? user.toString() : ""%>");
	function locationSearch() {
		var searchKey = $("#searchKey").val();
		var location = $("#location").val();
		alert(searchKey + " : " + location);
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
				<a href="./index.html">Sign out</a>
			</nav>
		</div>
	</header>
	<a href="#menu" class="navPanelToggle"><span class="fa fa-bars"></span></a>

	<!-- Main -->
	<section id="main">
		<div class="inner">
			<header class="major special">
				<h1>Privacy Search</h1>
				<p></p>
			</header>
		</div>
	</section>
	<div id="body">
		<div id="left">
			<form method="post" action="./MapAction">
				<table>
					<tr>
						<td>Search key</td>
						<td><input type="text" name="searchKey" id="searchKey"></td>
					</tr>
					<tr>
						<td>Location</td>
						<td><input type="text" name="location" id="location"></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" name="search" id="search"
							value="Search"></td>
					</tr>
				</table>
			</form>
		</div>
		<div id="right">
			<span class="Centerer"></span>
		</div>
	</div>



	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>
	<script src="assets/js/validations.js"></script>
</body>
</html>
