package adnadu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestCase1_2 extends BaseClass{
	@Test
	public void runtestcase1_2(){


		driver.findElement(By.xpath("//form[@class='search-header search']")).click();
		driver.findElement(By.xpath("//input[@class='search-header__input search__input']")).sendKeys("cars", Keys.ENTER);
		String invalidmessage=driver.findElement(By.xpath("//p[text()='Please try a different search term or go back to the ']")).getText();
		System.out.println(invalidmessage);
	}
}
