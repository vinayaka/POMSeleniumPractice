package SeleniumFeb2024;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class OpenCart {

	public static void main(String[] args) throws IOException {
		
		ReadProperty rprop=new ReadProperty();
		
			Properties prop=rprop.InitProp();
	
			
		//String browsername="chrome";
		BrowsetUtil brutil=new BrowsetUtil();
		WebDriver driver=brutil.lunchBrowser(prop.getProperty("browser"));
		
		brutil.lunchurl(prop.getProperty("url"));
		String acttitle=brutil.getPgaeTitle();
		System.out.println(acttitle);
		brutil.closeBroswser();
		brutil.quitBroswser();
	}

}
