package SeleniumFeb2024;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	static WebDriver driver;
    public static void main( String[] args )
    {
    	
    	WebDriver  driver=new FirefoxDriver();
        driver.get("https:www.google.com");
        WebElement serachbox=driver.findElement(By.id("searchBox"));
        serachbox.sendKeys("front-end");
        WebElement searchbtn=driver.findElement(By.id("searchButton"));
        searchbtn.click();
        try{
        Thread.sleep(1000);
         JavascriptExecutor  js=(JavascriptExecutor)driver;
        js.executeScript("Window.ScrollBy(0,1200)");

        }catch(Exception ex){
          ex.printStackTrace();
        }finally{
       
        
         driver.quit();
        }
    }
}
