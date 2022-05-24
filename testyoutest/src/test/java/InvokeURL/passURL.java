package InvokeURL;

import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.WebDriver;


import baseClass.broswerSetup;

public class passURL 
{
	public static WebDriver sendUrlToWeb() throws Throwable, IOException
	{
		Properties pip = new Properties();
		pip.load(new FileInputStream("./config.properties"));
		WebDriver driver = broswerSetup.selectBroswer("chrome", pip.getProperty("url"));
		return driver;
	}
	
	

}
