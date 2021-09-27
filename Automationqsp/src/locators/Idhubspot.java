package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idhubspot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login?__cf_chl_jschl_tk__=pmd_qt91ButrT6S8EpXUkE6.R2df9hT9mTmoRimBpxZsexI-1632749236-0-gqNtZGzNAhCjcnBszQrR");
		driver.findElement(By.id("username")).sendKeys("rowdyhero");
		driver.findElement(By.id("password")).sendKeys("cr7");
		driver.findElement(By.id("password-login-button")).click();

	}

}
