package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadPage {
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName;

	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;

	@FindBy(xpath="//input[@name='company']")
	private WebElement company;

	@FindBy(xpath="//input[@name='designation']")
	private WebElement title;

	@FindBy(xpath="//input[@name='phone']")
	private WebElement phone;

	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobile;

	@FindBy(xpath="//input[@name='email']")
	private WebElement email;

	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement noOfEmployees;
	
	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement street;

	@FindBy(xpath="//input[@name='pobox']")
	private WebElement poBox;

	@FindBy(xpath="//input[@name='code']")
	private WebElement postalCode;

	@FindBy(xpath="//input[@name='city']")
	private WebElement city;

	@FindBy(xpath="//input[@name='country']")
	private WebElement country;

	@FindBy(xpath="//input[@name='state']")
	private WebElement state;

	@FindBy(xpath="//input[@class='crmbutton small save']")
	private WebElement saveBtn;

	public CreateNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		

}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNoOfEmployees() {
		return noOfEmployees;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getPoBox() {
		return poBox;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	/**
	 * this is business lib of TC_01
	 * @param fname
	 * @param lname
	 * @param cmp
	 */
	public void createLead(String fname,String lname,String cmp)
	{
			firstName.sendKeys(fname);
			lastName.sendKeys(lname);
			company.sendKeys(cmp);
	}
	/**
	 * this is business lib of TC_02
	 * @param fname
	 * @param lname
	 * @param cmp
	 * @param til
	 * @param phn
	 * @param mob
	 * @param emailid
	 * @param numofemp
	 * @param strt
	 * @param pbox
	 * @param pcode
	 * @param cty
	 * @param ctry
	 * @param st
	 */
	public void createLead(String fname,String lname,String cmp,String til,String phn,String mob,String emailid,String numofemp,String strt,String pbox,String pcode,String cty,String ctry,String st)
{
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		company.sendKeys(cmp);
		title.sendKeys(til);
		phone.sendKeys(phn);
		mobile.sendKeys(mob);
		email.sendKeys(emailid);
		noOfEmployees.sendKeys(numofemp);
		street.sendKeys(strt);
		poBox.sendKeys(pbox);
		postalCode.sendKeys(pcode);
		city.sendKeys(cty);
		country.sendKeys(ctry);
		state.sendKeys(st);
}
	public void createLead(String fname,String lname,String cmp,String til,String phn,String mob,String emailid,String numofemp)
	{
			firstName.sendKeys(fname);
			lastName.sendKeys(lname);
			company.sendKeys(cmp);
			title.sendKeys(til);
			phone.sendKeys(phn);
			mobile.sendKeys(mob);
			email.sendKeys(emailid);
			noOfEmployees.sendKeys(numofemp);
	}
	public void createLead(String fname,String lname,String cmp,String strt,String pbox,String pcode,String cty,String ctry,String st)
	{
			firstName.sendKeys(fname);
			lastName.sendKeys(lname);
			company.sendKeys(cmp);
			street.sendKeys(strt);
			poBox.sendKeys(pbox);
			postalCode.sendKeys(pcode);
			city.sendKeys(cty);
			country.sendKeys(ctry);
			state.sendKeys(st);
			saveBtn.click();
	}
}