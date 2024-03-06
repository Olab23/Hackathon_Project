package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.Travel_Insurance;
import testBase.BaseClass;
import utilities.ExcelUtility;

public class TC_001_Student_Travel_Insurance extends BaseClass{
	
	@Test(groups = {"travel", "master"})
	public void travel_insurance() throws Exception {
		
		logger.info("**** starting TC_001_TravelDetails  *****");
		HomePage hp=new HomePage(driver);
		logger.info("Opening of Travel Insurance Page ");
		hp.travelinsurance();
		
		Travel_Insurance Np=new Travel_Insurance(driver);
		Np.selectCountry();
		logger.info("Entering customer details.. ");
		Np.euroCountry();
		Np.nextPage();
		logger.info("clicked on continue..");
	    Np.dateInput();
		Np.selectDateRange();
		Np.nextPage();
		logger.info("Select Student...");
		Np.noOfStudent();
		Np.selectStudentAge();
		Np.nextPage();
		Np.medicalCond();
//		Np.nextPage();
		Np.phoneNo(ExcelUtility.readExcel(0));
		logger.info("Select Student Plan...");
//		Np.studentPlan();
		Np.plans();
		Np.plansData();
//		Np.logoClick();
		logger.info("**** finished TC_001_TravelDetails  *****");
		
	}
	/*
	@Test(priority=2)
	public void selcountry() throws InterruptedException  {
		
		Travel_Insurance Np=new Travel_Insurance(driver);
		Np.SelectCountry();
	}
	
	@Test(priority=3)
	public void Eurcountry() throws InterruptedException  {
		
		Travel_Insurance Np=new Travel_Insurance(driver);
		Np.Eurocountry();
	}
	
	@Test(priority=4)
	public void Next() throws InterruptedException  {
		
		Travel_Insurance Np=new Travel_Insurance(driver);
		Np.NextPage();
	}
	
	@Test(priority=5)
	public void date() throws InterruptedException  {
		
		Travel_Insurance Np=new Travel_Insurance(driver);
		Np.SelectDate();
	}
	
	@Test(priority=6)
	public void startdate() throws InterruptedException  {
		
		Travel_Insurance Np=new Travel_Insurance(driver);
		Np.StartDate();
		
	}
	
	@Test(priority=7)
	public void lastdate() throws InterruptedException  {
		
		Travel_Insurance Np=new Travel_Insurance(driver);
//		Np.LastDate(driver);
		Np.NextPage();
	}
	
	@Test(priority=8)
	public void Countpeople() throws InterruptedException  {
		
		Travel_Insurance Np=new Travel_Insurance(driver);
		Np.countpeople();
	}
	
	@Test(priority=9)
	public void SelectAge() throws InterruptedException  {
		
		Travel_Insurance Np=new Travel_Insurance(driver);
		Np.selectage();
	}
	
	@Test(priority=10)
	public void MedicalCondi() throws InterruptedException  {
		
		Travel_Insurance Np=new Travel_Insurance(driver);
		Np.MedicalCond();
	}
	
	@Test(priority=11)
	public void phoneno() throws InterruptedException  {
		
		Travel_Insurance Np=new Travel_Insurance(driver);
		Np.PhoneNo();
	}
	
	@Test(priority=12)
	public void plans() throws InterruptedException  {
		
		Travel_Insurance Np=new Travel_Insurance(driver);
		Np.Plans();
	}
	
	@Test(priority=13)
	public void plansdata() throws InterruptedException, IOException  {
		
		Travel_Insurance Np=new Travel_Insurance(driver);
		Np.PlansData();
	}
	*/
	

}
