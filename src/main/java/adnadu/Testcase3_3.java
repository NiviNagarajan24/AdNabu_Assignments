package adnadu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testcase3_3 extends BaseClass {
	@Test
	public void runtestcase3_3(){
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
				driver.findElement(By.linkText("Continue shopping")).click();
				//Adding one more product
				WebElement newfilter = driver.findElement(By.id("FilterTags"));
				Select newfiltertags=new Select(newfilter);
				newfiltertags.selectByVisibleText("dd");
				List<WebElement> newlistofproducts = driver.findElements(By.xpath("//ul[@class='grid grid--uniform grid--view-items']"));
				for (WebElement newproductslist : newlistofproducts) {
					String newproductnames = newproductslist.getText();
					System.out.println(newproductnames);
					driver.findElement(By.xpath("//li[@class='grid__item grid__item--collection-template small--one-half medium-up--one-quarter']")).click();
					driver.findElement(By.name("add")).click();
					//updated cart by multiple products
					List<WebElement> newaddtocart = driver.findElements(By.xpath("//tr[@class='cart__row border-bottom line1 border-top']"));
					for (WebElement newcartproduct : newaddtocart) {
						String newaddtocartproduct = newcartproduct.getText();
						System.out.println("NewAddcart="+newaddtocartproduct);

					}

				}
			}
		}

	}
}