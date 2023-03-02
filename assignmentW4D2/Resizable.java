package week4.day2.assignmentW4D2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://jqueryui.com/resizable");
		driver.switchTo().frame(0);
		Actions build=new Actions(driver);
		WebElement findElementR = driver.findElement(By.xpath("//div[contains(@class,'ui-resizable-handle')][3]"));
		build.clickAndHold(findElementR).moveByOffset(250, 150).perform();
	}

}
