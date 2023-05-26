package calculator;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/div")
public class Division extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		double n1=Double.parseDouble(req.getParameter("num1"));
		double n2=Double.parseDouble(req.getParameter("num2"));
		
			resp.getWriter().print("<h1 style='color:blue'>The division of"+n1+"and "+n2+" is"+(n1/n2));

	}
	
	}

