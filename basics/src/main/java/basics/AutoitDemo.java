package basics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoitDemo {

	@Test
	public void autoItDemo() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get(System.getProperty("user.dir") + "//html//autoit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("input_8")).click();

		Runtime.getRuntime().exec("G:\\somu\\autoIt\\Resume.exe");
	}

}
