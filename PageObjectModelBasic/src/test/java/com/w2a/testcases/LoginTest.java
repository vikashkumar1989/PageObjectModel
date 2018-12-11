package com.w2a.testcases;

import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;

public class LoginTest extends Page{
	
	@Test
	public void login() {
		HomePage h1=new HomePage();
		System.out.println("Debug1");
		LoginPage lg=h1.gotoLogin();
		System.out.println("Debug2");
		ZohoAppPage zp=lg.login("smartyvik35@gmail.com", "Lohani@1");
	}

}
