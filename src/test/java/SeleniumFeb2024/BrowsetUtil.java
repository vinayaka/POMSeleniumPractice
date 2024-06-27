package SeleniumFeb2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowsetUtil {
	
	WebDriver driver;
	public WebDriver lunchBrowser(String browsername) {
		
		System.out.println("Lunch broswer");
		switch (browsername.trim().toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "Firefix":
			driver=new FirefoxDriver();
			break;
		case "Edgae":
			driver=new EdgeDriver();
			break;

		default:
			throw new BrowserException("Invalid driver");
			
		}
		return driver;
	}

	public void lunchurl(String url) {
		if(url==null) {
			throw new BrowserException("Invalid url"+url);
		}
		if(url.isEmpty() || url.isBlank()) {
			throw new BrowserException("Invalid url"+url);
		}
		if(url.indexOf("http")!=0 || url.indexOf("http")>0) {
			throw new BrowserException("Invalid url"+url);
		}
		driver.get(url.trim());
	}
	
	public String getPgaeTitle() {
		return driver.getTitle();
	}
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	public void closeBroswser() {
		 driver.close();
	}
	public void quitBroswser() {
		 driver.quit();;
	}
}
