

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServ
 */
@WebServlet("/CalcServ")
public class CalcServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int a= Integer.parseInt(request.getParameter("num1"));
		int b= Integer.parseInt(request.getParameter("num2"));
		String op= request.getParameter("op");
		switch(op) {
		case "+" :  response.getWriter().append("sum is " + (a+b));
		break;
		case "/" :  try{response.getWriter().append("div is " + (a/b));} catch(Exception e) {response.getWriter().append(e.getMessage());};
		break;
		case "-" :  response.getWriter().append("sum is " + (a-b));
		break;
		case "*" :  response.getWriter().append("sum is " + (a*b));

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
