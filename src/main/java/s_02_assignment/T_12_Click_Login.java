package s_02_assignment;

//1.Open the browser, 
//2.navigate to Demo Web Shop,
//3.click Login, 
//4.then use navigate().forward() after going back.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_12_Click_Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");

		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
	}
}
