package s_07_webelement_verification_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEV_02_IsSelected {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement poll = driver.findElement(By.xpath("//div[@id='poll-block-1']"));
		System.out.println(poll.isSelected());
	}
}
