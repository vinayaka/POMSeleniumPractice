package SeleniumFeb2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextConcept {
static WebDriver driver;
	public static void main(String[] args) {
	 driver=	new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//String headertext=driver.findElement(By.tagName("h2")).getText();
		//System.out.println(headertext);
		By header=By.tagName("h2");
		ElementUtility util=new ElementUtility(driver);
		String h=util.doGetText(header);
		System.out.println(h);

	}

}
