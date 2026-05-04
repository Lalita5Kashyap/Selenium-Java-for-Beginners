package s_07_webelement_verification_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEV_03_IsEnabled {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement voteButton = driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
		System.out.println(voteButton.isEnabled());
	}
}
