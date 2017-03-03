package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practice1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String title = "Google";
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=jJhLVeGpGO7I8AeVpICoAQ&gws_rd=ssl");
		String f = driver.getTitle();
		if(title.equals(f)){
			System.out.println("success");
		}
		else{
			System.out.println("failure");
		}
driver.close();
	}

}
