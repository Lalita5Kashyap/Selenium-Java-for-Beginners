package s_07_webelement_verification_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEV_01_IsDisplayed {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://x.com/");

		WebElement text = driver.findElement(By.xpath("//span[text()='Happening now']"));
		System.out.println(text.isDisplayed());
	}
}
