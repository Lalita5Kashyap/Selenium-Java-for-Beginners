package s_02_tasks;

//1.Open the browser, 
//2.navigate to Demo Web Shop,
//3.click on Books, 
//4.then use navigate().back() and 
//5.verify you returned to the home page.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_08_Click_On_Books {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");
		String homePageurl = driver.getCurrentUrl();

		driver.findElement(By.linkText("Books")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		String afterRefreshHomePageurl = driver.getCurrentUrl();
		if (afterRefreshHomePageurl.equals(homePageurl)) {
			System.out.println("User return to home page ");
		} else {
			System.out.println("User not return to home page ");
		}
	}
}
