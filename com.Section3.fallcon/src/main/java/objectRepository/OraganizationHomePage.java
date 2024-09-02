package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OraganizationHomePage {
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement newOrgBtn;

	public OraganizationHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getNewOrgBtn() {
		return newOrgBtn;
	}
	
	/**
	 * business library to click on new org btn
	 */
	public void clickOnNewOrgBtn()
	{
		newOrgBtn.click();
	}
}
