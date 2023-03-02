package week4.day2.assignmentW4D2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.nykaa.com/");
		Actions build=new Actions(driver);
		
		build.moveToElement(driver.findElement(By.xpath("//a[text()='brands']"))).perform();
		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		String title1 = driver.getTitle();
		System.out.println("Title of the page : "+title1);
		if(title1.contains("L'Oreal Paris")) {
			System.out.println("Yes , this page is related to L'Oreal Paris");
		}
		else {
			System.out.println("NO , this page is not related to L'Oreal Paris");
		}
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("//div/span[text()='customer top rated']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'filter-open')]/span[text()='Category']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(@class,'filter-name')])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(@class,'filter-name')])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/span[text()='Shampoo']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'filter-open')]/span[text()='Concern']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/span[text()='Color Protection']")).click();
		Thread.sleep(1000);
		String text2 = driver.findElement(By.xpath("//div[@class='css-xrzmfa']")).getText();
		Thread.sleep(1000);
		System.out.println("Shampoo : "+text2);
		if(text2.contains("Color Protection")||text2.contains("Color Protect")||text2.contains("Colour Protect")) {
			System.out.println("Yes, Filter is applied with Shampoo");
		}
		else {
			System.out.println("No, Filter is not applied with Shampoo");
		}
		
		driver.findElement(By.xpath("//div[@class='css-xrzmfa']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window=new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		driver.findElement(By.xpath("//button/span[text()='180ml']")).click();
		Thread.sleep(1000);
		String price = driver.findElement(By.xpath("(//div[@class='css-f5j3vf']/div/span)[2]")).getText();
		Thread.sleep(1000);
		System.out.println("Price : "+price);
		driver.findElement(By.xpath("//button/span[text()='Add to Bag']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='css-g4vs13']//*[name()='svg']")).click();
		WebElement findElementBag = driver.findElement(By.xpath("//div[contains(@class,'css-1w65igk')]/iframe"));
		
		driver.switchTo().frame(findElementBag);
		Thread.sleep(1000);
		String grandTotal = driver.findElement(By.xpath("//span[contains(@class,'css-1um1mkq')]")).getText();
		Thread.sleep(1000);
		System.out.println("Grand Total : "+grandTotal);
		if(price.equals(grandTotal)) {
			System.out.println("yes, both price and grand total are same");
		} 
		else {
			System.out.println("No, both price and grand total are different");
		}
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		driver.switchTo().defaultContent();
		//driver.close();
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		Thread.sleep(1000);
		driver.close();
		Thread.sleep(1000);
		driver.switchTo().window(window.get(0));
		driver.close();
		
	}
	

}
