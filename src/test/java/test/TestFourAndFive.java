package test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePage.util;
import page.TestSecondPage;


public class TestFourAndFive extends util {
	TestSecondPage variousCases;
	
	@BeforeMethod
	public void callingWebBrowser() {
		init();
		variousCases = PageFactory.initElements(driver, TestSecondPage.class);

	}
	
	/*
	 * Test 1: Validate a user is able to add a
	 * category and once the category is added it should display.
	 */
	@Test
	public void test4 () {
		variousCases.addCategoryData("FCTechfios123");
		variousCases.addCategoryColor("Blue");
		variousCases.clickAddCategory();
		Assert.assertEquals(variousCases.checkCategory("FCTechfios123"), "FCTechfios123", "Categoory couldn't be found");
		System.out.println("Test");
	}
	
	/*
	 * Test 2: Validate a user is not able to add a duplicated category.
	 *  If it does then the following message will display: "The category you
	 *  want to add already exists: <duplicated category name>."
	 */
	
	@Test
	public void test5() {
		 variousCases.addCategoryData("FCTechfios123");
			variousCases.addCategoryColor("Blue");
			variousCases.clickAddCategory();
		String actualText = driver.findElement(By.tagName("body")).getText();
		String expectedText = "The category you want to add already exists: FCTechfios123.";
		Assert.assertEquals(actualText, expectedText , "Invalid message");
		
	}
	
	@AfterMethod
	public void closingBrowser() {
		tearDown();
	}
	
}