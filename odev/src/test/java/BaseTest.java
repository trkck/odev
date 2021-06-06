
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import odev.PracticeFormPage;

public class BaseTest {
	// bunun i�i driver'� (chrome) ba�latmak ve o sayfay� ba�latmak bunu da en �ncelikle yap�lmas� laz�m
	// bu nedenle @BeforeAll kullanaca��z
	
	private static final Logger logger = LogManager.getLogger();
	protected static WebDriver driver;
	
	public static PracticeFormPage practiceFormPage;
	
	
	@BeforeAll
	public static void setup() { 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tarik\\eclipse\\F.A.JDBC.E�itim\\odev\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gittigidiyor.com/uye-girisi?s=1");
		logger.fatal("site anasayfas�na eri�im sa�land�.");
		practiceFormPage = new PracticeFormPage(driver);
		
		
	
			
	}
	
	@AfterAll
	public static void tearDown() {
		
		
		
		
		//driver.quit();
	}
	
	

}
