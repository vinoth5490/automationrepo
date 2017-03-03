import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class radiobtn {

	
	public static void main(String[] args) {
		/*WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		List<WebElement> r = driver.findElements(By.name("group1"));
		System.out.println(r.size());
		for(int i=0;i<=r.size();i++){
			System.out.println(r.get(i).getText());*/
		
/*		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.americangolf.co.uk/golf-clubs");
		WebElement r = driver.findElement(By.xpath("//div[@title='Refine by: CobraGolf']"));
		List<WebElement> s = r.findElements(By.xpath("//a"));
		for(int i=0;i<=s.size();i++){
			System.out.println(s.get(i).getText());*/
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.jobserve.com/in/en/Job-Search/");
		String x = "Engineering";	
		WebElement d = driver.findElement(By.xpath("//span[text()='27 Industries Selected']"));
		d.click();
		driver.findElement(By.xpath("//*[@id='ddcl-selInd-i0']")).click();
		WebElement s = driver.findElement(By.xpath("[text()='"+x+"']"));;
		//s.findElement(By.xpath("[text()='"+x+"']"));
		s.click();
		
		
		

	}

}
