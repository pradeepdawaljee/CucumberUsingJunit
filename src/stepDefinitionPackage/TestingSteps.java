package stepDefinitionPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestingSteps {
	
	WebDriver driver;
	
	@Given("^User is on the Home Page$")
	public void user_is_on_the_Home_Page(){
	    
		String chromePath=System.getProperty("user.dir")+"/Drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver=new ChromeDriver();
		String url="https://app.ait.moolya.global";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}

	@When("^Entered valid username$")
	public void entered_valid_username(){
	    
		driver.findElement(By.name("userName")).sendKeys("pradeep.dawaljee@raksan.in");
	    
	}

	@When("^Entered valid password$")
	public void entered_valid_password(){
	    
		driver.findElement(By.name("Password")).sendKeys("MoolyaAdmin@123");
	}

	@When("^Clicks on login button$")
	public void clicks_on_login_button(){
	    
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	}

	@Then("^Should display Successful Login message or Landing screen$")
	public void should_display_Successful_Login_message_or_Landing_screen(){
	    
		System.out.println("User logged in successfully");
	}
	
/*	@Given("^User is on the Home Page$")
	public void user_is_on_the_Home_Page(){
	    
		String chromePath=System.getProperty("user.dir")+"/Drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver=new ChromeDriver();
		String url="https://app.ait.moolya.global";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}

	@When("^Entered valid username$")
	public void entered_valid_username(){
	    
		driver.findElement(By.name("userName")).sendKeys("pradeep.dawaljee@raksan.in");
	}

	@When("^Entered valid password$")
	public void entered_valid_password(){
		driver.findElement(By.name("Password")).sendKeys("MoolyaAdmin@123");
	    
	}

	@When("^Clicks on login button$")
	public void clicks_on_login_button(){
	    
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	}

	@Then("^Should display Successful Login message or Landing screen$")
	public void should_display_Successful_Login_message_or_Landing_screen(){
	    
		System.out.println("User logged in successfully");
	}

	@When("^Entered Invalid username$")
	public void entered_Invalid_username(){
	    
		driver.findElement(By.name("userName")).sendKeys("jdsbfhbjn");
	}

	@When("^Entered Invalid password$")
	public void entered_Invalid_password(){
		driver.findElement(By.name("Password")).sendKeys("rrtytyr");
	    
	}

	@Then("^Should display Error message$")
	public void should_display_Error_message(){
	    System.out.println("Check Error message");
	    
	}
*/
	
	
	
}
