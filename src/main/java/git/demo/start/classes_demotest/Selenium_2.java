package git.demo.start.classes_demotest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUBHAM\\Desktop\\Selenium & Jave Notes and detail\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SUBHAM\\Desktop\\Selenium & Jave Notes and detail\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		//driver.findElement(By.id("username")).sendKeys("User");
		//driver.findElement(By.id("password")).sendKeys("123456");
		
		
		//driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("User");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("123456");
		driver.findElement(By.cssSelector("#Login")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		
		
		
		
		
		//System.out.println(driver.getPageSource());
		//driver.navigate().to("https//www.fb.com");
		//driver.navigate().back();
		//driver.close();
		//driver.quit();	
		
		
		
	}

}
