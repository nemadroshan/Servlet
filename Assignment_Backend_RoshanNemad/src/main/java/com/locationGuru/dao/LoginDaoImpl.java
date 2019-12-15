package com.locationGuru.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.locationGuru.bo.UserBo;

@Repository
public class LoginDaoImpl implements LoginDao {
	private static final String LOGIN_QUERY ="SELECT COUNT (*) FROM USER_TABLE WHERE USERNAME = ? AND PASSWORD = ? ";
	private static final String GETROLE_QUERY = " SELECT ROLE FROM USER_TABLE WHERE USERNAME =? AND PASSWORD = ?";
	private static final String GETFULLNAME_QUERY ="SELECT NAME , LASTNAME FROM USER_TABLE WHERE USERNAME = ?";
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
	Connection con = null;
	Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "scott", "tiger");
		if(con == null)
			System.out.println("Connectionn is not established");
		else
			System.out.println("Connection is established");
	return con;
	}
	
	@Override
	public int login(String username, String password) throws Exception {
		Connection con =null;
		PreparedStatement ps = null;
		int count = 0;
		con  = getConnection();
		ps = con.prepareStatement(LOGIN_QUERY);
		//set values to query parameter
		ps.setString(1,username);
		ps.setString(2, password);
		//execute the query
		 count= ps.executeUpdate();
		 con.close();
		return count;
	}

	@Override
	public String role(String username, String password) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String role = null;
		
		//getConnection
		con= getConnection();
		ps = con.prepareStatement(GETROLE_QUERY);
		//setting values to query param
		ps.setString(1,username);
		ps.setString(2, password);
		//execute the query
		rs = ps.executeQuery();
	
		if(rs != null) 
			while (rs.next()) {
				role = rs.getString(1);
			}
		con.close();
		return role;
	}

	@Override
	public UserBo getFullName(String username) throws Exception {
		Connection con =null;
		PreparedStatement ps = null;
		UserBo bo =null;
		ResultSet rs = null;
		bo =new UserBo();
		//get Connection
		con = getConnection();
		ps =  con.prepareStatement(GETFULLNAME_QUERY);
		//SET VALUES TO QUERY PARAM
		ps.setString(1,username);
		rs = ps.executeQuery();
		if(rs!=null)
			while(rs.next()) {
				bo.setName(rs.getString(1));
				bo.setLastName(rs.getString(2));
			}
		con.close();
		return bo;
	}

}
