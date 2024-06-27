package SeleniumFeb2024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	Properties prop;
	public Properties InitProp() throws IOException {
		try {
			FileInputStream input=new FileInputStream("./src/test/java/config/config.properties");
			 prop=new Properties();
			prop.load(input);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}

}
