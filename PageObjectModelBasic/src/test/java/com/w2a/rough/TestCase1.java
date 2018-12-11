package com.w2a.rough;

import com.w2a.base.Page;
import com.w2a.crm.Pages.CrmHomePage;
import com.w2a.crmAccount.Pages.AccountPage;
import com.w2a.crmAccount.Pages.CreateAccount;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomePage h1=new HomePage();
		LoginPage lg=h1.gotoLogin();
		ZohoAppPage zp=lg.login("smartyvik35@gmail.com", "Lohani@1");
		CrmHomePage crm=zp.gotoCrm();
		AccountPage ac=Page.menu.gotoAccounts();
		CreateAccount ca=ac.gotoCreate();
		ca.AddAccountInfo("Vikash");
		
}

}
