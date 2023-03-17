package week6.day1.assignmentservice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class AssignIns extends BaseClass {
	@Test(priority=2)
	public void assignin() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//span/following-sibling::input")).sendKeys("INC0010124",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='checkbox-label'])[2]")).click();
		WebElement findElement2 = driver.findElement(By.xpath("//label/following-sibling::select"));
		Select dd2=new Select(findElement2);
		dd2.selectByVisibleText("software group");
		driver.findElement(By.xpath("//span/following-sibling::input")).sendKeys("INC0010106",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//tr/td[3])[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='sys_display.incident.caller_id']")).clear();
		driver.findElement(By.xpath("//input[@id='sys_display.incident.caller_id']")).sendKeys("Software Manager");
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).clear();
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("Updated");
		driver.findElement(By.xpath("//span/button[text()='Update']")).click();
		System.out.println("incident move to Software group");
		 

	}

}
