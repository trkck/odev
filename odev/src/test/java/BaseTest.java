
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import odev.PracticeFormPage;

public class BaseTest {
	// bunun iþi driver'ý (chrome) baþlatmak ve o sayfayý baþlatmak bunu da en öncelikle yapýlmasý lazým
	// bu nedenle @BeforeAll kullanacaðýz
	
	private static final Logger logger = LogManager.getLogger();
	protected static WebDriver driver;
	
	public static PracticeFormPage practiceFormPage;
	
	
	@BeforeAll
	public static void setup() { 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tarik\\eclipse\\F.A.JDBC.Eðitim\\odev\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gittigidiyor.com/uye-girisi?s=1");
		logger.fatal("site anasayfasýna eriþim saðlandý.");
		practiceFormPage = new PracticeFormPage(driver);
		
		
	
			
	}
	
	@AfterAll
	public static void tearDown() {
		
		
		
		
		//driver.quit();
	}
	
	

}
