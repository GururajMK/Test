package Test;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Day3 {
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before executing any methods in the class");
	}
	
	
	@Test(groups = {"smoke"})
	public void WebloginCarLoan()
	{
		System.out.println("weblogincar");
	}
	
	@BeforeMethod
	public void  beforeevery() 
	{
		System.out.println("I will execute before every test method in day 3 class");
	}
	
	@AfterMethod
	public void  afterreevery() 
	{
		System.out.println("I will execute after every test method in day 3 class");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After executing any methods in the class");
	}
	
	@Parameters({ "URL", "APIKey/username"})
	@Test
	public void MobileloginCarLoan(String urlname,String key)
	{
		System.out.println("Mobilelogincar");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("i am the no 1");
	}
	
	@Test(enabled = false)
	public void MobilesigninCarLoan()
	{
		System.out.println("Mobilesignincar");
	}
	
	@Test(dataProvider = "getData")
	public void MobilesignoutCarLoan(String username, String password)
	{
		System.out.println("Mobilesignoutcar");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods = {"WebloginCarLoan","MobilesignoutCarLoan"})
	public void APIloginCarLoan()
	{
		System.out.println("LoginAPIcar");
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st combination - username password - good credit histry = row
		//2nd - username password - no credit histry 
		//3rd - fraudelent credit histry
		Object[][] data = new Object[3][2];
		
		// 1st set
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		//columns in the row are nothing but values for that particular combination(row)
		
		//2nd set
		data[1][0]="secandusername";
		data[1][1]="secandpassword"; 
		
		//3rd set
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		return data;
	}
	

}
