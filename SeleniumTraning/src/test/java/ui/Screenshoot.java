package ui;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshoot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		Date date = new Date();
		String Screenshootfilename = date.toString().replace(" ", "-").replace(":", "-");
		System.out.println(Screenshootfilename);
		driver.get("https://www.saucedemo.com/");
		
		File scrennshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrennshotfile, new File(".//Screenshots/"+Screenshootfilename+" .png"));
	}

}
