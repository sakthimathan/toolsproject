package firstweek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathan\\eclipse-workspace\\seleniumPractices\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://letcode.in/table");
		System.out.println("--------***ALL Data***-------");
		List<WebElement> AllData = driver.findElements(By.xpath("(//table)[2]/tbody/tr/td"));
		for (WebElement all : AllData) {
			System.out.println(all.getText());
			
		}
		System.out.println("-------***Singel Row-Data***--------");
		List<WebElement> rowdata = driver.findElements(By.xpath("(//table)[2]/tbody/tr[3]/td"));
		for (WebElement row : rowdata) {
			System.out.println(row.getText());
		}
		System.out.println("------***Singel Col-Data***---------");
		List<WebElement> colu = driver.findElements(By.xpath("(//table)[3]/tr/td[1]"));
		for (WebElement col : colu) {
			System.out.println(col.getText());	
		} 
		System.out.println("------***Singel-Data***-------");
		List<WebElement> sing = driver.findElements(By.xpath("(//table)[3]/tr[4]/td[3]"));
		for (WebElement one : sing) {
			System.out.println(one.getText());
		}
		
	}

}
