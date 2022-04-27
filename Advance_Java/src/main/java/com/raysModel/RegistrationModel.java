package com.raysModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import com.raysBean.RegistrationBean;

public class RegistrationModel {
public static Integer nextPk(RegistrationBean bean) throws Exception {
		
	ResourceBundle rb = ResourceBundle.getBundle("com.raysModel.app");

	Class.forName(rb.getString("driver"));

	Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("username"),
			rb.getString("password"));

		
		conn.setAutoCommit(false);
		
		int pk = 0;
		
		PreparedStatement ps = conn.prepareCall("select max(id) from registrationform ");
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			pk = rs.getInt(1);
		}
		
		conn.commit();
		
		System.out.println(rs +"Inserted");
		System.out.println(pk);
		conn.close();
		ps.close();
		return pk+1;
}

	public void testAdd(RegistrationBean bean) throws Exception {

		ResourceBundle rb = ResourceBundle.getBundle("com.raysModel.app");

		Class.forName(rb.getString("driver"));

		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("username"),
				rb.getString("password"));

		conn.setAutoCommit(false);

		PreparedStatement ps = conn.prepareStatement("INSERT INTO registrationform VALUES(?,?,?,?,?,?,?,?,?,?);");
        ps.setInt(1, nextPk(bean));
		ps.setString(2, bean.getfName());
		ps.setString(3, bean.getlName());
		ps.setString(4, bean.getDob());
		ps.setString(5, bean.getEmail());
		ps.setString(6, bean.getContact());
		ps.setString(7, bean.getGender());
		ps.setString(8, bean.getAdd());
		ps.setString(9, bean.getLang());
		ps.setString(10, bean.getPwd());

		int i = ps.executeUpdate();

		System.out.println(i + "added");

		conn.commit();

		conn.close();
		ps.close();

	}

	public String forgotEmail(String e) {
		// TODO Auto-generated method stub
		return null;
	}
	public static Boolean authenticat(RegistrationBean m) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("com.raysModel.app");
		Class.forName(rb.getString("driver"));
		Connection co = DriverManager.getConnection(rb.getString("url"), rb.getString("username"),
				rb.getString("password"));
		int t = 0;

		PreparedStatement pr = co.prepareStatement("select EMAIL,pwd from registrationform");

		ResultSet r = pr.executeQuery();
		RegistrationBean m1 = new RegistrationBean();
		while (r.next()) {
			m1.setEmail(r.getString(1));
			m1.setPwd(r.getString(2));
			if (m.getEmail().equals(m1.getEmail()) && m.getPwd().equals(m1.getPwd())) {
				t = 1;
			}
		}
		if (t == 1) {
			return true;
		} else {
			return false;
		}
	}	

}