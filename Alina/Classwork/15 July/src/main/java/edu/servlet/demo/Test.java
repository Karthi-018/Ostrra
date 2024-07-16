package edu.servlet.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */

public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=request.getParameter("uname");
		String pass= request.getParameter("pass");
		if(uname.equals("Alina") && pass.equals("123"))
		{
			PrintWriter out=response.getWriter();
			out.println("<h1> Hi " + uname + " welcome </h1>");
		}
		else
		{
			PrintWriter out=response.getWriter();
			out.println("<h1> Invalid Credentials</h1>"
					+ "<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "<meta charset=\"ISO-8859-1\">\r\n"
					+ "<title>Insert title here</title>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "<form action=\"Test\" >\r\n"
					+ "	<input type=\"text\" placeholder=\"enter name\" name=\"uname\"/>\r\n"
					+ "	<input type=\"password\" placeholder=\"enter your password\" name=\"pass\"/>\r\n"
					+ "	<input type=\"submit\"/>\r\n"
					+ "</body>\r\n"
					+ "</html>");
		}
//		PrintWriter out=response.getWriter();
//		out.println("<h1> Hi " + uname + " welcome </h1>");
		
		
		//response.getWriter().append("Hello").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
