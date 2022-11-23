package firstweek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locaters {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mathan\\eclipse-workspace\\seleniumPractices\\driver\\chromedriver.exe");
		
		
		
		
       WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804944%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804944&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D1007810%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwzY2bBhB6EiwAPpUpZmMhoHXFrYJPEo9x23B-5sW7slgtknBSd4TpLogxkWKKm36Vf1NZahoCTccQAvD_BwE");

		driver.manage().window().maximize();
		
		WebElement firstname =driver.findElement(By.name("firstname"));
		firstname.sendKeys("sakthi");
		WebElement lastname=driver.findElement(By.name("lastname"));
		lastname.sendKeys("balan");
		WebElement regemail=driver.findElement(By.name("reg_email__"));
		regemail.sendKeys("7639558167");
		WebElement password= driver.findElement(By.id("password_step_input"));
		password.sendKeys("123456789");
		Thread.sleep(2000);

		WebElement date=driver.findElement(By.id("day"));
		date.sendKeys("26");
		WebElement month=driver.findElement(By.id("month"));
		month.sendKeys("07");
		WebElement year=driver.findElement(By.id("year"));
		year.sendKeys("1997");
		WebElement gender=driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/label[text()='Male']"));
		gender.isSelected();
		gender.click();
		WebElement submit=driver.findElement(By.name("websubmit"));
		submit.click();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
