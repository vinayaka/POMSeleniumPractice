package SeleniumFeb2024;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeList {

	static ChromeDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https:bigbasket.com");

		By imges = By.tagName("img");
	//	List<String> attlist = getAttributeList(imges, "alt");

//		for (String s : attlist) {
//			System.out.println(s);
//		}

	}

	public static List<WebElement> getWebElements(By locator) {
		return driver.findElements(locator);
	}

	

}
