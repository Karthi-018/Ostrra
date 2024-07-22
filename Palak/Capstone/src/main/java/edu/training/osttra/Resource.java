package edu.training.osttra;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Resource
 */
@WebServlet("/Resource")
public class Resource extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Resource() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String rtname = request.getParameter("rtname");
		String rname = request.getParameter("rname");
		String attribute= request.getParameter("attribute");
		String data=request.getParameter("value");
		System.out.println(rname+attribute+data+rtname);
		Connection c;
		try {
			c= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Assignment","postgres","postgres");
			PreparedStatement ps = c.prepareStatement("insert into public.\"Resource\" (rname,attribute,data,rtname) values(?,?,?,?)");
			ps.setString(1,rname);
			ps.setString(2,attribute);
			ps.setString(3,data);
			ps.setString(4,rtname);
			int count = ps.executeUpdate();
			System.out.println("connection");
			response.sendRedirect("permission.jsp");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
