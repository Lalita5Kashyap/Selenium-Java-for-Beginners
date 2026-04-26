package s_02_assignment;

//1.Open the browser, 
//2.navigate to Demo Web Shop, 
//3.print the title, 
//4.then refresh the page and 
//5.print the title again.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_01_Print_TheTitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
	}
}
