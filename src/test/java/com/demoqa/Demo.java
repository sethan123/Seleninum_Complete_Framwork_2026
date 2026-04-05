package com.demoqa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.logging.Logger;
public class Demo {
	private static final Logger log = Logger.getLogger(Demo.class.getName());

@Test
public void test1() {

	System.out.println("This is my first test");
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/login");
	driver.manage().window().maximize();
	System.out.println("Title of the page is: " + driver.getTitle());
	driver.findElement(By.id("userName")).sendKeys("testuser");
	driver.findElement(By.id("password")).sendKeys("Password@123");
	driver.findElement(By.id("login")).click();
	log.info("Login successful");


	driver.quit();


}
	
	
}
