package tc1_Repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OraganizationHomePage;

public class ORG_04 extends BaseClass{
	@Test //(groups= {"regression","sanity"})
	

	public void org_04Case() throws Exception {
		
		JavaUtility JUTIL=new JavaUtility();
		int num=JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL=new ExcelUtility();
		String ORGNAME=EUTIL.readDataFromExcel("Org", 11, 1);
		String WEBSITE=EUTIL.readDataFromExcel("Org", 11, 2);
		String EMPLOYEES=EUTIL.readDataFromExcel("Org", 11, 3);
		String PHONE=EUTIL.readDataFromExcel("Org", 11, 4);
		String OTHERPHONE=EUTIL.readDataFromExcel("Org", 11, 5);
		String EMAIL=EUTIL.readDataFromExcel("Org", 11, 6);
		String BILLINGADDRESS=EUTIL.readDataFromExcel("Org", 11, 7);
		String BILLINGCITY=EUTIL.readDataFromExcel("Org", 11, 8);
		String BILLINGSTATE=EUTIL.readDataFromExcel("Org", 11, 9);
		HomePage hp=new HomePage(driver);
		hp.clickOnOrg();
		OraganizationHomePage op=new OraganizationHomePage(driver);
		op.clickOnNewOrgBtn();
		CreateNewOrgPage cnp = new CreateNewOrgPage(driver);
		cnp.createOrganization(ORGNAME+num, WEBSITE, EMPLOYEES,PHONE,OTHERPHONE,EMAIL,BILLINGADDRESS,BILLINGCITY,BILLINGSTATE);
		System.out.println("Org_04 executed successfully");

		Thread.sleep(4000);

}
}
