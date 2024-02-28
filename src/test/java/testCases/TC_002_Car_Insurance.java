package testCases;

import org.testng.annotations.Test;
import pageObject.Car_Insurance;
import pageObject.HomePage;
import testBase.BaseClass;
import utilities.ExcelUtility;

public class TC_002_Car_Insurance extends BaseClass  {

	
	@Test(groups = {"car", "master"})
	public void car_Insurance () throws Exception  {
		logger.info("**** starting TC_002_Car_Insurance  *****");
		HomePage hm = new HomePage(driver);
		hm.Carinsurance();
		
		Car_Insurance rc = new Car_Insurance(driver);
		logger.info("Buying new car.. ");
		rc.buyCar();
		logger.info("Search RTO.. ");
		rc.getSearchRto();
		logger.info("Selecting city.. ");
		rc.selectCityOption();
		logger.info("Selecting car details.. ");
		rc.selectCarOption();
		rc.carModelOption();
		rc.fuelTypeOption();
		rc.carVariantOption();
		rc.carVariantMode();
		logger.info("Entering customer details.. ");
		rc.getName(ExcelUtility.readExcel(1));
		rc.getEmail(ExcelUtility.readExcel(2));
		rc.getMobilNo();
		logger.info("Capturing Error msg.. ");
		rc.getErrorMessage();
		rc.clearEmail();
		logger.info("Entering correct email.. ");
		rc.correctEmail(ExcelUtility.readExcel(3));
		rc.viewButton();
		rc.getDeliveryDate();
		rc.getCarNo();
		rc.view();
		logger.info("Getting Car quote.. ");
		rc.getQuote();
		
		logger.info("**** finished TC_002_Car_Insurance  *****");
	}

	/*
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
	*/
	
	
	
}

