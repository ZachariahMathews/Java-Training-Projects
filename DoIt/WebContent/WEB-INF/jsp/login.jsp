<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DoIt - Login</title>
<link href="css/style.css" rel="stylesheet" />
<link href="css/bootstrap.css" rel="stylesheet">
</head>
<body class="login-body">
	<div id="login-container">
		<!-- <h1>Login Form</h1> -->
		<form class="form-signin" action="Controller">
			<h2 class="form-signin-heading">DoIt!</h2>
			<div class="login-wrap">
				<table>
					<tr>
						<td style="margin-right: 5px;">User ID &nbsp;</td>
						<td><input type="text" class="form-control" name="userid"
							autofocus></td>
					</tr>
					<tr>
						<td style="margin-right: 5px;">Password &nbsp;</td>
						<td><input type="password" class="form-control"
							name="password"></td>
					</tr>
					<tr>
						<td><input type="hidden" name="handler" value="login">
						</td>
						<td></td>
					</tr>
				</table>
				<input type="submit" value="Login"
					class="btn btn-lg btn-login btn-block">
				<%
					if (request.getAttribute("login") == null) {
					} else if (!(Boolean) request.getAttribute("login")) {
				%>
				<span> Login failed.</span>
				<%
					}
				%>
				<div class="registration">
					Don't have an account yet? <a class=""
						href="Controller?handler=signup-link"> Create an account </a>
				</div>
			</div>
		</form>

	</div>
	<script src="js/jquery.js"></script>
	<script src="bs3/js/bootstrap.min.js"></script>
</body>
</html>