package com.locationGuru.dao;

import com.locationGuru.bo.UserBo;

public interface LoginDao {
	 public int login(String username , String password) throws Exception;
	 public String role(String username ,String password) throws Exception;
	 public UserBo getFullName(String username) throws Exception;
}
