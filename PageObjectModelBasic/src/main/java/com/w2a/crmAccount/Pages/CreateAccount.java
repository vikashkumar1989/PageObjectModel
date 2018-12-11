package com.w2a.crmAccount.Pages;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class CreateAccount extends Page{
	
	public void AddAccountInfo(String name) {
		driver.findElement(By.xpath("//input[@id='Crm_Accounts_ACCOUNTNAME']")).sendKeys(name);
	}

}
