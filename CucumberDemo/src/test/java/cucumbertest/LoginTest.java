package cucumbertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com");

		driver.manage().window().maximize();
		WebElement uName = driver.findElement(By.id("username"));
		uName.sendKeys("Anusha10");
		driver.findElement(By.id("password")).sendKeys("Anusha10");
		driver.findElement(By.cssSelector("input#login")).click();
	}

}
