package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>DoIt - Login</title>\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"login-body\" style=\"background-image: url('img/bg.jpg');\">\r\n");
      out.write("\t<div id=\"login-container\">\r\n");
      out.write("\t\t<!-- <h1>Login Form</h1> -->\r\n");
      out.write("\t\t<form class=\"form-signin\" action=\"Controller\">\r\n");
      out.write("\t\t\t<h2 class=\"form-signin-heading\">DoIt!</h2>\r\n");
      out.write("\t\t\t<div class=\"login-wrap\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"margin-right: 5px;\">User ID &nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" class=\"form-control\" name=\"userid\"\r\n");
      out.write("\t\t\t\t\t\t\tautofocus></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"margin-right: 5px;\">Password &nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"password\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"password\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"hidden\" name=\"handler\" value=\"login\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Login\"\r\n");
      out.write("\t\t\t\t\tclass=\"btn btn-lg btn-login btn-block\">\r\n");
      out.write("\t\t\t\t");

					if (request.getAttribute("login") == null) {
					} else if (!(Boolean) request.getAttribute("login")) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"alert alert-danger invalid \" role=\"alert\">Login failed. Invalid UserID or Password.</div>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"registration\">\r\n");
      out.write("\t\t\t\t\tDon't have an account yet? <a class=\"\"\r\n");
      out.write("\t\t\t\t\t\thref=\"Controller?handler=signup-link\"> Create an account </a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"js/jquery.js\"></script>\r\n");
      out.write("\t<script src=\"bs3/js/bootstrap.min.js\"></script>\r\n");
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
