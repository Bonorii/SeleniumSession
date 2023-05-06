package Seleniumtrainingpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Support\\eclipse-workspace\\Seleniumtraining2\\Browserfolder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://netowsolutions.com/swadel/");
	}

}
