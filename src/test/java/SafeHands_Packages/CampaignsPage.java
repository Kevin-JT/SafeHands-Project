package SafeHands_Packages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CampaignsPage {
	
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void BeforeTest() {
		
		//Set the Instance
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		
		//Set the Path
		driver=new ChromeDriver();
		
		//Open the Window
		driver.get("http://127.0.0.1:8000/campaigns/");
		
		//Maximize the Window
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void TestCase1() {
		
		//Print the Title in Console
		String Title=driver.getTitle();
		System.out.println("Page Title is: "+Title);
				
		//Check whether the TestCase is fail or Pass in console
		if (Title.equals("Campaigns | SafeHands")) {
			  System.out.println(" TestCase 1 is Passed");
		} else {
		      System.out.println(" TestCase 1 is Failed");
		}
	}
	
	@Test(priority=2)
	public void TestCase2() throws InterruptedException {
		
		//Wait the Browser to Locate the Button
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement firstdetailsbtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"volunteer-btn-1\"]")));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",firstdetailsbtn);

		//Wait for scroll settle
		Thread.sleep(1000);

		//Click normally
		wait.until(ExpectedConditions.elementToBeClickable(firstdetailsbtn)).click();
		
		//Wait the Browser
		Thread.sleep(2000);
		
		//Get an Text from the Details
		WebElement passage=driver.findElement(By.xpath("//*[@id=\"modal1\"]/div/p[2]/strong"));
		String text=passage.getText();
		System.out.println("Actual Text: " + text);
		String expectedText="Location:";

		if (text.equals(expectedText)) {
		    System.out.println("TestCase 2 is Passed");
		} else {
		    System.out.println("TestCase 2 is Failed");
		}	
	}
	
	@Test(priority=3)
	public void TestCase3() throws InterruptedException {
		
		//Wait the Browser to Locate the Button
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement seconddetailsbtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"volunteer-btn-2\"]")));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",seconddetailsbtn);

		//Wait for scroll settle
		Thread.sleep(1000);

		//Click normally
		wait.until(ExpectedConditions.elementToBeClickable(seconddetailsbtn)).click();
		
		//Wait the Browser
		Thread.sleep(2000);
		
		//Get an Text from the Details
		WebElement passage=driver.findElement(By.xpath("//*[@id=\"modal2\"]/div/p[2]/strong"));
		String text=passage.getText();
		System.out.println("Actual Text: " + text);
		String expectedText="Location:";

		if (text.equals(expectedText)) {
		    System.out.println("TestCase 3 is Passed");
		} else {
		    System.out.println("TestCase 3 is Failed");
		}
	}
	
	@Test(priority=4)
	public void TestCase4() throws InterruptedException {
		
		//Wait the Browser to Locate the Button
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement thirddetailsbtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"volunteer-btn-3\"]")));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",thirddetailsbtn);

		//Wait for scroll settle
		Thread.sleep(1000);

		//Click normally
		wait.until(ExpectedConditions.elementToBeClickable(thirddetailsbtn)).click();
		
		//Wait the Browser
		Thread.sleep(2000);
		
		//Get an Text from the Details
		WebElement passage=driver.findElement(By.xpath("//*[@id=\"modal3\"]/div/p[2]/strong"));
		String text=passage.getText();
		System.out.println("Actual Text: " + text);
		String expectedText="Location:";

		if (text.equals(expectedText)) {
		    System.out.println("TestCase 4 is Passed");
		} else {
		    System.out.println("TestCase 4 is Failed");
		}
	}
	
	@AfterTest
	public void tearDown() {
	    driver.quit();
	}
}
