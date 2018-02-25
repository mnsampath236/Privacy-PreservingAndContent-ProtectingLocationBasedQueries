<%@page import="com.lbq.util.Constants"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    	String regResp = (String) request.getAttribute("regResp");
    %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Location based Search</title>
    
    <script type="text/javascript">
    	function validation() {
			var resp = '<%=regResp%>';
			alert(resp);
			if('<%=Constants.FAIL%>' == resp){
				alert("Login fail");
				 window.location = '/UserLogin.jsp';
			}
		}
    </script>
</head>
<body onload="javascript:validation();">
	<div id="wrapper">
		<div id="header">
			<div id="ttl">
				<span class="Centerer"></span> <label class="Title">Privacy-Preserving and Content-Protecting Location Based Queries</label>
			</div>
			<div id="ei">
				<span class="Centerer"></span>
			</div>
		</div>

		<div id="body">
			<div id="left">
				<a href="index.html">Home Page</a><br>
				<a href="Contact.jsp">Contact</a><br>
			</div>
			<div id="right">
				<span class="Centerer"></span> 

			</div>
		</div>
	</div>
</body>
</html>
