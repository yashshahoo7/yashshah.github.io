import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Updateddropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\yash\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		/*driver.findElement(By.id("divpaxinfo")).click();
	    Thread.sleep(2000L);
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());*/
		//Dynamic Dropdown Exampple
		
		/*driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']")).click();
		driver.findElement(By.xpath("//a[@value='AMD']-)).click();
		Thread.sleep(2000L);
		diver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BOM'][2]")).click()*/
		
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		WebDriverWait wait = new WebDriverWait(driver, 15);      
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_mainContent_ddl_originStation1_CTXT"))).click();
		driver.findElement(By.xpath("//td[@class='mapbg'] //a[@value='DEL']")).click();
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT' //td[@class='mapbg'] //a[@value='AMD']")).click();
		WebDriverWait waitArrival = new WebDriverWait(driver, 55);      
		waitArrival.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"))).click();
		driver.findElement(By.xpath("//td[@class='mapbg'] //a[@value='MAA']")).click();
	}

}
