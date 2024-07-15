import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class MyServlet
 */
//@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    	 HttpSession s= request.getSession(); 
 		 List<Registration> ls=new ArrayList<>();
    	 
    	 String uName=request.getParameter("uName");
         String pass=request.getParameter("pass");
         
         for(Registration reg : ls) {
        	 if(uName.equals(reg.getUname()){
        		 if( pass.equals(reg.getPass())))
        	 	{
        		 	response.getWriter().append("HI "+uName);
        	 	}
	        	 else
	             {
	            	 response.getWriter().append("Wrong Pass");
	            	 response.sendRedirect("login.html");
	             }
        	 
        	 }
		}
        response.getWriter().append("User Not There");
        
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        resp.getWriter().append("HI (POST)"+req.getParameter("uName"));
    }

}