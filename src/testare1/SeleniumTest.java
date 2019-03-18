package testare1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	 public static void main(String[] args) {
		 String driverPath = "C:\\Users\\vtamazlicari\\Desktop/chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", driverPath);
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 driver.findElement(By.id("email")).sendKeys("yourEmailId");
		 driver.findElement(By.name("pass")).sendKeys("yourPassword");
		 driver.findElement(By.id("u_0_2")).click();
	 }
}
