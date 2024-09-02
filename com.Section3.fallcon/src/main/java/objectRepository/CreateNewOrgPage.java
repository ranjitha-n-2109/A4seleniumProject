package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgPage {
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgName;
	
	@FindBy(xpath="//input[@name='website']")
	private WebElement website;
	
	@FindBy(xpath="//input[@name='employees']")
	private WebElement employees;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phn;
	
	@FindBy(xpath="//input[@name='otherphone']")
	private WebElement otherPhn;
	
	@FindBy(xpath="//input[@name='email1']")
	private WebElement email;
	
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement billingAddress;
	
	@FindBy(xpath="//input[@name='bill_city']")////input[@name='bill_city']
	private WebElement billingCity;
	
	@FindBy(xpath="//input[@name='bill_state']")
	private WebElement billingState;
	
	@FindBy(xpath="(//input[@class='crmbutton small save'])[2]")
	private WebElement saveBtn;

	
	public CreateNewOrgPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getWebsite() {
		return website;
	}

	public WebElement getEmployees() {
		return employees;
	}

	public WebElement getPhn() {
		return phn;
	}

	public WebElement getOtherPhn() {
		return otherPhn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getBillingCity() {
		return billingCity;
	}

	public WebElement getBillingState() {
		return billingState;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
/**
 * this business lib of TC_01
 * @param organization
 * @param web
 * @param emp
 */
	public void createOrganization(String organization, String web, String emp) {
		orgName.sendKeys(organization);
		website.sendKeys(web);
		employees.sendKeys(emp);
	}
	/**
	 * this business lib of TC_02
	 * @param organization
	 * @param web
	 * @param emp
	 * @param phoneNumber
	 * @param othPhn
	 * @param emailid
	 */
	public void createOrganization(String organization, String web, String emp,String phoneNumber,String othPhn,String emailid) {
		orgName.sendKeys(organization);
		website.sendKeys(web);
		employees.sendKeys(emp);
		phn.sendKeys(phoneNumber);
		otherPhn.sendKeys(othPhn);
		email.sendKeys(emailid);
		
	}
	/**
	 * this business lib of TC_03
	 * @param organization
	 * @param web
	 * @param billingAd
	 * @param billingC
	 * @param billingS
	 */
	public void createOrganization(String organization, String web,String billingAd,String billingC,String billingS) {
		orgName.sendKeys(organization);
		website.sendKeys(web);
		billingAddress.sendKeys(billingAd);
		billingCity.sendKeys(billingC);
		billingState.sendKeys(billingS);
	}	
	/**
	 * this business lib of TC_04
	 * @param organization
	 * @param web
	 * @param emp
	 * @param phoneNumber
	 * @param othPhn
	 * @param emailid
	 * @param billingAd
	 * @param billingC
	 * @param billingS
	 */
	
	public void createOrganization(String organization, String web, String emp,String phoneNumber,String othPhn,String emailid,String billingAd,String billingC,String billingS) {
		orgName.sendKeys(organization);
		website.sendKeys(web);
		employees.sendKeys(emp);
		phn.sendKeys(phoneNumber);
		otherPhn.sendKeys(othPhn);
		email.sendKeys(emailid);
		billingAddress.sendKeys(billingAd);
		billingCity.sendKeys(billingC);
		billingState.sendKeys(billingS);
		saveBtn.click();
	}
}
