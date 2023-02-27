package week4.day1.assignmentW4D1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafgroundWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("\"--disable-notifications\"");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node0qnmkmsqk1e5qax12gvptco49127048.node0");
		System.out.println("1. Click and Confirm new Window Opens :");
		driver.findElement(By.xpath("//button/span[text()='Open']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window=new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		
		if(window.size()>0) {
			System.out.println("Yes, New Window has open");
			System.out.println("Window Name : "+driver.getTitle());
		}
		else {
			System.out.println("No, New Window has not open");
		}
		
		driver.close();
		driver.switchTo().window(window.get(0));
		System.out.println("");
		System.out.println("2. Find the number of opened tabs : ");
		driver.findElement(By.xpath("//button/span[text()='Open Multiple']")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> window1=new ArrayList<String>(windowHandles1);
		System.out.println("How many new windows opened : "+(window1.size()-1));
		int j=1;
		for(int i=1;i<=window1.size()-1;i++) {
			driver.switchTo().window(window1.get(i));
			System.out.println(j +" - window name : "+driver.getTitle());
			j++;
		}
		for(int i=1;i<=window1.size()-1;i++) {
			driver.switchTo().window(window1.get(i));
			driver.close();
		}
		
		System.out.println("");
		System.out.println("3. Close all windows except Primary");
		driver.switchTo().window(window1.get(0));
		driver.findElement(By.xpath("//button/span[text()='Close Windows']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> window2=new ArrayList<String>(windowHandles2);
		System.out.println("How many new windows opened : "+(window2.size()-1));
		int count=window2.size();
		for(int k=1;k<=window2.size()-1;k++) {
			driver.switchTo().window(window2.get(k));
			driver.close();
			count--;
		}
		//System.out.println(count);
		if(count==1) {
			System.out.println("All the opened new windows has been closed ");
		}
		else {
			System.out.println("All the opened new windows not closed ");
		}
			
		driver.switchTo().window(window2.get(0));
		System.out.println("");
		System.out.println("4. Wait for 2 new tabs to open");
		driver.findElement(By.xpath("//button/span[text()='Open with delay']")).click();
		Thread.sleep(5000);
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> window3=new ArrayList<String>(windowHandles3);
		System.out.println("How many new windows opened : "+(window3.size()-1));
		for(int l=1;l<=window3.size()-1;l++) {
			driver.switchTo().window(window3.get(l));
			driver.close();
		}
		driver.switchTo().window(window3.get(0));
		System.out.println("");
		System.out.println("the main window name : "+driver.getTitle());
	}
	

}
