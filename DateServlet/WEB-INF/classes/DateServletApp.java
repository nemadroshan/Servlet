package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DateServletApp extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw =null;
		Date d =null;
		//set response context type to Instruct browser towards displaying web pages
		res.setContentType("text/html");
		//get PrintWriter Stream obj pointing res obj as destnation from obj
		pw=res.getWriter();
		//write b logic to generate the output
		d = new Date();

	
		//write output to response object 
		pw.println("<br>our servlet class (Date Servlet) object hashcode:"+this.hashCode());
		pw.println("<br>our servlet class (Date Servlet) req hashcode:"+req.hashCode());
		pw.println("<br>our servlet class (Date Servlet) res hashcode:"+res.hashCode());
		pw.println("<br>our servlet class (Date Servlet) res hashcode:"+res.hashCode());
		
		pw.println("<h1 style='color:red,text:-align:center'>Date and Time!!!->"+d.toString());
		
		//close stram
		
		pw.close();
	}

}
