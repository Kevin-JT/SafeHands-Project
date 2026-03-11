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

public class EmergencyPage {

	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void BeforeTest() {
		
		//Set the Instance
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		
		//Set the Path
		driver=new ChromeDriver();
		
		//Open the Window
		driver.get("http://127.0.0.1:8000/emergency/");
		
		//Maximize the Window
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void TestCase1() {
		
		//Print the Title in Console
		String Title=driver.getTitle();
		System.out.println("Page Title is: "+Title);
				
		//Check whether the TestCase is fail or Pass in console
		if (Title.equals("Emergency Resources - SafeHands")) {
			  System.out.println("TestCase 1 is Passed");
		} else {
		      System.out.println("TestCase 1 is Failed");
		}
	}
	
	@Test(priority=2)
	public void TestCase2() {
		
		//Verify that the Access Resource Button is redirecting the user to Emergency Resource page
		WebElement btn=driver.findElement(By.xpath("/html/body/div/div/a"));
		btn.click();
		
		//Print the Title in Console
		String Title=driver.getTitle();
		System.out.println("Page Title is: "+Title);
				
		//Check whether the TestCase is fail or Pass in console
		if (Title.equals("Emergency Resources")) {
			  System.out.println("TestCase 2 is Passed");
		} else {
		      System.out.println("TestCase 2 is Failed");
		}
	}
	
	@Test(priority=3)
	public void TestCase3() throws InterruptedException {
		
		//Wait the Browser
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement zoomIn=wait.until(ExpectedConditions.elementToBeClickable(By.className("leaflet-control-zoom-in")));
        //Locate the Map
		WebElement map=driver.findElement(By.id("map"));

		String before=map.getAttribute("style");

		zoomIn.click();
		Thread.sleep(1000);

		String after=map.getAttribute("style");

		if (!before.equals(after)) {
		    System.out.println("TestCase 3 is Passed");
		} else {
		    System.out.println("TestCase 3 is Failed");
		}
	}
	
	@Test(priority=4)
	public void TestCase4() throws InterruptedException {
		
		//Wait the Browser
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	    WebElement map=wait.until(ExpectedConditions.elementToBeClickable(By.className("leaflet-map-pane")));
	    
	    //Get position before click
	    String beforePosition = map.getAttribute("style");
	    
	    //Wait the Browser to Locate the Button
    	WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(15));
    	WebElement donateitems=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section[1]/h4")));
    	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",donateitems);

	    // Click the button that changes location
	    WebElement changeLocationBtn = driver.findElement(By.xpath("//*[@id=\"resourceList\"]/li[1]"));
	    changeLocationBtn.click();

	    //Wait the Browser
	    Thread.sleep(2000);

	    //Get position after click
	    String afterPosition = map.getAttribute("style");

	    System.out.println("Before: " + beforePosition);
	    System.out.println("After: " + afterPosition);

	    //Print the Result in Console
	    if (!beforePosition.equals(afterPosition)) {
	        System.out.println("TestCase 4 is Passed");
	    } else {
	        System.out.println("TestCase 4 is Failed");
	    }
	}
	
	@Test(priority=5)
	public void TestCase5() {
		
		//Wait the Browser to Locate the Button
    	WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(15));
    	WebElement donateitems=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section[3]")));
    	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",donateitems);
    	
    	//Verify that the Phone number is showing dialer PopUp
	    //Locate phone link
	    WebElement phone=driver.findElement(By.xpath("/html/body/section[3]/ul/li[3]/a"));

	    //Get href value
	    String href5=phone.getAttribute("href");

	    //heck tel protocol
	    if (href5.startsWith("tel:")) {
	        System.out.println("TestCase 5 is Passed");
	    } else {
	        System.out.println("TestCase 5 is Failed");
	    }
	}
	
	 @AfterTest
	 public void CloseWindow() {
	  driver.close();
	 }
}
