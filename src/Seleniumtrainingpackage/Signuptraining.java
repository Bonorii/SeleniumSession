package Seleniumtrainingpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signuptraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting Property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Support\\eclipse-workspace\\Seleniumtraining2\\Browserfolder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netowsolutions.com/swadel/");
		// Element
		driver.findElement(By.cssSelector("#layout > div > header > div.header_1.cz_menu_fx_fade_in > div > div > div.elms_right.header_1_right > div.cz_elm.icon_header_1_right_4.inner_icon_header_1_right_2 > a > i")).click();
		
		driver.findElement(By.name("username")).sendKeys("nuke@yopmail.com");
		
		driver.findElement(By.id("password")).sendKeys("TestPassword213$");
		
		driver.findElement(By.name("login")).click();
	}
}
