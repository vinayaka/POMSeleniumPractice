package SeleniumFeb2024;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtility {

	private WebDriver driver;

	ElementUtility(WebDriver driver) {
		this.driver = driver;
	}

	public void nullcheck(String input) {
		if (input == null) {
			throw new ElementException("value is nulll" + input);
		}
	}

	public void doSendKeys(By locator, String input) {
		nullcheck(input);
		GetElement(locator).sendKeys(input);
	}
	public void doSendKeys(By locator, String input,int timeOut) {
		nullcheck(input);
		waitElementVisible(locator,timeOut).sendKeys(input);
	}

	public WebElement GetElement(By locator) {
		try {
			return driver.findElement(locator);
		} catch (NoSuchElementException ex) {
			System.out.println("Element is not present on the page" + locator);
			ex.printStackTrace();
			return null;
		}
	}

	public void doClick(By locator) {
		GetElement(locator).click();
	}
	public void doClickWithWait(By locater,int timeOut) {
		waitElementVisible(locater,timeOut).click();
	}
	public String doGetText(By locator) {
		return GetElement(locator).getText();
	}

	public String doGetAttribute(By locator, String Atvalue) {
		return GetElement(locator).getAttribute(Atvalue);
	}

	public  boolean doIsDisplyed(By locator) {
		try {
		boolean flag= getElement(locator).isDisplayed();
		return flag;
		}catch(NoSuchElementException ex) {
			System.out.println("Element with locator"+locator+"Not displayed");
			return false;
		}
	}
	public  boolean isElementIsDisplayed(By locator) {
		int elementcount=driver.findElements(locator).size();
		if(elementcount==1) {
			System.out.println("Element is Displayed"+locator);
			return true;
		}else {
			System.out.println("Mutiple or zero element is Displyed"+locator);
			return false;
		}
	}

	public  boolean isElementIsDisplayed(By locator,int exceptedcount) {
		int elementcount=driver.findElements(locator).size();
		if(elementcount==exceptedcount) {
			System.out.println("Element is Displayed"+locator);
			return true;
		}else {
			System.out.println("Mutiple element is Displyed"+locator);
			return false;
		}
	}
	public List<WebElement> getWebElements(By locator) {
		return driver.findElements(locator);
	}

	public int getElementcount(By locator) {
		return getWebElements(locator).size();
	}

	public List<String> getElementText(By locator) {
		List<WebElement> list = getWebElements(locator);
		List<String> elelist = new ArrayList();
		for (WebElement e : list) {
			String text = e.getText();
			if (text.length() != 0) {
				elelist.add(text);
			}
		}
		return elelist;
	}
	public  List getAttributeList(By locator, String attrname) {
		List<WebElement> imglist = getWebElements(locator);
		List<String> attlist = new ArrayList();
		for (WebElement e : imglist) {
			String attvalue = e.getAttribute(attrname);
			if (attvalue != null)
				System.out.println(attvalue);
			attlist.add(attvalue);
		}
		return attlist;
	}
	
	/*****************select drop down utility***********************/
	
	public  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public  void doselectByIndex(By locator, int id) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(id);
	}
	
	public  void doselectVisibleText(By locator, String text) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public  void doselectVisibleValue(By locator, String value) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	/******************Actions Util******************/
	public  void handleparentSubMenu(By Parentlocator, By childlocator) throws InterruptedException {
		Actions ac=new Actions(driver);
		ac.moveToElement(getElement(Parentlocator)).perform();
		Thread.sleep(2000);
		getElement(childlocator).click();
		doClick(childlocator);
	}
	/***wait Util***********************/
	
	
	/**
	 * 
	An expectation for checking that an element is present on the DOM of a page. 
	This does notnecessarily mean that the element is visible.
	 * @param locatort
	 * @param timeOut
	 * @return
	 */
		public  WebElement waitForElementPresent(By locatort,int timeOut) {
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
		
		public  WebElement waitElementVisible(By locatort,int timeOut) {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			return wait.until(ExpectedConditions.visibilityOfElementLocated(locatort));
		}
		/**
		 * An expectation for checking an element is visible and enabled such that you can click it.
		 * @param locator
		 * @param timeOut
		 */
		public void clickWhenReady(By locator,int timeOut) {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
		}
		/**
		 * An expectation for checking that the title contains a case-sensitive substring
		 * @param titleFraction
		 * @param timeOut
		 * @return
		 */
		public  String waitForTitleContains(String titleFraction,int timeOut) {
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
		
		public  String waitForTitleToBe(String title,int timeOut) {
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
		
		public  String waitForURLContains(String URLFraction,int timeOut) {
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
		
		public  String waitForURLToBe(String URL,int timeOut) {
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

}
