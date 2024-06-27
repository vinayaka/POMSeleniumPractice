package SeleniumFeb2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUPHandle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		String username="admin";
		String pwd="admin";
		driver.get("https://"+username+":"+pwd+"@"+"the-internet.herokuapp.com/basic_auth");

	}

}
