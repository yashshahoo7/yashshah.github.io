import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaStreamSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\yash\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		/*driver.findElement(By.xpath("//tr//th[1]")).click();
		List<WebElement> names =driver.findElements(By.xpath("//tr//td[1]"));
		List<String> originaList = names.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sortedList = originaList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originaList.equals(sortedList));
		
		List<String> price;
		//scan the originaList coloumn with getText->rice->print the price of the Rice.
		do 
		{
			List<WebElement> rows =driver.findElements(By.xpath("//tr//td[1]"));
			 price = rows.stream().filter(s->s.getText().contains("Beans")).
					map(s->getpriceVeggie(s)).collect(Collectors.toList());
					price.forEach(s->System.out.println(s));
					
					if(price.size()<1) {
						driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
					}
		}while(price.size()<1);*/
		
		
		//Filter Example.
		
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> veggies = driver.findElements(By.xpath("//tr//td[1]"));
		List<WebElement> filteredresult = veggies.stream().filter(veggie->veggie.getText().contains("Rice")).collect(Collectors.toList());
		Assert.assertEquals(veggies.size(), filteredresult.size());
		
	}

	/*private static String getpriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}*/

}
