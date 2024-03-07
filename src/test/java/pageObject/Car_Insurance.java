package pageObject;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.plugins.di.Keys;
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
	
	@FindBy(xpath="//span[@class='CarRegDetails_blueTextButton__P1blP blueTextButton fontMedium']")
	WebElement newCar;
	
	@FindBy(xpath="//*[@id='searchInput']/div/input")
	WebElement searchRto;
	
	@FindBy(xpath="//div[@class='dropdown']")
	WebElement BlueRto;
	
	@FindBy(xpath="//span[normalize-space()='Pune']")
	WebElement Bcity;
	
	@FindBy(xpath="//li[normalize-space()='MH12']")
	WebElement Bcode;
	
	@FindBy(xpath="//span[text()='MH12-PUNE(Maharashtra)']")
	WebElement selectCity;
	
	@FindBy(xpath="//span[normalize-space()='TATA']")
	WebElement selectCar;
	
	@FindBy(xpath="//li[normalize-space()='NEXON']")
	WebElement carModel;
	
	@FindBy(xpath="//li[normalize-space()='Petrol']")
	WebElement fuelType;
	
	@FindBy(xpath="//li[text()='Automatic']")
	WebElement carVariant;
	
	@FindBy(xpath="//li[normalize-space()='Creative Plus 1.2 Revotron Petrol 6AMT (1199 cc)']")
	WebElement carVariantModel;
	
	@FindBy(xpath="//li[normalize-space()='Brand New Car']")
	WebElement BrandNC;
	
	@FindBy(xpath="//*[@id='name']")
	WebElement name;
	
	@FindBy(xpath="//input[@placeholder='Full name']")
	WebElement Bname;
	
	@FindBy(xpath="//*[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Your email']")
	WebElement Bemail;
	
	@FindBy(xpath="//*[@id='mobileNo']")
	WebElement mobilNo;
	
	@FindBy(xpath="//input[@placeholder='Mobile number']")
	WebElement BmobilNo;
	
	@FindBy(xpath="//div[@class='msg-error show']")
	WebElement errorMessage;
	
	@FindBy(xpath="//div[@class='errorMsg']")
	WebElement BerrorMessage;
	
	@FindBy(xpath="//span[text()='View Prices']")
	WebElement viewButtonClick;
	
	@FindBy(xpath="//button[normalize-space()='View Prices']")
	WebElement BviewButtonClick;
	
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
		try {
		buyingCar.click();
		}
		catch(Exception e) {
			newCar.click();
		}
	}
	
	public void getSearchRto() {
		
		try {
			searchRto.click();
		}
		catch(Exception e) {
			BlueRto.click();
		}
		
	}
	
	public void selectCityOption() {
		try {
		selectCity.click();
		}
		catch(Exception e) {
			Bcity.click();
			Bcode.click();
		}
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
		try {
		name.sendKeys(name1);
		}
		catch(Exception e) {
			Bname.click();
			Bname.sendKeys(name1);
		}
	}
	public void getEmail(String mail) {

		try {
			email.sendKeys(mail);
			}
			catch(Exception e) {
				Bemail.click();
				Bemail.sendKeys(mail);
			}
	}
	public void getMobilNo() {
		try {
		mobilNo.sendKeys("9876543468");
		}
		catch(Exception e) {
			BmobilNo.click();
			BmobilNo.sendKeys("9876543468");
		}
	}
	
	public void getErrorMessage() {
		System.out.println("---Capture the error message--- ");
		try {
		System.out.println( errorMessage.getText());
		}
		catch(Exception e) {
			System.out.println( BerrorMessage.getText());
		}
	}
	
	public void clearEmail() {
		try {
		email.clear();
		}
		catch(Exception e) {
			Bemail.click();
//			Bemail.clear();
		}
	}
	public void correctEmail(String mail1) {
		try {
		email.sendKeys(mail1);
		}
		catch(Exception e) {
			Bemail.click();
			Bemail.sendKeys(mail1);
		}
	}
	public void viewButton() {
		try {
		viewButtonClick.click();
		}
		catch(Exception e) {
			BviewButtonClick.click();
		}
	}
	
	public void getDeliveryDate() {
		
		super.driver.findElement(By.xpath("(//button[normalize-space()=\"I don't know my car's delivery date\"])[1]")).click();

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
	






