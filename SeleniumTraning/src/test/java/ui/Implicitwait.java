package ui;

import java.time.Duration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicitwait {

	private static Timeouts implicitlyWait;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		//Implicit wait
//		driver.get("https://www.ebay.com/");
//		driver.manage().window().maximize();
//		implicitlyWait = driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement mousehover = driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/a"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(mousehover).perform();

		
		//explicit wait
//		driver.get("https://www.ebay.com/");
//		driver.manage().window().maximize();
//		WebElement mousehover = driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/a"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(mousehover).perform();
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[2]/a"))).click();

		
		
		//Fulentwait
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	    WebElement mousehover = driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/a"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mousehover).perform();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout
				(Duration.ofSeconds(10)).
				pollingEvery(Duration.ofSeconds(2)).withMessage("kjininmi").
			    ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div[5]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[2]/a"))).click();
		
		
		
	}

}
