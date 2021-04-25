package ui;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		//print the titlepage
		String script="return document.title;";
		String title = (String) j.executeScript(script);
		System.out.println(title);
		//click button
		 WebElement frame1 = driver.findElement(By.id("iframeResult"));
		 driver.switchTo().frame(frame1);
		 j.executeScript("myFunction()");
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
		 
		 
		
		 
		
		}

}
