package com.raysModel;

import java.awt.List;
import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.raysBean.StudentBean;

public class StudentModel {
	public static void add(StudentBean bean) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("com.raysModel.app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
		PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?,?)");
		ps.setString(1, bean.getRollNO());
		ps.setString(2, bean.getFirstName());
		ps.setString(3, bean.getLastName());
		ps.setString(4, bean.getSession());
		
		int i = ps.executeUpdate();
		
		System.out.println(i+"Added");
		conn.close();
		ps.close();
	}
	public static void update(StudentBean bean) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("com.raysModel.app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
		PreparedStatement ps = conn.prepareStatement("update student set first_name=?,last_name=?,session=? where roll_no=?;");
		
		ps.setString(1, bean.getFirstName());
		ps.setString(2, bean.getLastName());
		ps.setString(3, bean.getSession());
		ps.setString(4, bean.getRollNO());
		
		int i = ps.executeUpdate();
		
		System.out.println(i+"Updated");
		conn.close();
	    ps.close();
	}
	public static void delete(String rollNo) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("com.raysModel.app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
		PreparedStatement ps = conn.prepareStatement("delete from student where roll_no=?;");
		ps.setString(1, rollNo);
		int i = ps.executeUpdate();
		System.out.println(i+"Deleted");
		conn.close();
		ps.close();
	}
	public static StudentBean get(String rollNo) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("com.raysModel.app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
		PreparedStatement ps = conn.prepareCall("select * from marksheet where roll_no=?");
		
		ps.setString(1, rollNo);
		
		ResultSet rs = ps.executeQuery();
		
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		
		while(rs.next()) {
			StudentBean bean1 = new StudentBean();
			bean1.setRollNO(rs.getString(1));
			bean1.setFirstName(rs.getString(2));
			bean1.setLastName(rs.getString(3));
			bean1.setSession(rs.getString(5));
			
			list.add(bean1);
		}	
		conn.commit();
		conn.close();
		ps.close();
		return null;
	    }
	public List search() throws Exception {
		
		ResourceBundle rb = ResourceBundle.getBundle("com.raysModel.app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("password"));
		
		
		conn.setAutoCommit(false);
		
		PreparedStatement ps = conn.prepareCall("select * from student");
		
		ResultSet rs = ps.executeQuery();
		
		List list = new List();
		
		while(rs.next()) {
			StudentBean bean1 = new StudentBean();
			bean1.setRollNO(rs.getString(1));
			bean1.setFirstName(rs.getString(2));
			bean1.setLastName(rs.getString(3));
			bean1.setSession(rs.getString(4));
			
			list.add(toString());
		}
		
	    
	    conn.commit();
	    
	    ps.close();
	    conn.close();
	    
	    return list;
	    

	}
}
