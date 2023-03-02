package week4.day2.assignmentW4D2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[contains(@class,'username')]")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//label[text()='Password']//following-sibling::input[1]")).sendKeys("Leaf@123");
		driver.findElement(By.xpath("//label[text()='Password']//following-sibling::input[2]")).click();
		driver.findElement(By.xpath("(//div[@class='tileNavButton']/button)[2]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window=new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		System.out.println("After confirm, page title : "+driver.getTitle());
		driver.close();
		driver.switchTo().window(window.get(0));
		driver.close();
	}
}
