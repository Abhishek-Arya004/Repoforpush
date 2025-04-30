package com.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Objects {

	public WebDriver driver;
	
	public  Login_Objects(WebDriver driver){
		 
		 this.driver=driver;
		 
	 }
	

	// WebElement username = driver.findElement(By.name(null));

	public By Username = By.name("username");

	public	By Password = By.name("password");

	public By submit = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");

	public void enterUsername(String username) {

		driver.findElement(Username).sendKeys(username);

	}

	public void enterPassword(String password) {

		driver.findElement(Password).sendKeys(password);

	}

	public void Clickonsubmit() {

		driver.findElement(submit).click();

	}

}
