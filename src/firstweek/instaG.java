package firstweek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instaG {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\mathan\\\\eclipse-workspace\\\\seleniumPractices\\\\driver\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		WebElement sing=driver.findElement(By.xpath("//span[text()='Sign up']"));
		sing.click();
		Thread.sleep(2000);
		WebElement phone=driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
		phone.sendKeys("7639556167");
		WebElement name=driver.findElement(By.xpath("//input[@name='fullName']"));
		name.sendKeys("sakthi");
		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("Sask123@");
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("Sakk@11");
		WebElement singi=driver.findElement(By.xpath("//button[text()='Sign up']"));
		singi.click();
		
		
	}

}
