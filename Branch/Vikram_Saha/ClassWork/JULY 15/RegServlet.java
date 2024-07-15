

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
//@WebServlet("/MyServlet")
public class RegServlet extends HttpServlet {
	public List<LoginDetails> li=new ArrayList<LoginDetails>();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uName=request.getParameter("uName");
		String pass=request.getParameter("pass");
		String lName=request.getParameter("lName");
		String fName=request.getParameter("fName");
		LoginDetails ld=new LoginDetails(uName, pass, lName, fName);
		li.add(ld);
		response.getWriter().print("ADDED DATA ");
		request.getSession().setAttribute("li", li);
		response.sendRedirect("index.html");
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.getWriter().append("HI (POST)"+req.getParameter("uName"));
	}

}
