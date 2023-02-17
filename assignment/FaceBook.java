package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("(//div[@class='_5dbb']//input)[1]")).sendKeys("Roja");
		driver.findElement(By.xpath("(//div[@class='_5dbb']//input)[2]")).sendKeys("Madhayan");
		driver.findElement(By.xpath("(//div[@class='_5dbb']//input)[3]")).sendKeys("7708949409");
		driver.findElement(By.xpath("(//div[@class='_5dbb']//input)[5]")).sendKeys("@manimani123");
		WebElement findDay = driver.findElement(By.name("birthday_day"));
		Select dd=new Select(findDay);
		dd.selectByIndex(2);
		WebElement findMon = driver.findElement(By.name("birthday_month"));
		Select dd1=new Select (findMon);
		dd1.selectByIndex(5);
		WebElement findYear = driver.findElement(By.name("birthday_year"));
		Select dd2=new Select (findYear);
		dd2.selectByVisibleText("1993");
		driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba']/input[@class='_8esa'])[1]")).click();
		driver.close();
		

	}

}
