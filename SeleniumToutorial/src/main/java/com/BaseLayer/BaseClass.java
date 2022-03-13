package com.BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class BaseClass {

	public static WebDriver driver;
	
	public static void intilization () {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//AllBrower Driver/chromedriver.exe");
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
	


//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Kadam\\Desktop\\Sele\\edgedriver_win64 (1)\\msedgedriver.exe");
//			 	driver = new EdgeDriver();
//				driver.manage().window().maximize();
//				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//				driver.manage().deleteAllCookies();
//				driver.get("https://opensource-demo.orangehrmlive.com/");

	}
	}

