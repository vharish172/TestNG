package day1.demo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertion {
	@Test
	public void hardassert()
	{
		String Expected = "IBMer";
		String Actual = "IBM";
		SoftAssert obj= new SoftAssert();
		
		//Assert.assertEquals=("Actual,Expected)//hard Assert
		
		obj.assertEquals(Actual,Expected);
		System.out.println("after assertion");
		obj.assertAll();
	}

}
