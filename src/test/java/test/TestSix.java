package test;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePage.util;
import page.TestSecondPage;

public class TestSix extends util {
	
	@BeforeMethod
	public void callingWebBrowser() {
		init();
	}

/*
 *  Test 3: Validate the month drop down has all the months 
 *  (jan, feb, mar ...) in the Due Date dropdown section.
 */
	@Test
	public void test6 () {
		String[] months = {"Jan","Feb","Mar","Apr",
				"May", "Jun","Jul","Aug","Sep","Oct",
				"Nov","Dec"};
		
		TestSecondPage variousCases = PageFactory.initElements(driver, TestSecondPage.class);
		for (int i=0; i<months.length; i++) {
		variousCases.selectMonth(months[i]);
		Assert.assertEquals(months[i], variousCases.selectMonth(months[i]));
		}
	}
	
	@AfterMethod
	public void closingBrowser() {
		tearDown();
	}
}


	
	

