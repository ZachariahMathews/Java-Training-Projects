package jndidemo.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class JNDILookupServlet
 */
public class JNDILookupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	try {
    		
    		Context ctx=new InitialContext();
    		DataSource ds=(DataSource)ctx.lookup("java:comp/env/jdbc/TestDB");
    		Connection conn=ds.getConnection();
    		System.out.println("conncted");
    		conn.close();
    		LocalTime lt=LocalTime.of(23, 00);
    		System.out.println(lt.format(DateTimeFormatter.ofPattern("hh:mm a")));
		} catch (NamingException | SQLException e) {
			
			e.printStackTrace();
		}
    	
    	/*String str="hello world this is awesomse";
    	String[]s=str.split(" ");
    	for(String s1:s){
    		if(s1.equals("world"))
    			s1="bill";
    	}
    	for(String s1:s){
    		System.out.println(s1);
    	}*/
    	List<String> s=new ArrayList<String>();
    	String str="hello world this is awesomse";
    	String[]s2=str.split(" ");
    	for(String s1:s2){
    		s.add(s1);
    	}
    	ListIterator<String> i = s.listIterator();

    	//changed the value of frist element in List
    	while(i.hasNext()) {
    	    String str1=i.next();
    		if(str1.equals("world"))
    	    i.set("hrereh");    // Change the element the iterator is currently at
    	} 
    	for(String s1:s){
    		System.out.println(s1);
    	}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
