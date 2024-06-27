package SeleniumFeb2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHadling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=
				new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form");
	}

}
