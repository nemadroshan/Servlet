package com.intEthic.service;

import java.util.List;

import com.intEthic.bo.StudentBO;
import com.intEthic.dto.StudentDTO;

public interface StudentService {
		public String addStudent(StudentDTO dto);
		public String deleteStudentByRollNum(int rollNum)throws Exception;
		public boolean login(String name, String pwd)throws Exception;
		public List<StudentDTO>getAllStudent()throws Exception;
		public StudentDTO getResultBYrollnum(String name , int num )throws Exception;
}
