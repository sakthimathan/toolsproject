package firstweek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelRoom {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mathan\\eclipse-workspace\\seleniumPractices\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("sakthibalan");
		driver.findElement(By.name("password")).sendKeys("Sakthi@1997");
		driver.findElement(By.className("login_button")).click();
		Thread.sleep(3000);
		WebElement location = driver.findElement(By.id("location"));
		Select s=new Select(location);
		s.selectByValue("London");
		WebElement hotel = driver.findElement(By.name("hotels"));
		Select s1=new Select(hotel);
		s1.selectByValue("Hotel Sunshine");
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select s2=new Select(roomtype);
		s2.selectByValue("Super Deluxe");
		WebElement no = driver.findElement(By.id("room_nos"));
		Select s3=new Select(no);
		s3.selectByValue("2");
		Thread.sleep(2000);
		driver.findElement(By.id("datepick_in")).clear();
	    driver.findElement(By.id("datepick_in")).sendKeys("12/11/2022");
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("15/11/2022");
		WebElement adult = driver.findElement(By.id("adult_room"));
        Select s4=new Select(adult);
        s4.selectByValue("3");
        WebElement child = driver.findElement(By.id("child_room"));
        Select s5=new Select(child);
        s5.selectByValue("2");
        driver.findElement(By.id("Submit")).click();
        driver.findElement(By.id("radiobutton_0")).click();
        driver.findElement(By.name("continue")).click();
        driver.findElement(By.id("first_name")).sendKeys("mathan");
        driver.findElement(By.id("last_name")).sendKeys("siva");
        driver.findElement(By.name("address")).sendKeys("f2 eskay homes etti annal nagar poonamallee-614001");
        driver.findElement(By.id("cc_num")).sendKeys("2345908067894567");
        WebElement type = driver.findElement(By.id("cc_type"));
        Select s6=new Select(type);
        s6.selectByValue("VISA");
        WebElement exp = driver.findElement(By.id("cc_exp_month"));
		Select s7=new Select(exp);
		s7.selectByValue("7");
		WebElement exyear = driver.findElement(By.id("cc_exp_year"));
		Select s8=new Select(exyear);
		s8.selectByVisibleText("2022");
		driver.findElement(By.id("cc_cvv")).sendKeys("977");
		driver.findElement(By.className("reg_button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout")).click();
		
	}

}
