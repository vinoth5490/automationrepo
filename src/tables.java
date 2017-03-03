import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;




public class tables {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "I:\\automation\\ExternalLib\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		//Thread.sleep(6000);
		System.out.println("waited for 6000ms");
		driver.get("http://money.rediff.com/gainers");
List<WebElement> companyname= driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		System.out.println(companyname.size());
		ArrayList<String> a= new ArrayList<String>();
		ArrayList<String> s= new ArrayList<String>();
		
for(int i=0;i<=5;i++){
	a.add(companyname.get(i).getText());
	s.add(companyname.get(i).getText());
	//System.out.println(a.get(i));
	//System.out.println(companyname.get(i).getText());
		}
HashSet<String> v = new HashSet<String>(s);

verifyAndProceed( a,  v, "message");

/*for(int i=0;i<=5;i++){
	if(a.get(i).equals(s.get(i))){
		System.out.println("match"+a.get(i)+"-"+s.get(i));
	}else{
		System.out.println("unmatch");	
	}
	}*/


	}
	public static <T> void verifyAndProceed(T expected, T actual, String message) {
		try {
			org.testng.asserts.SoftAssert softAssert = new org.testng.asserts.SoftAssert();
			softAssert.assertEquals(actual, expected);
			softAssert.assertAll();
			System.out.println("fail");
		} catch (AssertionError e) {
			e.printStackTrace();
		}
	}
	
	
}
