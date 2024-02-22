package pageObject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import utilities.Apache;

public class Travel_Insurance extends BasePage{
	
	WebDriver driver;
	
    String[] datastr = new String[3];
	public Travel_Insurance(WebDriver driver) {
		super(driver);
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
	
	@FindBy(xpath="//div[normalize-space()='Start date']")
	WebElement startDate;
	
	@FindBy(xpath="(//span[@class='MuiIconButton-label'])[4]")
	WebElement NextMonth;
		
	@FindBy(xpath="//*[@class='memSelectRadioWrapper']/div[2]")
	WebElement NoOfStudent;
	
	@FindBy(xpath="//div[@class='options_box_wrapper__option']")
	List<WebElement> listOfAge;
	
	@FindBy(xpath="//div[@id='0']")
	WebElement selectAges;
	
	@FindBy(xpath="//*[@id='1']")
	WebElement selectAges2;
	
	@FindBy(id="ped_no")
	WebElement mediCondition;
	
	@FindBy(id="mobileNumber")
	WebElement mobileNo;
	
	@FindBy(xpath="//button[text()='View plans']")
	WebElement viewPlans;
	
	@FindBy(id="studentTrip")
	WebElement studentPlan;
	
	@FindBy(id="Traveller_1")
	WebElement student1;
	
	@FindBy(id="Traveller_2")
	WebElement student2;
	
	
	@FindBy(xpath="//p[@class='filter_name_heading']")
	WebElement sortBy;
	
	@FindBy(xpath="//input[@value='Premium low to high']")
	WebElement LowToHigh;
	
	@FindBy(xpath="//p[@class='quotesCard--insurerName']")
	List<WebElement> companyName;
	
	@FindBy(xpath="//span[@class='premiumPlanPrice']")
	List<WebElement> Price;
	
	
	
	
	public void selectCountry() throws InterruptedException {
		Country.click();
	}
	
	public void euroCountry() throws InterruptedException {

  		String Destination = "United Kingdom";
		
		for(WebElement Country:CountryList) {
			if(Country.getText().equals(Destination)) {
				Country.click();
				break;
			}
		}
		
	}
	
	public void nextPage() throws InterruptedException {

		Next.click();
	}
	
	public void dateInput() throws InterruptedException {
		
		try {
		startDate.click();
		}catch(Exception e) {
			startDate.click();
		}
	}
	
	public void selectDateRange() throws InterruptedException {
		
		String month_year= "March 2024";
		String startdate = "20";
		String enddate="10";
		String month_year1="June 2024";
	
		try {
		while(true) {
			String month=super.driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-subtitle1 MuiTypography-displayInline'])[1]")).getText();
			if(month.equals(month_year)) {
				break;
			}
			else {
				super.driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[4]")).click();
			}
			List<WebElement> datepicker1 = super.driver.findElements(By.xpath("//*[@class='MuiPickersDateRangeDay-root']"));
			for(WebElement element:datepicker1) {
				String date=element.getText();
				if(date.equals(startdate)) {
					element.click();
					break;
				}
			}
		}
		}catch(Exception e) {
			
		}
		try {
		while(true) {
			String month=super.driver.findElement(By.xpath("(//*[@class='MuiTypography-root MuiTypography-subtitle1 MuiTypography-displayInline'])[1]")).getText();
			if(month.equals(month_year1)) {
				break;
			}
			else {
				super.driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[4]")).click();
			}
			List<WebElement> datepicker1 = super.driver.findElements(By.xpath("//*[@class='MuiPickersDateRangeDay-root']"));
			for(WebElement element:datepicker1) {
				String date=element.getText();
				if(date.equals(enddate)) {
					element.click();
					break;
				}
			}
		}
		}catch(Exception e) {
			
		}	
		
	}

	
	public void noOfStudent() throws InterruptedException {
		
		NoOfStudent.click();
	}
	
	public void selectStudentAge() throws InterruptedException {
	
		String age1 = "22 years";
	
		selectAges.click();
		for(WebElement age:listOfAge) {
			if(age.getText().equals(age1)) {
				age.click();
				break;
			}
		}
		
		
		String age2 = "21 years";
		
		selectAges2.click();
		for(WebElement age:listOfAge) {
			if(age.getText().equals(age2)) {
				age.click();
				break;
			}
		}
		
		Next.click();
		
	}
	
	public void medicalCond() throws InterruptedException {
	
		mediCondition.click();
		Next.click();
	}
	
	public void phoneNo() throws InterruptedException {
		
		mobileNo.sendKeys("9696682791");
		viewPlans.click();
	}
	
	public void studentPlan() {
		studentPlan.click();
		student1.click();
		student2.click();
	}
	
	public void plans() throws InterruptedException {
		
		Thread.sleep(4000);
		sortBy.click();
		LowToHigh.click();
		
	}
	
	public void plansData() throws InterruptedException, IOException{
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
