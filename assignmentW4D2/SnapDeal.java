package week4.day2.assignmentW4D2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.snapdeal.com/");
		Actions build=new Actions(driver);
		build.moveToElement(driver.findElement(By.linkText("Men's Fashion"))).perform();
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		String shoeCount = driver.findElement(By.xpath("(//div[contains(@class,'selected')]/following-sibling::div)[1]")).getText();
		Thread.sleep(1000);
		System.out.println("sports shoes count : "+shoeCount);
		driver.findElement(By.xpath("//div[@class='child-cat-name ' and text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'sort-drop')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
		Thread.sleep(1000);
		List<WebElement> findElementsPrice = driver.findElements(By.xpath("(//div[contains(@class,'product-price-row')]/div/span[contains(@class,'product-price')])"));
		int count=0;
		for(int i=1;i<=findElementsPrice.size();i++) {
			int j=i;
			Thread.sleep(1000);
			String text1 = driver.findElement(By.xpath("(//div[contains(@class,'product-price-row')]/div/span[contains(@class,'product-price')])["+j+"]")).getText();
			Thread.sleep(1000);
			String text2 = driver.findElement(By.xpath("(//div[contains(@class,'product-price-row')]/div/span[contains(@class,'product-price')])["+(j++)+"]")).getText();
			Thread.sleep(1000);
			String replacetext1 = text1.replaceAll("[^0-9]", "");
			String replacetext2 = text2.replaceAll("[^0-9]", "");
			int a=Integer.parseInt(replacetext1);
			int b=Integer.parseInt(replacetext2);
			//System.out.println(a);
			if(!(a<=b)) {
				count++;
			}
		}
		if(count<1) {
			System.out.println("Items displayed are sorted correctly");
		}
		else {
			System.out.println("Items displayed are sorted not correctly");
		}
		
		//WebElement findElement1 = driver.findElement(By.xpath("//a[contains(@class,'left-handle')]"));
		//build.dragAndDropBy(findElement1, 100, 0).perform();
		WebElement findElement2 = driver.findElement(By.xpath("(//div[@class='price-text-box']/input)[1]"));
		WebElement findElement3 = driver.findElement(By.xpath("(//div[@class='price-text-box']/input)[2]"));
		findElement2.clear();
		findElement3.clear();
		findElement2.sendKeys("550");
		findElement3.sendKeys("650");
		driver.findElement(By.xpath("//div[contains(@class,'price-go-arrow')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='sdCheckbox filters-list '])[3]")).click();
		Thread.sleep(3000);
		String texts = driver.findElement(By.xpath("//div[@class='sort-selected']")).getText();
		Thread.sleep(1000);
		System.out.println("Sort by : "+texts);
		String textp = driver.findElement(By.xpath("(//div[@class='navFiltersPill']/a[@data-key=\"Price|Price\"])[1]")).getText();
		Thread.sleep(1000);
		System.out.println("Price range : "+textp);
		String textc = driver.findElement(By.xpath("(//div[@class='navFiltersPill']/a[@data-key=\"Color_s|Color\"])[1]")).getText();
		Thread.sleep(1000);
		System.out.println("Color : "+textc);
		WebElement findElement4 = driver.findElement(By.xpath("(//div[@class='product-tuple-image ']/div)[1]"));
		build.moveToElement(findElement4).perform();
		Thread.sleep(1000);
		findElement4.click();
		/*
		 * Set<String> windowHandles = driver.getWindowHandles(); List<String>
		 * window=new ArrayList<String>(windowHandles);
		 * driver.switchTo().window(window.get(0));
		 */		
		String textpp = driver.findElement(By.xpath("//div[contains(@class,'product-price')]/span[@class='payBlkBig']")).getText();
		Thread.sleep(1000);
		System.out.println("Total Cost :"+ textpp);
		String textdc = driver.findElement(By.xpath("//div[contains(@class,'product-price')]/span[@class='percent-desc ']")).getText();
		Thread.sleep(1000);
		System.out.println("Discount percentage :"+ textdc);
		Thread.sleep(1000);
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File desni=new File("./snap/shoe.png");
		FileUtils.copyFile(screenshotAs, desni);
		System.out.println("screen shot : ./snap/shoe.png");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'close ')]")).click();
		Thread.sleep(1000);
		driver.close();
		
		}

}
