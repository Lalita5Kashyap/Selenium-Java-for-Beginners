package s_03_assignment;

//Your should only use the name locator”
//1.Launch the browser.
//2.Navigate to the https://demowebshop.tricentis.com/ 
//3.You have to locate the newsletter text area.
//4.Enter some value.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class For_02_Name_Locator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.name("NewsletterEmail")).sendKeys("phone");
	}
}
