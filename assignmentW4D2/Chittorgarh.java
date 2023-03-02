package week4.day2.assignmentW4D2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chittorgarh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.chittorgarh.com/");
		driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
		driver.findElement(By.xpath("//div[text()='NSE / BSE']/following-sibling::a[text()='NSE Bulk Deals']")).click();
		/*
		 * String text = driver.findElement(By.
		 * xpath("(//table[contains(@class,'table table-bordered')])[1]/tbody/tr[1]/td[1]/a"
		 * )).getText(); Thread.sleep(1000); System.out.println(text);
		 */
		List<WebElement> findElementsrows = driver.findElements(By.xpath("(//table[contains(@class,'table table-bordered')])[1]/tbody/tr/td[1]/a"));
		List<String> SecurityName=new ArrayList<String>();
		System.out.println("All the Security names : ");
		System.out.println(" ");
		for(int i=1;i<=findElementsrows.size();i++) {
			String textName = driver.findElement(By.xpath("(//table[contains(@class,'table table-bordered')])[1]/tbody/tr["+i+"]/td[1]/a")).getText();
			SecurityName.add(textName);
			System.out.println(textName);
		}
		System.out.println(" ");
		Set<String> setName=new LinkedHashSet<String>(SecurityName);
		List<String> SecurityNameTwo=new ArrayList<String>(setName);
		for(int j=0;j<SecurityNameTwo.size();j++) {
			int count=Collections.frequency(SecurityName, SecurityNameTwo.get(j));
			System.out.println(SecurityNameTwo.get(j)+" : "+count+" times");
			}
		}
	}


