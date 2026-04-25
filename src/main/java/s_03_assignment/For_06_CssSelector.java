package s_03_assignment;

//--->CssSelector();
//		open the browser
//		navigate to the demo web shop
//		click one the Add to cart button for virtual gift card

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class For_06_CssSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");

		driver.findElement(By.cssSelector("[class=\"button-2 product-box-add-to-cart-button\"]")).click();
	}
}
