package com.intEthic.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.intEthic.dto.StudentDTO;
import com.intEthic.service.StudentService;
import com.intEthic.service.StudentServiceImpl;
@WebServlet("/addurl")
public class AddStudent extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String result = "";
		HttpSession session = req.getSession();
		StudentService service = new StudentServiceImpl();
		StudentDTO dto = new StudentDTO();
		System.out.println("AddStudent.doGet()");
		// general settings
		PrintWriter pw = res.getWriter();
		// set Content type
		res.setContentType("text/html");

		// take input form forem and set to dto
		dto.setBio_marks(Integer.parseInt(req.getParameter("bm")));
		dto.setChemistry_mark(Integer.parseInt(req.getParameter("cm")));
		dto.setEnglish_marks(Integer.parseInt(req.getParameter("em")));
		dto.setPhysics_marks(Integer.parseInt(req.getParameter("pm")));
		dto.setFname(req.getParameter("fname").toLowerCase());
		dto.setName(req.getParameter("sname").toLowerCase()+" "+req.getParameter("lname").toLowerCase());

		// call service methode
		result = service.addStudent(dto);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("AddStudent.doPost()");
		doGet(request, response);
	}

}
