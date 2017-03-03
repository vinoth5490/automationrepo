import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class multipleelements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//div[@class='refinement brand']//span[@class='refinement-name']
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.americangolf.co.uk/golf-clubs/putters");
		String t = null;
	List <WebElement> l =driver.findElements(By.xpath("//div[@class='refinement brand']//span[@class='refinement-name']"));
     System.out.println(l.size());
     for(int i=0;i<l.size();i++){
    	     	 t =l.get(i).getText();
    	      System.out.println(t);
    	     	     }
  	

	}

}
