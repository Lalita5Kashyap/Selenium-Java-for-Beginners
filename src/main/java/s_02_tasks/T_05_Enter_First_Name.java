package s_02_tasks;

//1.Open the browser, 
//2.navigate to Demo Web Shop,
//3.click on Register link
//4.enter First Name, 
//5.then clear the text and 
//6.enter another name.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_05_Enter_First_Name {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("abcd");
		Thread.sleep(5000);
		firstName.clear();
		Thread.sleep(5000);
		firstName.sendKeys("Lalita");
	}
}
