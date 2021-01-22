import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedCalender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\yash\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		Thread.sleep(2000L);
		driver.findElement(By.id("travel_date")).click();
		
		while (!driver.findElement(By.cssSelector(".datepicker-days .datepicker-switch")).getText().contains("April")) {
			driver.findElement(By.cssSelector(".datepicker-days .next")).click();
		}

		List<WebElement> days = driver.findElements(By.cssSelector("[class='day']"));
		int count = driver.findElements(By.cssSelector("[class='day']")).size();

		for (int i = 0; i < count; i++) {

			String date = driver.findElements(By.cssSelector("[class='day']")).get(i).getText();

			if (date.equalsIgnoreCase("4")) {
				driver.findElements(By.cssSelector("[class='day']")).get(i).click();
			}
		}
	}
}
