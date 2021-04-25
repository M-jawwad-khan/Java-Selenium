package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RIghtCLickOperation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/iframe"));
		driver.switchTo().frame(frame);
		WebElement rectangle = driver.findElement(By.xpath("//*[@id=\"swatch\"]"));
		Actions actions = new Actions(driver);
		actions.contextClick(rectangle).perform();
		Thread.sleep(2000);
		
		
		
	}

}
