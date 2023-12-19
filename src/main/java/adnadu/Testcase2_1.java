package adnadu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testcase2_1 extends BaseClass {
	@Test
	public void runtestcase2_1(){

		driver.findElement(By.xpath("//span[text()='Catalog']")).click();
		WebElement filter = driver.findElement(By.id("FilterTags"));
		Select filtertags=new Select(filter);
		filtertags.selectByVisibleText("White Gold");
		List<WebElement> listofproducts = driver.findElements(By.xpath("//ul[@class='grid grid--uniform grid--view-items']"));
		for (WebElement productslist : listofproducts) {
			String productnames = productslist.getText();
			System.out.println(productnames);
			
		}
	
	}
}

