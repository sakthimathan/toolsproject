package firstweek;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProject {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mathan\\eclipse-workspace\\seleniumPractices\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("sakthi");
		driver.findElement(By.name("middleName")).sendKeys(" ");
		driver.findElement(By.name("lastName")).sendKeys("balan");
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("5998");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active']/div[@class='oxd-select-text-input'])[1]")).click();
		
	
		
		
		
	}

}
