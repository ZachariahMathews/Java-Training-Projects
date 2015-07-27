package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>DoIt - Home</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-timepicker.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"datepick()\">\r\n");
      out.write("\t<h1>Home</h1>\r\n");
      out.write("\t<form action=\"Controller\">\r\n");
      out.write("\t\tEnter the task : <input type=\"text\" name=\"task\"> <br>\r\n");
      out.write("\t\tPriority : <select name=\"priority\">\r\n");
      out.write("\t\t\t<option value=\"1\">1</option>\r\n");
      out.write("\t\t\t<option value=\"2\">2</option>\r\n");
      out.write("\t\t\t<option value=\"3\">3</option>\r\n");
      out.write("\t\t\t<option value=\"4\">4</option>\r\n");
      out.write("\t\t\t<option value=\"5\">5</option>\r\n");
      out.write("\t\t</select> <br> Date: <input type=\"text\" id=\"datepicker1\" name=\"taskdate\">\r\n");
      out.write("\t\t<br> Time:\r\n");
      out.write("\t\t<div class=\"input-append bootstrap-timepicker\">\r\n");
      out.write("\t\t\t<input id=\"timepicker1\" type=\"text\" class=\"input-small\"> \r\n");
      out.write("\t\t\t<spanm class=\"add-on\"><i class=\"icon-time\"></i></span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"handler\" value=\"list-add\">\r\n");
      out.write("\t\t<input type=\"submit\" value=\"Add\"> <br>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<table width=\"100%\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>Priority</td>\r\n");
      out.write("\t\t\t<td>Task Description</td>\r\n");
      out.write("\t\t\t<td>Task Time</td>\r\n");
      out.write("\t\t\t<td>Task Date</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");

		for(Task t:(List<Task>)getServletContext().getAttribute("tasks")){
		
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>");
      out.print(t.getPriority() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(t.getTask() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(t.getTasktime().toString() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(t.getTaskdate().toString() );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");
} 
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<table>\r\n");
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t \r\n");
      out.write("\tfunction datepick(){\r\n");
      out.write("\t\t$('#timepicker1').timepicker();\r\n");
      out.write("        $('#datepicker1').datepicker({\r\n");
      out.write("            format: \"yyyy-mm-dd\",\r\n");
      out.write("            autoclose: true\r\n");
      out.write("        });  \r\n");
      out.write("        \r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script src=\"js/jquery-2.1.4.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap-datepicker.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap-timepicker.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.js\"></script>\r\n");
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
