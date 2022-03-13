package com.utilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseLayer.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportSetUp extends BaseClass{
	public static ExtentSparkReporter sparkReports;
	public static ExtentReports extent;
	
	static String dateTime = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
	
	
	public static ExtentReports extentReportSetUP() {

		// it will store in desired location
		sparkReports = new ExtentSparkReporter(System.getProperty("user.dir") + "\\Reports\\" + dateTime + ".html");

		// it will start the report
		extent = new ExtentReports();

		// attached report to specified path
		extent.attachReporter(sparkReports);
		

		return extent;
	}
	
	
			public static String  takesScreenshotpasscase (String Methodname) {
						String datetime =	dateTime;
		
				TakesScreenshot ts = (TakesScreenshot) driver; 
		
					File f = ts.getScreenshotAs(OutputType.FILE);
					String  distpath =System.getProperty("User.dir")+"//PassScreenshot//"+Methodname+datetime+".png";
		
					File dist = new File(distpath);
					
						try {
						FileUtils.copyFile(f, dist);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return distpath;
					
		}
			
		
		
		public static String  takesScreenshotFailcase (String Methodname) {
		
					String datetime =	dateTime;
			TakesScreenshot ts = (TakesScreenshot) driver; 
			File f = ts.getScreenshotAs(OutputType.FILE);
					String Distpath =System.getProperty("User.dir") + "//FailCasescreenshot//"+Methodname+datetime+".png";
					File Dist =new File(Distpath);
					try {
						FileUtils.copyFile(f, Dist);
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					return Distpath;
		}
	
			
	
	
	}
	
	
	
	

	


