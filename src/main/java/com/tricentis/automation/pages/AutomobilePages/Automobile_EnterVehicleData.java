package com.tricentis.automation.pages.AutomobilePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Automobile_EnterVehicleData {
	
	WebDriver dr;
	
	@FindBy(id="engineperformance")
	WebElement engineperformance;
	
	public Automobile_EnterVehicleData(WebDriver dr)
	{
		PageFactory.initElements(dr, this);
		
		//PageFactory is an in built class inside Selenium, it initializes the webelements declared above
	}
	
	public void enter_engineperformance(String kw) {
		
		engineperformance.sendKeys(kw);
	}
}
