package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//td/label[text()='Chrome'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Bengaluru']")).click();
		System.out.println("Find the default select radio button : "+driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).getText());
		System.out.println("Select the age group :"+driver.findElement(By.xpath("//div/label[text()='21-40 Years']")).getText());
		driver.close();
	}

}
