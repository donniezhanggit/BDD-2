package Automation.bdd;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class TestConfigFactory {

	public static HashMap<String,String> properties = new HashMap<String,String>();
	
	public static HashMap<String,String> readProperty(){
		String filepath = System.getProperty("user.dir")+"Config/Config.properties";
		String value="";
		try{
			Properties prop = new Properties();
			InputStream input=new FileInputStream(filepath);
			prop.load(input);
			
			for(String key: prop.stringPropertyNames()){
				value = prop.getProperty(key);
				properties.put(key, value);
			}
			
			//System.out.println(value);
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return properties;
	}
}
