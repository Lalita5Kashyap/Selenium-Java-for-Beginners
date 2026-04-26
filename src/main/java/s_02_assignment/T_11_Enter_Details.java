package s_02_assignment;

//1.Open the browser, 
//2.navigate to Demo Web Shop,
//3.Navigate to Register page, 
//4.enter details, 
//5.then get the title and 
//6.check whether it contains the word Register.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_11_Enter_Details {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");

		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Jenny");
		driver.findElement(By.id("LastName")).sendKeys("Frill");
		driver.findElement(By.id("Email")).sendKeys("jenny@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("JennyFrill");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("JennyFrill");

		String currentTitle = driver.getTitle();
		String word = "Register";
		if (currentTitle.endsWith(word)) {
			System.out.println("Url contains word Register");
		} else {
			System.out.println("Url not contains word Register");
		}
	}
}
