package s_02_tasks;

//1.Open the browser, 
//2.navigate to Demo Web Shop,
//3.click Register, 
//4.then get the page source and 
//5.check whether it contains the word Register.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_06_Click_Register {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();
		String pageSource = driver.getPageSource();
		if (pageSource.contains("Register")) {
			System.out.println("PageSource contains Register");
		} else {
			System.out.println("PageSource not contains Register");
		}
	}
}
