package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.Health_Insurance;
import pageObject.HomePage;
import testBase.BaseClass;
import utilities.ExcelUtility;

public class TC_003_Health_Insurance extends BaseClass{


    @Test(groups = {"health", "master"})
    public void HomePage() throws Exception {
    	logger.info("**** starting TC_003_Health_Insurance  *****");
    	try {
    		
			HomePage hp=new HomePage(driver);
			hp.Healthinsurance();
		}
	 catch (Exception e) {
		e.printStackTrace();
	 }
    	Health_Insurance Np= new Health_Insurance(driver);
    	logger.info("Open of Health Insurance Page ");
			Np.Continuebutton();
			logger.info("Selecting Customer deatils.. ");
			
			Np.SelectAge();
	    	Thread.sleep(4000);
	    	Np.Ageyears();
	    	Np.Continuebutton2();
	    	Np.SelectCity();
	    	logger.info("Entering Customer personel deatils.. ");
	    	Np.IntName(ExcelUtility.readExcel(4));
	    	Np.MobileNumber(ExcelUtility.readExcel(5));
	    	Np.Continuebutton4();
	    	Np.CheckMedHis();
	    	Np.HealthIns();
	    	logger.info("Health Insurance plan.. ");
	    	Np.Viewplans();
	    	Np.SelSort();
	    	Np.SelLowtoHigh();
	    	Np.Application();
	    	Np.ListInfo();
	    	logger.info("**** finished TC_003_Health_Insurance  *****");
    	}
	}
    
   