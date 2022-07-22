package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLibraries {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		Thread.sleep(2000);
		WebElement UsernameTxt = driver.findElement(By.id("login_field"));
		if(UsernameTxt.isDisplayed()) {
			if(UsernameTxt.isEnabled()) {
				System.out.println("Text box is Enabled");
				UsernameTxt.sendKeys("Veeranjaneyulu");
				Thread.sleep(2000);
				UsernameTxt.clear();
				UsernameTxt.sendKeys("SivaReddy ");
				System.out.println(UsernameTxt.getAttribute("value"));
			}else {
				System.out.println("Text box is Disabled");
			}
			
		}else {
			System.out.println("Text box is not displayed");
		}
		Thread.sleep(5000);
		String head = driver.findElement(By.tagName("h1")).getText();
		System.out.println(head);
		
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("AnjiBabu"); 
		Thread.sleep(2000);
		driver.findElement(By.className("header-logo"));
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Create ")).sendKeys();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]"));
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='commit']"));
		
//		WebDriverManager.firefoxdriver().setup()
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://github.com/login");
		
//		 public static void highlight(WebDriver driver, WebElement element) {
//			 JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//			 jsExecutor.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:yellow')");
//		 }
	
		

	}

}
