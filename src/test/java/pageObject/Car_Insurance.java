package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Car_Insurance extends BasePage {
	public	WebDriver driver;
	public Car_Insurance( WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
			}
	
	
	@FindBy(xpath= "//*[@id='before-tp']/div[2]/a")
	WebElement buynew;
	
	@FindBy(id="spn4")
	WebElement city;
	
	@FindBy(xpath= "//*[@id='section2']/ul/li[1]/span")
	WebElement rto;
	
	@FindBy(xpath= "//*[@id='dvMake']/div/ul/div/li[12]/span")
	WebElement car_brand;
	
	@FindBy(xpath= "//*[@id='modelScroll']/li[8]/span")
	WebElement car_model;
	
	@FindBy(xpath= "//*[@id='variantScroll']/li[2]/span")
	WebElement model_variant;
	
	@FindBy(xpath= "//*[@id='btnLeadDetails']/span")
	WebElement view_details_button;
	
	@FindBy(id="name")
	WebElement name;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="mobileNo")
	WebElement phone_no;
	
	
		
	public void buynew() {
		buynew.click();
	}
	
	public void city_click() {
		city.click();
	}
	public void rto_click() {
		rto.click();
	}
	public void carbrand_click() {
		car_brand.click();
	}
	
	public void carModel_click() {
		car_model.click();
	}
	public void carVariant_click() {
		model_variant.click();
	}
	
	public void send_Details() {
		name.sendKeys("tester");
		email.sendKeys("tr");
		phone_no.sendKeys("1");
		
	}
	
	
	
	public void print_error() {
		view_details_button.click();
		String error = super.driver.findElements(By.xpath("//*[@class='msg-error show']")).get(0).getText();
		System.out.println(error);
	}
	}
	





