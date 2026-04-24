package s_02_webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD_15_SwitchT0_Windows_Tabs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");
		String parent = driver.getWindowHandle();
		System.out.println(parent);

		driver.findElement(By.linkText("Facebook")).click();

		Set<String> wins = driver.getWindowHandles();
		for (String tabs : wins) {
			System.out.println(tabs);
			if (!tabs.equals(parent)) {
				driver.switchTo().window(tabs);
			}
		}
		Thread.sleep(5000);
		driver.switchTo().window(parent);
	}
}
