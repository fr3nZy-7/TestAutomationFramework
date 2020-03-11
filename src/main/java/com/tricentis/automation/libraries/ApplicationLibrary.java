package com.tricentis.automation.libraries;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ApplicationLibrary {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\AutoTest Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		File scrFile = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
		//here we have purposefully type caste dr opbject with TakeScreenshot
		//WebDriver interface has getScreenshotAs function. ChromeDriver class  has implemented it
		// direct dr.getScreenshotAs would work fine
		//we have not written it as in our framework our driver is of WebDriver class, since we are testing on multiple browsers
		
		
		String screenshotName = "E://Amey.png";
		FileHandler.copy(scrFile, new File(screenshotName));
		
	}

}
