package SeleniumFeb2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	 driver=	new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Jordan.Mathews']/parent::td/preceding-sibling::td/input[@type=\"checkbox\"]")).click();
//		https://classic.crmpro.com/
//			apiautomation/Selenium@12345
	}

}
