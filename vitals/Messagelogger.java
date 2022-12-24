package vitals;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Messagelogger {
	
	public String print_language (String message) {
		
		Properties app_properties = getProperties();
		
		if (app_properties.getProperty("language").equalsIgnoreCase("German")) {
			return app_properties.getProperty(message + "_german");
		}
		return app_properties.getProperty(message);
		   	
	}

	private Properties getProperties() {
		Properties p=new Properties(); 
		try {
			FileReader reader=new FileReader("vitals\\application.properties"); 
		    p.load(reader);	
		} catch (IOException e) {
			e.printStackTrace();
		}
		return p;
	}

}
