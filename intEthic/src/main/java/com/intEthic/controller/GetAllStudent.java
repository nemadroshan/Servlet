package com.intEthic.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.intEthic.dto.StudentDTO;
import com.intEthic.service.StudentService;
import com.intEthic.service.StudentServiceImpl;
@WebServlet("/getAllStudent")
public class GetAllStudent extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentService service =  new StudentServiceImpl();
		List<StudentDTO> dto =null;
		HttpSession session = req.getSession();
		try {
			dto = service.getAllStudent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(dto);
		req.setAttribute("list", dto);
		session.setAttribute("list", dto);	
	}
	
}
