package SeleniumFeb2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownHandling {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		By country = By.id("Form_getForm_Country");
		By employee = By.id("Form_getForm_NoOfEmployees");

		Select countrydropdown = new Select(driver.findElement(country));
		Select employeedropedown = new Select(driver.findElement(employee));
		doselectByIndex(country,2);
		doselectVisibleText(country,"India");
		doselectVisibleValue(country,"Argentina");
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doselectByIndex(By locator, int id) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(id);
	}
	
	public static void doselectVisibleText(By locator, String text) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public static void doselectVisibleValue(By locator, String value) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
}
