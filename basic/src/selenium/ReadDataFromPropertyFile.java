package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Sel_Drivers\\selenium\\drivers\\chromedriver.exe");
		File file = new File("E:\\maven\\basic\\Configuration\\config.properties");

		FileInputStream fileInput = new FileInputStream(file);

		Properties prop = new Properties();

		prop.load(fileInput);

		WebDriver driver = new ChromeDriver();

		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

}
