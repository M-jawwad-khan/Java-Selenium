package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsworking
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.sugarcrm.com/request-demo/");
		driver.findElement(By.name("firstname")).sendKeys("Shezad");
		driver.findElement(By.name("firstname")).clear();
		System.out.println(driver.findElement(By.name("firstname")).getAttribute("class"));
		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div/div/div/div[1]/form/div/div[12]/div/input")).getCssValue("text-transform"));

		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div/div/div/div[1]/form/div/div[12]/div/input")).getSize());
		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div/div/div/div[1]/form/div/div[12]/div/input")).getLocation());
		//agr xpath kai tagmai hoga text wo otha kr lay ayga
		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div/div/div/div[1]/form/div/div[12]/div/input")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div/div/div/div[1]/form/div/div[12]/div/input")).getTagName());

		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div/div/div/div[1]/form/div/div[12]/div/input")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div/div/div/div[1]/form/div/div[12]/div/input")).isEnabled());
		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div/div/div/div[1]/form/div/div[12]/div/input")).isSelected());
		
		
		
		
	}

}
