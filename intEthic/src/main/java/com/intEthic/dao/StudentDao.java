package com.intEthic.dao;

import java.util.List;

import com.intEthic.bo.StudentBO;

public interface StudentDao {
	public int insert(StudentBO bo)throws Exception;
	public int deleteByRollNumber(int rollNum)throws Exception;
	public boolean login(String user, String pwd)throws Exception;
	public List<StudentBO>getAllStudent()throws Exception;
}
