package week6.day1.assignmentservice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.sukgu.Shadow;

public class BaseClass {
	public ChromeDriver driver;
	@BeforeMethod
	public void precon() {
		// TODO Auto-generated method stub
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*","--disable-notifications");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://dev57841.service-now.com/");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Srivatsan@12");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Shadow shadow=new Shadow(driver);
		shadow.setImplicitWait(20);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//span[text()='Incidents']").click();
		shadow.setImplicitWait(5);
		WebElement findElementByXPath = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(findElementByXPath);

		

	}
	@AfterMethod
	public void postcon() {
		// TODO Auto-generated method stub
		driver.close();
		

	}

}
