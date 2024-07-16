package edu.training.osttra;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		if(uname.equals("admin")&& pass.equals("root")) {
			response.getWriter().println("<h1>Hi" + uname+" Hello from Servlet</h1>");
			
		}
		else {
			response.getWriter().println("Invalid Cardentials");
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		if(uname.equals("admin")&& pass.equals("root")) {
			response.getWriter().println("<h1>Hi" + uname+" Hello from Servlet</h1>");
			
		}
		else {
			response.getWriter().println("Invalid Cardentials");
		}
	}

}
