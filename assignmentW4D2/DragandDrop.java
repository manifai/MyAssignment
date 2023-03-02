package week4.day2.assignmentW4D2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notification");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://leafground.com/drag.xhtml");
		WebElement findElementOne = driver.findElement(By.id("form:conpnl_header"));
		Point location1 = findElementOne.getLocation();
		Actions bulid=new Actions(driver);
		bulid.dragAndDropBy(findElementOne, 500, 100).perform();
		Point location2 = findElementOne.getLocation();
		if(!location1.equals(location2)) {
			System.out.println("Yes, it's Dragged");
		}
		WebElement findElementTwo = driver.findElement(By.id("form:drag_content"));
		Point location3 = findElementTwo.getLocation();
		WebElement findElementThree = driver.findElement(By.id("form:drop_content"));
		bulid.dragAndDrop(findElementTwo, findElementThree).perform();
		Point location4 = findElementTwo.getLocation();
		if(!location3.equals(location4)) {
			System.out.println("Yes, it's Dragged and dropped");
		}
	}

}
