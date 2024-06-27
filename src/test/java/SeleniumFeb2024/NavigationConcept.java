package SeleniumFeb2024;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException {
	 driver=	new ChromeDriver();
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://amazon.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		driver.navigate().to(new URL("https://google.com"));
		System.out.println(driver.getTitle());

}
}
