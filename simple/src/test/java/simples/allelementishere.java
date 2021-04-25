package simples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class allelementishere {
	
	protected WebDriver driver;
	private By txt_UN = By.id("");
	
	
	public allelementishere(WebDriver driver) {
		this.driver = driver;
	}

	
	public void Enter_name_and_password(String username,String password) throws InterruptedException {
		driver.findElement(txt_UN).sendKeys(username);
		driver.findElement(txt_UN).sendKeys(password);
	}
	


}
