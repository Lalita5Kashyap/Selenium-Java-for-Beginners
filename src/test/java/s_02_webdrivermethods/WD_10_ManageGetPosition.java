package s_02_webdrivermethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD_10_ManageGetPosition {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Point getposi = driver.manage().window().getPosition();
		System.out.println(getposi);
		System.out.println(getposi.getX());
		System.out.println(getposi.getY());
	}
}
