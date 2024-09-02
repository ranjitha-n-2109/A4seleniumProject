package tc1_Repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OraganizationHomePage;

public class ORG_01 extends BaseClass {
	
		@Test //(groups= {"regression"})
		public void org_01Case() throws Exception {
			JavaUtility JUTIL=new JavaUtility();
			int num=JUTIL.getRandomNumber(1000);
			ExcelUtility EUTIL=new ExcelUtility();
			String ORGNAME=EUTIL.readDataFromExcel("Org", 2, 1);
			String WEBSITE=EUTIL.readDataFromExcel("Org", 2, 2);
			String EMPLOYEES=EUTIL.readDataFromExcel("Org", 2, 3);
			HomePage hp=new HomePage(driver);
			hp.clickOnOrg();
			OraganizationHomePage op=new OraganizationHomePage(driver);
			op.clickOnNewOrgBtn();
			CreateNewOrgPage cnp = new CreateNewOrgPage(driver);
			cnp.createOrganization(ORGNAME+num, WEBSITE, EMPLOYEES);
			System.out.println("Org_01 executed successfully");
			Thread.sleep(4000);
}
	}


