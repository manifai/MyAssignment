package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[1]")).sendKeys("Manikandan"); 
		driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[2]")).sendKeys(", India");
		boolean enabled = driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[3]")).isEnabled();
		if(enabled==false) {
			System.out.println("text box is disabled");
		}
		else {
			System.out.println("text box is enabled");
		}
		driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[4]")).clear();
		System.out.println("Retrieve the typed text : "+driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[5]")).getAttribute("value"));
		WebElement findEmail = driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[6]"));
		findEmail.sendKeys("Manikandanmadhayan@gmail.com");
		findEmail.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='grid formgrid']//textarea")).sendKeys("this is manikandan from salem");
		driver.findElement(By.xpath("(//span[@class='ql-picker-label'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='ql-picker-options']/span)[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='ql-bold'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='ql-header'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='ql-editor'])[1]")).sendKeys("Testing");
		driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[9]")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		String textError = driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText();
		System.out.println("Just Press Enter and confirm error message* : "+textError);
		Point locationOne = driver.findElement(By.xpath("//span/label")).getLocation();
		System.out.println("Label Position Changes before click : "+locationOne);
		driver.findElement(By.xpath("//span[@class='ui-float-label']/input")).click();
		Point locationTwo = driver.findElement(By.xpath("//span/label")).getLocation();
		System.out.println("Label Position Changes after click : "+locationTwo);
		driver.findElement(By.xpath("//li[@class='ui-autocomplete-input-token']/input")).sendKeys("Manikandan");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li/span[@class='ui-autocomplete-query'])[3]")).click();
		driver.findElement(By.xpath("//input[@id='j_idt106:j_idt122']")).click();
		boolean displayedKey = driver.findElement(By.xpath("//div[contains(@class,'ui-shadow keypad-popup')]")).isDisplayed();
		if(displayedKey==true) {
			System.out.println("yes, Keyboard appears");
		}
		else {
			System.out.println("No, Keyboard not appears");
		}
		driver.findElement(By.xpath("(//button[@class='ql-bold'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='ql-italic'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='ql-underline'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ql-picker-label'])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ql-picker-options']/span)[83]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ql-size ql-picker']/span[@class='ql-picker-label'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ql-picker-options']/span)[87]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[2]")).sendKeys("thank you all");
		
		driver.close();

		
		

	}

}
