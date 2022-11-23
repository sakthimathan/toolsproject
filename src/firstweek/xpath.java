package firstweek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\mathan\\\\eclipse-workspace\\\\seleniumPractices\\\\driver\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement name=driver.findElement(By.id("email"));
		name.sendKeys("mmathan101@gmail.com");
		
		WebElement passs=driver.findElement(By.name("pass"));
		passs.sendKeys("Sak@123");
		WebElement log=driver.findElement(By.xpath("//button[@type='submit']"));
		log.click();
		WebElement mess=driver.findElement(By.xpath("//div[@role='button'][2]"));
		mess.click();
		
		
		
		
		
	}

}
