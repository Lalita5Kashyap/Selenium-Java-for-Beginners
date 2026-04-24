package s_02_webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD_07_Manage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// minimize the browser
		driver.manage().window().minimize();

		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		// fullscreen of the window
		driver.manage().window().fullscreen();
		// driver.close();
	}
}
