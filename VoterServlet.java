package com.techno.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class VoterServlet extends HttpServlet 
{
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException {
	
	PrintWriter pw=null;
	String name=null,tage=null;
	int age=0;
	pw=res.getWriter();
	res.setContentType("text/html");

	name=req.getParameter("name");
	tage=req.getParameter("age");
	age=Integer.parseInt(tage);

	if(age>=18)
		{
		pw.println("<h1 style='color:green'>"+name+"you are Eligible for vote</h1>");
		}
		else
		{
			pw.println("<h1 style='color:red'>"+name+"you are not eligible for vote </h1>");
		}
		pw.println("<a href='input.html'><img src=profile_img.png'></a>");
		pw.close();
	}
}