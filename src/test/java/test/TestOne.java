package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePage.util;
import page.TestFirstPage;

public class TestOne extends util {
	
		@BeforeMethod
		public void callingWebBrowser() {
			init();
		}
	
	/*
	 * Test 1: Validate when the toggle all check box is CHECKED,
	 *  all check boxes for list items are also CHECKED ON.
	 */
		@Test
		public void test1 () {
			TestFirstPage variousCases = PageFactory.initElements(driver, TestFirstPage.class);
			variousCases.insertData("FC123");
			variousCases.addData();
			variousCases.insertData("FC124");
			variousCases.addData();
			variousCases.toggleAll();
		}
		
		@AfterMethod
		public void closingBrowser() {
			tearDown();
		}
}
