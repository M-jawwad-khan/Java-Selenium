package simples;

import org.openqa.selenium.WebDriver;

public class calllingvariable {
	WebDriver driver = null;
	allelementishere calling;
	
	
	public void calling(String name,String pass) throws InterruptedException {
		calling = new allelementishere(driver);
		calling.Enter_name_and_password(name, pass);
	}
	

}
