package s_02_assignment;

//1.Open the browser, 
//2.navigate to Demo Web Shop,
//3.print title, 
//4.close browser, 
//5.then try to print title again.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_20_PrintTitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");

		System.out.println(driver.getTitle());
		driver.close();
		System.out.println(driver.getTitle());
	}
}
