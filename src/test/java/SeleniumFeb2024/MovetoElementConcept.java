package SeleniumFeb2024;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElementConcept {
static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=	new ChromeDriver();
		
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		By parentlocator=By.cssSelector("a.menulink");
		By childMenu=By.linkText("COURSES");
		handleparentSubMenu(parentlocator,childMenu);
		
	}
	
	public static void handleparentSubMenu(By Parentlocator, By childlocator) throws InterruptedException {
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(Parentlocator)).perform();
		Thread.sleep(2000);
		driver.findElement(childlocator).click();
	}

	}


