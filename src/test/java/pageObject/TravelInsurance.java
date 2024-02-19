package pageObject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import utilities.Apache;

public class TravelInsurance extends BasePage{
	
	WebDriver driver;
	
    String[] datastr = new String[3];
	public TravelInsurance(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="country")
	WebElement Country;
	
	@FindBy(className="search-item")
	List<WebElement> CountryList;
	
	@FindBy(xpath="//li[normalize-space()='United Kingdom']")
	WebElement EuroCountry;
	
	@FindBy(xpath="//button[text()=\"Next\"]")
	WebElement Next;
	
	@FindBy(className="MuiTypography-root MuiTypography-subtitle1 MuiTypography-displayInline")
	List<WebElement> MonthYear;
	
	@FindBy(className="MuiButtonBase-root MuiIconButton-root MuiPickersArrowSwitcher-iconButton MuiIconButton-sizeSmall")
	WebElement NextMonth;
	
	
	@FindBy(xpath="//*[@id=\"prequote-wrapper\"]/div[2]/div/div[1]/div/div[1]/div/div")
	WebElement selDate;
	@FindBy(xpath="//button[@aria-label=\"Feb 20, 2024\"]")
	WebElement Firstdate;
	@FindBy(xpath="//button[@aria-label=\"Feb 29, 2024\"]")
	WebElement Lastdate;
	@FindBy(xpath="//*[@class=\"memSelectRadioWrapper\"]/div[2]")
	WebElement people;
	@FindBy(xpath="//*[@id=\"divarrow_undefined\"]")
	WebElement ages;
	@FindBy(xpath="//*[@id=\"optionBox_0_wrapper\"]/div[24]/label")
	WebElement age1;
	@FindBy(xpath="//*[@id=\"1\"]")
	WebElement ages2;
	@FindBy(xpath="//*[@id=\"optionBox_1_wrapper\"]/div[23]/label")
	WebElement age2;
	@FindBy(id="ped_no")
	WebElement mediCond;
	@FindBy(xpath="//*[@id=\"mobileNumber\"]")
	WebElement mobileNo;
	@FindBy(xpath="//button[text()=\"View plans\"]")
	WebElement viewplans;
	@FindBy(xpath="//p[@class=\"filter_name_heading\"]")
	WebElement sortby;
	@FindBy(xpath="//input[@value='Premium low to high']")
	WebElement LowToHigh;
	@FindBy(xpath="//p[@class='quotesCard--insurerName']")
	List<WebElement> companyName;
	@FindBy(xpath="//span[@class='premiumPlanPrice']")
	List<WebElement> Price;
	
	public void SelectCountry() throws InterruptedException {
		Country.click();
	}
	
	public void Eurocountry() throws InterruptedException {
		EuroCountry.click();
//		String Destination = "United Kingdom";
		
//		int CountryCount = CountryList.size();
//		
//		for(int i=0; i<=CountryCount; i++) {
//			String Country = CountryList.get(i).getText();
//			if(Country.equals(Destination)) {
//				CountryList.get(i).click();
//			}
//		}
		
	}
	
	public void NextPage() throws InterruptedException {

		Next.click();
	}
	
	public void SelectDate() throws InterruptedException {
		
		selDate.click();
//		String sMMYYYY = "March 2024";
//		String sDay = "10";
//		String eMMYYYY = "April 2024";
//		String eDay = "10";
//		
//		for(int i=0; i<=2; i++) {
//			String my = MonthYear.get(i).getText();
//			
//			if(my.equals(sMMYYYY)) {
//				break;
//			}else {
//				NextMonth.click();
//			}
//		}
//		
			
			
			
			
			
	}
	
	public void StartDate() throws InterruptedException {
	
		Firstdate.click();
	}
	
	public void LastDate() throws InterruptedException {
		
		Lastdate.click();
	}
	
	public void countpeople() throws InterruptedException {
		
		people.click();
	}
	
	public void selectage() throws InterruptedException {
	
		ages.click();
		age1.click();
		ages2.click();
		age2.click();
		Next.click();
	}
	
	public void MedicalCond() throws InterruptedException {
	
		mediCond.click();
		Next.click();
	}
	
	public void PhoneNo() throws InterruptedException {
		
		mobileNo.sendKeys("9696682791");
		viewplans.click();
	}
	
	public void Plans() throws InterruptedException {
		
		Thread.sleep(4000);
		sortby.click();
		LowToHigh.click();
		
	}
	
	public void PlansData() throws InterruptedException, IOException{
		for(int i=0;i<=2;i++) {
			System.out.println(companyName.get(i).getText());
			System.out.println(Price.get(i).getText());
//			Apache.ExcelFile(companyName);
//			Apache.ExcelFile(Price);
			//datastr[i]=companyName.get(i).getText();
			
		}
		//Apache.ExcelFile(companyName);
	}
}
