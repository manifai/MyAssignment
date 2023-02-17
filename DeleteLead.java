package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		WebElement findLead = driver.findElement(By.xpath("//li/a[text()='Find Leads']"));
		findLead.click();
		driver.findElement(By.xpath("//em//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//div/input[@name='phoneNumber']")).sendKeys("7708949409");
		driver.findElement(By.xpath("//em/button[text()='Find Leads']")).click();
		//driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]")).click();
		//driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ' ]//a)[1]")).click();
		Thread.sleep(2000);
		WebElement findId = driver.findElement(By.xpath("(//td[contains(@class,'x-grid3-td-partyId')]//a[@class='linktext'])[1]"));
		String text = findId.getText();
		System.out.println(text);
		findId.click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//li/a[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys(text);
		driver.findElement(By.xpath("//em/button[text()='Find Leads']")).click();
		Thread.sleep(2500);
		WebElement act = driver.findElement(By.className("x-paging-info"));
		String text2 = act.getText();
		System.out.println(text2);
		String exp="No records to display";
		if(text2.contains(exp)) {
			System.out.println(text+" deleted");
		}
		else {
			System.out.println(text+" still there");
		}
		driver.close();
	}

}
