package SeleniumFeb2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drapandDropAConcept {

	static ChromeDriver driver;
	public static void main(String[] args) {
		driver=	new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		//driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions ac =new Actions(driver);
		WebElement souruce=driver.findElement(By.id("draggable"));
		WebElement Target=driver.findElement(By.id("droppable"));
		ac.dragAndDrop(souruce, Target).perform();
		
	}
	
}
