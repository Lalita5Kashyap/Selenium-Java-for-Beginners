package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_03_LaunchEaseMyTrip {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		// System.out.println("Title: " +driver.getTitle());
		// System.out.println("Current url: s" +driver.getCurrentUrl());
		driver.close();
	}
}
