package tasks;

import org.openqa.selenium.By;

//1.Open the browser, 
//2.navigate to Demo Web Shop,
//3.Navigate to Login page, 
//4.enter email and password, 
//5.then refresh the page and 
//6.verify the fields are empty.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_07_Enter_Email_And_Password {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys("abc@gmail.com");
		WebElement password=driver.findElement(By.id("Password"));
		password.sendKeys("abc");
		Thread.sleep(5000);
		driver.navigate().refresh();
		// Get values after refresh
		String emailValue = email.getAttribute("value");
		String passwordValue = password.getAttribute("value");

		// Check if empty
		if(emailValue.isEmpty() && passwordValue.isEmpty()) {
		    System.out.println("Fields are empty");
		} else {
		    System.out.println("Fields are NOT empty");
		
		
		
	}
}
