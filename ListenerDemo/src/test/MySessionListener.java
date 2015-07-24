package test;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MySessionListener
 *
 */
public class MySessionListener implements HttpSessionListener {

   
    public void sessionCreated(HttpSessionEvent arg0)  { 
    	
    	System.out.println("session created: "+arg0.getSession().getAttribute("who"));
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         
    	System.out.println("session destroyed: "+arg0.getSession().getAttribute("who"));
    }
	
}
