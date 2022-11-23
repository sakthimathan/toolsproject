package firstweek;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mathan\\eclipse-workspace\\seleniumPractices\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://commons.apache.org/proper/commons-io/download_io.cgi");

		TakesScreenshot ts= (TakesScreenshot) driver;
		File scer=ts.getScreenshotAs(OutputType.FILE);
		File desn=new File("C:\\Users\\mathan\\eclipse-workspace\\seleniumPractices\\screenshot",".png");
	    FileUtils.copyFile(scer, desn);
		
		
		
		
		
		
	}

}
