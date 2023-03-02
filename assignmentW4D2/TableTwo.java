package week4.day2.assignmentW4D2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TableTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://html.com/tags/table/");
		List<WebElement> findElementsR = driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr/td[1]"));
		//System.out.println("Count of number of rows : "+findElementsR.size());
		List<WebElement> findElementsC = driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr[1]/td"));
		//System.out.println("Count of number of columns : "+findElementsC.size());
		List<String> listH=new ArrayList<String>();
		for(int i=1;i<=findElementsC.size();i++) {
			String textH = driver.findElement(By.xpath("//div[@class='render']/table/thead/tr/th["+i+"]")).getText();
			listH.add(textH);
			//System.out.println(textH);
		}
		List<String> listR=new ArrayList<String>();
		for(int j=1;j<=findElementsR.size();j++) {
			String textR = driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr["+j+"]/td[1]")).getText();
			listR.add(textR);
			//System.out.println(textR); 
		}
		for(int k=1;k<=findElementsR.size();k++) {
			System.out.println(listR.get(k-1));
			System.out.println("");
			for(int l=2;l<=findElementsC.size();l++) {
				String textD = driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr["+k+"]/td["+l+"]")).getText();
				System.out.println(listH.get(l-1)+" : "+textD);
			}
			System.out.println("");
		}
	}

}