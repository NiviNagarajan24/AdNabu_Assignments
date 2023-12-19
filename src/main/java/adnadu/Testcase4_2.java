package adnadu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testcase4_2 extends BaseClass {
	@Test
	public void runtestcase4_2(){
		driver.findElement(By.xpath("//span[text()='Catalog']")).click();
		WebElement filter = driver.findElement(By.id("FilterTags"));
		Select filtertags=new Select(filter);
		filtertags.selectByVisibleText("White Gold");
		List<WebElement> listofproducts = driver.findElements(By.xpath("//ul[@class='grid grid--uniform grid--view-items']"));
		for (WebElement productslist : listofproducts) {
			String productnames = productslist.getText();
			System.out.println(productnames);
			//Adding to the cart
			driver.findElement(By.xpath("//li[@class='grid__item grid__item--collection-template small--one-half medium-up--one-quarter'][2]")).click();
			driver.findElement(By.name("add")).click();
			List<WebElement> addtocart = driver.findElements(By.xpath("//tr[@class='cart__row border-bottom line1 border-top']"));
			for (WebElement cartproduct : addtocart) {
				String addtocartproduct = cartproduct.getText();
				System.out.println("Addcart="+addtocartproduct);
				//Decreasing the quantity of products
				WebElement quantity= driver.findElement(By.xpath("//input[@class='cart__qty-input']"));
				quantity.click();
				quantity.clear();
				quantity.sendKeys("0");
				driver.findElement(By.xpath("//input[@name='update']")).click();
				String emptycart=driver.findElement(By.xpath("//p[text()='Your cart is currently empty.']")).getText();
				System.out.println(emptycart);


			}
		}
	}
}
