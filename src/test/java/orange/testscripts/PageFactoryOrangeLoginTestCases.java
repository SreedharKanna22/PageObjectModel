package orange.testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import orange.locators.LoginObjects;
import orange.locators.PageFactoryOrangeLoginLocators;

public class PageFactoryOrangeLoginTestCases {

	@Test
	public void browserLaunch() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		PageFactory.initElements(driver, PageFactoryOrangeLoginLocators.class);

		PageFactoryOrangeLoginLocators.username.sendKeys("Admin");
		PageFactoryOrangeLoginLocators.password.sendKeys("admin123");
		PageFactoryOrangeLoginLocators.loginBtn.click();

	}

}
