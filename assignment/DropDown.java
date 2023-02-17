package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		WebElement findElementUi = driver.findElement(By.xpath("//div[@class='grid formgrid']//select[@class='ui-selectonemenu']"));
		Select ddUi=new Select(findElementUi);
		ddUi.selectByIndex(1);
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("//ul/li[text()='India']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul/li[text()='Chennai']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/button[contains(@class,'ui-autocomplete-dropdown')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul//li[text()='Selenium WebDriver']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul//li[text()='English']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul//li[text()='Two']")).click();
		Thread.sleep(1000);
		driver.close();
		
		//Select ddCo=new Select(findElementCountry);
		//ddCo.selectByIndex(1);
		
	}

}
