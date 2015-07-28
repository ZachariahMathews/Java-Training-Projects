<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.util.List"%>
<%@page import="com.envestnet.doit.beans.Task"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DoIt - Home</title>
<link rel="stylesheet" href="css/bootstrap-datepicker3.css" />
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/bootstrap-timepicker.css" />
</head>
<body onload="datepick()">
	<h1>Home</h1>
	<%
		if(request.getParameter("handler").equals("edit-link")){
			
		List<Task> tasks=(List<Task>) getServletContext().getAttribute("tasks");
		Task task=null;
		for(Task temp:tasks) {
			if(temp.getDisplayid()==Integer.parseInt(request.getParameter("index"))){
		
		task=temp;
		break;
			}
		}
	%>
	<form action="Controller">
		<input type="hidden" name="taskid" value="<%=task.getTaskid()%>">
		Enter the task : <input type="text" name="task"
			value="<%=task.getTask()%>"> <br> Priority : <select
			name="priority">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
		</select> <br> Date: <input type="text" id="datepicker1" name="taskdate"
			value="<%=task.getTaskdatetime().toLocalDate()%>"> <br>
		Time:
		<div class="input-append bootstrap-timepicker">
			<input id="timepicker1" type="text" class="input-small"
				value="<%=task.getTaskdatetime().toLocalTime().format(DateTimeFormatter.ofPattern("hh:mm a"))%>"> <span
				class="add-on"><i class="icon-time"></i></span>
		</div>
		<input type="hidden" name="handler" value="edit-page"> <input
			type="submit" value="Edit"> <br>
	</form>
	<%
		}
		else{
	%>
	<form action="Controller">
		Enter the task : <input type="text" name="task"> <br>
		Priority : <select name="priority">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
		</select> <br> Date: <input type="text" id="datepicker1" name="taskdate">
		<br> Time:
		<div class="input-append bootstrap-timepicker">
			<input id="timepicker1" type="text" class="input-small"> <span
				class="add-on"><i class="icon-time"></i></span>
		</div>
		<input type="hidden" name="handler" value="list-add"> <input
			type="submit" value="Add"> <br>
	</form>
	<%
		}
	%>
	<br>
	<hr>
	<table width="100%">
		<tr>
			<td>Priority</td>
			<td>Task Description</td>
			<td>Task Time</td>
			<td>Task Date</td>
			<td></td>
		</tr>
		<%
			int i=0;
				for(Task t:(List<Task>)getServletContext().getAttribute("tasks")){
			t.setDisplayid(++i);
			if(t.getUserid().equals(request.getSession().getAttribute("userid"))){
		%>
		<tr>
			<td><%=t.getPriority()%></td>
			<td><%=t.getTask()%></td>
			<td><%=t.getTaskdatetime().toLocalTime().format(DateTimeFormatter.ofPattern("hh:mm a"))%></td>
			<td><%=t.getTaskdatetime().toLocalDate().toString()%></td>
			<td><a href="Controller?handler=edit-link&index=<%=i%>">Edit</a></td>
			<td><a href="Controller?handler=remove&index=<%=i%>">Edit</a></td>
			<td><a href="Controller?handler=done&index=<%=i%>">Edit</a></td>
		</tr>
		<%
			}}
		%>
	</table>
	<table>

	</table>

	<script type="text/javascript">
		function datepick() {

			$('#timepicker1').timepicker();
			$('#datepicker1').datepicker({
				format : "yyyy-mm-dd",
				autoclose : true
			});

		}
	</script>
	<script src="js/jquery-2.1.4.js"></script>
	<script src="js/bootstrap-datepicker.min.js"></script>
	<script src="js/bootstrap-timepicker.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>