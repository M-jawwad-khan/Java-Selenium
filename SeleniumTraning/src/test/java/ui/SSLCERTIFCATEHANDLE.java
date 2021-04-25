package ui;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLCERTIFCATEHANDLE {
	public static String browser = "Firefox";
	public static WebDriver driver;

	// public static ChromeDriver driver;
	// public static FirefoxDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// InterFace Driver
		
		DesiredCapabilities handleSSLError = new DesiredCapabilities();

		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			handleSSLError.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			handleSSLError.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			FirefoxOptions foption = new FirefoxOptions();
			foption.merge(handleSSLError);
			driver = new FirefoxDriver(foption);
			
		} else if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		// get (url) open the current url

		driver.get("https://www.expired.badssl.com/");

		// manage is used for maximize minimize manage the window change the window size
		// driver.manage().window().maximize();

		// CurrentUrl to print the url
		// String currentUrl = driver.getCurrentUrl();
		// System.out.println(currentUrl);

		// to print the title page gettitle
		// String title = driver.getTitle();
		// System.out.println(title);

		// pagesource is used to print all the page sourcecode
		// String pagesource = driver.getPageSource();
		// System.out.println(pagesource);

		// navigate is just from to
		// driver.navigate().to("https://iulms.edu.pk/login/index.php/");

//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
//
//		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class=\'inventory_list\']/div"));
//		System.out.println(webelements);
//
//		driver.navigate().to("https://www.sugarcrm.com/");
//		String windowhandle = driver.getWindowHandle();
//		System.out.println(windowhandle);
//
//		driver.findElement(By.xpath("/html/body/div[3]/main/section[4]/div/div/div[1]/a")).click();
//		Set<String> windowhandles = driver.getWindowHandles();
//		System.out.println(windowhandles);
//
//		// quit() close()
//		driver.close();
	}

}
