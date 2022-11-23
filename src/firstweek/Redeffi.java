package firstweek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Redeffi {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\mathan\\\\eclipse-workspace\\\\seleniumPractices\\\\driver\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		Thread.sleep(3000);
		WebElement Day=driver.findElement(By.xpath("//select[contains(@name, 'DOB_Day')]"));
		Select s=new Select(Day);
		s.selectByValue("26");
		WebElement month = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Month')]"));
		Select s1=new Select(month);
		s1.selectByIndex(7);
		WebElement year = driver.findElement(By.xpath("//select[contains(@name, 'DOB_Year')]"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1997");

	}}
