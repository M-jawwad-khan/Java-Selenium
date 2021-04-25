package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLDemo {

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setAcceptInsecureCerts(true);
		
		FirefoxOptions option = new FirefoxOptions();
		option.merge(dc);
		
		WebDriver driver = new FirefoxDriver(option);	
		driver.get("https://www.expired.badssl.com/");
		
	}
}
