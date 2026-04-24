package s_02_webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD_13_GetWindowHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");

		// Store the value and print
		String win = driver.getWindowHandle();
		System.out.println(win);

		// or direct print
		// System.out.println(driver.getWindowHandle());
	}
}
