package edu.osttra.servlets.demo.DemoServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DemoServlet() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uName");
		String upass = request.getParameter("uPass");
		PrintWriter out = response.getWriter();
		if(uname.equals("admin") && upass.equals("admin123")) {
			out.println("<h1>Hi "+uname+" welcome to Servlet World</h1>");
		} else {
			out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "	<form method=\"POST\" action=\"printName\">\r\n"
				+ "		<input type=\"text\" placeholder=\"Enter your username\" name=\"uName\" />\r\n"
				+ "		<input type=\"password\" placeholder=\"Enter your password\" name=\"uPass\" />\r\n"
				+ "		<input type=\"submit\" value=\"Login\" />\r\n"
				+ "	</form>\r\n"
				+ "</body>\r\n"
				+ "</html>");
		}
	}

}
