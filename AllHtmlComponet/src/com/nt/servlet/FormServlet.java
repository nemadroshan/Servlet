package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FormServlet  extends HttpServlet{
	public void doGet(HttpServletRequest request ,HttpServletResponse response)
												throws ServletException,IOException{
		String name=null,gender=null,ms=null,addrs=null,qlfy=null;
		String[] hb=null;
		String[] crs=null;
		int age =0;
		PrintWriter pw = null;
		//getPrint Writer Object//get
		pw = response.getWriter();
		
		//set response content type
		response.setContentType("text/html");
		//read from data
		name=request.getParameter("tname");
		age=Integer.parseInt(request.getParameter("tage"));
		gender=request.getParameter("gen");
		ms=request.getParameter("ms");
		addrs=request.getParameter("taddress");
		qlfy =request.getParameter("qlfy");
		crs=request.getParameterValues("crs");
		hb=request.getParameterValues("hb");
		
		//write request processing logic
		
			if(gender.equalsIgnoreCase("M")){
				if(age<=5)
					pw.println(name+"u are baby boy");
				else if(age<=12)
					pw.println(name+" u r small boy");
				else if(age<=19)
					pw.println(name+"u r tinnage boy");
				else if(age<=35)
					pw.println(name+"u r young man");
				else if(age<=50)
					pw.println(name+"u r middle boy");
				else 
					pw.println(name+"u r Budda boy");	
			}
			else if(gender.equalsIgnoreCase("F")) {
				
				if(age<=5)
					pw.println(name+"u are baby girl");
				else if(age<=12)
					pw.println(name+" u r small girl");
				else if(age<=19)
					pw.println(name+"u r tinnage girls");
				else if(age<=35)
					pw.println(name+"u r young aunty");
				else if(age<=50)
					pw.println(name+"u r aurat");
				else 
					pw.println(name+"u r Buddi boy");	
				
			}
		
			pw.println("<br>name="+name);
			pw.println("<br>age="+age);
			pw.println("<br>Gender="+gender);
			pw.println("<br>Maritial Status="+ms);
			pw.println("<br>Address="+addrs);
			pw.println("<br>Qualification="+qlfy);
			pw.println("<br>Courses="+Arrays.toString(crs));
			pw.println("<br>Hobbies ="+Arrays.toString(hb));	
	}//do get
	
	public void doPost( HttpServletRequest request , HttpServletResponse response)
															throws ServletException,IOException{
		doGet(request,response);
	}//doPost

}//class
