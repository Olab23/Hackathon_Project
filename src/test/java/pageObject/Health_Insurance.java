package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Health_Insurance extends BasePage{
   
	WebDriver driver;
    String[] datastr = new String[3];
	public Health_Insurance(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id='app']/div/div[1]/div[1]/form/section[1]/article/div[2]/div[1]/label")
	WebElement Self;
	
	@FindBy(xpath="//button[@id='step1ContinueBtn']")
	WebElement Continue;
	
	@FindBy(xpath="//select[@id='Self']")
	WebElement selAge;
	
	@FindBy(xpath="//option[@value='22']")
	WebElement age;
	
	@FindBy(xpath="//button[@id='step2ContinueBtn']")
	WebElement Button2;
	
	@FindBy(id="city")
	WebElement Citypin;
	
	@FindBy(xpath="//li[normalize-space()='Pune']")
	WebElement City;
	
	@FindBy(xpath="//button[@id='step3ContinueBtn']")
	WebElement Button3;
	
	@FindBy(id="fullName")
	WebElement name;
	
	@FindBy(id="mobile")
	WebElement mobilenum;
	
	@FindBy(xpath="//button[@id='step4ContinueBtn']")
	WebElement Button4;
	
	@FindBy(xpath="//input[@id='ped_last']")
	WebElement MedicalHis;
	
	@FindBy(xpath="//input[@id='corp_no']")
	WebElement HealthIn;
	
	@FindBy(xpath="//button[@id='viewPlansBtn']")
	WebElement ViewPlan;
	
	@FindBy(xpath="//div[@id='1']")
	WebElement sortBy;
	
	@FindBy(xpath="//div[@class='dataScrollBox_web']//div[2]//input[1]")
	WebElement LowtoHigh;
	
	@FindBy(xpath="//button[normalize-space()='Apply']")
	WebElement Applybut;
	
	@FindBy(xpath="//div[contains(@class,'quotes_rvmp_card segmentation_quoteCard')]")
	List<WebElement> NoofItems;
	
	
	
	
	
	public void SelectSelf() throws InterruptedException {
		
		Self.click();
	}
	
	public void Continuebutton() throws InterruptedException {
		
		try {
		Continue.click();
		}catch(Exception e) {
			Continue.click();
		}
	}
	
	public void SelectAge() throws InterruptedException {
		
		selAge.click();
	}
	
	public void Ageyears() throws InterruptedException {
		
		age.click();
	}
	
	public void Continuebutton2() throws InterruptedException {
		
		Button2.click();
	}
	
	public void Citypincode() throws InterruptedException {
		
		Thread.sleep(2000);
		Citypin.click();
	}
	public void SelectCity() throws InterruptedException{
		try {
			City.click();
			}catch(Exception e) {
				City.click();
			}
		
		
	}
	public void Continuebutton3() throws InterruptedException{
		Button3.click();
	}
	public void IntName() throws InterruptedException{
		name.click();
		name.sendKeys("asdfg");
//		
	}
	public void MobileNumber() throws InterruptedException{
		//mobilenum.click();
		Thread.sleep(5000);
		mobilenum.sendKeys("9168541055");
	}
	public void Continuebutton4() throws InterruptedException{
		Button4.click();
		Thread.sleep(5000);
	}
	public void CheckMedHis() throws InterruptedException{
		MedicalHis.click();
		Thread.sleep(4000);
	}
	public void HealthIns()throws InterruptedException{
		HealthIn.click();
	}
	public void Viewplans() throws InterruptedException{
		ViewPlan.click();
		Thread.sleep(4000);
	}
		
	public void SelSort() throws InterruptedException{
		sortBy.click();
	}
	public void SelLowtoHigh() throws InterruptedException{
		LowtoHigh.click();
	}
	public void Application() throws InterruptedException{
	  Applybut.click();
	}
	public void ListInfo() {
	for(WebElement a:NoofItems)	{
		System.out.println(a.getText());
	}
	}
}
	

