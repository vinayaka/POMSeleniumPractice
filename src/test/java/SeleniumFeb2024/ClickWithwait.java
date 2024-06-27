package SeleniumFeb2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickWithwait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		By singuplink=By.linkText("Sign Up");
		ElementUtility eutil=new ElementUtility(driver);
		
		eutil.clickWhenReady(singuplink, 10);
	}

}
