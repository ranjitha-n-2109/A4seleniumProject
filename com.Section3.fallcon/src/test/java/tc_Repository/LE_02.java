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
public class LE_02 extends BaseClass {
	
	@Test //(groups= {"smoke"})
	public void le_02Case() throws Exception {
		
		JavaUtility JUTIL=new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL = new ExcelUtility ();
		String  FIRSTNAME=EUTIL.readDataFromExcel("leads", 5, 1);
		String LASTNAME=EUTIL.readDataFromExcel("leads", 5, 2);
		String COMPANY=EUTIL.readDataFromExcel("leads", 5, 3);
		String TITLE=EUTIL.readDataFromExcel("leads", 5, 4);
		String PHONE=EUTIL.readDataFromExcel("leads", 5, 5);
		String MOBILE=EUTIL.readDataFromExcel("leads", 5, 6);
		String EMAIL=EUTIL.readDataFromExcel("leads", 5, 7);
		String NOEMP=EUTIL.readDataFromExcel("leads", 5, 8);
		String STREET=EUTIL.readDataFromExcel("leads", 5, 9);
		String POBOX=EUTIL.readDataFromExcel("leads", 5, 10);
		String POSTALCODE=EUTIL.readDataFromExcel("leads", 5, 11);
		String CITY=EUTIL.readDataFromExcel("leads", 5, 12);
		String COUNTRY=EUTIL.readDataFromExcel("leads", 5, 13);
		String STATE=EUTIL.readDataFromExcel("leads", 5,14);
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp=new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadPage cn=new CreateNewLeadPage(driver);
		cn.createLead(FIRSTNAME+num, LASTNAME, COMPANY,TITLE,PHONE,MOBILE,EMAIL,NOEMP,STREET,POBOX,POSTALCODE,CITY,COUNTRY,STATE);
		System.out.println("Le_02  executed successfully");
		Thread.sleep(4000);
		
		}

}


