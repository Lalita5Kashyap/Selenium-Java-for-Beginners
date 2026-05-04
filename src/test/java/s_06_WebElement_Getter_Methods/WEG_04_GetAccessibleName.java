package s_06_webelement_getter_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEG_04_GetAccessibleName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement electronicsmenu = driver.findElement(By.xpath("(//a[contains(@href,'electronics')])[1]"));
		System.out.println(electronicsmenu.getAccessibleName());
	}
}
