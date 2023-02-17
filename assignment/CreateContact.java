package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("(//div[@class='x-panel-header']/a)[3]")).click();
		driver.findElement(By.xpath("//li/a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Manikandan");
		driver.findElement(By.id("lastNameField")).sendKeys("Madhayan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Mani");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Ma");
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Manikandan@gmail.com");
		WebElement stateEle = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd=new Select(stateEle);
		dd.selectByVisibleText("New York");
		driver.findElement(By.xpath("//td/input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("//div/a[text()='Edit']")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Automation Testing");
		driver.findElement(By.xpath("//td/input[@class='smallSubmit']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();  
		
		
		
		
	}

}
