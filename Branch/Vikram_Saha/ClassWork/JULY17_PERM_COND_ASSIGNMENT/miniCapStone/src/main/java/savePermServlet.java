

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class savePermServlet
 */
@WebServlet("/savePermServlet")
public class savePermServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public savePermServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
			PreparedStatement ps=conn.prepareStatement("insert into permtable values (?,?,?,?,?)");
//			PreparedStatement ps=conn.prepareStatement("insert into jul16 values (?)");
			
			
			String perms="",attVals="";
			List<String> liAttVals=Arrays.asList(request.getParameterValues("attValsCBK"));//perms.split(","));
			for(String s:liAttVals) {
				attVals+=s+",";
			}
			List<String> liPerms=Arrays.asList(request.getParameterValues("permsCBK"));
			for(String s:liPerms) {
				perms+=s+",";
			}
			ps.setString(1,request.getParameter("resTypeName"));
			ps.setString(2,request.getParameter("resName"));
			ps.setString(3,perms);
			ps.setString(4,request.getParameter("attrName"));
			ps.setString(5,attVals);
			int op=ps.executeUpdate();
			response.getWriter().print(op +" rows affected");
//			ps.setString(1, uname);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(request.getParameterValues("permsCBK"));
		List<String> liPerms=Arrays.asList(request.getParameterValues("permsCBK"));
		for(String s:liPerms) {
			System.out.println(s);
		}
//		System.out.println("a");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
