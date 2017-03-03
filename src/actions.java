import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class actions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("http://americangolf.co.uk");
		  WebElement golfClub=driver.findElement(By.xpath("//*[@id='navigation']/nav/ul/li[1]/a"));
		  
		  Actions act =new Actions(driver);
		  act.moveToElement(golfClub).build().perform();
		  Random r = new Random();
		  int n = r.nextInt(4);
		 String x = "html/body/div[1]/div[2]/div/nav/ul/li[1]/div/div[1]/div/div[1]/div[1]/ul[";
       String y = "]/li/ul/li[2]/ul/li[";
       String z = "]/a";
		WebElement f = driver.findElement(By.xpath(x+n+y+n+z));
		f.click();

	}

}
