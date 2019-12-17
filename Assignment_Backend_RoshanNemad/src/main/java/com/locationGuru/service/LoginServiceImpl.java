package com.locationGuru.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locationGuru.bo.UserBo;
import com.locationGuru.dao.LoginDao;
import com.locationGuru.dto.UserDTO;
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao dao;
	
	/*
	 * public void setDao(LoginDao dao) { this.dao = dao; }
	 */
	
	public LoginServiceImpl() {
	     System.out.println("service : zeroparam constructor");
	}

	@Override
	public boolean validate(String username, String password) throws Exception {
		System.out.println("LoginServiceImpl.validate()");
		int count =0;
		count = dao.login(username, password);
		if(count == 0)
			return false;
		else
			return true;
	}

	@Override
	public String getRole(String username, String password) throws Exception {
		System.out.println("LoginServiceImpl.getRole()");
			String role = null;
			role = dao.role(username, password);
			return role;
	}

	@Override
	public UserDTO getFullname(String username) throws Exception {
		System.out.println("LoginServiceImpl.getFullname()");
		UserDTO dto = new UserDTO();
		UserBo bo =null;
		bo = dao.getFullName(username);
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}
}
