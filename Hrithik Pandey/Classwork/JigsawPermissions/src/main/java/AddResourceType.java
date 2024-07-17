

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddResourceType
 */
@WebServlet("/AddResourceType")
public class AddResourceType extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddResourceType() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rtName = request.getParameter("textfield");
		String permissions= request.getParameter("textarea");
		Connection conn=null;
		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgres");
			conn=con; 
			PreparedStatement ps;
			ps = conn.prepareStatement("insert into public.\"ResourceTypes\" values (? , ?)");
			ps.setString(1, rtName);
			ps.setString(2, permissions);
			int x= ps.executeUpdate(); 
			response.sendRedirect("CreateResource.jsp");
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
