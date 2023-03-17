package week6.day1.assignmentservice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class DeleIns extends BaseClass {
	@Test(priority=3)
	public void deleins() throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement findElement = driver.findElement(By.xpath("(//tr/td[3])[3]/a"));
		String text = findElement.getText();
		findElement.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span/button[text()='Delete']")).click();
		driver.findElement(By.xpath("(//button[text()='Delete'])[3]")).click();
		System.out.println(text+" deleted");
		

	}

}
