package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Htmlbasiccontrols {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(10000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.id("hindichbx"));
		checkbox.click();
		Thread.sleep(5000);
		if(checkbox.isSelected()) {
			checkbox.click();
			Thread.sleep(5000);
			System.out.println("Hindi check box is unselected");
		}
		driver.findElement(By.id("registerbtn")).click();
		Thread.sleep(5000);
		WebElement successTxt = driver.findElement(By.linkText("Registration is Successful"));
		String text = successTxt.getText();
		System.out.println(text);
		Thread.sleep(4000);
		driver.findElement(By.id("clearbtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("navigateHome")).click();

	}

}
