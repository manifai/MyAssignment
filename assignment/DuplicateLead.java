package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("First American India");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manikandan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Madhayan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Mani");
		driver.findElement(By.name("departmentName")).sendKeys("Title");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("US Title Insurance");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mmanikandanmadhayan@gmail.com");
		WebElement parent = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd=new Select(parent);
		dd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement createcompanyname = driver.findElement(By.id("createLeadForm_companyName"));
		createcompanyname.clear();
		//driver.findElement(By.id("createLeadForm_companyName")).clear();
		createcompanyname.sendKeys("FAI P.Ltd");
		//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("FAI P.Ltd");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manikandan M");
		driver.findElement(By.className("smallSubmit")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.close();

	}

}
