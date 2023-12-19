package adnadu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public ChromeDriver driver;
	@BeforeMethod
	public void precondition() {
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adnabu-arjun.myshopify.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
	@AfterMethod
	public void postcondition() {
		driver.close();
	}
}
