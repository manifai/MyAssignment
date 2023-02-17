package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Basic']/preceding-sibling::div[contains(@class,'ui-chkbox-box')]")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']/preceding-sibling::div[contains(@class,'ui-chkbox-box')]")).click();
		
		driver.findElement(By.xpath("(//label[text()='Python']/preceding::div[contains(@class,'ui-chkbox-box')])[4]")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[contains(@class,'ui-chkbox')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[contains(@class,'ui-chkbox')]")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		boolean disabledBox = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isSelected();
		if(disabledBox==false) {
			System.out.println("Verify if check box is disabled : yes, disabled");
		}
		else {
			System.out.println("Verify if check box is disabled : no, enabled");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu-trigger')]/preceding-sibling::ul")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox')]/following-sibling::label[text()='London']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox')]/following-sibling::label[text()='Rome']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox')]/following-sibling::label[text()='Amsterdam']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		driver.close();
		//label[text()='Java']/preceding::div[contains(@class,'ui-chkbox')]/div[contains(@class,'ui-chkbox-box')]
	}

}
