package TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.HomePage;
import com.PageLayer.LoginPage;
import com.PageLayer.PimPage;

public class PimPageTest extends BaseClass{
	LoginPage loginpage ;
	 HomePage  homepage;
		PimPage pimpage;
	
	
	@BeforeClass
	public void setup() {
		
		BaseClass.intilization();
		 loginpage = new LoginPage();
		  homepage =new HomePage();
		  pimpage = new PimPage();
	
	
			}
		@Test(priority =1,groups= "homepage")
			public void EnterUserName () {
		  loginpage.inputDataInUsername("Admin");
		  loginpage.enterPasword("admin123");
	  	   loginpage.enterLoginButton();
	       }
		@Test(priority =2,groups= "homepage")
			public void validatepimPimPageUrl() {
			homepage.clickOnpim();
			String actualUrl =driver.getCurrentUrl();
			Assert.assertEquals(true, actualUrl.contains("pim") );
			}
		@Test(priority =3,groups= "pimpage")
	  	public void validatePimpageurl() {
	  		pimpage.clickOnAddButton();
	  		
	  		pimpage.AddemplyeeDatails("sham", "shidheshwar", "bhosale");
	  		
	  	}
		@Test(priority =4,groups= "pimpage")
	  	public void validateclickSave() {
	  		pimpage.captureEmpleefistname();
	  		pimpage.captureEmpleemiddlename();
	  		pimpage.captureEmpleelasttnamr();
	  	 
	  	}
		@Test(priority =5,groups= "pimpage")
	  	 public void validateclickOnsaveButton() {
	  		 pimpage.clickOnSaveButton();
	  		 
	  	 }
		@Test(priority =6,groups= "pimpage")
	  	 public void vlidateUrlOfPersonDatails() {
	  		 String atualurl =driver.getCurrentUrl();
	  		 Assert.assertEquals(true, atualurl.contains("viewPersonalDetails"));
	  	 }
	  	 
		@Test(priority =7,groups= "pimpage")
	  	public void validateClickOnEidtButton() {
	  		pimpage.clickOnEditButton();
	  		
	  	}
		@Test(priority =8,groups= "pimpage")
	  public void validateAddEmplyeedatils() {
	  		pimpage.clickOnSaveButton();
	  		String fname =pimpage.CapturefistnameInpersonalDatails();
	  		Assert.assertEquals(fname, "sham");
	  		String mname =pimpage.CapturemiddlenameInpersonalDatails();
	  		Assert.assertEquals(mname, "shidheshwar");
	  		String lname =pimpage.CapturelastnameInpersonalDatails();
	  		Assert.assertEquals(lname, "bhosale");
	  	}
		@Test(priority =9,groups= "pimpage")
	  	public void validateRadioButtom () {
	  		pimpage.clickRideoButton();
	  		
	  	}
		@Test(priority =10,groups= "pimpage")
	  	public void ValidateMarriedStatus() {
	  		pimpage.selectDropdounVlauve("Single");
	  		pimpage.selectNationlity("Greek");
	  		}
		@Test(priority =11,groups= "pimpage")
			public void validateNicksNmae() {
				pimpage.enterniksname("datta");
					}
		@Test(priority =12,groups= "pimpage")
			public void validateOnClickSaveButton() {
		pimpage.clickOnSaveButtonForParsonalDatails();
		}
	
		@AfterClass
			public void tearDoun() {
		driver.close();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
