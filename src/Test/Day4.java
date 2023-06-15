package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	
	@Parameters({"URL"})
	@Test
	public void WebloginHomeLoan(String uname)
	{
		System.out.println("webloginHome");
		System.out.println(uname);
	}
	
	@Test(groups = {"smoke"})
	public void MobileloginHomeLoan()
	{
		System.out.println("MobileloginHome");
	}
	
	
	@Test
	public void LoginAPIHomeLoan()
	{
		System.out.println("LoginAPIHome");
	}


}
