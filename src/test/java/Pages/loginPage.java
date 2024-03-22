package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class loginPage {
	
	public loginPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	
	@FindBy(id="input-email")
	public WebElement inputEmailBox;
	
	@FindBy(id="input-password")
	public WebElement inputPasswordBox;
	
	@FindBy(xpath="//input[@value='Login']")
	public WebElement loginButton;
	
	@FindBy(xpath="//*[@class='alert alert-danger alert-dismissible']")
	public WebElement errorMessage;
	
	
	@FindBy(xpath="//a[text() = 'Forgotten Password']")
	public WebElement forgotPasswordLink;
	

	public void assertLoginFeatures() {
		Assert.assertTrue(inputEmailBox.isDisplayed());
		Assert.assertTrue(inputPasswordBox.isDisplayed());
		Assert.assertTrue(loginButton.isDisplayed());
	}
	
	
	
}
