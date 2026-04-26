package s_02_assignment;

//1.Open the browser, 
//2.navigate to Demo Web Shop,
//3.wait for 2 seconds, 
//4.then close the browser using close().

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_10_Wait_For_2_Seconds {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");

		Thread.sleep(2000);
		driver.close();
	}
}
