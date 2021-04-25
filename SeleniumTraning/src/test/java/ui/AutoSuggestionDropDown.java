package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.edge.driver","C:\\Web_Driver\\msedgedriver.exe" );
				WebDriverManager.firefoxdriver().setup();
				//WebDriverManager.edgedriver().setup();
				//WebDriverManager.chromedriver().setup();
				//EdgeDriver Driver=new EdgeDriver();
			    FirefoxDriver driver = new FirefoxDriver();
			    driver.get("https://www.makemytrip.com/");
			    driver.manage().window().maximize();
			    driver.findElement(By.xpath("//span[text()='From']")).click();
			    WebElement ddown = driver.findElement(By.xpath("//input[@placeholder='From']"));
			    Thread.sleep(2000);
			    ddown.sendKeys("Sydney");
			    Thread.sleep(2000);
			    ddown.sendKeys(Keys.ARROW_DOWN);
			    Thread.sleep(2000);
			    ddown.sendKeys(Keys.ARROW_DOWN);
			    Thread.sleep(2000);
			    ddown.sendKeys(Keys.ENTER);
			    
			    
			    

	}

}
