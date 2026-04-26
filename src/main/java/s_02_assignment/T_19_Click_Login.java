package s_02_assignment;

//1.Open the browser, 
//2.navigate to Demo Web Shop,
//3.click Login, 
//4.then use navigate().refresh() and 
//5.verify the page title remains the same.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_19_Click_Login {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");
		String pageTitle = driver.getTitle();

		driver.findElement(By.linkText("Log in")).click();
		driver.navigate().refresh();
		String refreshTitle = driver.getTitle();
		if (refreshTitle.equals(pageTitle)) {
			System.out.println("Page title remain same after refresh");
		} else {
			System.out.println("Page title is different after refresh");
		}
	}
}
