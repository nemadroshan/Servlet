package com.locationGuru.service;

import com.locationGuru.dto.UserDTO;

public interface LoginService {
	public boolean validate(String username ,String password) throws Exception;
	public String getRole(String username,String password) throws Exception;
	public UserDTO getFullname(String username)throws Exception;

}
