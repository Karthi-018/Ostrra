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
 * Servlet implementation class ResourceType
 */
@WebServlet("/ResourceType")
public class ResourceType extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResourceType() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String rtname = request.getParameter("rtname");
		String permission= request.getParameter("permission");
		Connection c;
		try {
			c= DriverManager.getConnection("jdbc:postgresql://localhost:5432/Assignment","postgres","postgres");
			PreparedStatement ps = c.prepareStatement("insert into public.\"ResourseType\" (rtname,permission) values(?,?)");
			ps.setString(1,rtname);
			ps.setString(2,permission);
			int count = ps.executeUpdate();
			System.out.println("connection");
			response.sendRedirect("MyJsp.jsp");
			
			
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
