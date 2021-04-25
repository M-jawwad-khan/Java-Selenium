package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllTheLinks {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();

		FirefoxDriver Driver = new FirefoxDriver();
		//Driver.get("https://www.sugarcrm.com/request-demo/");
	//	Driver.manage().window().maximize();
//		List<WebElement> alllinks = Driver.findElements(By.tagName("a"));
//		System.out.println(alllinks.size());
//		
//		for(int i = 0; i <alllinks.size();i++) {
//			System.out.println("Links on page are"+alllinks.get(i).getAttribute("href"));
//					
//		}
//		List<WebElement> alllinks = Driver.findElements(By.tagName("a"));
//		System.out.println(alllinks.size());
//		
//		for(int i = 0; i <alllinks.size();i++) {
//			System.out.println("Links name are "+alllinks.get(i).getText());
//			System.out.println("Links on page are"+alllinks.get(i).getAttribute("href"));
//					
//		}
		
		Driver.get("https://www.salesforce.com/au/form/signup/freetrial-elf-v2/?d=70130000000Enyk/");
		List<WebElement> alllinks = Driver.findElements(By.tagName("option"));
		System.out.println(alllinks.size());
		
		for(int i = 0; i <alllinks.size();i++) {
			//System.out.println("Links name are "+alllinks.get(i).getText());
			System.out.println("Links on page are"+alllinks.get(i).getAttribute("value"));
					
		}
	}

}
