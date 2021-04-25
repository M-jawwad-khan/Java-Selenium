package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InterfaceDemo {
	public static String browser = "Firefox";
	public static WebDriver driver;
	
	public void launchApplication(String browser) {
		
		if(browser.equals("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
				}
				else if(browser.equals("Chrome")) {
					WebDriverManager.chromedriver().setup();			
					driver = new ChromeDriver();
				}
				else if(browser.equals("edge")) {
					WebDriverManager.edgedriver().setup();			
					driver = new EdgeDriver();
				}

				driver.get("https://www.google.com/");
	}

}
