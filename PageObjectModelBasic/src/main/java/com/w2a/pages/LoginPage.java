package com.w2a.pages;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class LoginPage extends Page{
	
	public ZohoAppPage login(String username, String password) {
		type("id_XPATH",username);
		type("password_XPATH",password);
		click("//div[@id='signin_submit']");
		return new ZohoAppPage();
	}

}
