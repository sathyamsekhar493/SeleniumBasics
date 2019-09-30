package selenium;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class databasedemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {

		System.setProperty("webdriver.chrome.driver", "F:\\Sel_Drivers\\selenium\\drivers\\chromedriver.exe");

		String Connectionurl = "jdbc:sqlserver://localhost:1433;DatabaseName=crmpro;instance=DESKTOP-HHSPART;encrypt=true;TrustServerCertificate=true;";

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		Connection conn = DriverManager.getConnection(Connectionurl, "sa", "123456789");

		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT * FROM login");
		while (rs.next()) {
			String username = rs.getString(1);
			String password = rs.getString(2);

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.crmpro.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);

			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			Files.copy(src, new File("E:\\maven\\basic\\Screenshots\\Login.png"));
			
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			


		}

		conn.close();
	}
}
