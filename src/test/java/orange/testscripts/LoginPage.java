package orange.testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import orange.locators.LoginObjects;

public class LoginPage {
	WebDriver driver;

	@Test
	public void loginScenario() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		LoginObjects.username(driver).sendKeys("Admin");
		LoginObjects.password(driver).sendKeys("admin123");
		LoginObjects.loginBtn(driver).click();

	}

}
