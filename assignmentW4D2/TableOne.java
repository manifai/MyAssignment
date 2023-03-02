package week4.day2.assignmentW4D2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TableOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://html.com/tags/table/");
		List<WebElement> findElementsR = driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr/td[1]"));
		System.out.println("Count of number of rows : "+findElementsR.size());
		List<WebElement> findElementsC = driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr[1]/td"));
		System.out.println("Count of number of columns : "+findElementsC.size());
	}

}
