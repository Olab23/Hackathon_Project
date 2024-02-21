
package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class buyNew extends BasePage {
	
	public	WebDriver driver;
	
	public buyNew( WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
			}
	
	@FindBy(xpath= "//*[@id=\"before-tp\"]/div[2]/a")
	WebElement buynew;
	
	
		public void buynew() {
			buynew.click();
		}
	}