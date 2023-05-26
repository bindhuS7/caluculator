package calculator;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/add")//( mapping     "/ is mandatory to accept" )
public class Addition implements Servlet {

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		//1.this method gives information
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//in this class we don't have main method
		//2.here we write our logic
		//3.servlet is entry point(server(apache tomcat) create object for servlet)
		
		int n=Integer.parseInt(arg0.getParameter("num1"));
		int n1=Integer.parseInt(arg0.getParameter("num2"));
		System.out.println("the sum of "+n+"and "+n1+" is "+(n+n1));
		arg1.getWriter().print("the sum of "+n+"and "+n1+" is "+(n+n1));
		//to print in front end we use (arg1.getWriter().print("the sum of "+n+"and "+n1+" is "+(n+n1));
		
	//this is my logic
	}

}
