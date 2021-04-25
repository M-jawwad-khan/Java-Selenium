package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resaizabebyoffset {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		
//		driver.get("https://www.ebay.com/");
//		WebElement mousehover = driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/a"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(mousehover).perform();
		
		
//		driver.get("https://jqueryui.com/resizable/");
//		driver.manage().window().maximize();
//		WebElement frame = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/iframe"));
//		driver.switchTo().frame(frame);
//		WebElement drag = driver.findElement(By.xpath("/html/body/div/div[3]"));
//		Actions actions = new Actions(driver);
//		actions.dragAndDropBy(drag, 300, 100).perform();
		
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/iframe"));
		driver.switchTo().frame(frame);
		WebElement slider = driver.findElement(By.xpath("/html/body/div[2]/span"));
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		actions.dragAndDropBy(slider, -100, 120).perform();
		
	}

}
