package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;
import com.utilsLayer.SelectsClassMethods;

public class PimPage extends BaseClass {
	
	@FindBy(id="btnAdd")
	private WebElement addButton;
	
	@FindBy(id="firstName")
	private WebElement Fistname;
	
	@FindBy(id="middleName")
	private WebElement Middlename;
	@FindBy(id="lastName")
	private WebElement Lastneme;
	@FindBy(id="employeeId")
	private WebElement employeeid;
	@FindBy(xpath="//input[@value='Save']")
	private WebElement saveButton;
	@FindBy(id="btnSave")
	private WebElement editbutton;
	
	@FindBy(xpath="//input[@id='personal_txtEmpFirstName']")
	private WebElement fistnameinpersonalDatails;
	@FindBy(xpath="//input[@id='personal_txtEmpMiddleName']")
	private WebElement middlenameinpersonalDatails;
	@FindBy(xpath="//input[@id='personal_txtEmpLastName']")
	private WebElement lastnameinpersonalDatails;
	
	@FindBy(xpath="//input[@id='personal_optGender_1']")
	private WebElement selectradiobutton;
	@FindBy(id ="personal_cmbMarital")
	private WebElement marriedstatus;
	@FindBy(id="personal_cmbNation")
	private WebElement nationlity;
	
	@FindBy(xpath ="//input[@name='personal[txtEmpNickName]']")
	private WebElement nikName;
	
	@FindBy(xpath ="//input[@id='btnSave']")
	private WebElement sButton;
	
	
	public PimPage() {
				PageFactory.initElements(driver,this);
	}
	
	public void clickOnAddButton() {
		addButton.click();
	}
	
	public void AddemplyeeDatails(String fistname,String middlename,String lastname) {
		Fistname.sendKeys(fistname);
		Middlename.sendKeys(middlename);
		Lastneme.sendKeys(lastname);
		
	}
	public String captureEmpleefistname() {
		return Fistname.getAttribute("value");
	}
	
	public String captureEmpleemiddlename() {
		return Middlename.getAttribute("value");
	}
	public String captureEmpleelasttnamr() {
		return Lastneme.getAttribute("value");
	}
	
	public String captureEmpleeId() {
		return employeeid.getAttribute("value");
	}	
	 public void clickOnSaveButton() {
		 saveButton.click();
	 }
	  public void clickOnEditButton() {
		  editbutton.click();
	  }
	 public String CapturefistnameInpersonalDatails() {
		return fistnameinpersonalDatails.getAttribute("value");
	 }
	 public String CapturemiddlenameInpersonalDatails() {
			return middlenameinpersonalDatails.getAttribute("value");
		 }
	 public String CapturelastnameInpersonalDatails() {
			return lastnameinpersonalDatails.getAttribute("value");
		 }
	 public void clickRideoButton() {
		 selectradiobutton.click();
	 }
	 
	 public void selectDropdounVlauve(String droupDounvalve) {
		 SelectsClassMethods.selectDropDounValue(marriedstatus, droupDounvalve);
		 
		 }
	 
	 public void selectNationlity(String dpvalue) {
		 SelectsClassMethods.selectDropDounValue(nationlity, dpvalue);
	 }
	 public void enterniksname(String nname) {
		 nikName.sendKeys(nname);
	 }
	 
	 public void clickOnSaveButtonForParsonalDatails() {
		 sButton.click();
	 }
	 
	 
	 
	 
	 
	 

}