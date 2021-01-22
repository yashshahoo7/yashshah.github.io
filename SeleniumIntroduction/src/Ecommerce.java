import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\yash\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] itemsNeeded = { "Brocolli", "Cucumber", "Beetroot" };
		int j = 0;
		// driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		Thread.sleep(3000);
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));
		// System.out.println(items);
		for (int i = 0; i < items.size(); i++) {
			String[] name = items.get(i).getText().split("-");
			String formattedName = name[0].trim();

			List itemsNeededlist = Arrays.asList(itemsNeeded);

			if (itemsNeededlist.contains(formattedName)) {

				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length) {
					break;
				}
			}

		}

	}

}
