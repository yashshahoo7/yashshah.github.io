import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\yash\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("autocomplete")).sendKeys("yash");
		driver.findElement(By.cssSelector("button#openwindow.btn-style.class1")).click();
		//driver.findElement(By.xpath("//*[@id='openwindow']")).click();
		//driver.findElement(By.linkText("Open Tab")).click();
		
		
	}

}
