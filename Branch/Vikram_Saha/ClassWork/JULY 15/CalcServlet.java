

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
//@WebServlet("/MyServlet")
public class CalcServlet extends HttpServlet {
	public static int i=10;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		String oper=request.getParameter("oper");
		
		int result=-1;
		switch(oper) {
		case "+":result = num1+ num2; break;
		case "-":result = num1- num2; break;
		case "/":result = num1/ num2; break;
		case "%":result = num1% num2; break;
		case "*":result = num1* num2; break;
		default:response.getWriter().print("bad input"); return;
		}
		
		response.getWriter().print("OUTPUR = "+result);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.getWriter().append("HI (POST)"+req.getParameter("uName"));
	}

}
