package ui;
// above,below,toRightOf ,toLeftOf
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import org.openqa.selenium.By;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		
	//	driver.get("https://www.saucedemo.com/");
	//	WebElement password = driver.findElement(By.id("password"));
	//	driver.findElement(withTagName("input").above(password)).sendKeys("testing");
		
	//	driver.get("https://www.saucedemo.com/");
		//WebElement User_Id = driver.findElement(By.id("user-name"));
	//	driver.findElement(withTagName("input").below(User_Id)).sendKeys("testing");
		
		driver.get("https://www.investopedia.com/articles/insurance/09/indexed-universal-life-insurance.asp/");
		WebElement dictionary = driver.findElement(By.className("icon icon-facebook"));
		driver.findElement(withTagName("svg").toRightOf(dictionary)).click();
		
		

	}

}
