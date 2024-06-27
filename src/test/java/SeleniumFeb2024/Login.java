package SeleniumFeb2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login{
	
	
	public static void main(String[] arg) {
		
		BrowsetUtil util=new BrowsetUtil();
			WebDriver driver=	util.lunchBrowser("chrome");
			
			util.lunchurl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			By usernmae=By.id("input-email");
			By pws=By.id("input-password");
			ElementUtility utl=new ElementUtility(driver);
			utl.doSendKeys(usernmae, "vinayaka@gmail.com");
			utl.doSendKeys(pws, "vinayaka123");
			util.closeBroswser();
			
	}
}