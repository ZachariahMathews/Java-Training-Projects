<%@page import="test.login.LoginValidator"%>
<%@page %>
<% 

	/* if(request.getParameter("username").equalsIgnoreCase("zach")&&request.getParameter("password").equalsIgnoreCase("pass")){
		
		RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);
	}
	else{
		
		response.sendRedirect("index.jsp");
	} */
	LoginValidator lv=new LoginValidator();
	if(lv.validate(request)){
		
		RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);
	}
	else{
		
		response.sendRedirect("index.jsp?usr="+request.getParameter("username")+"&pss="+request.getParameter("password"));
	} 
%>