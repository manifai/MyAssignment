package week4.day2.assignmentW4D2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://jqueryui.com/selectable");
		driver.switchTo().frame(0);
		Actions build=new Actions(driver);
		WebElement findElement1 = driver.findElement(By.xpath("//ol/li[1]"));
		WebElement findElement2 = driver.findElement(By.xpath("//ol/li[2]"));
		WebElement findElement3 = driver.findElement(By.xpath("//ol/li[3]"));
		WebElement findElement4 = driver.findElement(By.xpath("//ol/li[4]"));
		WebElement findElement5 = driver.findElement(By.xpath("//ol/li[5]"));
		WebElement findElement6 = driver.findElement(By.xpath("//ol/li[6]"));
		WebElement findElement7 = driver.findElement(By.xpath("//ol/li[7]"));
		build.keyDown(Keys.CONTROL).click(findElement1).click(findElement2).click(findElement3).click(findElement4).click(findElement5).click(findElement6)
		.click(findElement7).keyUp(Keys.CONTROL).perform();
	}

}
