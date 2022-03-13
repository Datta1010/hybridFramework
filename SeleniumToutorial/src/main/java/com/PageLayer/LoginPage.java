package com.PageLayer;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(id="txtUsername")
	private WebElement username;
	
	@FindBy(id="txtPassword")
	private WebElement password;
	
	@FindBy(id="btnLogin")
	private WebElement logbuttan;
	
	
	
	public   LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean cheakUsernameDisplayed() {
		return username.isDisplayed();
		}
	public boolean cheakUsernameEnabled() {
		return username.isEnabled();
			}
	public void inputDataInUsername(String id) {
		username.sendKeys(id);
	}
	public void captureusername() {
		username.getAttribute("value");
	}
	
	public boolean cheakPassDisplayed() {
		return password.isDisplayed();
	}
	
	public boolean cheakpassEnabled() {
		
		return password.isEnabled();
	}
	public void enterPasword(String pass) {
		password.sendKeys(pass);
	}
	
	public void enterLoginButton() {
		 logbuttan.click();
		
	 }
	
}
