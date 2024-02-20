package pageObject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
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
	
	@FindBy(xpath="//li[@class='search-item']")
	List<WebElement> CountryList;
	
	@FindBy(xpath="//button[normalize-space()='Next']")
	WebElement Next;
	
	@FindBy(xpath="//h6[@class='MuiTypography-root MuiTypography-subtitle1 MuiTypography-displayInline']")
	List<WebElement> MonthYear;
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDateRangeDay-day MuiPickersDateRangeDay-notSelectedDate MuiPickersDateRangeDay-dayOutsideRangeInterval']")
	List<WebElement> Dates;
	
	@FindBy(xpath="(//*[@class='MuiTypography-root MuiTypography-subtitle1 MuiTypography-displayInline'])[1]")
	WebElement MonthYear2;
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDateRangeDay-day MuiPickersDateRangeDay-notSelectedDate MuiPickersDateRangeDay-dayOutsideRangeInterval']")
	List<WebElement> Dates2;
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersArrowSwitcher-iconButton MuiIconButton-sizeSmall']")
	WebElement NextMonth;
	
	
	@FindBy(xpath="//div[normalize-space()='Start date']")
	WebElement startDate;
	
	@FindBy(xpath="//label[normalize-space()='End date']")
	WebElement endDate;
	
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

  		String Destination = "United Kingdom";
		
		for(WebElement Country:CountryList) {
			if(Country.getText().equals(Destination)) {
				Country.click();
				break;
			}
		}
		
	}
	
	public void NextPage() throws InterruptedException {

		Next.click();
	}
	
	public void SelectDate() throws InterruptedException {
		
		try {
		startDate.click();
		}catch(Exception e) {
			startDate.click();
		}
	}
	
	public void StartDate(WebDriver driver) throws InterruptedException {
		
		String sMMYYYY = "March 2024";
		String sDay = "10";
		
//		for(int i=0; i<2; i++) {
//			String my = MonthYear.get(i).getText();
//			
//			if(my.equals(sMMYYYY)) {
//				NextMonth.click();
//				for(int j=0; j<=31; j++) {
//					
//					String days = Dates.get(j).getText();
//					
//					if(days.equals(sDay)) {
//						Dates.get(j).click();
//						break;
//					}
//					
//				}
//				
//				break;
//			}
//		}
//		
		while(true) {
			String month=driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-subtitle1 MuiTypography-displayInline'])[1]")).getText();
			if(month.equals(sMMYYYY)) {
				break;
			}
			else {
				NextMonth.click();
			}
			List<WebElement> datepicker1 = driver.findElements(By.xpath("//*[@class='MuiPickersDateRangeDay-root']"));
			for(WebElement element:datepicker1) {
				String date=element.getText();
				if(date.equals(sDay)) {
					element.click();
					break;
				}
			}
		}
		
		
	}
	
	public void LastDate(WebDriver driver) throws InterruptedException {
		
		endDate.click();
		String eMMYYYY = "June 2024";
		String eDay = "23";
		
//	while(true) {	
//			String my = MonthYear2.getText();
//			
//			if(my.equals(eMMYYYY)) {
//					break;
//				}
//			
//			else {
//				NextMonth.click();
//			}
//			for(int j=0; j<=31; j++) {
//				
//				String days = Dates2.get(j).getText();
//				
//				if(days.equals(eDay)) {
//					Dates2.get(j).click();
//					break;
//				}
//			
//			for(WebElement element:Dates) {
//				String date=element.getText();
//				if(date.equals(eDay)) {
//					element.click();
//					break;
//				}
//			}
		
		while(true) {
			String month=driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-subtitle1 MuiTypography-displayInline'])[1]")).getText();
			if(month.equals(eMMYYYY)) {
				break;
			}
			else {
				NextMonth.click();
			}
			List<WebElement> datepicker1 = driver.findElements(By.xpath("//*[@class='MuiPickersDateRangeDay-root']"));
			for(WebElement element:datepicker1) {
				String date=element.getText();
				if(date.equals(eDay)) {
					element.click();
					break;
				}
			}
		}
			
//		Next.click();
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