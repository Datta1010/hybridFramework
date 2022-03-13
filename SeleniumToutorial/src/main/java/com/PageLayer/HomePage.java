package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class HomePage extends BaseClass {
	
			public HomePage() {
				 PageFactory.initElements(driver, this);
			}
			
	@FindBy(xpath ="//img[@alt ='OrangeHRM']")
	private WebElement logo;
	@FindBy(id="menu_admin_viewAdminModule")
	private WebElement Admin;
	 @FindBy(id="menu_pim_viewPimModule")
	 private WebElement pim;
	 @FindBy(id="menu_leave_viewLeaveModule")
	 private WebElement Leave;
	 @FindBy(id="menu_time_viewTimeModule")
	 private WebElement time;
	 @FindBy(id="menu_recruitment_viewRecruitmentModule")
	 private WebElement req;
	  @FindBy(id="menu_pim_viewMyDetails")
	  private WebElement My_Info;
	@FindBy(id="menu__Performance")
	private WebElement performance;
	 @FindBy(id="menu_dashboard_index")
	 private WebElement dashbord;
	 @FindBy(id="menu_directory_viewDirectory")
	 private WebElement directory;
	 @FindBy(id="menu_maintenance_purgeEmployee")
	 private  WebElement maintenace;
	 @FindBy(xpath="//a[@id='menu_buzz_viewBuzz']")
	 private  WebElement buzz;
	 
	 public boolean cheaklogoloStatus() {
		 return logo.isDisplayed();
	 }
	 
	 
	 public void clickOnAdmin() {
		 Admin.click();
	 }
	 public void clickOnpim() {
		 pim.click();
	 }
	 
	 public void clickOnLeave() {
		 Leave.click();
	 }
	 
	 public void clickOnTime() {
		 time.click();
	 }
	 public void clickOnRiq() {
		 req.click();
	 }
	 public void clickOnMy_Info() {
		 My_Info.click();
	 }
	 public void clickPerformance() {
		 performance.click();
	 }
	 public void clickOnDashbord() {
		 dashbord.click();
	 }
	 
	 public void clickOndirectory() {
		 directory.click();
	 }
	  public void clickOnmaintenace() {
		 maintenace.click();
	 }
	  public void clickonbuzz() {
		 buzz.click();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
