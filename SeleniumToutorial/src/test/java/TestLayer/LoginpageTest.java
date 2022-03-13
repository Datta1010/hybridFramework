package TestLayer;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;

import com.PageLayer.LoginPage;


public class LoginpageTest extends BaseClass  {
	LoginPage loginpage;
	
	
	@BeforeClass
	public void setup() {
		
		BaseClass.intilization();
		 loginpage = new LoginPage();
		 
		 
	}
	@Test(priority =1,groups= "LoginPage")
	public void validateUsernameDisplayedStatus() {
	boolean actualDislpyedStaus =	loginpage.cheakUsernameDisplayed();
	
		Assert.assertEquals(true, actualDislpyedStaus);
	}
	
	@Test(priority =2,groups= "LoginPage")
	public void validateUsernameEnabledStatus() {
		boolean actualEnabledStatus =loginpage.cheakUsernameEnabled();
		Assert.assertEquals(true, actualEnabledStatus);
	}
	@Test(priority =3,groups= "LoginPage")
	public void validateInterNameTextbox() {
		loginpage.inputDataInUsername("Admin");
	}
	@Test(priority =4,groups= "LoginPage")
	public void ValidatePassDispleyed() {
		boolean actualDislpyedstatus =loginpage.cheakPassDisplayed();
		Assert.assertEquals(true, actualDislpyedstatus);
		}
	@Test(priority =5,groups= "LoginPage")
	public void validatePassEnablaed() {
		boolean actualEnableStatus =loginpage.cheakpassEnabled();
	Assert.assertEquals(actualEnableStatus, true);
	}
	@Test(priority =6,groups= "LoginPage")
	public void validateenterPass() {
	loginpage.enterPasword("admin123");
	}
	
	@Test(priority =7,groups= "LoginPage")
	public void clickLoginButton() {
		loginpage.enterLoginButton();
	
	}
	
	@AfterClass
	public void tearDoun() {
		driver.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
