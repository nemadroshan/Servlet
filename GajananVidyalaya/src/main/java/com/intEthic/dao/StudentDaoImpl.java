package com.intEthic.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.intEthic.bo.StudentBO;

public class StudentDaoImpl implements StudentDao{
	private static final String INSERT_QUERY = "INSERT INTO CURD_STUDENT VALUES(?,?,?,?,?,?,?,?,CUST.NEXTVAL)";
	private static final String DELETE_QUERY = "DELETE FROM CURD_STUDENT WHERE ROLLNUM=?";
	private static final String RESULT_QUERY = "SELECT NAME,FNAME,ROLLNUM,P_MARK,C_MARK,B_MARK,E_MARK,PERCENTAGE,OUTOF FROM CURD_STUDENT WHERE NAME=? AND FNAME=? AND ROLLNUM=?";
	private static final String getAllStudent = "SELECT NAME,FNAME,P_MARK,C_MARK,B_MARK,E_MARK,OUTOF,PERCENTAGE,ROLLNUM FROM CURD_STUDENT";
    private static final String getStudentByRollNum ="SELECT NAME,FNAME,P_MARK,C_MARK,B_MARK,E_MARK,OUTOF,PERCENTAGE,ROLLNUM FROM CURD_STUDENT WHERE NAME =? AND ROLLNUM=?";
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			if (con != null)
				System.out.println("Connection is established");
			else
				System.out.println("Connection is not established");
		} catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return con;
	}// connection

	 
	public int insert(StudentBO bo) throws Exception {
		PreparedStatement ps = null;
		Connection con = null;
		// get connection
		con = getConnection();
		ps = con.prepareStatement(INSERT_QUERY);
		// set values to query param
		ps.setString(1, bo.getName());
		ps.setString(2, bo.getFname());
		ps.setInt(3, bo.getPhysics_marks());
		ps.setInt(4, bo.getChemistry_mark());
		ps.setInt(5, bo.getBio_marks());
		ps.setInt(6, bo.getEnglish_marks());
		ps.setInt(7, bo.getOut_of());
		ps.setFloat(8, bo.getPercentage());

		int result = ps.executeUpdate();
		if (result == 0)
			return 0;
		else
			return 1;
	}// insert

	 
	public int deleteByRollNumber(int rollNum) throws Exception {
		System.out.println("StudentDaoImpl.deleteByRollNumber()");
		Connection con = getConnection();
		PreparedStatement ps = null;
		ps = con.prepareStatement(DELETE_QUERY);
		ps.setInt(1, rollNum);
		int result = ps.executeUpdate();
		if (result == 0)
			return 0;
		else
			return 1;
	}// delete

	 
	public boolean login(String user, String pwd) throws Exception {
		System.out.println("StudentDaoImpl.login()");
		boolean flag = false;
		/*
		 * Connection con = getConnection(); Statement st = con.createStatement();
		 * boolean flag = false; System.out.println(pwd); ResultSet rs =
		 * st.executeQuery("SELECT UNAME,PWD FROM ADMIN"); while(rs.next()) {
		 * 
		 * if (user.equals(rs.getString(1)) && pwd.equals(rs.getString(2))) { flag =
		 * true; } else { flag = false; break; } } // while
		 */

		if (user.equalsIgnoreCase("admin") && pwd.equals("admin")) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}// login

	 
	public List<StudentBO> getAllStudent() throws Exception {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		List<StudentBO> lbo = new ArrayList<StudentBO>();

		con = getConnection();
		st = con.createStatement();
		rs = st.executeQuery(getAllStudent);
		while (rs.next()) {
			StudentBO bo = new StudentBO();
			bo.setName(rs.getString(1));
			bo.setFname(rs.getString(2));
			bo.setPhysics_marks(Integer.parseInt(rs.getString(3)));
			bo.setChemistry_mark(Integer.parseInt(rs.getString(4)));
			bo.setBio_marks(Integer.parseInt(rs.getString(5)));
			bo.setEnglish_marks(Integer.parseInt(rs.getString(6)));
			bo.setOut_of(Integer.parseInt(rs.getString(7)));
			bo.setPercentage(Float.parseFloat(rs.getString(8)));
			bo.setRollNum(Integer.parseInt(rs.getString(9)));

			lbo.add(bo);
		}

		return lbo;
	}

	 
	public StudentBO getResultByRollNum(String name, int rollnum) throws Exception {
		Connection con = getConnection();
		ResultSet rs =null;
		PreparedStatement ps = null;
		StudentBO bo = new StudentBO();
		ps = con.prepareStatement(getStudentByRollNum);
		ps.setString(1, name);
		ps.setInt(2,rollnum);
		
		rs = ps.executeQuery();
		while (rs.next()) {
			bo.setName(rs.getString(1));
			bo.setFname(rs.getString(2));
			bo.setPhysics_marks(Integer.parseInt(rs.getString(3)));
			bo.setChemistry_mark(Integer.parseInt(rs.getString(4)));
			bo.setBio_marks(Integer.parseInt(rs.getString(5)));
			bo.setEnglish_marks(Integer.parseInt(rs.getString(6)));
			bo.setOut_of(Integer.parseInt(rs.getString(7)));
			bo.setPercentage(Float.parseFloat(rs.getString(8)));
			bo.setRollNum(Integer.parseInt(rs.getString(9)));
		}
		return bo;
	}

}// class
