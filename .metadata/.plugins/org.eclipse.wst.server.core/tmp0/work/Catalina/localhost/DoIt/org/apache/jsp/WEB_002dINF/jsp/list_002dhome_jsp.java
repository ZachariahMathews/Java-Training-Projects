package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import com.envestnet.doit.beans.Task;

public final class list_002dhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>DoIt - Home</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-datepicker3.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-select.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-timepicker.min.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"datepick()\" style=\"background-image: url('img/bg.jpg');\">\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t\t<header class=\"header fixed-top clearfix\"> <!--logo start-->\r\n");
      out.write("\t\t<div class=\"brand\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- <a href=\"index.html\" class=\"logo\">  -->\r\n");
      out.write("\t\t\t<!-- <img src=\"images/logo.png\" alt=\"\"> -->\r\n");
      out.write("\t\t\t<p class=\"logo\">DoIt!</p>\r\n");
      out.write("\t\t\t<!-- </a> -->\r\n");
      out.write("\t\t\t<div class=\"sidebar-toggle-box\">\r\n");
      out.write("\t\t\t\t<span class=\"glyphicon glyphicon-menu-hamburger\"></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--logo end-->\r\n");
      out.write("\t\t<div class=\"top-nav clearfix\">\r\n");
      out.write("\t\t\t<!--search & user info start-->\r\n");
      out.write("\t\t\t<ul class=\"nav pull-right top-menu\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- user login dropdown start-->\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a data-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\tclass=\"dropdown-toggle\" href=\"#\"> <img alt=\"\" src=\"img/bg.jpg\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"username\"> ");
      out.print(request.getSession().getAttribute("userid"));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t<b class=\"caret\"></b>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu extended logout\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"Controller?handler=logout\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-off\"></span>&nbsp; Log Out</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<!-- user login dropdown end -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<!--search & user info end-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t<aside>\r\n");
      out.write("\t\t<div id=\"sidebar\" class=\"nav-collapse\">\r\n");
      out.write("\t\t\t<!-- sidebar menu start-->\r\n");
      out.write("\t\t\t<div class=\"leftside-navigation\">\r\n");
      out.write("\t\t\t\t<ul class=\"sidebar-menu\" id=\"nav-accordion\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"index.html\"> <i class=\"fa fa-dashboard\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<span>Dashboard</span>\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"sub-menu\"><a href=\"javascript:;\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-laptop\"></i> <span>Layouts</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"boxed_page.html\">Boxed Page</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"horizontal_menu.html\">Horizontal Menu</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"language_switch.html\">Language Switch Bar</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"sub-menu\"><a href=\"javascript:;\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-book\"></i> <span>UI Elements</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"general.html\">General</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"buttons.html\">Buttons</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"typography.html\">Typography</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"widget.html\">Widget</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"slider.html\">Slider</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"tree_view.html\">Tree View</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"nestable.html\">Nestable</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"grids.html\">Grids</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"calendar.html\">Calender</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"draggable_portlet.html\">Draggable Portlet</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"fontawesome.html\"> <i class=\"fa fa-bullhorn\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<span>Fontawesome </span>\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"sub-menu\"><a href=\"javascript:;\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-th\"></i> <span>Data Tables</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"basic_table.html\">Basic Table</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"responsive_table.html\">Responsive Table</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"dynamic_table.html\">Dynamic Table</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"editable_table.html\">Editable Table</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"sub-menu\"><a href=\"javascript:;\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-tasks\"></i> <span>Form Components</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"form_component.html\">Form Elements</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"advanced_form.html\">Advanced Components</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"form_wizard.html\">Form Wizard</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"form_validation.html\">Form Validation</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"file_upload.html\">Muliple File Upload</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"dropzone.html\">Dropzone</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"inline_editor.html\">Inline Editor</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"sub-menu\"><a href=\"javascript:;\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-envelope\"></i> <span>Mail </span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"mail.html\">Inbox</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"mail_compose.html\">Compose Mail</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"mail_view.html\">View Mail</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"sub-menu\"><a href=\"javascript:;\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\" fa fa-bar-chart-o\"></i> <span>Charts</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"morris.html\">Morris</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"chartjs.html\">Chartjs</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"flot_chart.html\">Flot Charts</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"c3_chart.html\">C3 Chart</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- sidebar menu end-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</aside>\r\n");
      out.write("\r\n");
      out.write("\t\t<section id=\"main-content\"> <section class=\"wrapper\">\r\n");
      out.write("\t\t<!-- page start--> ");

 	if(request.getParameter("handler").equals("edit-link")){
 		
 	List<Task> tasks=(List<Task>) getServletContext().getAttribute("tasks");
 	Task task=null;
 	for(Task temp:tasks) {
 		if(temp.getDisplayid()==Integer.parseInt(request.getParameter("index"))){
 	
 	task=temp;
 	break;
 		}
 	}
 
      out.write("\r\n");
      out.write("\t\t<form action=\"Controller\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"taskid\" value=\"");
      out.print(task.getTaskid());
      out.write("\">\r\n");
      out.write("\t\t\tEnter the task : <input type=\"text\" name=\"task\"\r\n");
      out.write("\t\t\t\tvalue=\"");
      out.print(task.getTask());
      out.write("\"> <br> Priority : <select\r\n");
      out.write("\t\t\t\tname=\"priority\">\r\n");
      out.write("\t\t\t\t<option value=\"1\">1</option>\r\n");
      out.write("\t\t\t\t<option value=\"2\">2</option>\r\n");
      out.write("\t\t\t\t<option value=\"3\">3</option>\r\n");
      out.write("\t\t\t\t<option value=\"4\">4</option>\r\n");
      out.write("\t\t\t\t<option value=\"5\">5</option>\r\n");
      out.write("\t\t\t</select> <br> Date: <input type=\"text\" id=\"datepicker1\" name=\"taskdate\"\r\n");
      out.write("\t\t\t\tvalue=\"");
      out.print(task.getTaskdatetime().toLocalDate());
      out.write("\"> <br>\r\n");
      out.write("\t\t\tTime:\r\n");
      out.write("\t\t\t<div class=\"input-append bootstrap-timepicker\">\r\n");
      out.write("\t\t\t\t<input id=\"timepicker1\" type=\"text\" class=\"input-small\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.print(task.getTaskdatetime().toLocalTime().format(DateTimeFormatter.ofPattern("hh:mm a")));
      out.write("\">\r\n");
      out.write("\t\t\t\t<span class=\"add-on\"><i class=\"icon-time\"></i></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"handler\" value=\"edit-page\"> <input\r\n");
      out.write("\t\t\t\ttype=\"submit\" value=\"Edit\"> <br>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t");

			}
			else{
		
      out.write("\r\n");
      out.write("\t\t<form action=\"Controller\" class=\"form-add\">\r\n");
      out.write("\t\t\t<div class=\"add-wrap\">\r\n");
      out.write("\t\t\t\tEnter the task : <input type=\"text\" name=\"task\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t<br> Priority : <select name=\"priority\" class=\"selectpicker\">\r\n");
      out.write("\t\t\t\t\t<option value=\"1\">1</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2\">2</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"3\">3</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"4\">4</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"5\">5</option>\r\n");
      out.write("\t\t\t\t</select> <br> Date: <input type=\"text\" id=\"datepicker1\" name=\"taskdate\"\r\n");
      out.write("\t\t\t\t\tclass=\"form-control\"> <br> Time:\r\n");
      out.write("\t\t\t\t<div class=\"input-append bootstrap-timepicker\">\r\n");
      out.write("\t\t\t\t\t<input id=\"timepicker1\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"input-small form-control\"> <span class=\"add-on\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon-time\"></i></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"handler\" value=\"list-add\"> <input\r\n");
      out.write("\t\t\t\t\ttype=\"submit\" value=\"Add\"> <br>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t");

			}
		
      out.write(" <br>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<h1>");
      out.print(request.getSession().getAttribute("userid"));
      out.write("</h1>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t<table width=\"100%\" class=\"table\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>Priority</td>\r\n");
      out.write("\t\t\t\t<td>Task Description</td>\r\n");
      out.write("\t\t\t\t<td>Task Time</td>\r\n");
      out.write("\t\t\t\t<td>Task Date</td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				int i = 0;
					//System.out.println("After-jsp: "+((List<Task>)getServletContext().getAttribute("tasks")).size());
					for (Task t : (List<Task>) getServletContext()
							.getAttribute("tasks")) {

						t.setDisplayid(++i);
						if (t.getUserid().equals(
								request.getSession().getAttribute("userid"))) {
							//System.out.println(t.getTask()+" "+t.getUserid()+" "+t.getDone());
							if (t.getDone() == 'n'
									&& t.getTaskdatetime().isAfter(LocalDateTime.now())) {
			
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(t.getPriority());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(t.getTask());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(t.getTaskdatetime().toLocalTime().format(DateTimeFormatter.ofPattern("hh:mm a")));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(t.getTaskdatetime().toLocalDate().toString());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td><a href=\"Controller?handler=edit-link&index=");
      out.print(i);
      out.write("\">Edit</a></td>\r\n");
      out.write("\t\t\t\t<td><a href=\"Controller?handler=remove&index=");
      out.print(i);
      out.write("\">Remove</a></td>\r\n");
      out.write("\t\t\t\t<td><a href=\"Controller?handler=done&index=");
      out.print(i);
      out.write("\">Done</a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				}}}
			
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- page end--> </section> </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction datepick() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t$('.selectpicker').selectpicker();\r\n");
      out.write("\t\t\t$('#timepicker1').timepicker();\r\n");
      out.write("\t\t\t$('#datepicker1').datepicker({\r\n");
      out.write("\t\t\t\tformat : \"yyyy-mm-dd\",\r\n");
      out.write("\t\t\t\tautoclose : true\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script src=\"js/jquery-2.1.4.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap-datepicker.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap-timepicker.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.nicescroll.js\"></script>\r\n");
      out.write("\t<script src=\"js/scripts.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap-select.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
