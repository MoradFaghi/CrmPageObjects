package comCrmQaTestcases;

import comCrmQaBase.TestBase;
import comCrmQaPages.HomePage;
import comCrmQaPages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {       // constructor for LoginPageTest
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
			}
	
	@Test(priority=1)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	
//	@Test(priority=2)
//	public void loginPageTitleTest() {
//		String title=loginpage.validateLoginPageTitle();
//		Assert.assertEquals(title, "Classic FreeCRM or CRMPro User?  Login to ");
//	}


	
	//@AfterMethod
	//public void tearDown() {
	//	driver.quit();
	//}
		
	

}
