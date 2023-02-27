package week4.day1.assignmentW4D1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions option=new ChromeOptions();
		option.addArguments("\"--disable-notifications\"");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//div[@class='x-panel-header']/a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//li/a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//input[@name='partyIdFrom']/following-sibling::a/img")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window=new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		//System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-partyId')])[1]/a")).click();
		driver.switchTo().window(window.get(0));
		driver.findElement(By.xpath("//input[@name='partyIdTo']/following-sibling::a/img")).click();
		Thread.sleep(2000);
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> window1=new ArrayList<String>(windowHandles1);
		driver.switchTo().window(window1.get(1));
		//System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-partyId')])[2]/a")).click();
		driver.switchTo().window(window.get(0));
		//System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		System.out.println("Current title of the Page : "+driver.getTitle());
		//driver.close();
		
		
		
	}

}
