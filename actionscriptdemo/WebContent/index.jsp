<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="person" class="actionscriptdemo.bean.Person" scope="page"></jsp:useBean>
	<jsp:setProperty property="name" name="person" param="name"/>
	<jsp:setProperty property="age" name="person" param="age"/>
	<jsp:getProperty property="name" name="person"/><br>
	<jsp:getProperty property="age" name="person"/>
	<%@ include file="footer.jsp" %>
</body>
</html>