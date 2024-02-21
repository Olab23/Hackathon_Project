package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.Travel_Insurance;
import testBase.BaseClass;

public class TC_001_Student_Travel_Insurance extends BaseClass{
	
	@Test(priority=1)
	public void homepage() throws InterruptedException, IOException {

		HomePage hp=new HomePage(driver);
		hp.travelinsurance();
		
//		Travel_Insurance Np=new Travel_Insurance(driver);
//		Np.SelectCountry();
//		Np.Eurocountry();
//		Np.NextPage();
//		Np.SelectDate();
//		Np.StartDate();
//		Np.NextPage();
//		Np.countpeople();
//		Np.selectage();
//		Np.MedicalCond();
//		Np.PhoneNo();
//		Np.Plans();
//		Np.PlansData();
	}
	
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
	
	

}
