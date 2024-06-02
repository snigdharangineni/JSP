package com.jspLearning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		
		HttpSession session = req.getSession();
		int k = (int)session.getAttribute("k");
		
		//int k = Integer.parseInt(req.getParameter("k"));
		
		k = k*k;
		out.print("<html><body bgcolor = 'cyan'>" );
		out.println("result is " + k);
		out.print("</body></html>");
	}
}
