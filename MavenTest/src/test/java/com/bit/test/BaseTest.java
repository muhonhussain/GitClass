package com.bit.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.Utility.ReadProfile;
import com.utility.ReadPropFile;

public class BaseTest {
	
	WebDriver driver;
	Properties prop;
	@Before
	public void openBrowser() throws IOException {
	prop=ReadPropFile.readFile("C:\\Users\\muhon\\eclipse-workspace\\MavenTest");
	String browser = prop.getProperty("Chrome");
	if(browser.equals("Chrome")) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}else if (browser.equals("firefox"));{
	prop.getProperty("");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	
	} if(browser.equals("edge")) {
		prop.getProperty("");
		driver = new EdgeDriver();
	} else if (browser.equals("ie"));
	//  System.setProperty("", "C:\\\\Users\\\\muhon\\\\eclipse-workspace\\\\MavenTest");
	 prop.getProperty(""); 
	driver = new InternetExplorerDriver();
		driver.manage().window().maximize();{
			
		}
		driver.get(prop.getProperty("url"));
		
	}	
}
