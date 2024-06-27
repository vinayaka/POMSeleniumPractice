package SeleniumFeb2024;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
	static ChromeDriver driver;
	public static void main(String[] args) {
		driver=	new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By link=By.tagName("a");
		By imges=By.tagName("img");
		System.out.println("Total link"+getElementcount(link));
		System.out.println("Total imga"+getElementcount(imges));
		
		//By link=By.tagName("a");
//		List<WebElement> element=getWebElements(link);
//		for(WebElement e:element) {
//			if(!e.getText().isEmpty())
//			System.out.println(e.getText());
//			}
		
		List<String> elementtxt=getElementText(link);
for(String s:elementtxt) {
	System.out.println(s);
}
		
	}

public static List<WebElement> getWebElements(By locator) {
	return driver.findElements(locator);
}

public static int  getElementcount(By locator) {
	return getWebElements(locator).size();
}

public static List<String>  getElementText(By locator) {
	List<WebElement> list=getWebElements(locator);
	List<String> elelist=new ArrayList();
	for(WebElement e:list) {
		String text=e.getText();
		if(text.length()!=0) {
			elelist.add(text);
		}
	}
	return elelist;
}
	}


