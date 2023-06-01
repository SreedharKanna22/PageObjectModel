package orange.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginObjects {

	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@placeholder='Username']"));
	}

	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.name("password"));
	}

	public static WebElement loginBtn(WebDriver driver) {
		return driver.findElement(By.cssSelector("button[type='submit']"));
	}

}
