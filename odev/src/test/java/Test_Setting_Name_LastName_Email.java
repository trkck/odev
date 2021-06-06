


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;

import odev.PracticeFormPage;

public class Test_Setting_Name_LastName_Email extends BaseTest {
	Logger logger = LogManager.getLogger();
	PracticeFormPage practiceFormPage = new PracticeFormPage(driver);

	
	
	
	  @Test public void setEmail() { 
		  
		  practiceFormPage.setEmail();
		  
			  
	      practiceFormPage.setPassword();
	      
	      
	      practiceFormPage.clic();
	      
	      logger.warn("siteye login olundu.");
	      
	      
	  
	  }
	 
	
	
	
	
	
	

}
