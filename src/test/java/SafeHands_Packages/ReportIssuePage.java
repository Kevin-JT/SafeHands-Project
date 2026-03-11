package SafeHands_Packages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReportIssuePage {

	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void BeforeTest() {
		
		//Set the Instance
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		
		//Set the Path
		driver=new ChromeDriver();
		
		//Open the Window
		driver.get("http://127.0.0.1:8000/report/");
		
		//Maximize the Window
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void TestCase1() {
		
		//Print the Title in Console
		String Title=driver.getTitle();
		System.out.println("Page Title is: "+Title);
				
		//Check whether the TestCase is fail or Pass in console
		if (Title.equals("Report Issues - SafeHands")) {
			  System.out.println("TestCase 1 is Passed");
		} else {
		      System.out.println("TestCase 1 is Failed");
		}
	}
	
	@Test(priority=2)
	public void TestCase2() throws InterruptedException {
		
		//Verify that the Submit a Report Section is Accepting valid input and the Map is functioning properly
		//Locate the Fields
		WebElement locationfield2=driver.findElement(By.xpath("//*[@id=\"location\"]"));
		
		//Wait the Browser to Locate the Button
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    	WebElement description=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"report-form\"]/form/div[4]/label")));
    	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",description);
    	
    	//Select option for DropDown list
    	Select dropdown2=new Select(driver.findElement(By.xpath("//*[@id=\"disaster-type\"]")));
    	WebElement descriptionfield2=driver.findElement(By.xpath("//*[@id=\"description\"]"));

    	//Wait the Browser
    	Thread.sleep(2000);
    	WebElement submitbtn2=driver.findElement(By.xpath("//*[@id=\"report-form\"]/form/button"));
    	
    	//Enter Inputs and Click Button
    	locationfield2.sendKeys("Thiruvananthapuram, Kerala, 695001, India");
    	dropdown2.selectByIndex(2);
    	descriptionfield2.sendKeys("Flood");
    	submitbtn2.click();
    	
    	//Pause the Browser
    	Thread.sleep(2000);
    	
    	//Verify that the Registration Page accepts the Input
    	WebElement text=driver.findElement(By.xpath("/html/body/section[1]/div/h1"));
    	
    	//Print the Result in Console
    	if(text.isDisplayed()) {
    		System.out.println("TestCase 2 is Passed");
    	} else {
    		System.out.println("TestCase 2 is Failed");
    	}
	}
	
	@Test(priority=3)
	public void TestCase3() throws InterruptedException {
		
		//Wait the Browser
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement zoomIn = wait.until(ExpectedConditions.elementToBeClickable(By.className("leaflet-control-zoom-in")));

        //Locate the Map
		WebElement map = driver.findElement(By.id("live-reports-map"));

		String before = map.getAttribute("style");

		zoomIn.click();
		Thread.sleep(1000);

		String after = map.getAttribute("style");

		if (!before.equals(after)) {
		    System.out.println("TestCase 3 is Passed");
		} else {
		    System.out.println("TestCase 3 is Failed");
		}
	}
	
	@AfterTest
    public void CloseWindow() {
    	driver.close();
    }
}
