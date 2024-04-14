package SamplePractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver D= new ChromeDriver ();
		String u = "https;//www.google.com";
		D.get(u);
		
		D.manage().window().maximize();
	    D.manage().timeouts().implicitlyWait(2000, null);
	    D.manage().timeouts().implicitlyWait(null);
	    D.manage().timeouts().implicitlyWait(2000,null);
	    
		

	}

}
