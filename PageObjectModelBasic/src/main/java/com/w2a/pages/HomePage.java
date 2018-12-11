package com.w2a.pages;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class HomePage extends Page{
	
	public void gotoCustomer() {		
		click("gotoCustomer_XPATH");
	}
	public void gotoSupport() {
		click("gotoSupport_XPATH");
	}
	public void gotoContactSales() {
		click("gotoContactSales_XPATH");
	}
	public LoginPage gotoLogin() {
		click("gotoLogin_XPATH");
		return new LoginPage();
		
	}
}
