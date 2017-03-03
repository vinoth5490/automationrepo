import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class mulelmjobeserve {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.jobserve.com/in/en/Job-Search/");
		String y= "Education";
		WebElement d = driver.findElement(By.xpath("//span[text()='27 Industries Selected']"));
		d.click();
		driver.findElement(By.xpath("//*[@id='ddcl-selInd-i0']")).click();
		List <WebElement> l = driver.findElements(By.xpath("//div[@class='ui-dropdownchecklist-dropcontainer ui-widget-content']"));
		System.out.println(l.size());
		String s;
		for(int i=0;i<=30;i++){
		s=l.get(i).getText();
		System.out.println(s);
		if(y.equals(s)){
			WebElement t = driver.findElement(By.xpath("//div[@class='ui-dropdownchecklist-dropcontainer ui-widget-content']//label[contains(text(),'Education']"));
		t.click();
				}
		

		}
		
		System.out.println("---------------------------------------------------------------------");		
		}

}
