package tc1_Repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OraganizationHomePage;

public class ORG_02 extends BaseClass{
	
		@Test //(groups= {"regression","smoke"})
		public void org_02Case() throws Exception {
			JavaUtility JUTIL=new JavaUtility();
			int num=JUTIL.getRandomNumber(1000);
			ExcelUtility EUTIL=new ExcelUtility();
			String ORGNAME=EUTIL.readDataFromExcel("Org", 5, 1);
			String WEBSITE=EUTIL.readDataFromExcel("Org", 5, 2);
			String EMPLOYEES=EUTIL.readDataFromExcel("Org", 5, 3);
			String PHONE=EUTIL.readDataFromExcel("Org", 5, 4);
			String OTHERPHONE=EUTIL.readDataFromExcel("Org", 5, 5);
			String EMAIL=EUTIL.readDataFromExcel("Org", 5, 6);
			HomePage hp=new HomePage(driver);
			hp.clickOnOrg();
			OraganizationHomePage op=new OraganizationHomePage(driver);
			op.clickOnNewOrgBtn();
			CreateNewOrgPage cnp = new CreateNewOrgPage(driver);
			cnp.createOrganization(ORGNAME+num, WEBSITE, EMPLOYEES,PHONE,OTHERPHONE,EMAIL);
			System.out.println("Org_02 executed successfully");

			Thread.sleep(4000);

}
	}
	

