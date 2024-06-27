package SeleniumFeb2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	static WebDriver driver;
	public static void main(String[] args) {
	//wait(I)-Untill();
		//Implemented by  Fluentwait(C)-methods()
		//extended webdriverwait(C)-?Inherited methods +Indivual methods
		// Do not mix implict wait and explicait wait
		/*
		 * e1:20   + 5 --->total time out 25
		 * e2:5    +  2----------------->7
		 * e3:25 (NEF)---->
		 * e4:0+	0--->0
		 * e5:20      +0  ->20 
		 * 
		 */
		 driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
		By email=By.id("input-email");
		By pwd=By.id("input-password");
		By submit=By.xpath("//input[@value='Login']");
	
//	
//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//WebElement eleemail=wait.until(ExpectedConditions.presenceOfElementLocated(email));
//eleemail.sendKeys("vainaya@gmail.com");
//waitForElementPresent(email,10).sendKeys("test@gmail.com");	
//getElelment(pwd).sendKeys("ateastt");
//waitForElementPresent(submit,5).click();
//		waitForVisiblityOfElement(email,10).sendKeys("test@gmail.com");
//		getElelment(pwd).sendKeys("ateastt");
//		waitForVisiblityOfElement(submit,5).click();
		
		ElementUtility util=new ElementUtility(driver);
		util.doSendKeys(email, "test@qwil.com", 10);
		util.doSendKeys(pwd, "qwerrq");
		util.doClickWithWait(submit, 10);
		System.out.println("After click");
		
	}
/**
 * 
An expectation for checking that an element is present on the DOM of a page. 
This does notnecessarily mean that the element is visible.
 * @param locatort
 * @param timeOut
 * @return
 */
	public static WebElement waitForElementPresent(By locatort,int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locatort));
	}
	
	
	/**
	 * 
	 * 

An expectation for checking that an element is present on the DOM of a page and visible.
Visibility means that the element is not only displayed but also has a height and width that isgreater than 0.

	 * @param locatort
	 * @param timeOut
	 * @return
	 */
	
	public static WebElement waitForVisiblityOfElement(By locatort,int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locatort));
	}

public static WebElement getElelment(By locator) {
	return driver.findElement(locator);
}
}
