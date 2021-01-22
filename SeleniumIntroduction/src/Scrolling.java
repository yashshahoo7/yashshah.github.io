import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\yash\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000L);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=3000");
		
		List<WebElement> Amounts = driver.findElements(By.cssSelector("div[class='tableFixHead'] td:nth-child(4)"));
		
		int sum = 0;
		for(int i=0;i<Amounts.size();i++)
		{
		sum = sum + Integer.parseInt(Amounts.get(i).getText());
		}
		
		System.out.println(sum);
		
		int value =Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum,value);
		
	}

}
