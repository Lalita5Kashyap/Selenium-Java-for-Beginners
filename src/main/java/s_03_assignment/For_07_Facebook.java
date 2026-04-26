package s_03_assignment;

//1.Open the browser
//2.Navigate to the this website https://www.facebook.com/
//3.Enter your email and password (use the sendKeys() method to pass the value)

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class For_07_Facebook {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("lalita@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("lalita@123");
	}
}
