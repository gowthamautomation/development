package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Sample {
	WebDriver driver;
	@Given("user is on the facebook page")
	public void user_is_on_the_facebook_page() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	

	@When("user enter {string} and {string}")
	public void user_enter_and(String no, String yes) {
		driver.findElement(By.id("email")).sendKeys(no);
		driver.findElement(By.id("pass")).sendKeys(yes);
	   	}	
	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
		   driver.findElement(By.name("login")).click();

	}
	@Then("user should verify after login success message")
	public void user_should_verify_after_login_success_message() {
	   
	}



}
