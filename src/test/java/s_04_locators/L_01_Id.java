package s_04_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_01_Id {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/user-signin");
		Thread.sleep(7000);
		driver.findElement(By.id("Email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abcdabcd");
	}
}
