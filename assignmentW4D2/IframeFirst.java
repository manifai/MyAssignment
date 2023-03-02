package week4.day2.assignmentW4D2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IframeFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notification");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node05us3gij8ed091h38fieurov685953.node0");
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println("1. Click Me (Inside frame) : "+text);
		driver.switchTo().defaultContent();
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		System.out.println("2. How many frames in this page? : "+findElements.size());
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		String text2 = driver.findElement(By.xpath("//button[@id='Click']")).getText();
		System.out.println("3. Click Me (Inside Nested frame)? :"+text2);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.close();
	}

}
