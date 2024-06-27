package SeleniumFeb2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicaitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("input-email")).sendKeys("testa@fmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("input-password")).sendKeys("ttttt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		//Imp wait cannot be used for Non webelelemnt url, title,alret

	}

}
