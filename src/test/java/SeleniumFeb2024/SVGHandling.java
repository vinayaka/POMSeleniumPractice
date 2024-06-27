package SeleniumFeb2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("(//*[local-name()='svg'])[1]")).click();
	}
	//(//button[contains(@class,'prev')])[2]
	
	////h2[contains(text(),'Travel')]/span[text()='Stories']/ancestor::div[@class='headingblock']/following-sibling::travel-stories//button[contains(@class,'next')]

}
