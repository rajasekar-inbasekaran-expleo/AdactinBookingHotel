package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.adactin.baseclass.BaseClass;
import com.adactin.runner.Test_Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_DefinitionforBookStore extends BaseClass {

	public static WebDriver driver = Test_Runner.driver;


	@Given("I navigate to the bookstore website")
	public void i_navigate_to_the_bookstore_website() {

		launchurl("https://adactinhotelapp.com/");

	
	}


	@When("I search for {string}")
	public void i_search_for(String string) {

	}
	@When("I add the book to the cart")
	public void i_add_the_book_to_the_cart() {

	}
	@Then("I should see {string} in the cart")
	public void i_should_see_in_the_cart(String string) {

	}



}
