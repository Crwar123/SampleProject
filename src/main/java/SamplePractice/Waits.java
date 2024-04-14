package SamplePractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	private static final WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.get("");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofNanos(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofDays(1));
		
		
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(0));
		wait.until(null)	;}
//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(0));
	Alert alrt = driver.switchTo().alert();
	//alrt.dismiss();
	
	Actions action = new Actions (driver);
//	action.
	

}
