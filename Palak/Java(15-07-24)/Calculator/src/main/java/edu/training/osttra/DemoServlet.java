package edu.training.osttra;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1 =Integer.parseInt(request.getParameter("value1"));
		int num2 =Integer.parseInt(request.getParameter("value2"));
		String val= request.getParameter("cal");
		int ans;
		if(val.equals("sum")) {
			
			ans= num1+num2;
			response.getWriter().println("Sum is "+ans);
		}
		else if(val.equals("sub")) {
			ans= num1-num2;
			response.getWriter().println("Subtraction is "+ans);
		}
		else if(val.equals("multi")) {
			ans= num1*num2;
			response.getWriter().println("Multiplication is "+ans);
		}
		else if(val.equals("divi")) {
			ans= num1/num2;
			response.getWriter().println("Division is "+ans);
		}
		else {
			response.getWriter().println("Invalid input");
		}
		
		
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1 =Integer.parseInt(request.getParameter("value1"));
		int num2 =Integer.parseInt(request.getParameter("value2"));
		String val= request.getParameter("cal");
		int ans;
		if(val.equals("sum")) {
			
			ans= num1+num2;
			response.getWriter().println("Sum is "+ans);
		}
		else if(val.equals("sub")) {
			ans= num1-num2;
			response.getWriter().println("Subtraction is "+ans);
		}
		else if(val.equals("multi")) {
			ans= num1*num2;
			response.getWriter().println("Multiplication is "+ans);
		}
		else if(val.equals("divi")) {
			ans= num1/num2;
			response.getWriter().println("Division is "+ans);
		}
		else {
			response.getWriter().println("Invalid input");
		}
	}

}
