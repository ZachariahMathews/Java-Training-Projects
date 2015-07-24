<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List" %>
<%@page import="mvcdemo.bean.Book" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book List</title>
</head>
<body>
<%
	List<Book>list=(List<Book>)request.getAttribute("bookList");
	if(list!=null){
		
		for(Book b:list){
%>
	<h3><%=b.getName() %>,<%=b.getPrice() %></h3>
<%
		}
	}
%>
</body>
</html>