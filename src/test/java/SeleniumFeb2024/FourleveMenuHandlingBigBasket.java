package SeleniumFeb2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FourleveMenuHandlingBigBasket {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		By level1=By.xpath("(//button[contains(@id,'headlessui-menu-button')]//span[text()='Shop by'])[2]");
		By level2=By.linkText("Beverages");
		By level3=By.linkText("Tea");
		By level4=By.linkText("Green Tea");

		leve4MenuSubMenuHandling(level1,level2,level3,level4);
//act.moveToElement(driver.findElement(leve4)).perform();
//Thread.sleep(1000);

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
public static void leve4MenuSubMenuHandling(By leve1,By level2,By level3,By level4) throws InterruptedException {
	getElement(leve1).click();
	Thread.sleep(3000);
	Actions act=new Actions(driver);
	act.moveToElement(getElement(level2)).perform();
	Thread.sleep(1000);
	act.moveToElement(getElement(level3)).perform();
	Thread.sleep(1000);
	getElement(level4).click();
}
}
