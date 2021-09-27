package WebDriverMethods1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/Html/Checkbox.html");
			String GetPageSource=driver.getPageSource();
			System.out.println(GetPageSource);
			driver.close();
	}

}
