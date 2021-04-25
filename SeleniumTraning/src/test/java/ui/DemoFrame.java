package ui;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.edge.driver","C:\\Web_Driver\\msedgedriver.exe" );
				WebDriverManager.firefoxdriver().setup();
				//WebDriverManager.edgedriver().setup();
				//WebDriverManager.chromedriver().setup();
				//EdgeDriver Driver=new EdgeDriver();
			    FirefoxDriver Driver = new FirefoxDriver();
			    Driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
//			    Driver.switchTo().frame(0);
//			    Driver.switchTo().frame("iframeResult");
			    WebElement frame1 = Driver.findElement(By.id("iframeResult"));
			    Driver.switchTo().frame(frame1);
			    Driver.findElement(By.xpath("/html/body/button")).click();
			    Alert alertpage = Driver.switchTo().alert();
			    String getalerttext = alertpage.getText();
			    System.out.println(getalerttext);
			    alertpage.sendKeys("Jawwad Khan");
			    alertpage.accept();
				/*
				 * String gettextofalert = Driver.switchTo().alert().getText();
				 * System.out.println(gettextofalert); Driver.switchTo().alert().accept();
				 */
			    Driver.switchTo().parentFrame();
			    System.out.println(Driver.getTitle());

	}

}
