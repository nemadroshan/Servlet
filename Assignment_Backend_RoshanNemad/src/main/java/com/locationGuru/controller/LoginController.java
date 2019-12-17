package com.locationGuru.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.locationGuru.dto.UserDTO;
import com.locationGuru.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService service;

	public LoginController() {
		System.out.println("LoginController : zero param Constructor");
	}

	@RequestMapping(value = "/login")
	public String showlogin() {
		System.out.println("LoginController.showlogin()");
		return "login";
	}

	@RequestMapping(value = "/login.htm", method = RequestMethod.POST)
	public String authenticate(HttpServletRequest req, Model model) {
		System.out.println("LoginController.authenticate()");
		boolean flag = false;
		UserDTO dto = null;
		String role = null;

		String username = req.getParameter("uname").trim().toLowerCase();
		String password = req.getParameter("pwd").trim().toLowerCase();
		// using Service validating user
		try {
			flag = service.validate(username, password);
			if (flag == true) {
				role = service.getRole(username, password);
				if (role.equalsIgnoreCase("admin")) {
					// admin
					dto = service.getFullname(username);
					model.addAttribute("user", dto);
					return "admin";
				} else if (role.equalsIgnoreCase("manager")) {
					// manager
					dto = service.getFullname(username);
					model.addAttribute("user", dto);
					return "manager";
				} else {
					// employee
					dto = service.getFullname(username);
					model.addAttribute("user", dto);
					return "employee";
				}
			} // if
			/*
			 * else { rd = req.getRequestDispatcher("error.jsp"); rd.forward(req, res); }
			 */
		} // try
		catch (SQLException se) {
			se.printStackTrace();
			return "error";
		} catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
			return "error";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
		return "error";
	}// loginController
}