package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {
	
	Properties pro;
	public Readconfig() {
		File src=new File("./Configurationfiles/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getApplicationURL() {
		String url=pro.getProperty("url");
		return url;
		
	}
	
	public String getusername() {
		String user=pro.getProperty("uname");
		return user;
		
	}
	
	public String getpassword() {
		String pwd=pro.getProperty("pwd");
		return pwd;
		
	}
	

}
