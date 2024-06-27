package SeleniumFeb2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisabled {

	static WebDriver driver;
	public static void main(String[] args) {
	 driver=	new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/register/");

	}

}
