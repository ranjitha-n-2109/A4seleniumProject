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
public class LE_04 extends BaseClass{
	@Test //(groups= {"smoke","regression"})
	public void le_04Case() throws Exception {
		
		JavaUtility JUTIL=new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL = new ExcelUtility ();
		String FIRSTNAME=EUTIL.readDataFromExcel("leads", 11, 1);
		String LASTNAME=EUTIL.readDataFromExcel("leads", 11, 2);
		String COMPANY=EUTIL.readDataFromExcel("leads", 11, 3);
		String STREET=EUTIL.readDataFromExcel("leads",11,4);
		String POBOX=EUTIL.readDataFromExcel("leads", 11,5);
		String POSTALCODE=EUTIL.readDataFromExcel("leads", 11, 6);
		String CITY=EUTIL.readDataFromExcel("leads",11,7);
		String COUNTRY=EUTIL.readDataFromExcel("leads",11,8);
		String STATE=EUTIL.readDataFromExcel("leads",11,9);
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp = new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadPage cn=new CreateNewLeadPage(driver);
		cn.createLead(FIRSTNAME+num, LASTNAME, COMPANY,STREET,POBOX,POSTALCODE,CITY,COUNTRY,STATE);
		System.out.println("Le_04 executed successfully");
		Thread.sleep(4000);
		}

}


