package pageObject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelUtility;

public class Car_Insurance extends BasePage {
	public	WebDriver driver;
	public static String CarPlans;
	
	public Car_Insurance( WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
			}
	
	@FindBy(linkText="Buying a new car? Click here")
	WebElement buyingCar;
	
	@FindBy(xpath="//*[@id='searchInput']/div/input")
	WebElement searchRto;
	
	@FindBy(xpath="//span[text()='MH35-GONDIA(Maharashtra)']")
	WebElement selectCity;
	
	@FindBy(xpath="//span[@class='tata']")
	WebElement selectCar;
	
	@FindBy(xpath="//b[text()='NEXON']")
	WebElement carModel;
	
	@FindBy(xpath="//b[text()='Petrol']")
	WebElement fuelType;
	
	@FindBy(xpath="//li[text()='Automatic']")
	WebElement carVariant;
	
	@FindBy(xpath="//b[text()='Creative Plus 1.2 Revotron Petrol 6AMT (1199 cc)']")
	WebElement carVariantModel;
	
	@FindBy(xpath="//*[@id='name']")
	WebElement name;
	
	@FindBy(xpath="//*[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//*[@id='mobileNo']")
	WebElement mobilNo;
	
	@FindBy(xpath="//div[@class='msg-error show']")
	WebElement errorMessage;
	
	@FindBy(xpath="//span[text()='View Prices']")
	WebElement viewButtonClick;
	
	@FindBy(xpath="//button[normalize-space()='I don't know my car's delivery date']")
	WebElement deliveryDate;

	@FindBy(xpath="//button[normalize-space()='I don't know my car's ex-showroom price']")
	WebElement dontNo;
	
	@FindBy(xpath="//h2[text()='Refresh the page']")
	WebElement refresh;
	
	@FindBy(xpath="//div[@class='crossBtn']")
	WebElement crossButton;
	
	@FindBy(xpath="//p[text()='View Coverage']")
	WebElement viewCoverage;
	
	@FindBy(xpath="//li[text()='Premium Breakup']")
	WebElement Premium;
	
	@FindBy(xpath="//div[@class='popupBox padding0 policyDetailPopup slideToLeft']")
	WebElement quote;
	
	@FindBy(xpath="//img[@alt='policybazaar']")
	WebElement logoClick2;
	

	
	public void buyCar() {
		buyingCar.click();
	}
	
	public void getSearchRto() {
		searchRto.click();
	}
	
	public void selectCityOption() {
		selectCity.click();
	}
	
	public void selectCarOption() {
		selectCar.click();
	}
	public void carModelOption() {
		carModel.click();
	}
	
	public void fuelTypeOption() {
		fuelType.click();
	}
	public void carVariantOption() {
		carVariant.click();
	}
	
	public void carVariantMode() {
		carVariantModel.click();
	}
	public void getName(String name1) {
		name.sendKeys(name1);
	}
	public void getEmail(String mail) {
		email.sendKeys(mail);
	}
	public void getMobilNo() {
		mobilNo.sendKeys("9876543468");
	}
	
	public void getErrorMessage() {
		System.out.println("---Capture the error message--- ");
		System.out.println( errorMessage.getText());
	}
	
	public void clearEmail() {
		email.clear();
	}
	public void correctEmail(String mail1) {
		email.sendKeys(mail1);
	}
	public void viewButton() {
		viewButtonClick.click();
	}
	
	public void getDeliveryDate() {
		JavascriptExecutor js = (JavascriptExecutor)super.driver;
		
//		js.executeScript("arguments[0].click();", super.driver.findElement(By.xpath("(//button[normalize-space()='I don't know my car's delivery date'])[1]")));
		super.driver.findElement(By.xpath("(//button[normalize-space()=\"I don't know my car's delivery date\"])[1]")).click();
//		js.executeScript("arguments[0].click();", super.driver.findElement(By.xpath("(//button[normalize-space()='I don't know my car's ex-showroom price'])[1]")));
		super.driver.findElement(By.xpath("(//button[normalize-space()=\"I don't know my car's ex-showroom price\"])[1]")).click();
	}
	
	public void getCarNo() throws InterruptedException {
		
		try {
			Thread.sleep(3000);
			    if(refresh.isDisplayed()) {
			    	crossButton.click();
			    }
			    	Thread.sleep(4000);
		}
		catch(org.openqa.selenium.NoSuchElementException e){
				e.getStackTrace();
		}
		
	}
	public void view(){
		viewCoverage.click();
		Premium.click();
		
	}
	

	public void getQuote() throws IOException {
		CarPlans= quote.getText();
		System.out.println("-------------Car Insurance Quote-----------");
		System.out.println(CarPlans);
		System.out.println("------------------------");
		
		ExcelUtility.excel();
	}
	
	
	
}
	






