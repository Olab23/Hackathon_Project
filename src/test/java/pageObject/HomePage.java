package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
	

    WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//p[normalize-space()='Travel Insurance']")
	WebElement travelInsurance;
	
	@FindBy(xpath="//p[normalize-space()='Car Insurance']")
	WebElement carInsurance;
	
	@FindBy(xpath="//div[@class='shadowHandlerBox']/i[@class='icon-bg homeIconsBg health-insurance']")
	WebElement healthInsurance;
	
	public void travelinsurance() {
		
		JavascriptExecutor js = (JavascriptExecutor)super.driver;
		js.executeScript("document.body.style.zoom='90%'");
		js.executeScript("arguments[0].click();", travelInsurance);

	}

	public void Carinsurance() {
		
		JavascriptExecutor js = (JavascriptExecutor)super.driver;
		js.executeScript("document.body.style.zoom='90%'");
		js.executeScript("arguments[0].click();", carInsurance);

	}
	
	public void Healthinsurance() {
		
		JavascriptExecutor js = (JavascriptExecutor)super.driver;
		js.executeScript("document.body.style.zoom='90%'");
		js.executeScript("arguments[0].click();", healthInsurance);
	}
}
