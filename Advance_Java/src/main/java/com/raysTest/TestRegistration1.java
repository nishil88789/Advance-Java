package com.raysTest;



import com.raysBean.RegistrationBean;
import com.raysModel.RegistrationModel;

public class TestRegistration1 {
	public static void main(String[] args) throws Exception {
		testadd();
	}

	private static void testadd() throws Exception {
		RegistrationBean bean = new RegistrationBean();
		
		bean.setfName("rahul");
		bean.setlName("singh");
		bean.setDob("02/02/1999");
		bean.setAdd("indore");
		bean.setEmail("rahul@gmail.com");
		bean.setGender("male");
		bean.setLang("HTML");
		
	RegistrationModel model = new RegistrationModel();
		
	   model.testAdd(bean);
		System.out.println("Success");
		
	}

}
