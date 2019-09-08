package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Helper {
	
	public static void mouseOver(WebDriver driver,WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();	
	}
	public static void clickOnElement(WebElement element) {
		//element.click();
		waitForElement(element).click();
	}
	public static WebElement waitForElement(WebElement element) {
		ExpectedConditions.invisibilityOf(element);
		return element;
	}
	public static void selectElement(WebElement element,String text) {
		new Select(element).selectByVisibleText(text);
		
	}
	public static boolean verifyElement(WebElement element) {
		boolean result = waitForElement(element).isDisplayed();
		return result;
		
	}
	
	
	
	}
