package firstweek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hrm2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mathan\\eclipse-workspace\\seleniumPractices\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active'][1]")).sendKeys("Admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']/i[@class='oxd-icon bi-plus oxd-button-icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("siva");
		driver.findElement(By.name("middleName")).sendKeys(" ");
		driver.findElement(By.name("lastName")).sendKeys("kumar");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(9000);
        driver.findElement(By.className("oxd-select-text oxd-select-text--active")).click();

        
        
        
        
        
		
	}

}
