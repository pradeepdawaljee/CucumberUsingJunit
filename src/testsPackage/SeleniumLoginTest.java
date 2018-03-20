package testsPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLoginTest {
	
	public static void main(String[] args) {
		
		String chromePath=System.getProperty("user.dir")+"/Drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver driver=new ChromeDriver();
		String url="https://app.ait.moolya.global";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		driver.findElement(By.name("userName")).sendKeys("pradeep.dawaljee@raksan.in");
		driver.findElement(By.name("Password")).sendKeys("MoolyaAdmin@123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		System.out.println("User logged in successfully");
	}

}
