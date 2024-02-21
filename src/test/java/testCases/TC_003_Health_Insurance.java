package testCases;

import org.testng.annotations.Test;

import pageObject.Health_Insurance;
import pageObject.HomePage;
import testBase.BaseClass;

public class TC_003_Health_Insurance extends BaseClass{


    @Test
    public void HomePage() throws InterruptedException {
    	try {
    		
			HomePage hp=new HomePage(driver);
			hp.Healthinsurance();
		}
	 catch (Exception e) {
		e.printStackTrace();
	 }
    	Health_Insurance Np= new Health_Insurance(driver);
			Np.Continuebutton();
			Np.SelectAge();
	    	Thread.sleep(4000);
	    	Np.Ageyears();
	    	Np.Continuebutton2();
	    	Np.Citypincode();
	    	Np.SelectCity();
	    	Np.IntName();
	    	Np.MobileNumber();
	    	Np.Continuebutton4();
	    	Np.CheckMedHis();
	    	Np.HealthIns();
	    	Np.Viewplans();
	    	Np.SelSort();
	    	Np.SelLowtoHigh();
	    	Np.Application();
	    	Np.ListInfo();
    	}
	}
    
   