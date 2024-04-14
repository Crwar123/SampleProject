package Base;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	@BeforeClass
	public void launchBrowser() {System.out.println("Launch the browser");}
	
	@BeforeMethod
	public void enterUrl() {System.out.println("Enter The Url");}
	
	@BeforeTest
	public void login() {System.out.println("Login Method");}
	
}
