package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseober {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		
//		driver.get("https://www.ebay.com/");
//		WebElement mousehover = driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/a"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(mousehover).perform();
		
		driver.get("https://jqueryui.com/droppable/");
		WebElement frame = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/iframe"));
		driver.switchTo().frame(frame);
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag, drop).perform();
		
	}

}
