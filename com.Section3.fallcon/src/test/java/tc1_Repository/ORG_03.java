package tc1_Repository;

import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OraganizationHomePage;

public class ORG_03 extends BaseClass {
	
		@Test  //(groups= {"smoke"})
		public void org_03Case() throws Exception {
			JavaUtility JUTIL=new JavaUtility();
			int num=JUTIL.getRandomNumber(1000);
			ExcelUtility EUTIL=new ExcelUtility();
			String ORGNAME=EUTIL.readDataFromExcel("Org", 8, 1);
			String WEBSITE=EUTIL.readDataFromExcel("Org", 8, 2);
			String BILLINGADDRESS=EUTIL.readDataFromExcel("Org", 8, 3);
			String BILLINGCITY=EUTIL.readDataFromExcel("Org", 8, 4);
			String BILLINGSTATE=EUTIL.readDataFromExcel("Org", 8, 5);
			HomePage hp=new HomePage(driver);
			hp.clickOnOrg();
			OraganizationHomePage op=new OraganizationHomePage(driver);
			op.clickOnNewOrgBtn();
			CreateNewOrgPage cnp = new CreateNewOrgPage(driver);
			cnp.createOrganization(ORGNAME+num, WEBSITE,BILLINGADDRESS,BILLINGCITY,BILLINGSTATE);
			System.out.println("Org_03 executed successfully");

			Thread.sleep(4000);

		}
		
}
