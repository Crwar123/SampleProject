package SamplePractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNg {

	public static void main(String[] args) {
		String url= "http:\\www.facebook.com";
		
		WebDriver dr= new ChromeDriver();
		dr.get(url);
	}

}
