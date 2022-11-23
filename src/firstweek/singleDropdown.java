package firstweek;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class singleDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathan\\eclipse-workspace\\seleniumPractices\\driver\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.google.com/search?q=gmil&rlz=1C1CHBD_enIN1027IN1027&oq=gmil&aqs=chrome..69i57j0i10i131i433i512l4j0i10i433i512j0i10i131i433i512l2j0i10i512j0i10i433i512.4747j0j7&sourceid=chrome&ie=UTF-8");
	
	driver.findElement(By.linkText("Create a Gmail account")).click();

	driver.findElement(By.xpath("//a[@class='action-button']")).click();
	
	  ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
    
      driver.switchTo().window(newTb.get(1));
	WebElement firs=driver.findElement(By.name("firstName"));
	firs.sendKeys("sakthi");
	
	WebElement last=driver.findElement(By.id("lastName"));
	last.sendKeys("balan");
	WebElement user=driver.findElement(By.id("username"));
	user.sendKeys("sakthi@11997");
		
			
	}
	

}
