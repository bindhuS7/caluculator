package calculator;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/sub")// to accept the request we use /
//if we done any logical mistakes then we get error 
public class SubStractions extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
       int n1=Integer.parseInt( req.getParameter("num1"));
       int n2=Integer.parseInt(req.getParameter("num2"));
        System.out.println("the sum of is"+n1+"and"+n2+"is"+(n1+n2));
        resp.getWriter().print("the substraction of is"+n1+"and"+n2+"is"+(n1-n2));
		
	}

}
