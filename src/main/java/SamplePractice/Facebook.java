package SamplePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver d= new ChromeDriver ();

//WebDriver d1 = new EdgeDriver();

d.get("https:\\www.facebook.com");  // Enter the Url 
d.manage().window().maximize();

d.findElement(By.name("email")).sendKeys("crwar"); // Id of facebook
d.findElement(By.name("pass")).sendKeys("Golu@321"); // Pass of fb
d.findElement(By.name("login")).submit();
Thread.sleep(2000);
System.out.println(d.getTitle());
System.out.println(d.getCurrentUrl());
d.findElements(By.className(null));
		
	}

}
