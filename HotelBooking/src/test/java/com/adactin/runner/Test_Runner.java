package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature", 
glue = "com.adactin.stepdefinition",
plugin = {"pretty", 
        "html:target/cucumber-reports.html",
        "json:target/cucumber-reports.json",
        "junit:target/cucumber-reports.xml"},
monochrome = true,
dryRun = false )

public class Test_Runner {
	
	
	public static WebDriver driver;
	
	
	@BeforeClass
	public static void set_up () {
		
		driver = BaseClass.getdriver("chrome");
		
		
	}
	@AfterClass
    public static  void tearDown() {
		
		//driver.close();
	}
	
	
	


}
