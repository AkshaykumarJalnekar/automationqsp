package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdGlobalglaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.globalglaze.in/");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_usernm")).sendKeys("rowdy");
		driver.findElement(By.id("adminpassword")).sendKeys("cr7");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_btn_go")).click();


	}

}
