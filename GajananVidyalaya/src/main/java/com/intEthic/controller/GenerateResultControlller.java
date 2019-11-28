package com.intEthic.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.intEthic.dto.StudentDTO;
import com.intEthic.service.StudentService;
import com.intEthic.service.StudentServiceImpl;

@WebServlet("/gresult")
public class GenerateResultControlller extends HttpServlet {
   @Override
public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session = req.getSession();
	ServletContext ctx = req.getServletContext();
	RequestDispatcher rd = null;
	StudentService service = new StudentServiceImpl();
	String name = req.getParameter("sname").toLowerCase();
	int rollnum =0;
	try {
		rollnum= Integer.parseInt(req.getParameter("rollnum"));
		StudentDTO dto = service.getResultBYrollnum(name, rollnum);
		session.setAttribute("dto", dto);
		resp.sendRedirect("maks");
	}catch (SQLException se) {
		// TODO Auto-generated catch block
		se.printStackTrace();
		rd = ctx.getRequestDispatcher("/error");
		rd.forward(req, resp);
	}
	catch (NumberFormatException nfe) {
		nfe.printStackTrace();
		rd= ctx.getRequestDispatcher("/error");
		rd.forward(req, resp);
	}
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		rd= ctx.getRequestDispatcher("/error");
		rd.forward(req, resp);
		
	}
}
   
 @Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		doGet(req, resp);
	}
}
