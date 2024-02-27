package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.*;
import pageObject.Health_Insurance;
import pageObject.HomePage;
import testBase.BaseClass;
import utilities.ExcelUtility;

public class Health_Insurance_C {
	
	@Given("the user navigates to Health insurance plan")
	public void the_user_navigates_to_health_insurance_plan() {
		
		HomePage hp=new HomePage(BaseClass.getDriver());
		hp.Healthinsurance();
		
	}

	@When("user selects age and city")
	public void user_selects_age_and_city() throws InterruptedException {
	    
		Health_Insurance Np= new Health_Insurance(BaseClass.getDriver());
		Np.Continuebutton();
		Np.SelectAge();
    	Np.Ageyears();
    	Np.Continuebutton2();
    	Np.SelectCity();
	}

	@Then("user enters personal details")
	public void user_enters_personal_details() throws InterruptedException, Exception {
	    
		Health_Insurance Np= new Health_Insurance(BaseClass.getDriver());
		Np.IntName(ExcelUtility.readExcel(4));
    	Np.MobileNumber(ExcelUtility.readExcel(5));
    	Np.Continuebutton4();
	}

	@When("user checks medical history")
	public void user_checks_medical_history() throws InterruptedException {
		
		Health_Insurance Np= new Health_Insurance(BaseClass.getDriver());
		Np.CheckMedHis();
    	Np.HealthIns();

	}

	@Then("user sorts the plans low to high")
	public void user_sorts_the_plans_low_to_high() throws InterruptedException {
	    
		Health_Insurance Np= new Health_Insurance(BaseClass.getDriver());
		Np.Viewplans();
    	Np.SelSort();
    	Np.SelLowtoHigh();
    	Np.Application();
	}

	@Then("user gets the health plan name list")
	public void user_gets_the_health_plan_name_list() throws InterruptedException, IOException {

		Health_Insurance Np= new Health_Insurance(BaseClass.getDriver());
		Np.ListInfo();
	}
}
