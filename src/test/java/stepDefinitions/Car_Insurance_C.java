package stepDefinitions;

import io.cucumber.java.en.*;
import pageObject.Car_Insurance;
import pageObject.HomePage;
import testBase.BaseClass;
import utilities.ExcelUtility;

public class Car_Insurance_C {
	
	@Given("the user navigates to car insurance plan")
	public void the_user_navigates_to_car_insurance_plan() {
		HomePage hm = new HomePage(BaseClass.getDriver());
		hm.Carinsurance();
	}

	@When("user selects buying new car")
	public void user_selects_buying_new_car() {
		Car_Insurance rc = new Car_Insurance(BaseClass.getDriver());
		rc.buyCar();
	}

	@Then("user selects rto and city details")
	public void user_selects_rto_and_city_details() {
		Car_Insurance rc = new Car_Insurance(BaseClass.getDriver());
		rc.getSearchRto();
		rc.selectCityOption();
	}

	@When("user selects car model and type")
	public void user_selects_car_model_and_type() {
		Car_Insurance rc = new Car_Insurance(BaseClass.getDriver());
		rc.selectCarOption();
		rc.carModelOption();
		rc.fuelTypeOption();
		rc.carVariantOption();
		rc.carVariantMode();
	}

	@Then("user enters personel details")
	public void user_enters_personel_details() throws Exception {
		Car_Insurance rc = new Car_Insurance(BaseClass.getDriver());
		rc.getName(ExcelUtility.readExcel(1));
		rc.getEmail(ExcelUtility.readExcel(2));
		rc.getMobilNo();
	}

	@When("user capture error msg")
	public void user_capture_error_msg() {
		Car_Insurance rc = new Car_Insurance(BaseClass.getDriver());
		rc.getErrorMessage();
	}

	@Then("user clears deatils and put correct details")
	public void user_clears_deatils_and_put_correct_details() throws Exception {
		Car_Insurance rc = new Car_Insurance(BaseClass.getDriver());
		rc.clearEmail();
		rc.correctEmail(ExcelUtility.readExcel(3));
	}

	@Then("user capture the quote")
	public void user_capture_the_quote() throws InterruptedException {
		Car_Insurance rc = new Car_Insurance(BaseClass.getDriver());
		rc.viewButton();
		rc.getDeliveryDate();
		rc.getCarNo();
		rc.view();
	}
}
