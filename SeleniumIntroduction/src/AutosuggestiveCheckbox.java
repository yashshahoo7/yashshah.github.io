import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class AutosuggestiveCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\yash\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		/*driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000L);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option : options ){
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}*/
		
		// Multiple Checkbox
		
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
		//TestnG framework is testing framework for Assertion(It will check the condition if its true then it will execute the next step and if it false then it will not execute the next stop and the programme gets terminate).
		//Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
		Assert.assertFalse(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type*='checkbox']")).size());
		
		
	}

}
