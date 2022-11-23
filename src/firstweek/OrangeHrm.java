package firstweek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mathan\\eclipse-workspace\\seleniumPractices\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active'][1]")).sendKeys("Admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']/i[@class='oxd-icon bi-plus oxd-button-icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("siva");
		driver.findElement(By.name("middleName")).sendKeys(" ");
		driver.findElement(By.name("lastName")).sendKeys("kumar");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("0977");
		driver.findElement(By.xpath(" //button[@type='submit']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']/i[@class='oxd-icon bi-plus oxd-button-icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("aravind");
		driver.findElement(By.name("middleName")).sendKeys(" ");
		driver.findElement(By.name("lastName")).sendKeys("krishnan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("0099");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
