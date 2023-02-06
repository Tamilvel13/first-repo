ackage org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				driver.get("https://www.redbus.in/");
				driver.manage().window().maximize();
		
				WebElement findElement = driver.findElement(By.id("src"));
				findElement.sendKeys("trichy");
		

				}}
