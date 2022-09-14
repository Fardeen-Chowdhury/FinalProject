package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestThirdPage {
	
	WebDriver driver;
	
	public TestThirdPage (WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH , using = "//button[@onclick=\"myFunctionSky()\"]")
	WebElement SKY_BLUE_BACKGROUD;
	@FindBy(how = How.XPATH , using = "//button[@onclick=\"myFunctionWhite()\"]")
	WebElement SKY_WHITE_BACKGROUD;
	
	public void clickForSkyBlueBackground() {
		SKY_BLUE_BACKGROUD.click();
	}
	public void clickForSkyWhiteBackground() {
		SKY_WHITE_BACKGROUD.click();
	}
}
