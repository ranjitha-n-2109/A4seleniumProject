package sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample1 {
@Test(priority=1)
//@Test//(enabled=false)
	public void createUser()
	{
		System.out.println("user created!!");
	}
//@Test(priority=2,invocationCount=4)
@Test(invocationCount=0)

	public void modifyUser()
	{
		System.out.println("user modified!!");
	}
//@Ignore
@Test//(priority=3,dependsOnMethods= {"createUser"})//

	public void deleteUser()
	{
		System.out.println("user deleted!!");
	}
	
	
}
