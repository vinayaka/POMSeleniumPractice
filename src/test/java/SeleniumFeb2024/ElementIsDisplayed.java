package SeleniumFeb2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {

	static WebDriver driver;
	public static void main(String[] args) {
	 driver=	new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By email=By.id("input-email");
		By img=By.className("img-responsive");
		By forgetpwd=By.linkText("Forgotten Password");
		if(doIsDisplyed(email)) {
			System.out.println("PASSS");
		}
		isElementIsDisplayed(forgetpwd,4);
//		List<WebElement> emaillist = driver.findElements(email);
//		if(emaillist.size()==1) {
//			System.out.println("Pass");
//		}else {
//			System.out.println("Faile");
//		}
	}
	
public static boolean isElementIsDisplayed(By locator) {
	int elementcount=driver.findElements(locator).size();
	if(elementcount==1) {
		System.out.println("Element is Displayed"+locator);
		return true;
	}else {
		System.out.println("Mutiple or zero element is Displyed"+locator);
		return false;
	}
}

public static boolean isElementIsDisplayed(By locator,int exceptedcount) {
	int elementcount=driver.findElements(locator).size();
	if(elementcount==exceptedcount) {
		System.out.println("Element is Displayed"+locator);
		return true;
	}else {
		System.out.println("Mutiple element is Displyed"+locator);
		return false;
	}
}
	public static boolean doIsDisplyed(By locator) {
		try {
		boolean flag= getElement(locator).isDisplayed();
		return flag;
		}catch(NoSuchElementException ex) {
			System.out.println("Element with locator"+locator+"Not displayed");
			return false;
		}
	}
	public static  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
