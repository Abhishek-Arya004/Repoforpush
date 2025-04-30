package com.Testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Objects.Login_Objects;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Test {

	public WebDriver driver;

	@BeforeTest
	void OpenBrowser() {

		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

	}

	@Test

	void loginemethod() {

//		WebElement username = driver.findElement(By.name("username"));
//		WebElement password = driver.findElement(By.name("password"));
//		WebElement submit = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
//
//		username.sendKeys("Admin");
//		password.sendKeys("admin123");
//		submit.click();
		
		Login_Objects  objects = new Login_Objects(driver); 
		
		objects.enterUsername("Admin");
		objects.enterPassword("admin123");
		objects.Clickonsubmit();
		
		
		
		
		
	}
	
	//@AfterTest
	//void CloseBrowser() {

	//	driver.close();
//
	//}

}
