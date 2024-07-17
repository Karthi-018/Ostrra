import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AddPermission")
public class AddPermission extends HttpServlet {   
	 public void init() {
	        List<String> rt = getResourcesType(); 
	        getServletContext().setAttribute("rt", rt);
	        
	    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String resourceType = request.getParameter("resourceType");
        String resource = request.getParameter("resource");
        String permission = request.getParameter("permission");
        String att= request.getParameter("attribute");
        ServletContext sc = request.getServletContext();
        if("retrieveResourceType".equals(action)) {
            List<String> rt = getResourcesType();
            sc.setAttribute("rt",rt);
            sc.removeAttribute("res"); 
            sc.removeAttribute("per");
            sc.removeAttribute("att");
         }else if ("retrieveResources".equals(action)) {
            List<String> resources = getResourcesByType(resourceType);
            sc.setAttribute("res",resources);
            List<String> permissions = getPermissionsByResource(resourceType);
            sc.setAttribute("per",permissions);
            sc.removeAttribute("att");
        } else if ("retrieveAttributes".equals(action)) {
            String attribute = getAttributesByResource(resource);
            sc.setAttribute("att", attribute);
        }else if ("retrieveVals".equals(action)) {
            List<String> vals = getvalbyAtt(att);
            sc.setAttribute("vals", vals);
        }
        sc.setAttribute("selectedrt", resourceType);
        sc.setAttribute("selectedres", resource);
        sc.setAttribute("selectedper", permission);
        sc.setAttribute("selectedatt", att);
        response.sendRedirect("PermissionCondition.jsp");
    }

    private List<String> getvalbyAtt(String att) {
    	List<String> vals = new ArrayList<>();
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            PreparedStatement ps;
            String sql = "SELECT Resources.\"values\" FROM public.\"Resources\" AS Resources WHERE Resources.\"Att\" = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, att);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String raw = rs.getString(1);
                String[] arr = raw.split(",");
                for (String value : arr) {
                    vals.add(value); 
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vals;
	}
	private List<String> getResourcesType() {
    	List<String> rt = new ArrayList<>();
        Connection conn=null;
		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgres");
			conn=con; 
			PreparedStatement ps;
			 String sql = "SELECT ResourceTypes.\"rtName\" " +
                     "FROM public.\"ResourceTypes\" AS ResourceTypes ";
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				rt.add(rs.getString(1));
			}
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rt;
	}

	private List<String> getResourcesByType(String type) {
        List<String> resources = new ArrayList<>();
        Connection conn=null;
		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgres");
			conn=con; 
			PreparedStatement ps;
			 String sql = "SELECT Resources.\"resName\" " +
                     "FROM public.\"Resources\" AS Resources " +
                     "WHERE Resources.\"rtName\" = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, type);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				resources.add(rs.getString(1));
			}
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resources;
    }

    private List<String> getPermissionsByResource(String type) {
        List<String> permissions = new ArrayList<>();
        Connection conn=null;
		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgres");
			conn=con; 
			PreparedStatement ps;
			 String sql = "SELECT ResourceTypes.\"Permissions\" " +
                     "FROM public.\"ResourceTypes\" AS ResourceTypes " +
                     "WHERE ResourceTypes.\"rtName\" = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, type);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				String raw=(rs.getString(1));
				String[] arr = raw.split(",");
				    for (String permission : arr) {
				        permissions.add(permission);
				    }
			}
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return permissions;
    }

    private  String getAttributesByResource(String res) {
        String attribute ="";
        Connection conn=null;
		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgres");
			conn=con; 
			PreparedStatement ps;
			 String sql = "SELECT Resources.\"Att\" " +
                     "FROM public.\"Resources\" AS Resources " +
                     "WHERE Resources.\"resName\" = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, res);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				attribute=(rs.getString(1));
			}
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return attribute;
    }
}