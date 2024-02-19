package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.TravelInsurance;
import testBase.BaseClass;

public class TC_001 extends BaseClass{
	
	@Test(priority=1)
	public void homepage() {

		HomePage hp=new HomePage(driver);
		hp.travelinsurance();
	}
	
	@Test(priority=2)
	public void selcountry() throws InterruptedException  {
		
		TravelInsurance Np=new TravelInsurance(driver);
		Np.SelectCountry();
	}
	
	@Test(priority=3)
	public void Eurcountry() throws InterruptedException  {
		
		TravelInsurance Np=new TravelInsurance(driver);
		Np.Eurocountry();
	}
	
	@Test(priority=4)
	public void Next() throws InterruptedException  {
		
		TravelInsurance Np=new TravelInsurance(driver);
		Np.NextPage();
	}
	
	@Test(priority=5)
	public void date() throws InterruptedException  {
		
		TravelInsurance Np=new TravelInsurance(driver);
		Np.SelectDate();
	}
	
	@Test(priority=6)
	public void startdate() throws InterruptedException  {
		
		TravelInsurance Np=new TravelInsurance(driver);
		Np.StartDate();
	}
	
	@Test(priority=7)
	public void lastdate() throws InterruptedException  {
		
		TravelInsurance Np=new TravelInsurance(driver);
		Np.LastDate();
		Np.NextPage();
	}
	
	@Test(priority=8)
	public void Countpeople() throws InterruptedException  {
		
		TravelInsurance Np=new TravelInsurance(driver);
		Np.countpeople();
	}
	
	@Test(priority=9)
	public void SelectAge() throws InterruptedException  {
		
		TravelInsurance Np=new TravelInsurance(driver);
		Np.selectage();
	}
	
	@Test(priority=10)
	public void MedicalCondi() throws InterruptedException  {
		
		TravelInsurance Np=new TravelInsurance(driver);
		Np.MedicalCond();
	}
	
	@Test(priority=11)
	public void phoneno() throws InterruptedException  {
		
		TravelInsurance Np=new TravelInsurance(driver);
		Np.PhoneNo();
	}
	
	@Test(priority=12)
	public void plans() throws InterruptedException  {
		
		TravelInsurance Np=new TravelInsurance(driver);
		Np.Plans();
	}
	
	@Test(priority=13)
	public void plansdata() throws InterruptedException, IOException  {
		
		TravelInsurance Np=new TravelInsurance(driver);
		Np.PlansData();
	}
	
	

}
