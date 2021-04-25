package ui;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.edge.driver","C:\\Web_Driver\\msedgedriver.exe" );
				WebDriverManager.firefoxdriver().setup();
				//WebDriverManager.edgedriver().setup();
				//WebDriverManager.chromedriver().setup();
				//EdgeDriver Driver=new EdgeDriver();
			    FirefoxDriver Driver = new FirefoxDriver();
			    Driver.get("https://www.google.com/");

	}

}
