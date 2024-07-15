package edu.training.osttra;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddDetails
 */
@WebServlet("/AddDetails")
public class AddDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	String fName;
	String lName;
	String uName;
	String pass;
    public AddDetails() {
        super();
        // TODO Auto-generated constructor stub
    }
    public AddDetails(String fName,String lName,String uName,String pass) {
    	this.fName=fName;
    	this.lName=lName;
    	this.uName=uName;
    	this.pass=pass;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    fName= request.getParameter("fname");
		lName= request.getParameter("lname");
		uName= request.getParameter("uname");
		pass= request.getParameter("pass");
		
		List<AddDetails> data=new ArrayList<>();
		data.add(new AddDetails(fName,lName,uName,pass));
	
		
		HttpSession session=request.getSession();
		session.setAttribute("data", data);
		RequestDispatcher rd = request.getRequestDispatcher("login.html");
		rd.forward(request, response);
		
	}

}
