package com.intEthic.service;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ListCellRenderer;

import com.intEthic.bo.StudentBO;
import com.intEthic.dao.StudentDao;
import com.intEthic.dao.StudentDaoImpl;
import com.intEthic.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private StudentDao dao;

	public StudentServiceImpl() {
		dao = new StudentDaoImpl();
	}

	@Override
	public String addStudent(StudentDTO dto) {
		// use dto and bo
		// copy to bo
		int result = 0;
		StudentBO bo = new StudentBO();
		bo.setBio_marks(dto.getBio_marks());
		bo.setChemistry_mark(dto.getChemistry_mark());
		bo.setEnglish_marks(dto.getEnglish_marks());
		bo.setPhysics_marks(dto.getPhysics_marks());
		bo.setFname(dto.getFname());
		bo.setName(dto.getName());
		bo.setOut_of(100);

		int total = dto.getBio_marks() + dto.getChemistry_mark() + dto.getEnglish_marks() + dto.getPhysics_marks();
		float percentage = (total / 300) * 100;
		System.out.println("per ::" + percentage);
		System.out.println("total " + total);
		bo.setPercentage(percentage);

		// call dao methode
		try {
			result = dao.insert(bo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (result == 1)
			return "Student Inserted Successfully";
		else
			return "Student insertion is failed";
	}// insert service

	@Override
	public String deleteStudentByRollNum(int rollNum) throws Exception {
		System.out.println("StudentServiceImpl.deleteStudentByRollNum()");
		int result = dao.deleteByRollNumber(rollNum);
		if (result == 0)
			return "Record Not deleted";
		else
			return "Record deleted Successfully";
	}// delete methode

	@Override
	public boolean login(String uname, String pwd) throws Exception {
		System.out.println("StudentServiceImpl.login()");
		System.out.println(pwd);
		boolean flag = dao.login(uname, pwd);
		if (flag == true)
			return true;
		else
			return false;
	}// login

	@Override
	public List<StudentDTO> getAllStudent() throws Exception {
		List<StudentDTO> ldto = new ArrayList<StudentDTO>();
		List<StudentBO> lbo = null;

		lbo = dao.getAllStudent();
		for (StudentBO bo : lbo) {
			StudentDTO dto = new StudentDTO();
			dto.setName(bo.getName());
			dto.setFname(bo.getFname());
			dto.setRollNum(bo.getRollNum());
			dto.setPhysics_marks(bo.getPhysics_marks());
			dto.setBio_marks(bo.getBio_marks());
			dto.setEnglish_marks(bo.getEnglish_marks());
			dto.setChemistry_mark(bo.getChemistry_mark());
			dto.setOutOf(bo.getOut_of());
			dto.setPercentage(bo.getPercentage());

			ldto.add(dto);
		}
		return ldto;
	}

}// class
