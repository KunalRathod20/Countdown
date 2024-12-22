package com.selenium.Testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class JavascriptCountdown {
	 WebDriver driver;

	    @BeforeSuite
	    public void beforeSuite() {
	        System.out.println("Setup configurations");
	    }

	    @BeforeTest
	    public void beforeTest() {
	        System.out.println("Initializing the WebDriver");
	        driver = new ChromeDriver();
	    }

	    @BeforeClass
	    public void beforeClass() {
	        System.out.println("Opening the website");
	        driver.get("https://testpages.eviltester.com/styled/javascript-countdown-test.html");
	    }

	    @BeforeMethod
	    public void beforeMethod() {
	        System.out.println("Setup for each test");
	    }

	    @Test
	    public void testFormAndActions() throws InterruptedException {
	        System.out.println("Filling out the seconds and clicking buttons");

	        driver.findElement(By.id("start-timer")).click();
	        Thread.sleep(5000);
	        
	        driver.findElement(By.id("stop-timer")).click();
	        Thread.sleep(5000);
	        
	        driver.findElement(By.id("clear-timer")).click();
	        Thread.sleep(5000);

	        driver.findElement(By.xpath("//*[@id=\"timer-seconds\"]")).sendKeys("20");
	        Thread.sleep(5000);
	        
	        driver.findElement(By.id("reset-timer")).click();
	        Thread.sleep(5000);

	    }

	    @AfterMethod
	    public void afterMethod() {
	        System.out.println("Cleanup after each test");
	    }

	    @AfterClass
	    public void afterClass() {
	        System.out.println("Closing the driver");
	        driver.quit();
	    }

	    @AfterTest
	    public void afterTest() {
	        System.out.println("Final cleanup");
	    }

	    @AfterSuite
	    public void afterSuite() {
	        System.out.println("Final cleanup tasks");
	    }

}
