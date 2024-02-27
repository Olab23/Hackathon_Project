package stepDefinitions;

import testBase.BaseClass;
import utilities.ExcelUtility;

import java.io.IOException;

import io.cucumber.java.en.*;
import pageObject.HomePage;
import pageObject.Travel_Insurance;


public class Travel_Insurance_C {

	@Given("the user navigates to travel insurance plan")
	public void the_user_navigates_to_travel_insurance_plan() {
		
		HomePage hp=new HomePage(BaseClass.getDriver());
		hp.travelinsurance();
	}

	@When("user enters destination and date")
	public void user_enters_destination_and_date() throws InterruptedException {
	    
		Travel_Insurance Np=new Travel_Insurance(BaseClass.getDriver());
		Np.selectCountry();
		Np.euroCountry();
		Np.nextPage();
	    Np.dateInput();
		Np.selectDateRange();
		Np.nextPage();
	}

	@Then("user selects students age")
	public void user_selects_students_age() throws InterruptedException {
		
		Travel_Insurance Np=new Travel_Insurance(BaseClass.getDriver());
		Np.noOfStudent();
		Np.selectStudentAge();
	}

	@When("user enters medical condition")
	public void user_enters_medical_condition() throws InterruptedException {
	    
		Travel_Insurance Np=new Travel_Insurance(BaseClass.getDriver());
		Np.medicalCond();
	}

	@Then("user enters mobile number")
	public void user_enters_mobile_number() throws InterruptedException, Exception {
	    
		Travel_Insurance Np=new Travel_Insurance(BaseClass.getDriver());
		Np.phoneNo(ExcelUtility.readExcel(0));
	}

	@When("user selects students plan")
	public void user_selects_students_plan() throws InterruptedException {
	  
		Travel_Insurance Np=new Travel_Insurance(BaseClass.getDriver());
		Np.studentPlan();
		Np.plans();
	}

	@Then("user gets the travel plans")
	public void
	user_gets_the_travel_plans() throws InterruptedException, IOException {
	    
		Travel_Insurance Np=new Travel_Insurance(BaseClass.getDriver());
		Np.plansData();
	}
}
