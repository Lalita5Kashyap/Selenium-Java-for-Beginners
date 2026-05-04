package s_05_webelement_actions_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WE_04_Submit {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement searchField = driver.findElement(By.xpath("//input[starts-with(@class,'search')]"));
		searchField.sendKeys("computer");
		searchField.submit();
	}
}
