package com.test;

import org.testng.annotations.Test;

import genericlibrary.baseclass;
import objectrepository.Apparelpage;
import objectrepository.welcomepage.WelcomePage;

public class ApparelTest {
	public class ApparelsTest extends baseclass {

		@Test
		public void apparel_001() {
			WelcomePage welcome=new WelcomePage(driver);
			
			Apparelpage apparel=new Apparelpage(driver);
			
			//Click on Apparels link
			welcome.getApparelLink().click();
			test.log(LogStatus.INFO, "Clicked on Apparels link");
			//Verify Apparel page is displayed
			Assert.assertEquals(apparel.getPageTitle().getText(), "Apparel & Shoes");
			test.log(LogStatus.PASS, "Apparels page is displayed");
			
//			Reporter.log("jnojcbsoaclj",true);
		}
	}
}
