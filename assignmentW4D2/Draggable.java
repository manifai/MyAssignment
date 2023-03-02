package week4.day2.assignmentW4D2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://jqueryui.com/draggable");
		driver.switchTo().frame(0);
		WebElement findElementD = driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions build=new Actions(driver);
		build.dragAndDropBy(findElementD, 200, 100).perform();
	}

}
