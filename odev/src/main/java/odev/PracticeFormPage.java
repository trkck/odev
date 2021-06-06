package odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage {
	
		
private WebDriver driver;

private final By email = By.id("L-UserNameField");

private final By password = By.id("L-PasswordField");
	
private final By buton = By.id("gg-login-enter");







public PracticeFormPage(WebDriver driver) {
	
	this.driver = driver;
}

	public void setEmail() {
		WebElement login = driver.findElement(email);
		login.click();
		login.sendKeys("trk.kck95@gmail.com");
	}
		
	public void setPassword() {
		
		WebElement nameSpace = driver.findElement(password);
		nameSpace.click();
		nameSpace.sendKeys("tarik123");
		
		
	}
	
	public void clic() {
		
		WebElement nameSpace = driver.findElement(buton);
		nameSpace.click();
		
		 
		
	}
	
	
	 
	
	
}
