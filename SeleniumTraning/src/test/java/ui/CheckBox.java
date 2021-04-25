package ui;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		
//		driver.get("https://www.sugarcrm.com/request-demo/");
//		driver.manage().window().maximize();
////		WebElement ScrollingDown = driver.findElement(By.xpath("//input[@value='Request a Demo']"));
//		 driver.findElement(By.id("doi1")).click();
////		Actions actions = new Actions(driver);
////		actions.moveToElement(ScrollingDown);
////		actions.perform();
//		WebElement clicking = driver.findElement(By.xpath("//input[@name='interest_market_c']"));
//		clicking.click();
//		clicking.click();
//		driver.findElements(By.xpath("//input[@type='checkbox']")).size();
//		System.out.print(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
//		System.out.println(" ");
		
		
		driver.get("https://www.makemytrip.com/");
		WebElement radio = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[1]/ul/li[2]"));
		radio.click();
		System.out.println(radio.isSelected());
		
	}

}
