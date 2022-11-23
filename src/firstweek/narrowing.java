package firstweek;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class narrowing {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathan\\eclipse-workspace\\seleniumPractices\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
        
       WebElement ins=driver.findElement(By.xpath("//a[text()='Fulfilment by Amazon']"));                    
        JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ins);
		driver.findElement(By.linkText("Fulfilment by Amazon")).click();
		Thread.sleep(2000);
		WebElement sell = driver.findElement(By.linkText("Sell Online"));
		sell.isSelected();
        WebElement option = driver.findElement(By.linkText("Requirements to Sell"));
		option.click();
		
		//js.executeScript("arguments[0].scrollIntoview(true)", sell);
		
		
		
		
		
		
		
		
	}

}
