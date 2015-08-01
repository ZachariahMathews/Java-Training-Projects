<%@page import="java.time.LocalDateTime"%>
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
<link rel="stylesheet" href="css/bootstrap-datepicker3.min.css" />
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/bootstrap-select.css" />
<link rel="stylesheet" href="css/bootstrap-timepicker.min.css" />
</head>
<body onload="datepick()" style="background: #e3e3e3;">
	<div id="container">
		<header class="header fixed-top clearfix">
		<div class="brand">

			<!-- <img src="images/logo.png" alt=""> -->
			<p class="logo">DoIt!</p>

		</div>
		<div class="top-nav clearfix">
			<ul class="nav pull-right top-menu">

				<li class="dropdown"><a data-toggle="dropdown"
					class="dropdown-toggle" href="#"> <img alt="" src="img/bg.jpg">
						<span class="username"> <%=request.getSession().getAttribute("userid")%></span>
						<b class="caret"></b>
				</a>
					<ul class="dropdown-menu extended logout">
						<li><a href="Controller?handler=logout"><span
								class="glyphicon glyphicon-off"></span>&nbsp; Log Out</a></li>
					</ul></li>
			</ul>
		</div>
		</header>
		<div id="wrapper">
		
		<!-- sidebar-start -->
		
			<div id="sidebar-wrapper">
				<ul class="sidebar-nav">

					<li><a href="Controller?handler=personal"><span
							class="glyphicon glyphicon-user" aria-hidden="true"></span>Personal</a>
					</li>
					<li><a href="Controller?handler=work"> <span
							class="glyphicon glyphicon-briefcase" aria-hidden="true"></span>Work
					</a></li>
					<li><a href="Controller?handler=pending"><span
							class="glyphicon glyphicon-alert" aria-hidden="true"></span>Pending</a>
					</li>
					<li><a href="Controller?handler=archive"><span
							class="glyphicon glyphicon-folder-open" aria-hidden="true"></span>Archive</a>
					</li>
				</ul>
			</div>
			
			<!-- sidebar-end -->
			
			<!-- main-content-start -->
			
			<section id="main-content"> <section class="wrapper">
			
			<!-- scriptlet to check if we need to render edit form -->
			<%
				if (request.getParameter("handler").equals("edit-link")) {

			 		List<Task> tasks = (List<Task>) getServletContext()
			 				.getAttribute("tasks");
			 		Task task = null;
			 		for (Task temp : tasks) {
			 			if (temp.getTaskid() == Integer.parseInt(request
			 					.getParameter("taskid"))) {

			 				task = temp;
			 				break;
			 			}
			 		}
			%> <%-- <form action="Controller">
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
				<input id="timepicker1" type="text" class="input-small"	value="<%=task.getTaskdatetime().toLocalTime().format(DateTimeFormatter.ofPattern("hh:mm a"))%>">
			</div>
			<input type="hidden" name="handler" value="edit-page"> <input
				type="submit" value="Edit"> <br>
		</form> --%>

			<!-- edit-form -->

			<form action="Controller" class="form-add">
				<div class="add-wrap">
					<div class="row">
						<div class="col-lg-4 col-md-12 col-sm-12">
							<label class=>Enter the task</label><input type="text"
								name="task" value="<%=task.getTask()%>"
								class="form-control task-input">
						</div>
						<div class="col-lg-2 col-md-6 col-sm-6">
							<label>Category</label> <select name="category"
								class="form-control">
								<%
									if (task.getCategory().equals("personal")) {
								%>
								<option value="personal" selected="selected">Personal</option>
								<%
									} else {
								%>
								<option value="personal">Personal</option>
								<%
									}
																																																																																		if (task.getCategory().equals("work")) {
								%>
								<option value="work" selected="selected">Work</option>
								<%
									} else {
								%>
								<option value="work">Work</option>
								<%
									}
								%>
							</select>
						</div>
						<div class="col-lg-1 col-md-6 col-sm-6">
							<label>Priority</label> <select name="priority"
								class="form-control" id="priority-picker">
								<%
									if (task.getPriority() == 1) {
								%>
								<option value="1" selected="selected">1</option>
								<%
									} else {
								%>
								<option value="1">1</option>
								<%
									}
																																																																																		if (task.getPriority() == 2) {
								%>
								<option value="2" selected="selected">2</option>
								<%
									} else {
								%>
								<option value="2">2</option>
								<%
									}
																																																																																		if (task.getPriority() == 3) {
								%>
								<option value="3" selected="selected">3</option>
								<%
									} else {
								%>
								<option value="3">3</option>
								<%
									}
																																																																																		if (task.getPriority() == 4) {
								%>
								<option value="4" selected="selected">4</option>
								<%
									} else {
								%>
								<option value="4">4</option>
								<%
									}
																																																																																		if (task.getPriority() == 5) {
								%>
								<option value="5" selected="selected">5</option>
								<%
									} else {
								%>
								<option value="5">5</option>
								<%
									}
								%>
							</select>
						</div>
						<div class="col-lg-2 col-md-6 col-sm-6">
							<label>Date</label><input type="text" id="datepicker1"
								name="taskdate" class="form-control"
								value="<%=task.getTaskdatetime().toLocalDate()%>">
						</div>
						<div class="col-lg-2 col-md-6 col-sm-6">
							<label> Time</label>
							<div class="input-append bootstrap-timepicker">
								<input id="timepicker1" type="text"
									class="input-small form-control"
									value="<%=task.getTaskdatetime().toLocalTime().format(DateTimeFormatter.ofPattern("hh:mm a"))%>">
								<span class="add-on"><i class="icon-time"></i></span>
							</div>
						</div>
						<div class="col-lg-1 col-md-12 col-sm-12">
							<input type="hidden" name="taskid" value="<%=task.getTaskid()%>">
							<input type="hidden" name="handler" value="edit-page"> <input
								type="submit" value="Edit" class="btn btn-add btn-lg">
						</div>
					</div>
				</div>
			</form>
			
			<!-- edit form end -->
			
			<%
				} else {
			%>

			<!-- add form -->

			<form action="Controller" class="form-add">
				<div class="add-wrap">
					<div class="row">
						<div class="col-lg-4 col-md-12 col-sm-12">
							<label class=>Enter the task</label><input type="text"
								name="task" class="form-control task-input">
						</div>
						<div class="col-lg-2 col-md-6 col-sm-6">
							<label>Category</label> <select name="category"
								class="form-control">
								<option value="personal">Personal</option>
								<option value="work">Work</option>
							</select>
						</div>
						<div class="col-lg-1 col-md-6 col-sm-6">
							<label>Priority</label> <select name="priority"
								class="form-control" id="priority-picker">
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
							</select>
						</div>
						<div class="col-lg-2 col-md-6 col-sm-6">
							<label>Date</label><input type="text" id="datepicker1"
								name="taskdate" class="form-control">
						</div>
						<div class="col-lg-2 col-md-6 col-sm-6">
							<label> Time</label>
							<div class="input-append bootstrap-timepicker">
								<input id="timepicker1" type="text"
									class="input-small form-control"> <span class="add-on"><i
									class="icon-time"></i></span>
							</div>
						</div>
						<div class="col-lg-1 col-md-12 col-sm-12">
							<input type="hidden" name="handler" value="list-add"> <input
								type="submit" value="Add" class="btn btn-add btn-lg">
						</div>
					</div>
				</div>
			</form>
			
			<!-- add form end -->
			
			<%
				}
			%> <br>
			<%
				if(request.getSession().getAttribute("curr-page")==null){
			%>
			
			<!-- personal table start -->
			
			<h1>Personal</h1>


			<table width="100%" class="table">
				<%
					int i = 0;

								for (Task t : (List<Task>) getServletContext().getAttribute(
										"tasks")) {

									t.setDisplayid(++i);
									if (t.getUserid().equals(
											request.getSession().getAttribute("userid"))) {

										if (t.getDone() == 'n'
												&& t.getTaskdatetime().isAfter(
														LocalDateTime.now())
												&& t.getCategory().equals("personal")) {
				%>
				<tr class="table-row">
					<td><%=t.getPriority()%></td>
					<td><%=t.getTask()%></td>
					<td><%=t.getTaskdatetime().toLocalTime().format(DateTimeFormatter.ofPattern("hh:mm a"))%></td>
					<%
						if(t.getTaskdatetime().toLocalDate().toString().equals(LocalDateTime.now().toLocalDate().toString())) {
					%>
					<td>Today</td>
					<%
						}else{
					%>
					<td><%=t.getTaskdatetime().toLocalDate().toString()%></td>
					<%
						}
					%>
					<td><a
						href="Controller?handler=edit-link&taskid=<%=t.getTaskid()%>"><span
							class="glyphicon glyphicon-edit icon"></span></a></td>
					<td><a
						href="Controller?handler=remove&taskid=<%=t.getTaskid()%>"><span
							class="glyphicon glyphicon-trash icon"></span></a></td>
					<td><a
						href="Controller?handler=done&taskid=<%=t.getTaskid()%>"><span
							class="glyphicon glyphicon-ok icon"></span></a></td>
				</tr>
				<%
					}}}
				%>
			</table>
			
			<!-- personal table end -->
			
			<%
				} else if (request.getSession().getAttribute("curr-page")
							.equals("work")) {
			%>
			
			<!-- work table start -->
			
			<h1>Work</h1>


			<table width="100%" class="table">
				<%
					int i = 0;
								for (Task t : (List<Task>) getServletContext().getAttribute(
										"tasks")) {

									t.setDisplayid(++i);
									if (t.getUserid().equals(
											request.getSession().getAttribute("userid"))) {
										if (t.getDone() == 'n'
												&& t.getTaskdatetime().isAfter(
														LocalDateTime.now())
												&& t.getCategory().equals("work")) {
				%>
				<tr class="table-row">
					<td><%=t.getPriority()%></td>
					<td><%=t.getTask()%></td>
					<td><%=t.getTaskdatetime().toLocalTime().format(DateTimeFormatter.ofPattern("hh:mm a"))%></td>
					<%
						if(t.getTaskdatetime().toLocalDate().toString().equals(LocalDateTime.now().toLocalDate().toString())) {
					%>
					<td>Today</td>
					<%
						}else{
					%>
					<td><%=t.getTaskdatetime().toLocalDate().toString()%></td>
					<%
						}
					%>
					<td><a
						href="Controller?handler=edit-link&taskid=<%=t.getTaskid()%>"><span
							class="glyphicon glyphicon-edit icon"></span></a></td>
					<td><a
						href="Controller?handler=remove&taskid=<%=t.getTaskid()%>"><span
							class="glyphicon glyphicon-trash icon"></span></a></td>
					<td><a
						href="Controller?handler=done&taskid=<%=t.getTaskid()%>"><span
							class="glyphicon glyphicon-ok icon"></span></a></td>
				</tr>
				<%
					}}}
				%>
			</table>
			
			<!-- work table end -->
			
			<%
				} else if (request.getSession().getAttribute("curr-page")
							.equals("archive")) {
			%>

			<!-- archive table start -->

			<h1>Archive</h1>


			<table width="100%" class="table">
				<%
					int i = 0;
						for (Task t : (List<Task>) getServletContext().getAttribute(
								"tasks")) {

							t.setDisplayid(++i);
							if (t.getUserid().equals(
									request.getSession().getAttribute("userid"))) {
								if (t.getDone() == 'y') {
				%>
				<tr class="table-row">
					<td><%=t.getPriority()%></td>
					<td><%=t.getTask()%></td>
					<td><%=t.getTaskdatetime().toLocalTime().format(DateTimeFormatter.ofPattern("hh:mm a"))%></td>
					<%
						if(t.getTaskdatetime().toLocalDate().toString().equals(LocalDateTime.now().toLocalDate().toString())) {
					%>
					<td>Today</td>
					<%
						}else{
					%>
					<td><%=t.getTaskdatetime().toLocalDate().toString()%></td>
					<%
						}
					%>
				</tr>
				<%
					}}}
				%>
			</table>

			<!-- archive table end -->

			<%
				} else {
			%>
			
			<!-- pending table start -->
			
			<h1>Pending</h1>


			<table width="100%" class="table">
				<%
					int i = 0;
						for (Task t : (List<Task>) getServletContext().getAttribute(
								"tasks")) {

							if (t.getUserid().equals(
									request.getSession().getAttribute("userid"))) {
								if (t.getDone() == 'n'
										&& t.getTaskdatetime().isBefore(
												LocalDateTime.now())) {
				%>
				<tr class="table-row">
					<td><%=t.getPriority()%></td>
					<td><%=t.getTask()%></td>
					<td><%=t.getTaskdatetime().toLocalTime().format(DateTimeFormatter.ofPattern("hh:mm a"))%></td>
					<%
						if(t.getTaskdatetime().toLocalDate().toString().equals(LocalDateTime.now().toLocalDate().toString())) {
					%>
					<td>Today</td>
					<%
						}else{
					%>
					<td><%=t.getTaskdatetime().toLocalDate().toString()%></td>
					<%
						}
					%>
					<td><a
						href="Controller?handler=edit-link&taskid=<%=t.getTaskid()%>"><span
							class="glyphicon glyphicon-edit icon"></span></a></td>
					<td><a
						href="Controller?handler=remove&taskid=<%=t.getTaskid()%>"><span
							class="glyphicon glyphicon-trash icon"></span></a></td>
					<td><a
						href="Controller?handler=done&taskid=<%=t.getTaskid()%>"><span
							class="glyphicon glyphicon-ok icon"></span></a></td>
				</tr>
				<%
					}}}
				%>
			</table>

			<!-- pending table end -->
			
			<%
				}
			%> </section> </section>
			
			<!-- main-content-end -->



		</div>
	</div>
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
	<script src="js/bootstrap-timepicker.min.js"></script>
	<script src="js/bootstrap.js"></script>
	<script src="js/jquery.nicescroll.js"></script>
	<script src="js/scripts.js"></script>
	<script src="js/bootstrap-select.min.js"></script>
</body>
</html>