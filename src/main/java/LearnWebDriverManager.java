import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebDriverManager {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		
		  WebDriver driver = new ChromeDriver(); //WebDriver driver = new
		// FirefoxDriver(); driver.manage().window().maximize();
		 driver.get("https://www.google.com/"); //
		/* * driver.findElement(By.name("q")).sendKeys(Keys.CONTROL,"t"); WebElement
		 * findElement = driver.findElement(By.cssSelector("body"));
		 * 
		 * //Actions act = new Actions(driver);
		 * 
		 * //act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform
		 * ();
		 * 
		 * ((JavascriptExecutor)driver).executeScript("window.open()");
		 * 
		 * Set<String> windowHandles = driver.getWindowHandles();
		 * System.out.println(windowHandles.size()); Thread.sleep(2000);
		 */
		driver.close();
	
		  
		
		System.out.println(driver.getTitle());
		
		

	}

}
