package com.demoqa;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestGoogle {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Title of the page is: " + driver.getTitle());
		WebElement searchBox = driver.findElement(By.xpath("//*[@aria-label='Search']"));
		searchBox.sendKeys("Selenium interview questions");
		searchBox.submit();		
		driver.getTitle();
		driver.close();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));			
		
	}

}
