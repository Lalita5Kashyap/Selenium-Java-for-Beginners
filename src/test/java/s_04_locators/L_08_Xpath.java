package s_04_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_08_Xpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//Absolute xpath
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		
		//Relative xpath By Attribute
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().alert().accept();
		
		//Relative xpath By TextFunction
		driver.get("https://www.instagram.com/?hl=en");
		driver.findElement(By.xpath("//span[text()='Forgot password?']")).click();
		
		//Relative xpath By Contains
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[contains(@id,'small')]")).sendKeys("How are you!");
		
		//Relative xpath By Multiple Attribute
		
		
	}
}
