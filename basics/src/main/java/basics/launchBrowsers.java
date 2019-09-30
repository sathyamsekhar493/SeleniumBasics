package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchBrowsers {
	@Test
	public void LaunchBrowsers() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}

}
