package s_02_tasks;

//1.Open the browser, 
//2.navigate to Demo Web Shop,
//3.click on login link
//4.then go back and 
//5.verify the URL contains demowebshop.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_02_Go_Back {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		String url = driver.getCurrentUrl();
		if (url.contains("demowebshop")) {
			System.out.println("Verified, The URL contains demowebshop.");
		} else {
			System.out.println("Url not contains demowebshop");
		}
	}
}
