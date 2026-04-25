package s_02_tasks;

//1.Open the browser, 
//2.navigate to Demo Web Shop,
//3.Navigate to Login page, 
//4.check whether Remember Me checkbox is selected using isSelected().

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_16_Remember_Me_Checkbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");

		driver.findElement(By.linkText("Log in")).click();
		boolean remeberMeCheckbox = driver.findElement(By.id("RememberMe")).isSelected();
		System.out.println(remeberMeCheckbox);
	}
}
