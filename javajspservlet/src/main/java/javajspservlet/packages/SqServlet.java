package javajspservlet.packages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

		System.out.println("In SquareServlet");

		// RequestDispatcher topics starts

		/*
		 * int k = (int) req.getAttribute("k");
		 * 
		 * k = k * k;
		 * 
		 * PrintWriter er = res.getWriter();
		 * 
		 * er.println(k);
		 */

		// RequestDispatcher topics ends

		// sendRedirect starts
		
		  int k = Integer.parseInt(req.getParameter("k"));
		  
		  k = k * k;
		  
		  PrintWriter er = res.getWriter();
		  
		  er.println(k);
		 
		// sendRedirect ends
	}

}
