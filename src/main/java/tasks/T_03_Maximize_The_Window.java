package tasks;

//1.Open Demo Web Shop, 
//2.maximize the window, 
//3.then minimize the window after 3 seconds.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_03_Maximize_The_Window {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
	}
}
