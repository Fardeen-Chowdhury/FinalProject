package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePage.util;
import page.TestFirstPage;

public class TestThree extends util {
	
	@BeforeMethod
	public void callingWebBrowser() {
		init();
	}

/*
 *  Test 3: Validate that all list item could be removed using the 
 *  remove button and when "Toggle All" functionality is on.
 */
	@Test
	public void test3 () {
		TestFirstPage variousCases = PageFactory.initElements(driver, TestFirstPage.class);
		variousCases.insertData("FC123");
		variousCases.addData();
		variousCases.insertData("FC124");
		variousCases.addData();
		variousCases.toggleAll();
		variousCases.remove();
	}
	@AfterMethod
	public void closingBrowser() {
		tearDown();
	}
}


