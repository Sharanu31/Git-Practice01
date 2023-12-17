package javajspservlet.packages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	// public void service(HttpServletRequest req, HttpServletResponse res) throws
	// IOException {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		{
			int i = Integer.parseInt(req.getParameter("num1")); // get parameter will get us the string but we are
																// expecting an integer
			int j = Integer.parseInt(req.getParameter("num2"));

			int k = i + j;

			// RequestDispatcher starts //

			/*
			 * req.setAttribute("k", k);
			 * 
			 * // ReDirectingAn servlet from one servlet to other using below tech
			 * 
			 * // Using dispathcher we can call one servlet to other RequestDispatcher rd =
			 * req.getRequestDispatcher("sq");
			 * 
			 * rd.forward(req, res);
			 * 
			 * PrintWriter out = res.getWriter();
			 * 
			 * out.println("resuly " + k);
			 */

			// RequestDispatcher ends //

			// sendRedirect starts
			
			 res.sendRedirect("square");

			// sendRedirect ends
		}

	}

}
