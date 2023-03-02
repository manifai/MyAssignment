package week4.day2.assignmentW4D2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		Actions build=new Actions(driver);
		WebElement findElementMen = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Men']"));
		build.moveToElement(findElementMen).perform();
		driver.findElement(By.xpath("(//ul[@class='desktop-navBlock']/li/a[text()='Jackets'])[1]")).click();
		String textTotal = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		int totalCount1=Integer.parseInt(textTotal.replaceAll("[^0-9]", ""));
		System.out.println("Total count of item : "+ totalCount1);
		List<WebElement> findElementsCat = driver.findElements(By.xpath("//ul[@class='categories-list']//label"));
		int catTotal=0;
		for(int i=1;i<=findElementsCat.size();i++) {
			String textName = driver.findElement(By.xpath("(//ul[@class='categories-list']//label)["+i+"]")).getText();
			String textCount = driver.findElement(By.xpath("(//ul[@class='categories-list']//label)["+i+"]/span")).getText();
			int tcount=Integer.parseInt(textCount.replaceAll("[^0-9]", ""));
			catTotal+=tcount;
			System.out.println(textName);
		}
		System.out.println("sum of categories : "+catTotal);
		if(totalCount1==catTotal) {
			System.out.println("Both total Head count and categories count same");
		}
		else {
			System.out.println("Both total Head count and categories count not same");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[@class='categories-list']//label)[1]/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		driver.findElement(By.xpath("//div/input[@class='FilterDirectory-searchInput']")).sendKeys("Duke");
		driver.findElement(By.xpath("//ul[@class='FilterDirectory-list']/li[2]//div")).click();
		driver.findElement(By.xpath("//span[contains(@class,'FilterDirectory-close')]")).click();
		List<WebElement> findElementshead = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']/h3"));
		Set<String> setHead=new LinkedHashSet<String>();
		Thread.sleep(3000);
		for(int j=1;j<=findElementshead.size();j++) {
			String texthead = driver.findElement(By.xpath("(//div[@class='product-productMetaInfo']/h3)["+j+"]")).getText();
			setHead.add(texthead);
			//System.out.println(texthead);
			 
		}
		if(setHead.size()>1) {
			System.out.println("Confirm all the Coats are of brand Duke : No,we have other brand in the filter ");
		}
		else {
			System.out.println("Confirm all the Coats are of brand Duke : yes,we have only Duke brand in the filter ");
		}
		
		driver.findElement(By.xpath("//div[@class='sort-sortBy']/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='sort-label '])[4]")).click();
		WebElement findElementPrice = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]"));
		Thread.sleep(1000);
		System.out.println("Price of first displayed item : "+findElementPrice.getText());
		driver.findElement(By.xpath("(//div[@class='product-productMetaInfo'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window=new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File desini=new File("./snap/myntra1.png");
		FileUtils.copyFile(screenshotAs, desini);
		driver.findElement(By.xpath("//div[contains(@class,'pdp-add-to-wishlist')]")).click();
		System.out.println("screen shot : ./snap/myntra1.png");
		driver.close();
		driver.switchTo().window(window.get(0));
		driver.close();
		
		 
	}

}
