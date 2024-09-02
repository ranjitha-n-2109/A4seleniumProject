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
public class LE_03 extends BaseClass {
	@Test //(groups= {"sanity"})
	public void le_03Case() throws Exception {
		
		JavaUtility JUTIL=new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL = new ExcelUtility ();
		String  FIRSTNAME=EUTIL.readDataFromExcel("leads", 8, 1);
		String LASTNAME=EUTIL.readDataFromExcel("leads", 8, 2);
		String COMPANY=EUTIL.readDataFromExcel("leads", 8, 3);
		String TITLE=EUTIL.readDataFromExcel("leads", 8, 4);
		String PHONE=EUTIL.readDataFromExcel("leads", 8, 5);
		String MOBILE=EUTIL.readDataFromExcel("leads", 8, 6);
		String EMAIL=EUTIL.readDataFromExcel("leads", 8, 7);
		String NOEMP=EUTIL.readDataFromExcel("leads", 8, 8);
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp= new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadPage cn=new CreateNewLeadPage(driver);
		cn.createLead(FIRSTNAME+num, LASTNAME, COMPANY,TITLE,PHONE,MOBILE,EMAIL,NOEMP);
		System.out.println("Le_03 executed successfully");
		Thread.sleep(4000);
		}
	

}

