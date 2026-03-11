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

public class VolunteerPage {

	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void BeforeTest() {
		
		//Set the Instance
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		
		//Set the Path
		driver=new ChromeDriver();
		
		//Open the Window
		driver.get("http://127.0.0.1:8000/volunteer/");
		
		//Maximize the Window
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void TestCase1() {
		
		//Print the Title in Console
		String Title=driver.getTitle();
		System.out.println("Page Title is: "+Title);
				
		//Check whether the TestCase is fail or Pass in console
		if (Title.equals("Volunteer | SafeHands")) {
			  System.out.println("TestCase 1 is Passed");
		} else {
		      System.out.println("TestCase 1 is Failed");
		}
	}
	
	@Test(priority=2)
	public void TestCase2() throws InterruptedException {
		
		//Verify that the Sign up as a volunteer button is redirecting the user to desired section of the Page
		//Locate the Button
		WebElement button=driver.findElement(By.xpath("/html/body/section[1]/div/a"));
		button.click();
		
		//Wait the Browser
		Thread.sleep(2000);
		
		//Get an Text from the Donate Form
		WebElement passage=driver.findElement(By.xpath("//*[@id=\"signup\"]/h2"));
		String text=passage.getText();
		System.out.println("Actual Text: " + text);
		String expectedText="Sign Up as a Volunteer";

		if (text.equals(expectedText)) {
		    System.out.println("TestCase 2 is Passed");
		} else {
		    System.out.println("TestCase 2 is Failed");
		}
	}
	
	@Test(priority=3)
	public void TestCase3() throws InterruptedException {
		
		//Verify that the input fields are accepting valid inputs
		WebElement btn=driver.findElement(By.xpath("/html/body/section[1]/div/a"));
		btn.click();
		
		//Wait the Browser
		Thread.sleep(2000);
		
    	//Locate the Fields 
    	WebElement Name3=driver.findElement(By.xpath("//*[@id=\"name\"]"));
    	WebElement email3=driver.findElement(By.xpath("//*[@id=\"contact\"]"));
    	WebElement firstaidbtn=driver.findElement(By.xpath("//*[@id=\"signup\"]/form/div/label[1]"));
    	WebElement medicalbtn=driver.findElement(By.xpath("//*[@id=\"signup\"]/form/div/label[3]"));
    	
    	//Wait the Browser to Locate the Button
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    	WebElement donateitems=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"signup\"]/form/label[5]")));
    	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",donateitems);
    	
    	//Locate the Date Picker
    	WebElement startdate3=driver.findElement(By.xpath("//*[@id=\"availability_start\"]"));
    	WebElement enddate3=driver.findElement(By.xpath("//*[@id=\"availability_end\"]"));
    	
    	//Click the Submit Button
    	WebElement submitbtn=driver.findElement(By.xpath("//*[@id=\"signup\"]/form/button"));
    	
    	//Enter Inputs and Click Button
    	Name3.sendKeys("Kevin");
    	email3.sendKeys("Admin@gmail.com");
    	firstaidbtn.click();
        medicalbtn.click();
    	startdate3.sendKeys("01/01/2026");
    	enddate3.sendKeys("12/31/2026");
    	submitbtn.click();
    	
    	//Pause the Browser
    	Thread.sleep(2000);
    	
    	//Verify that the Volunteer Page accepts the Input
    	boolean TestCase3=driver.getCurrentUrl().equals("http://127.0.0.1:8000/volunteer/success/");
    	
    	//Print the Result in Console
    	if(TestCase3) {
    		System.out.println("TestCase 3 is Passed");
    	} else {
    		System.out.println("TestCase 3 is Failed");
    	}
	}
	
	@Test(priority=4)
	public void TestCase4() throws InterruptedException {
		
		//Verify that the input fields are not accepting invalid inputs
		WebElement btn=driver.findElement(By.xpath("/html/body/section[1]/div/a"));
		btn.click();
		
		//Wait the Browser
		Thread.sleep(2000);
		
    	//Locate the Fields 
    	WebElement Name4=driver.findElement(By.xpath("//*[@id=\"name\"]"));
    	WebElement email4=driver.findElement(By.xpath("//*[@id=\"contact\"]"));
    	WebElement firstaidbtn=driver.findElement(By.xpath("//*[@id=\"signup\"]/form/div/label[1]"));
    	WebElement medicalbtn=driver.findElement(By.xpath("//*[@id=\"signup\"]/form/div/label[3]"));
    	
    	//Wait the Browser to Locate the Button
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    	WebElement donateitems=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"signup\"]/form/label[5]")));
    	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",donateitems);
    	
    	//Locate the Date Picker
    	WebElement startdate4=driver.findElement(By.xpath("//*[@id=\"availability_start\"]"));
    	WebElement enddate4=driver.findElement(By.xpath("//*[@id=\"availability_end\"]"));
    	
    	//Click the Submit Button
    	WebElement submitbtn=driver.findElement(By.xpath("//*[@id=\"signup\"]/form/button"));
    	
    	//Enter Inputs and Click Button
    	Name4.sendKeys("Kevin@#");
    	email4.sendKeys("Admingmail.com");
    	firstaidbtn.click();
        medicalbtn.click();
    	startdate4.sendKeys("01/01/2026");
    	enddate4.sendKeys("12/31/2026");
    	submitbtn.click();
    	
    	//Pause the Browser
    	Thread.sleep(2000);
    	
    	//Verify that the Volunteer Page accepts the Input
    	boolean TestCase4=driver.getCurrentUrl().equals("http://127.0.0.1:8000/volunteer/success/");
    	
    	//Print the Result in Console
    	if(TestCase4) {
    		System.out.println("TestCase 4 is Failed");
    	} else {
    		System.out.println("TestCase 4 is Failed");
    	}
	}
	
	@Test(priority=5)
	public void TestCase5() throws InterruptedException {
		
		//Verify that the input fields are showing alert message when the user leave the fields blank
		WebElement btn=driver.findElement(By.xpath("/html/body/section[1]/div/a"));
		btn.click();
		
		//Wait the Browser
		Thread.sleep(2000);
		
    	//Locate the Fields 
    	WebElement Name5=driver.findElement(By.xpath("//*[@id=\"name\"]"));
    	WebElement email5=driver.findElement(By.xpath("//*[@id=\"contact\"]"));
    	WebElement firstaidbtn=driver.findElement(By.xpath("//*[@id=\"signup\"]/form/div/label[1]"));
    	WebElement medicalbtn=driver.findElement(By.xpath("//*[@id=\"signup\"]/form/div/label[3]"));
    	
    	//Wait the Browser to Locate the Button
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    	WebElement donateitems=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"signup\"]/form/label[5]")));
    	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",donateitems);
    	
    	//Locate the Date Picker
    	WebElement startdate5=driver.findElement(By.xpath("//*[@id=\"availability_start\"]"));
    	WebElement enddate5=driver.findElement(By.xpath("//*[@id=\"availability_end\"]"));
    	
    	//Click the Submit Button
    	WebElement submitbtn=driver.findElement(By.xpath("//*[@id=\"signup\"]/form/button"));
    	
    	//Enter Inputs and Click Button
    	Name5.sendKeys("Kevin@#");
    	email5.sendKeys("");
    	firstaidbtn.click();
        medicalbtn.click();
    	startdate5.sendKeys("01/01/2026");
    	enddate5.sendKeys("12/31/2026");
    	submitbtn.click();
    	
    	//Pause the Browser
    	Thread.sleep(2000);
    	
    	// Get validation message
    	String TestCase5=email5.getAttribute("validationMessage");
    	
    	//Print the Result in Console
    	if(TestCase5.equals("Please fill out this field.")) {
    		System.out.println("TestCase 5 is Passed");
    	} else {
    		System.out.println("TestCase 5 is Failed");
    	}
	}
	
	@Test(priority=6)
	public void TestCase6() throws InterruptedException {
		
		//Verify that the Successful form is redirecting the user to Success page
		WebElement btn=driver.findElement(By.xpath("/html/body/section[1]/div/a"));
		btn.click();
		
		//Wait the Browser
		Thread.sleep(2000);
		
    	//Locate the Fields 
    	WebElement Name6=driver.findElement(By.xpath("//*[@id=\"name\"]"));
    	WebElement email6=driver.findElement(By.xpath("//*[@id=\"contact\"]"));
    	WebElement firstaidbtn=driver.findElement(By.xpath("//*[@id=\"signup\"]/form/div/label[1]"));
    	WebElement medicalbtn=driver.findElement(By.xpath("//*[@id=\"signup\"]/form/div/label[3]"));
    	
    	//Wait the Browser to Locate the Button
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    	WebElement donateitems=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"signup\"]/form/label[5]")));
    	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",donateitems);
    	
    	//Locate the Date Picker
    	WebElement startdate6=driver.findElement(By.xpath("//*[@id=\"availability_start\"]"));
    	WebElement enddate6=driver.findElement(By.xpath("//*[@id=\"availability_end\"]"));
    	
    	//Click the Submit Button
    	WebElement submitbtn=driver.findElement(By.xpath("//*[@id=\"signup\"]/form/button"));
    	
    	//Enter Inputs and Click Button
    	Name6.sendKeys("Kevin");
    	email6.sendKeys("Admin@gmail.com");
    	firstaidbtn.click();
        medicalbtn.click();
    	startdate6.sendKeys("01/01/2026");
    	enddate6.sendKeys("12/31/2026");
    	submitbtn.click();
    	
    	//Pause the Browser
    	Thread.sleep(2000);
    	
    	//Verify that the Volunteer Page accepts the Input
    	boolean TestCase6=driver.getCurrentUrl().equals("http://127.0.0.1:8000/volunteer/success/");
    	
    	//Print the Result in Console
    	if(TestCase6) {
    		System.out.println("TestCase 6 is Passed");
    	} else {
    		System.out.println("TestCase 6 is Failed");
    	}
	}
	
	@AfterTest
    public void CloseWindow() {
    	driver.close();
    }
}
