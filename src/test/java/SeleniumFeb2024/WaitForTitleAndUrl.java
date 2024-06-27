package SeleniumFeb2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleAndUrl {
static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		By pricing = By.linkText("Pricing");
		ElementUtility eutil = new ElementUtility(driver);

		eutil.clickWhenReady(pricing, 10);
//	String title=	waitForTitleContains("PRICING", 10);
//	System.out.println(title);
//		System.out.println(title.concat("PRICING"));
//		
		String URL=waitForURLContains("pricing.html",10);
		System.out.println(URL);
		
	}
	
	
	public static String waitForURLContains(String URLFraction,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
		if (wait.until(ExpectedConditions.urlContains(URLFraction))) {
			return driver.getCurrentUrl();
		}
		}catch(TimeoutException ex) {
			System.out.println("URL not found");
			return driver.getCurrentUrl();
		}
		return driver.getCurrentUrl();
	}
	
	public static String waitForURLToBe(String URL,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
		if (wait.until(ExpectedConditions.urlToBe(URL))) {
			return driver.getCurrentUrl();
		}
		}catch(TimeoutException ex) {
			System.out.println("URL not found");
			return driver.getCurrentUrl();
		}
		return driver.getCurrentUrl();
	}
	
	public static String waitForTitleContains(String titleFraction,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
		if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
			return driver.getTitle();
		}
		}catch(TimeoutException ex) {
			System.out.println("Title not found");
			return driver.getTitle();
		}
		return driver.getTitle();
	}
	
	public static String waitForTitleToBe(String title,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
		if (wait.until(ExpectedConditions.titleIs(title))) {
			return driver.getTitle();
		}
		}catch(TimeoutException ex) {
			System.out.println("Title not found");
			return driver.getTitle();
		}
		return driver.getTitle();
	}

}
