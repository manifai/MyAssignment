package week4.day1.assignmentW4D1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonOne {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notification");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro",Keys.ENTER);
		String text = driver.findElement(By.xpath("(//h2/a/span)[2]")).getText();
		System.out.println("Product Name: "+text);
		String text1 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]")).getText();
		System.out.println("Product Price: "+text1);
		String text2 = driver.findElement(By.xpath("(//div/span/span[@class='a-size-base'])[1]")).getText();
		System.out.println("Product ratings : "+text2);
		String text3 = driver.findElement(By.xpath("(//a/span[contains(@class,'s-underline-text')])[1]")).getText();
		System.out.println("Number of customer ratings for Product : "+text3.replaceAll("[^0-9]", ""));
		driver.findElement(By.xpath("(//h2/a/span)[2]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window1=new ArrayList<String>(windowHandles);
		driver.switchTo().window(window1.get(1));
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File desni=new File("./snap/oneplus1.png");
		FileUtils.copyFile(screenshotAs,desni);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(2000);
		String text4 = driver.findElement(By.xpath("(//span[@class='a-price sw-subtotal-amount']/span)[2]/span[@class='a-price-whole']")).getText();
		Thread.sleep(2000);
		System.out.println("product sub total : "+text4);
		if(text1.equals(text4)) {
			System.out.println("Yes, both product price and sub total are same");
		}
		else {
			System.out.println("No, both product price and sub total are different");
		}
		driver.close();
		driver.switchTo().window(window1.get(0));
		driver.close();
	}

}
