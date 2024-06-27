package SeleniumFeb2024;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SellectDropDownAlllvalues {

	static ChromeDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		By country = By.id("Form_getForm_Country");
		By employee = By.id("Form_getForm_NoOfEmployees");
    List<String> text=getDropDownOptionText(country);
    
    for(String s:text) {
    	System.out.println(s);
    }
		getDropDownOptionText(employee);
		//Select countrydropdown = new Select(driver.findElement(country));
		//Select employeedropedown = new Select(driver.findElement(employee));
		
//		List<WebElement> options = countrydropdown.getOptions();
//		System.out.println(options.size());
//		
//		for(WebElement e:options) {
//			System.out.println(e.getText());
//		}
	
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public  static int getDropDownOptionCount(By locator) {
		Select selectdropdown = new Select(getElement(locator));
		return selectdropdown.getOptions().size();
		
	}
public static List<String> getDropDownOptionText(By locator) {
	Select selectdropdown = new Select(getElement(locator));
	List<WebElement> options = selectdropdown.getOptions();
	List<String> optiontextlist=new ArrayList<String>();
	//System.out.println(options.size());
	
	for(WebElement e:options) {
		optiontextlist.add(e.getText());
	}
	return optiontextlist;
}

}
