package testCases;

import org.testng.annotations.Test;
import pageObject.buyNew;
import pageObject.HomePage;
import pageObject.rto_city;
import testBase.BaseClass;

public class TC_002_Car_Insurance extends BaseClass  {

	
	@Test(priority=0)
	public void car_Insurance ()  {
		

	}

	@Test(priority=1)
	public void verify_carIns_click() {
		HomePage hm = new HomePage(driver);
		hm.Carinsurance();
		
	}
	@Test(priority=2)
	public void verify_buyNew_click() {
		
		buyNew bn =  new  buyNew(driver);
		bn.buynew();
	}
	
	@Test(priority=3)
	public void verify_city_click() {
		
		rto_city rc = new rto_city(driver);
		rc.city_click();
	}
	
	@Test(priority=4)
	public void verify_rto_click() {
		
		rto_city rc = new rto_city(driver);
		rc.rto_click();
	}
	@Test(priority=5)
	public void verify_brand_click() {
		
		rto_city rc = new rto_city(driver);
		rc.carbrand_click();
	}
	
	@Test(priority=6)
	public void verify_model_click() {
		
		rto_city rc = new rto_city(driver);
		rc.carModel_click();
	}
	@Test(priority=7)
	public void verify_varaint_click() {
		
		rto_city rc = new rto_city(driver);
		rc.carVariant_click();
	}
	
	@Test(priority=8)
	public void sendDetails() {
		
		rto_city rc = new rto_city(driver);
		rc.send_Details();
	}
	
	@Test(priority=9)
	public void submit_click() {
		
		rto_city rc = new rto_city(driver);
		rc.print_error();
	}
	
	
	
	
}

