package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestFirstPage {
	
	WebDriver driver;

	public TestFirstPage (WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how = How.NAME, using = "data")
	WebElement Insert_Data;
	@FindBy(how = How.XPATH, using = "//input[@value='Add']")
	WebElement Add_Data;
	@FindBy(how = How.NAME, using = "allbox")
	WebElement All_box;
	@FindBy(how = How.NAME, using = "todo[0]")
	WebElement Check_One_Box;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")
	WebElement Remove;
	
	public void insertData (String data) {
		Insert_Data.sendKeys(data);
	}
	public void addData () {
		Add_Data.click();
	}
	public void toggleAll() {
		All_box.click();
	}
	public void checkOneBox() {
		Check_One_Box.click();
	}
	public void remove() {
		Remove.click();
	}
}
