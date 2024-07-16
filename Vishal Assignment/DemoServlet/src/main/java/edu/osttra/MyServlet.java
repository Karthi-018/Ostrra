package edu.osttra;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MysServlet
 */
//@WebServlet("/MysServlet")
public class MyServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		
		
//		String upwd=req.getParameter("upwd");
//		
//		if(uname.equals("vishal") && upwd.equals("000")) {
//			PrintWriter out=res.getWriter();		
//			out.println("Login done");
//		}
//		else {
//			PrintWriter out=res.getWriter();		
//			out.println("Wrong");
//		}
		String num1=req.getParameter("num1");
		int n1=Integer.parseInt(num1);
		
		String num2=req.getParameter("num2");
		int n2=Integer.parseInt(num2);
		
		String operator = req.getParameter("operator");
        if(operator.equals("+"))
        {
            PrintWriter out = res.getWriter();
            out.println(n1+n2);
        }
        else if(operator.equals("-"))
        {
            PrintWriter out = res.getWriter();
            out.println(n1-n2);
        }
        else if(operator.equals("*"))
        {
            PrintWriter out = res.getWriter();
            out.println(n1*n2);
        }
        else
        {
            PrintWriter out = res.getWriter();
            out.println(n1/n2);
        }
	
		
//String uname=req.getParameter("uName");
//		
//		req.setAttribute("uname",uname);
//		HttpSession session=req.getSession();
//		session.setAttribute("uname", uname);
//		
//		ServletContext context=req.getServletContext();
//		context.setAttribute("uname", uname);
//		
//		RequestDispatcher rd=req.getRequestDispatcher("SecondServlet");
//		rd.forward(req, res);
		
	}

}
