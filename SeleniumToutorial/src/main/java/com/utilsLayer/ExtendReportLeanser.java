package com.utilsLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ExtendReportLeanser extends ExtendReportSetUp implements ITestListener {
	 ExtentTest objExtentTest;

	public void onStart(ITestContext context) {
		extent = ExtendReportSetUp.extentReportSetUP();
		System.out.println("Report is Starterd");
	}

	public void onTestStart(ITestResult result) {
	     objExtentTest=  extent.createTest(result.getMethod().getMethodName());
		System.out.println("Test Cases is started Name is  " + result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
	objExtentTest.log(Status.PASS, "Test Case is passed :" + result.getMethod().getMethodName());

		ExtendReportSetUp.takesScreenshotpasscase(result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		objExtentTest.log(Status.FAIL, "Test Case is passed :" + result.getMethod().getMethodName());
		ExtendReportSetUp.takesScreenshotFailcase(result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
		objExtentTest.log(Status.SKIP, "Test Case is passed :" + result.getMethod().getMethodName());
		System.out.println("test case is skip " + result.getMethod().getMethodName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}


	public void onFinish(ITestContext context) {
		extent.flush();
		System.out.println("All test case is finish");
	}


}
