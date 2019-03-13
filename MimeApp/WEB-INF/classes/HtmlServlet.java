package com.nt.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class HtmlServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{

		//get PrintWriter
		PrintWriter pw =res.getWriter();
		//set Response Content tYpe

		res.setContentType("text/html");
		//write logic to generate to output(webpage)
		pw.println("<table border ='0'>");
		pw.println("<tr><th>Leader</th><th>plcaces</th><th>Winning Prediction</th></tr>");
		pw.println("<tr><td>Modi</td><td>Gujarat</td><td>Super win</td></tr>");
		pw.println("<tr><td>Rahul</td><td>Delhi</td><td>May be  win</td></tr>");
		pw.println("<tr><td>Pawan kalyan</td><td>Telngana</td><td>Super win</td></tr>");
		pw.println("<tr><td>Mamata Banerji</td><td>West Bengal</td><td> so so win</td></tr>");
		pw.println("<tr><td>Raj Thakrey</td><td>Maharashtra</td><td> ONly one sit will win</td></tr>");
		pw.println("</table>");

		//close Streeam object
		pw.close();
	}//service();
}//class
