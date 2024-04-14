package SamplePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https:\\www.gmail.com");
d.findElement(By.name("identifier")).sendKeys("chaitanyawar@gmail.com");
d.findElement(By.className("VfPpkd-RLmnJb\"")).submit();
	}

}
