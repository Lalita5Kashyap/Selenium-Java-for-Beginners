package s_03_assignment;

//You should only use the ID”
//1.Launch the browser 
//2.Navigate to https://shopperstack.com/suer-signin 
//3.Enter username and password. (Locate the username and password field then you have to pass the values) with the help of sendKeys() method

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class For_01_Id_Locator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/user-signin");
		Thread.sleep(7000);
		driver.findElement(By.id("Email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abcdabcd");
	}
}
