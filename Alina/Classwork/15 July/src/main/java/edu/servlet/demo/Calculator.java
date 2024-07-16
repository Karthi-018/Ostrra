package edu.servlet.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
//@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        // Retrieve parameters from the form
	        String num1Str = request.getParameter("num1");
	        String num2Str = request.getParameter("num2");
	        String operator = request.getParameter("operator");
	        
	        // Convert parameters to double
	        double num1 = Double.parseDouble(num1Str);
	        double num2 = Double.parseDouble(num2Str);
	        
	        double result = 0.0;
	        String operationSymbol = "";
	        
	        // Perform calculation based on operator
	        switch (operator) {
	            case "+":
	                result = num1 + num2;
	                operationSymbol = "+";
	                break;
	            case "-":
	                result = num1 - num2;
	                operationSymbol = "-";
	                break;
	            case "*":
	                result = num1 * num2;
	                operationSymbol = "*";
	                break;
	            case "/":
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    operationSymbol = "/";
	                } else {
	                    operationSymbol = "/";
	                    result = Double.POSITIVE_INFINITY; // Handle division by zero
	                }
	                break;
	            default:
	                operationSymbol = "Invalid Operator";
	                break;
	        }
	        
	        // Prepare response
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        
	        out.println("<html><head><title>Calculator Result</title></head><body>");
	        out.println("<h2>Calculator Result</h2>");
	        out.println("<p>" + num1 + " " + operationSymbol + " " + num2 + " = " + result + "</p>");
	        out.println("<p><a href=\"index.html\">Back to Calculator</a></p>");
	        out.println("</body></html>");
	    }
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	}


