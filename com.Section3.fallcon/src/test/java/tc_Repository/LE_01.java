package tc_Repository;



import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;
@Listeners(genericUtilityOrLib.ListenersImplementationClass.class)
public class LE_01 extends BaseClass {
	@Test //(groups= {"regression"})
	public void le_01Case() throws Exception {
		JavaUtility JUTIL=new JavaUtility();
		int num=JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL=new ExcelUtility();
		String FIRSTNAME=EUTIL.readDataFromExcel("Leads",2,1);
		String LASTNAME=EUTIL.readDataFromExcel("Leads",2,2);
		String COMPANY=EUTIL.readDataFromExcel("Leads",2,3);
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp=new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadPage cn=new CreateNewLeadPage(driver);
		cn.createLead(FIRSTNAME+num, LASTNAME, COMPANY);
		System.out.println("Le_01 executed successfully");
		Thread.sleep(4000);
		
	}
	

	
}
