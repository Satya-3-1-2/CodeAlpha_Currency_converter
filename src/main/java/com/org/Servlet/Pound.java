package com.org.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/pound")
public class Pound extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int first = Integer.parseInt(req.getParameter("first"));
		double second = 0.00989138;
		
		double res = first*second;
		
		PrintWriter rs = resp.getWriter();
		
		rs.write("<html><body>");
		rs.write("<td>"+res+"</td>");
		rs.write("</body></html>");
		
	}

}