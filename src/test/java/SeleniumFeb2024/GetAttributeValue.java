package SeleniumFeb2024;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {
	static WebDriver driver;
	public static void main(String[] args) {
	 driver=	new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By forgetpwd=By.xpath("//*[@id=\"column-right\"]/div/a[3]");
		String avlaue=driver.findElement(forgetpwd).getAttribute("href");
		//System.out.println(avlaue);
		
		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		String emailval=driver.findElement(By.id("input-email")).getAttribute("value");
		//System.out.println(emailval);
		
		String vlaue=doGetAttribute(forgetpwd,"href");
		
		System.out.println(vlaue);
}
	public static WebElement GetElement(By locator) {
		
		return driver.findElement(locator);
		
	}
	
	public static String doGetAttribute(By locator,String Atvalue) {
		return GetElement(locator).getAttribute(Atvalue);
	}
}