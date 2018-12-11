package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.crmAccount.Pages.AccountPage;


public class TopMenu extends Page{
	
	public static WebDriver driver;

	public TopMenu(WebDriver driver) {
		this.driver=driver;
	}
	public void gotoHome() {

	}

	public void gotoLeads() {

	}

	public void gotoContacts() {

	}

	public AccountPage gotoAccounts() {
		
		click("gotoAccounts_XPATH");
		return new AccountPage();

	}

	public void gotoDeals() {

	}

	public void gotoActivities() {

	}

	public void gotoReports() {

	}

	public void gotoAnalystics() {

	}

}
