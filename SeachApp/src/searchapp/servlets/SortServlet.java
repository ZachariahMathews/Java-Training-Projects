package searchapp.servlets;

import java.io.IOException;
import java.io.Writer;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import searchapp.bean.SearchItem;
import searchapp.util.SearchForm;

/**
 * Servlet implementation class SortServlet
 */
public class SortServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		List<SearchItem> items=(List<SearchItem>) session.getAttribute("searchItems");
		if(request.getParameter("type").equals("name")){
			
			Collections.sort(items, new Comparator() {
				public int compare(Object item1, Object item2) {
				return ((SearchItem)item1).getName()
				.compareTo(((SearchItem)item2).getName());
				}
				}); 
		}
		else if(request.getParameter("type").equals("salary")){
			
			Collections.sort(items, new Comparator() {
				public int compare(Object item1, Object item2) {

					return ((SearchItem)item1).getSalary()
					-(((SearchItem)item2).getSalary());
				}}); 
		}
		
		Writer w=response.getWriter();
		w.write(SearchForm.getSearchForm(items));
		w.flush();
		w.close();
		
	}


}
