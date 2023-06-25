package qsp;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {
	public static void main(String[]arg) throws Exception{
		
	//getting java representative object of physical file
	FileInputStream fis=new FileInputStream("./data/ActitimeLogin.property");
	//creating object of properties class
	Properties p=new Properties();
	//load the file
	p.load(fis);
	//getting data by passing key (key content from property file itself)
	System.out.println(p.getProperty("url"));
	}
}
