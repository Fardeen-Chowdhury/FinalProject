package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePage.util;
import page.TestFirstPage;

public class TestTwo extends util {
		
		@BeforeMethod
		public void callingWebBrowser() {
			init();
		}
	
	/*
	 *	Test 2: Validate that a single list item could be 
	 *	removed using the remove button 
	 *	when a single checkbox is selected.
	 */
		@Test
		public void test2 () {
			TestFirstPage variousCases = PageFactory.initElements(driver, TestFirstPage.class);
			variousCases.insertData("FC123");
			variousCases.addData();
			variousCases.insertData("FC124");
			variousCases.addData();
			variousCases.checkOneBox();
			variousCases.remove();
		}
		@AfterMethod
		public void closingBrowser() {
			tearDown();
		}
}


