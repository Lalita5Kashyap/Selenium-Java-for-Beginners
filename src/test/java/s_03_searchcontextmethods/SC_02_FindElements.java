package s_03_searchcontextmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SC_02_FindElements {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		for (WebElement alltext : alllinks) {
			System.out.println(alltext.getText());
		}
	}
}
