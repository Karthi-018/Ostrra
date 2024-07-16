package edu.osttra.train;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CalculatorServlet() {
        super();
    }

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int a = Integer.parseInt(request.getParameter("num1"));
		int b = Integer.parseInt(request.getParameter("num2"));
		String operator = request.getParameter("op");
		int result=0;
		PrintWriter out = response.getWriter();
		if(operator.equals("add")) {
			result = a+b;	
		}else if(operator.equals("subtract")) {
			result =a-b;
		}else if(operator.equals("divide")) {
			result = a/b;
		}else{
			result = a*b;
		}
		out.println("<h1>Answer "+result+"</h1>");
	}

}
