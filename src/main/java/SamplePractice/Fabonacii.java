package SamplePractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fabonacii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0, n2=1,i,count=10;
		
		System.out.println(n1+""+n2);
		
		for (i=2;i<count;++i) {
			int n3= n1+n2;
			System.out.println(""+n3);
			
			n1=n2;
			n2=n3;
		}
		WebDriver driver = new ChromeDriver();
		
Alert a= driver.switchTo().alert();
a.dismiss();
a.accept();
a.sendKeys(null);
a.getText();

Alert b= driver.switchTo().alert();
b.dismiss();}

}
