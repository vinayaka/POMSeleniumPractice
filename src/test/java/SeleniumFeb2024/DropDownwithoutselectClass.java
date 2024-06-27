package SeleniumFeb2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownwithoutselectClass {
	
	//1. select dropdown without using select class method:by index,by name,by visibletext
	//2.select a drop down without using select classs 
	static ChromeDriver driver;
	public static void main(String[] args) {
		driver=	new ChromeDriver();
		
		driver.get("https://orangehrm.com/en/contact-sales/");
		 By countid=By.id("Form_getForm_Country");
	
		 selectDropdownvalue(countid, "India") ;

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void  selectDropdownvalue(By locator, String optionText) {
		Select select=new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		for(WebElement e:optionsList) {
			String text = e.getText();
			if(text.equals(optionText.trim())) {
				e.click();
				break;
				
			}
		}
	}
}
