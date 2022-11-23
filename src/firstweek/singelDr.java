package firstweek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class singelDr {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\mathan\\\\eclipse-workspace\\\\seleniumPractices\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.name("firstName")).sendKeys("sakthi");
		
		
		
	}

}
