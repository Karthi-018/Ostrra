package edu.training.osttra;


import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class MyServlet extends HttpServlet {
    
    

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String n1= req.getParameter("n1");
        int num1 = Integer.parseInt(n1);
        String n2= req.getParameter("n2");
        int num2 = Integer.parseInt(n2);
        String op = req.getParameter("op");
        if(op.equals("+"))
        {
        	PrintWriter out = res.getWriter();
            out.println(num1+num2);
        }
        else if(op.equals("-"))
        {
        	PrintWriter out = res.getWriter();
            out.println(num1-num2);
        }
        else if(op.equals("*"))
        {
        	PrintWriter out = res.getWriter();
            out.println(num1*num2);
        }
        else
        {
        	PrintWriter out = res.getWriter();
            out.println(num1/num2);
        }
       
        
    }

    

}