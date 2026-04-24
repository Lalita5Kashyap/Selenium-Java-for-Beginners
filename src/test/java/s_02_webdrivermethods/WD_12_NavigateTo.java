package s_02_webdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD_12_NavigateTo {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");

		// navigate to url using to(URL url)
		// URL url= new URL("https://demowebshop.tricentis.com");//deprecated
		// driver.navigate().to(url);

		// driver.navigate().back();
		// driver.navigate().forward();

		driver.navigate().refresh();
	}
}
