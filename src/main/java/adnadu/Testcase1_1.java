package adnadu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase1_1 extends BaseClass{
	@Test
	public void runtestcase1_1(){

		driver.findElement(By.xpath("//form[@class='search-header search']")).click();
		driver.findElement(By.xpath("//input[@class='search-header__input search__input']")).sendKeys("Rose Gold", Keys.ENTER);
		List<WebElement> listofproducts = driver.findElements(By.xpath("//ul[@class='grid grid--uniform grid--view-items']"));
		for (WebElement productslist : listofproducts) {
			String productnames = productslist.getText();
			System.out.println(productnames);
		}
	}
}

