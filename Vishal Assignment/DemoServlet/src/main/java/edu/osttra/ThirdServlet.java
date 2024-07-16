package edu.osttra;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ThirdServlet
 */
//@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session=request.getSession();

		String requestScopeData=(String)request.getAttribute("uname");
		String sessionScopeData=(String)request.getSession().getAttribute("uname");
		String applicationScopeData=(String)request.getServletContext().getAttribute("uname");
		
		PrintWriter out=response.getWriter();
		
		out.println("<h1> Request Scope Data "+requestScopeData+ "</h1>");
		out.println("<h1> session Scope Data "+sessionScopeData+ "</h1>");
		out.println("<h1> application Scope Data "+applicationScopeData+ "</h1>");
		
		
		session.invalidate();
		out.println("<form action = 'FourthServlet'><input type='submit'/></form>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
