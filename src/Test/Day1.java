package Test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@AfterTest
	public void lastexecute()
	{
		System.out.println("I will execute last");
			}
	
	
	@Test
	public void Demo()
	{
		
		System.out.println("Hello");
		Assert.assertTrue(false);

	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("I am the no 1 from last");
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("Bye");
	}

}
