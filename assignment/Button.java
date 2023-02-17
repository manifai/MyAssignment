package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String titleOne = driver.getTitle();
		System.out.println("Click and Confirm title : "+titleOne);
		driver.navigate().back();
		boolean enabledButton = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		if(enabledButton==false) {
			System.out.println("Confirm if the button is disabled : yes button is disabled");
		}
		else {
			System.out.println("Confirm if the button is disabled : no, button is enabled");
		}
		Point locationButton = driver.findElement(By.xpath("//span[text()='Save']")).getLocation();
		System.out.println("Find the position of the Submit button : "+locationButton);
		System.out.println(driver.findElement(By.xpath("//h5[text()='Find the Save button color']/following-sibling::button")).getCssValue("background-color"));
		System.out.println("Button Height : "+driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).getSize().getHeight());
		System.out.println("Button Width : "+driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).getSize().getWidth());
	
	}	

}
