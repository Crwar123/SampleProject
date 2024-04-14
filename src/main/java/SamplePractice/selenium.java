package SamplePractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


WebDriver d = new ChromeDriver();
WebDriver dr = new EdgeDriver();



//Try Catch Block
try {
d.get("https://www.facebook.com/");}
catch (Exception e) {
	System.out.println(e.getMessage());
	
	try {
		
		d.get("http://www.google.com");}
	catch (Exception a) {
		System.out.println(a.getMessage());
		
	}
	}
//Action
Actions a= new Actions(d);
a.moveToElement(null).build().perform();

Actions b=  new Actions (dr);
b.moveToElement(null).build().perform()
;}





	}


