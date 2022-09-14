package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class TestSecondPage {
	WebDriver driver;
	Select select;
	public TestSecondPage (WebDriver driver) {
		this.driver=driver;
	}
	@FindBy (how = How.NAME , using = "categorydata")
	WebElement CATEGORY_DATA;
	@FindBy (how = How.XPATH , using = "//select[@name='colour']")
	WebElement ADD_CAREGORY_COLOR;
	@FindBy (how = How.XPATH , using = "//input[@value='Add category']")
	WebElement ADD_CAREGORY_Data;
	@FindBy (how = How.NAME , using = "category" )
	WebElement Category;
	
	@FindBy (how = How.NAME , using = "due_month")
	WebElement Due_month;
	
	public void addCategoryData (String data) {
		CATEGORY_DATA.sendKeys(data);
		System.out.println(data);
	}
	public void  addCategoryColor(String color) {
		select = new Select (ADD_CAREGORY_COLOR);
	    select.selectByVisibleText(color);
	}
	public void clickAddCategory() {
		ADD_CAREGORY_Data.click();
	}
	
	public String checkCategory(String data) {
		select = new Select (Category);
		select.selectByVisibleText(data);
		return select.getFirstSelectedOption().getText();
	}
	
	public String selectMonth (String month) {
		select = new Select(Due_month);
		select.selectByVisibleText(month);
		String option = select.getFirstSelectedOption().getText();
		System.out.println(option);
		return option;
	}
}
