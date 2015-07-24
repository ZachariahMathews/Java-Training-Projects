package calculationdemo.servlets;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import calculationdemo.util.Calculation;
import calculationdemo.util.HistoryForm;

/**
 * Servlet implementation class HistoryServlet
 */
public class HistoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		if(session.getAttribute("status")!=null&&(boolean) session.getAttribute("status")){
			List<Calculation>cal=(List<Calculation>) session.getAttribute("history");
			if(cal!=null){
				
				Writer w=response.getWriter();
				w.write(HistoryForm.getHistoryForm(cal));
				w.flush();
				w.close();
			}
		}
		else{
			Writer w=response.getWriter();
			w.write("<h1>Not logged in</h1>");
			w.flush();
			w.close();
		}
		
		
	}


}
