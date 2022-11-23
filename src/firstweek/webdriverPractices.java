package firstweek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverPractices {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mathan\\eclipse-workspace\\seleniumPractices\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().forward();
		driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		driver.navigate().back();
		driver.close();
		
		
		
	}

}
