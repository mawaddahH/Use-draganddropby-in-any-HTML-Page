/**
 * @author Mawaddah Hanbali
 */
package ass3W9D5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromWhebDriverAss3W9D5 {
	public WebDriver driver;

	/**
	 * Set up browser settings and open the application
	 * 
	 * @throws InterruptedException
	 */
	@BeforeTest
	public void setUp() throws InterruptedException {
		// The path for open WebSite
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");

		// Open browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.diagrams.net/");
		Thread.sleep(2000); // To load the page
		System.out.println("Website Title: " + driver.getTitle());
	}

	/**
	 * Test Drag and Drop with dragAndDropBy method
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void LearnEnglishWebSite() throws InterruptedException {
		// wait until pop window open for maximum 20 second
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div.geDialog > div > span")));

		// close pop window
		WebElement checkbix = driver.findElement(By.cssSelector("body > div.geDialog > div > span"));
		checkbix.click();
		Thread.sleep(1000); // to see the result

		// source elements
		WebElement source = driver.findElement(By.xpath("//body//div//div//a[24]"));

		Actions a = new Actions(driver);
		a.dragAndDropBy(source, 400, 20).build().perform(); // add the first element
		a.dragAndDropBy(source, 300, -50).build().perform(); // add the second element

		Thread.sleep(4000); // to see the result
	}

	/**
	 * Tear down the setup after test completes
	 */
	@AfterTest
	public void terminateBrowser() {
		// Close the browser
		driver.close();

		// Quite the selenium
		driver.quit();
	}
}
