package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	
	@Test(groups = {"smoke"})
	public void ploan()
	{
		System.out.println("Good");
	}
	
	@BeforeTest
	public void prerequest()
	{
		System.out.println("I will execute first");
	}

}
