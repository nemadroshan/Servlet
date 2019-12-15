package com.intEthic.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.intEthic.service.StudentService;
import com.intEthic.service.StudentServiceImpl;

@WebServlet("/deleteurl")
public class deleteStudent extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = null;
		int rollNum = 0;
		String result = null;
		StudentService service = new StudentServiceImpl();
		pw = response.getWriter();
		response.setContentType("text/html");
		RequestDispatcher rd =null;
		rollNum = Integer.parseInt(request.getParameter("rollnum"));
		try {
			result = service.deleteStudentByRollNum(rollNum);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			rd = request.getRequestDispatcher("/index.html");
			rd.forward(request, response);
		}
		pw.println(result);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
