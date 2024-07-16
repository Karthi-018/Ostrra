package edu.osttra.servlets.demo.DemoServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int result;
		String operator = request.getParameter("operator");
		
		PrintWriter out = response.getWriter();
		
		if(operator.equals("add")) {
			result=num1+num2;
			out.println(result);
		} else if(operator.equals("subtract")) {
			result=num1-num2;
			out.println(result);
		} else if(operator.equals("multiply")) {
			result=num1*num2;
			out.println(result);
		} else if(operator.equals("divide")) {
			result=num1/num2;
			out.println(result);
		}
	}

}
