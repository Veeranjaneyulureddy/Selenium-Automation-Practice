package com.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(5000);
//		WebElement courseElement = driver.findElement(By.id("course"));
//		Select courseOptiSelect = new Select(courseElement);
//		courseOptiSelect.selectByIndex(3);
//		Thread.sleep(3000);
//		courseOptiSelect.selectByValue("net");
//		Thread.sleep(3000);
//		courseOptiSelect.selectByVisibleText("Javascript");
//		List<WebElement> coursrList = courseOptiSelect.getOptions();
//		for (WebElement listElement : coursrList) {
//			System.out.println(listElement.getText());
//			
//		}
//		
//		String option = courseOptiSelect.getFirstSelectedOption().getText();
//		System.out.println("First selected option: "+ option);
		
		WebElement multioptionElement = driver.findElement(By.id("ide"));
		Select optionSelect = new Select(multioptionElement);
		optionSelect.selectByIndex(1);
		Thread.sleep(2000);
		optionSelect.selectByValue("vs");
		Thread.sleep(2000);
		optionSelect.selectByVisibleText("NetBeans");
		Thread.sleep(2000);
		optionSelect.deselectByIndex(2);
		
		List<WebElement> listeElements = optionSelect.getOptions();
		for (WebElement listWebElement : listeElements) {
			System.out.println(listWebElement.getText());
			
		}
		List<WebElement> selctedoptions = optionSelect.getAllSelectedOptions();
		for (WebElement selectedElement : selctedoptions) {
			System.out.println("Selected options in dropdown : "+selectedElement.getText());
			
		}
		
	}

}
