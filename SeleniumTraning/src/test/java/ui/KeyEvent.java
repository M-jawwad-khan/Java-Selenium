package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyEvent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[6]/pre"));
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		actions.keyDown(frame, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		WebElement frame1 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[4]/pre/span"));
		Thread.sleep(2000);
		actions.keyDown(frame1, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
		
		
		
	}

}
