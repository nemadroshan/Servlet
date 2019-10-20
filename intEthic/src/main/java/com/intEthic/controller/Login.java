package com.intEthic.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.intEthic.dao.StudentDao;
import com.intEthic.dao.StudentDaoImpl;
import com.intEthic.service.StudentService;
import com.intEthic.service.StudentServiceImpl;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentService service = new StudentServiceImpl();
		String name = request.getParameter("name").trim();
		PrintWriter out = response.getWriter();
		boolean result = false;
		String pwd = request.getParameter("pwd").trim();
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
		session.setAttribute("pwd", pwd);
		try {
			result = service.login(name, pwd);
			if (result == true) {
				response.sendRedirect("home");
			}
			else {
				response.sendRedirect("error");
			}
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("error");
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
