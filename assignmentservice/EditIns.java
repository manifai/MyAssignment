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

public class EditIns extends BaseClass{
	@Test(priority=1)
	public  void editin() throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.findElement(By.xpath("//span/following-sibling::input")).sendKeys("INC0010085",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//tr/td[3])[2]/a")).click();
		Thread.sleep(1000);
		WebElement findElement = driver.findElement(By.xpath("(//div/select)[2]"));
		Select dd=new Select(findElement);
		dd.selectByIndex(0);
		WebElement findElement1 = driver.findElement(By.xpath("(//div/select)[3]"));
		Select dd1=new Select(findElement1);
		dd1.selectByIndex(1);
		driver.findElement(By.xpath("//span/button[text()='Update']")).click();
		driver.findElement(By.xpath("(//tr/td[3])[2]/a")).click();
		String text = driver.findElement(By.xpath("(//div/select)[2]//option[@selected='SELECTED']")).getText();
		Thread.sleep(1000);
		System.out.println("Urgency : "+text);
		String text1 = driver.findElement(By.xpath("(//div/select)[3]//option[@selected='SELECTED']")).getText();
		Thread.sleep(1000);
		System.out.println("State : "+text1);


	}

}
