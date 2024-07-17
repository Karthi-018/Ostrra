

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
 * Servlet implementation class AddResource
 */
@WebServlet("/AddResource")
public class AddResource extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddResource() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rtName = request.getParameter("rtName");
		String resName= request.getParameter("resName");
		String attName= request.getParameter("attName");
		String values= request.getParameter("values");
		
		Connection conn=null;
		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgres");
			conn=con; 
			PreparedStatement ps;
			ps = conn.prepareStatement("insert into public.\"Resources\" values (? , ?,?,?)");
			ps.setString(1, rtName);
			ps.setString(2, resName);
			ps.setString(3, attName);
			ps.setString(4, values);
			int x= ps.executeUpdate(); 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("PermissionCondition.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
