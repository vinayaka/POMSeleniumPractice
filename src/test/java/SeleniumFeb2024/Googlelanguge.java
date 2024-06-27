package SeleniumFeb2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlelanguge {

	static WebDriver driver;
	public static void main(String[] args) {
	 driver=	new ChromeDriver();
		
		driver.get("https://www.google.com");
		List<WebElement> list=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println(list.size());
		for(WebElement e:list) {
			String text=e.getText();
			if(text.equals("मराठी")) {
				e.click();
			}
		}

	}

}
