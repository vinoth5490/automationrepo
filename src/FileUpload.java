import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FileUpload {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","I:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.findElement(By.xpath("//input[@type='file']")).click();
		try {
			Runtime.getRuntime().exec("I:\\fif1.exe");
		} catch (IOException e) {
		   e.printStackTrace();
		}
		
		
	}

}
