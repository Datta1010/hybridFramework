package TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.HomePage;
import com.PageLayer.LoginPage;


public class HomePageTest  extends BaseClass {
	LoginPage loginpage ;
	 HomePage  homepage;
	
	@BeforeClass
	public void setup() {
		
		BaseClass.intilization();
		loginpage = new LoginPage();
		  homepage = new HomePage();
		 }
	@Test(priority =0,groups= "homepage")
			public void EnterUserName () {
		  loginpage.inputDataInUsername("Admin");
	  }
	  @Test(priority =1,groups= "homepage")
	  		public void EnterPassWord() {
		  loginpage.enterPasword("admin123");
	  }
	  @Test(priority =2,groups= "homepage")
	  		public void ClickOnloginButton() {
		  loginpage.enterLoginButton();
		  
	  }
	  @Test(priority =3,groups= "homepage")
	  public void validateLogoIsPresntOrNot() {
			boolean actuallogoPresnetOrNot =homepage.cheaklogoloStatus();
			
			Assert.assertEquals(true, actuallogoPresnetOrNot);
		}
	    @Test(priority =4,groups= "homepage")
			public void validatecickAdmin() {
				homepage.clickOnAdmin();
				
			}
			@Test(priority =5,groups= "homepage")
			public void validateclickpim() {
				homepage.clickOnpim();
				
			}
			
			@Test(priority =6,groups= "homepage")
			public void  validateclickleave() {
				homepage.clickOnLeave();
			}
			@Test(priority =7,groups= "homepage")
			public void validateclickOntime() {
				homepage.clickOnTime();
			}
			@Test(priority =8,groups= "homepage")
			public void validateclickOnreq() {
				homepage.clickOnRiq();
			}
			@Test(priority =9,groups= "homepage")
			public void validateclickOnMy_Info() {
				homepage.clickOnMy_Info();
			}
			@Test(priority =10,groups= "homepage")
			public void validateclickOnperformance() {
				homepage.clickPerformance();
				
			}
			@Test(priority =11,groups= "homepage")
			public void validateclickOnDashBord() {
				homepage.clickOnDashbord();
			}
			@Test(priority =12,groups= "homepage")
			public void validateclickOndirectory() {
				homepage.clickOndirectory();
			}
			@Test(priority =13,groups= "homepage")
			public void validatelickOnmaintenace() {
				homepage.clickOnmaintenace();
			}
			@Test(priority =15,groups= "homepage")
			public void validateClickOnBuzz() {
				homepage.clickonbuzz();
			}	
			@AfterClass
			public void tearDoun() {
				driver.close();
				
			}

}
