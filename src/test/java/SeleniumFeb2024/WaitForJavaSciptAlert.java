package SeleniumFeb2024;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForJavaSciptAlert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}

}
