import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Popups {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
driver.get("http://qtpselenium.com/test/unpredictable.php");

Set<String> windIds = driver.getWindowHandles();
System.out.println("Total windows - "+windIds.size() );
Iterator<String> it  =  windIds.iterator();

if(windIds.size()>1){
	
	it  =  windIds.iterator();
	String mainWin = it.next();
	String popupWin = it.next();
	System.out.println(mainWin); // main
	System.out.println(popupWin); // popup
	driver.switchTo().window(popupWin);
	driver.close();
	driver.switchTo().window(mainWin);
	}
else{
	System.out.println("No popups present");
}

}


	}

