package s_03_assignment;

//1.Open the browser
//2.Navigate to the this website https://demowebshop.tricentis.com/
//3.And click the login link 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class For_08_DemoWebShop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	}
}
