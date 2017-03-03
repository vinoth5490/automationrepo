import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class score {

	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
driver.get("http://www.espncricinfo.com/south-africa-domestic-2014-15/engine/match/783849.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
String X = "html/body/div[6]/div[1]/div[4]/div[1]/div[2]/div/table[1]/tbody/tr[" ;
String Y ="]/td[4]";
WebElement s;
int n = 0;
int sum = 0;
for(int i=2;i<=24;i++){
	if(i%2==0){
s = driver.findElement(By.xpath(X+i+Y));
String v = s.getText();
 n = Integer.parseInt(v);
 System.out.println(n);
 sum = sum+n;
	}
}
System.out.println("----------------------------------");
System.out.println(sum);
WebElement g = driver.findElement(By.xpath(X+25+Y));
String k = g.getText();
int l =Integer.parseInt(k);
if(l==sum){
	System.out.println("The scores are equal");
	
}
	}

}
