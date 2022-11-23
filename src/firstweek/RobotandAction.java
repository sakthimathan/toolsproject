package firstweek;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotandAction {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathan\\eclipse-workspace\\seleniumPractices\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Actions ac=new Actions(driver);
		Robot rc=new Robot();
		
		WebElement mob = driver.findElement(By.linkText("Mobiles"));
		ac.contextClick(mob).perform();
		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);
		
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
	}
 
	

}
