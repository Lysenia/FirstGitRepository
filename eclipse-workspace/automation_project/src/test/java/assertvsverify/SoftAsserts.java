package assertvsverify;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserts {
	
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void test1() {
		int i=100;
		int j=200;
		System.out.println("first assertion");
		softAssert.assertEquals(i, j, "i and j are equal");
		System.out.println("second assertion");
		softAssert.assertNotEquals(i, j, "i and j are not equal");
		System.out.println("third assertion");
		softAssert.assertTrue(i>j);
		softAssert.assertAll();
		//Assert.assertEquals(i, j); hard assert
	}

}
