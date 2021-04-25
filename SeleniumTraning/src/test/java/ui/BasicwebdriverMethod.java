package ui;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicwebdriverMethod {
	public static String browser = "Firefox";
	public static WebDriver driver;

	// public static ChromeDriver driver;
	// public static FirefoxDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// InterFace Driver

		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		// get (url) open the current url
		driver.get("https://www.saucedemo.com/");

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

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class=\'inventory_list\']/div"));
		System.out.println(webelements);

		driver.navigate().to("https://www.sugarcrm.com/");
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);

		driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div/nav/div[1]/ul/li[8]/a")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);

		// quit() close()
		driver.close();
	}

}
