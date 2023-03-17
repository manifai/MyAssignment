package week6.day1.assignmentservice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateIns extends BaseClass {
	public  String attributeValue;
	@Test(priority=0)
	public void createin() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//button[text()='New']")).click();
		attributeValue = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		Thread.sleep(1000);
		System.out.println(attributeValue);
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("System Test1");
		driver.findElement(By.xpath("//span/button[text()='Submit']")).click();
		driver.findElement(By.xpath("//span/following-sibling::input")).sendKeys(attributeValue,Keys.ENTER);
		String text = driver.findElement(By.xpath("(//tr/td[3])[2]/a")).getText();
		Thread.sleep(1000);
		if(attributeValue.equals(text)) {
			System.out.println("Incident Created");
			System.out.println("Incident Number : "+attributeValue);
		}else {
			System.out.println("Incident not Created");
		}

	}

}
