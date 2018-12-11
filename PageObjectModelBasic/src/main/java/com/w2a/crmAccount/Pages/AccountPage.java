package com.w2a.crmAccount.Pages;

import org.openqa.selenium.By;

import com.mysql.cj.jdbc.Driver;
import com.w2a.base.Page;

public class AccountPage extends Page{
	
	public void gotoImport() {
		click("gotoImport_XPATH");
	}
	public CreateAccount gotoCreate() {
		click("gotoCreate_XPATH");
		return new CreateAccount();
	}

}
