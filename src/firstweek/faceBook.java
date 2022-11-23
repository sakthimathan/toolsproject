package firstweek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class faceBook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\mathan\\\\eclipse-workspace\\\\seleniumPractices\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("sakthi");
		driver.findElement(By.name("lastname")).sendKeys("balan");
		driver.findElement(By.name("reg_email__")).sendKeys("7639558167");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Sakthi@12");
		WebElement day=driver.findElement(By.xpath("//select[@title='Day']"));
		Select s=new Select(day);
		s.selectByValue("26");
		 WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		s1.selectByIndex(7);
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1998");
		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/label[text()='Male']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}

}
