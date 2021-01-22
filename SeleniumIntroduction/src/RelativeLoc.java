import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class RelativeLoc {

	//This support in selenium 4.0 version so you have to download latest selenium java jar which has version 4.0
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\yash\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebElement name = driver.findElement(By.xpath("input[@name='name']"));
		//driver.findElement(withTagName("label")).above(name);
		WebElement date = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		//driver.findElement(withTagName("input")).below(date);
		WebElement icecream = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		//driver.findElement(withTagName("input").toLeftOf(icecream));
		File file = date.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));
		//driver.switchTo().newWindow(WindowType.TAB);
		//which will open a new tab in 
	}

}
