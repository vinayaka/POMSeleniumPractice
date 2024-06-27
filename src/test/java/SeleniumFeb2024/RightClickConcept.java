package SeleniumFeb2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	static ChromeDriver driver;
	public static void main(String[] args) {
		driver=	new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightclick=driver.findElement(By.cssSelector(".context-menu-one.btn.btn-neutral"));
		Actions ac=new Actions(driver);
		ac.contextClick(rightclick).perform();
		
		List<WebElement> menu=driver.findElements(By.cssSelector(".context-menu-list.context-menu-root>li.context-menu-item>span"));
		for(WebElement e:menu) {
		System.out.println(e.getText());
		}
	}

}
