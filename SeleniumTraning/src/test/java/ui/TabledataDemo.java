package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabledataDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		
		
		//step 1 switch to frame
		//step2 get the number of rows
		// step 3 get the number of columns
		// step 4 iterate rows and columns and get text and print it
		
		
		driver.get("https://www2.asx.com.au/");
		
		WebElement frame = driver.findElement(By.id("iframeResult"));
	    driver.switchTo().frame(frame);
		
		
		List<WebElement> rowelements = driver.findElements(By.xpath("there was the xpath of the row which is tr when we copy the xpate remove the number of rows in td"));
		System.out.println(rowelements.size());
		int rowsize = rowelements.size();
		
		//same like column where we us td not tr
		List<WebElement> columnelements = driver.findElements(By.xpath("there was the xpath of the row which is tr when we copy the xpate remove the number of rows in td"));
		System.out.println(columnelements.size());
		int columnsize = columnelements.size();
		
		for(int i = 0;i<=rowsize;i++) {
			for(int j=0;j<=columnsize;j++) {
				//copy the xpath of the row tr we have to apend just like tr["+i+"]/td["+j+"]")).gettext() +" ");
				System.out.print(driver.findElement(By.xpath("ss")));
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
