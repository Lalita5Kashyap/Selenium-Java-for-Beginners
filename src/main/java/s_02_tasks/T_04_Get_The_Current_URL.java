package s_02_tasks;

//1.Launch the browser, 
//2.open the website, 
//3.get the current URL, and 
//4.check whether it starts with https.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_04_Get_The_Current_URL {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		if (currenturl.startsWith("https")) {
			System.out.println("Url star with https");
		} else {
			System.out.println("Url star with https");
		}
	}
}
