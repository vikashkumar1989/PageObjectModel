package com.w2a.pages;

import org.openqa.selenium.By;

import com.w2a.base.Page;
import com.w2a.crm.Pages.CrmHomePage;

public class ZohoAppPage extends Page {

	public void gotoCliq() {	
		click("gotoCliq_XPATH");

	}

	public CrmHomePage gotoCrm() {		
		click("gotoCrm_XPATH");
		return new CrmHomePage();
		

	}
	public void gotoMeeting() {
		click("gotoMeeting_XPATH");

	}

	public void gotoSalesIQ() {
		click("gotoSalesIQ_XPATH");

	}

}
