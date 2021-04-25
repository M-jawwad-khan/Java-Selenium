package ui;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.edge.driver","C:\\Web_Driver\\msedgedriver.exe" );
				WebDriverManager.firefoxdriver().setup();
				//WebDriverManager.edgedriver().setup();
				//WebDriverManager.chromedriver().setup();
				//EdgeDriver Driver=new EdgeDriver();
			    FirefoxDriver driver = new FirefoxDriver();
			    driver.get("https://iulms.edu.pk/login/index.php");
			    System.out.println(driver.getTitle());
			    WebElement id =driver.findElement(By.id("username"));
			    WebElement pass =driver.findElement(By.id("password"));
			    id.clear();
			    pass.clear();
			    id.sendKeys("42891");
			    pass.sendKeys("chunni123");
			    driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[2]/div/div/div/div[1]/div[1]/form/div/div[5]/input[2]")).click();
			    
			    Set<String> firstwindow = driver.getWindowHandles();
			    System.out.println(firstwindow);
			    Iterator<String> itr = firstwindow.iterator();
			    String iulms = itr.next();
//			    String iulmsopen = itr.next();
			    
			    driver.switchTo().window(iulms);
			    System.out.println(driver.getTitle());
			    driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/ul/li[2]/a")).click();
			    driver.switchTo().window(iulms);
			    Set<String> windowhandles =  driver.getWindowHandles(); 
			   System.out.println(windowhandles);
//			    Driver.get("https://www.google.com/search?client=firefox-b-d&q=gmail");
//			    Driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/div[1]/a")).click();
//			    Thread.sleep(2000);
//			    Set<String> we = Driver.getWindowHandles();
//			    System.out.println(we);
//			    Iterator<String> itr = we.iterator();
//			    String parent = itr.next();
//			    String child = itr.next();
//			    
//			    Driver.switchTo().window(child);
//			    System.out.println(Driver.getTitle());
//			    Driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("lala");
//			    
//			    Driver.switchTo().window(parent);
//			   Set<String> windowhandles =  Driver.getWindowHandles();
//			   

//			   System.out.println(windowhandles);
//			   Iterator<String> iterator = windowhandles.iterator();
//			   String parentwindow = iterator.next();
//			   String ChildWindow = iterator.next();
//			   
//			   System.out.println(ChildWindow);
//			   
//			   Driver.switchTo().window(ChildWindow);
//			   Driver.findElement(By.id("UserFirstName-vuDp")).sendKeys("khan");
//			   Driver.switchTo().window(parentwindow);
			  
			   
	}

}
