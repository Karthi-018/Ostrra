

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
 * Servlet implementation class resServlet
 */
@WebServlet("/resServlet")
public class resServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public resServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String resTypeName=request.getParameter("resTypeName");
		String resName=request.getParameter("resName");
		String resAttrName=request.getParameter("resAttrName");
		String resAttrVals=request.getParameter("resAttrVals");
		
		try {
			Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
			PreparedStatement ps=conn.prepareStatement("insert into res values (?,?,?,?)");
//			PreparedStatement ps=conn.prepareStatement("insert into jul16 values (?)");
			ps.setString(1,resTypeName);
			ps.setString(2,resName);
			ps.setString(3,resAttrName);
			ps.setString(4,resAttrVals);
			int op=ps.executeUpdate();
			response.getWriter().print(op +" rows affected");
//			ps.setString(1, uname);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
