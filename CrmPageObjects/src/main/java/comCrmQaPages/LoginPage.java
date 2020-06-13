package comCrmQaPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.eclipse.jetty.util.annotation.Name;

import comCrmQaBase.TestBase;

public class LoginPage extends TestBase{
	
	// page Factory - object repository
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement SignUpBtn;
	
	@FindBy(xpath="//div[contains(text(),'Login to')]")
	WebElement crmLogo;
	

	
	// Initializing the Page Objects
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		

		
	//Actions
	public String validateLoginPageTitle() {
		return  driver.getTitle();
	}
	
	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String em, String pwd) {
		email.sendKeys(em);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
		}
	
}

