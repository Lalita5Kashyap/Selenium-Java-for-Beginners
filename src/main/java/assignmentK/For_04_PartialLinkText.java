package assignmentK;

//---> partialLinkText()
//		open the browser
//		navigate to the demo web shop
//		then click on this product “Build your own cheap computer”

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class For_04_PartialLinkText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Build your own")).click();
	}
}
