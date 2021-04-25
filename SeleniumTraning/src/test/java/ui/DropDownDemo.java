package ui;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		
//		driver.get("https://www.sugarcrm.com/request-demo/");
//		driver.manage().window().maximize();
//		WebElement DropDown = driver.findElement(By.name("employees_c"));
//		Select select = new Select(DropDown);
//		
//		WebElement firstoption = select.getFirstSelectedOption();
//		System.out.println(firstoption.getText());
//		//value
//		select.selectByValue("level1");
//		//waitsome time
//		Thread.sleep(2000);
//		
//		//text
//		select.selectByVisibleText("51 - 100 employees");
//		//waitsome time
//		Thread.sleep(2000);
//		//indexvalue get
//		select.selectByIndex(9);
		
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		//maximize the window
		driver.manage().window().maximize();
		// select is a tag which we create a select object and put the value of webelement in Select object 
		WebElement Dropdown = driver.findElement(By.id("multi-select"));
		//select tag object select is user for dropdown
		Select select = new Select(Dropdown);
		//select the value of california in a select tag
		select.selectByValue("California");
		Thread.sleep(2000);
		//select the index 5 value
		select.selectByIndex(5);
		Thread.sleep(2000);
		//this is for select all the values of dropdown
		List<WebElement> allitems = select.getAllSelectedOptions();
		//this will return the size
		System.out.println(allitems.size());
		//this will deslect all the selected dropdown
		select.deselectAll();
		Thread.sleep(2000);
		select.selectByValue("California");
		Thread.sleep(2000);
		select.selectByIndex(5);
		Thread.sleep(2000);
		//this will sdeselect the option which index value is 5
		select.deselectByIndex(5);
		System.out.print(" ");
		List<WebElement> allitems1 = select.getAllSelectedOptions();
		System.out.println(allitems1.size());
		
		
	}

}
