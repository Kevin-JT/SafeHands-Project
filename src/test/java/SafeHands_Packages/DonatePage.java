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

public class DonatePage {
	
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void BeforeTest() {
		
		//Set the Instance
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		
		//Set the Path
		driver=new ChromeDriver();
		
		//Open the Window
		driver.get("http://127.0.0.1:8000/donate/");
		
		//Maximize the Window
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void TestCase1() {
		
		//Print the Title in Console
		String Title=driver.getTitle();
		System.out.println("Page Title is: "+Title);
				
		//Check whether the TestCase is fail or Pass in console
		if (Title.equals("Donate | Safe Hands")) {
			  System.out.println("TestCase 1 is Passed");
		} else {
		      System.out.println("TestCase 1 is Failed");
		}
	}
	
	@Test(priority=2)
	public void TestCase2() throws InterruptedException {
		
		//Verify that the Donate button is redirecting the user to desired section of the Page
		//Locate the Button
		WebElement button=driver.findElement(By.xpath("/html/body/header/div/a"));
		button.click();
		
		//Wait the Browser
		Thread.sleep(2000);
		
		//Get an Text from the Donate Form
		WebElement passage=driver.findElement(By.xpath("//*[@id=\"donation-form\"]/h2"));
		String text=passage.getText();
		System.out.println("Actual Text: " + text);
		String expectedText="Donation Form";

		if (text.equals(expectedText)) {
		    System.out.println("TestCase 2 is Passed");
		} else {
		    System.out.println("TestCase 2 is Failed");
		}
	}
	
	@Test(priority=3)
	public void TestCase3() throws InterruptedException {
		
		//Verify that the input fields are accepting valid inputs
		WebElement donatenowbtn=driver.findElement(By.xpath("/html/body/header/div/a"));
		donatenowbtn.click();
		
		//Wait the Browser
		Thread.sleep(2000);
		
    	//Locate the Fields 
    	WebElement Name3=driver.findElement(By.xpath("//*[@id=\"id_name\"]"));
    	WebElement email3=driver.findElement(By.xpath("//*[@id=\"id_email\"]"));
    	WebElement cashbtn=driver.findElement(By.xpath("//*[@id=\"donation-form\"]/form/div[3]/button[3]"));
    	
    	//Select option for DropDown list
    	Select dropdown=new Select(driver.findElement(By.xpath("//*[@id=\"method\"]")));
    	
    	//Wait the Browser to Locate the Button
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    	WebElement donateitems=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"donation-form\"]/form/label[4]")));
    	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",donateitems);

    	WebElement checkbox3=driver.findElement(By.xpath("//*[@id=\"donation-form\"]/form/div[5]/label[2]/input"));
    	WebElement otheritems3=driver.findElement(By.xpath("//*[@id=\"other-resources\"]"));
    	WebElement submitbtn3=driver.findElement(By.xpath("//*[@id=\"donation-form\"]/form/button"));
    	
    	//Enter Inputs and Click Button
    	Name3.sendKeys("Kevin");
    	email3.sendKeys("Admin@gmail.com");
    	cashbtn.click();
    	dropdown.selectByIndex(2);
    	checkbox3.click();
    	otheritems3.sendKeys("Bed Sheets");
    	submitbtn3.click();
    	
    	//Pause the Browser
    	Thread.sleep(2000);
    	
    	//Verify that the Registration Page accepts the Input
    	boolean TestCase3=driver.getCurrentUrl().equals("http://127.0.0.1:8000/donate/#donation-form");
    	
    	//Print the Result in Console
    	if(TestCase3) {
    		System.out.println("TestCase 3 is Passed");
    	} else {
    		System.out.println("TestCase 3 is Failed");
    	}
	}
	
	@Test(priority=4)
	public void TestCase4() throws InterruptedException {
		
		//Verify that the input fields are not accepting invalid Name
		WebElement donatenowbtn=driver.findElement(By.xpath("/html/body/header/div/a"));
		donatenowbtn.click();
		
		//Wait the Browser
		Thread.sleep(2000);
		
    	//Locate the Fields 
    	WebElement Name4=driver.findElement(By.xpath("//*[@id=\"id_name\"]"));
    	WebElement email4=driver.findElement(By.xpath("//*[@id=\"id_email\"]"));
    	WebElement cashbtn4=driver.findElement(By.xpath("//*[@id=\"donation-form\"]/form/div[3]/button[3]"));
    	
    	//Select option for DropDown list
    	Select dropdown=new Select(driver.findElement(By.xpath("//*[@id=\"method\"]")));
    	
    	//Wait the Browser to Locate the Button
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    	WebElement donateitems=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"donation-form\"]/form/label[4]")));
    	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",donateitems);

    	WebElement checkbox4=driver.findElement(By.xpath("//*[@id=\"donation-form\"]/form/div[5]/label[2]/input"));
    	WebElement otheritems4=driver.findElement(By.xpath("//*[@id=\"other-resources\"]"));
    	WebElement submitbtn4=driver.findElement(By.xpath("//*[@id=\"donation-form\"]/form/button"));
    	
    	//Enter Inputs and Click Button
    	Name4.sendKeys("Kevin@34");
    	email4.sendKeys("Admin@Sgmail.com");
    	cashbtn4.click();
    	dropdown.selectByIndex(4);
    	checkbox4.click();
    	otheritems4.sendKeys("Bed Sheets");
    	submitbtn4.click();
    	
    	//Pause the Browser
    	Thread.sleep(2000);
    	
    	//Verify that the Registration Page accepts the Input
    	boolean TestCase4=driver.getCurrentUrl().equals("http://127.0.0.1:8000/donate/#donation-form");
    	
    	//Print the Result in Console
    	if(TestCase4) {
    		System.out.println("TestCase 4 is Failed");
    	} else {
    		System.out.println("TestCase 4 is Passed");
    	}
	}
	
	@Test(priority=5)
	public void TestCase5() throws InterruptedException {
		
		//Verify that the input fields are not accepting invalid Email
		WebElement donatenowbtn=driver.findElement(By.xpath("/html/body/header/div/a"));
		donatenowbtn.click();
		
		//Wait the Browser
		Thread.sleep(2000);
		
    	//Locate the Fields 
    	WebElement Name5=driver.findElement(By.xpath("//*[@id=\"id_name\"]"));
    	WebElement email5=driver.findElement(By.xpath("//*[@id=\"id_email\"]"));
    	WebElement cashbtn5=driver.findElement(By.xpath("//*[@id=\"donation-form\"]/form/div[3]/button[3]"));
    	
    	//Select option for DropDown list
    	Select dropdown=new Select(driver.findElement(By.xpath("//*[@id=\"method\"]")));
    	
    	//Wait the Browser to Locate the Button
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    	WebElement donateitems=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"donation-form\"]/form/label[4]")));
    	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",donateitems);

    	WebElement checkbox5=driver.findElement(By.xpath("//*[@id=\"donation-form\"]/form/div[5]/label[2]/input"));
    	WebElement otheritems5=driver.findElement(By.xpath("//*[@id=\"other-resources\"]"));
    	WebElement submitbtn5=driver.findElement(By.xpath("//*[@id=\"donation-form\"]/form/button"));
    	
    	//Enter Inputs and Click Button
    	Name5.sendKeys("Kevin");
    	email5.sendKeys("Admingmail.com");
    	cashbtn5.click();
    	dropdown.selectByIndex(4);
    	checkbox5.click();
    	otheritems5.sendKeys("Bed Sheets");
    	submitbtn5.click();
    	
    	//Pause the Browser
    	Thread.sleep(2000);
    	
    	//Get validation message
    	String TestCase5=email5.getAttribute("validationMessage");
    	
    	//Print the Result in Console
    	if(TestCase5 != null && !TestCase5.isEmpty()) {
    		System.out.println("TestCase 5 is Passed");
    	} else {
    		System.out.println("TestCase 5 is Failed");
    	}
	}
	
	@Test(priority=6)
	public void TestCase6() throws InterruptedException {
		
		//Verify that the Page is not accepting if the field are left blank
		WebElement donatenowbtn=driver.findElement(By.xpath("/html/body/header/div/a"));
		donatenowbtn.click();
		
		//Wait the Browser
		Thread.sleep(2000);
		
    	//Locate the Fields 
    	WebElement Name6=driver.findElement(By.xpath("//*[@id=\"id_name\"]"));
    	WebElement email6=driver.findElement(By.xpath("//*[@id=\"id_email\"]"));
    	WebElement cashbtn6=driver.findElement(By.xpath("//*[@id=\"donation-form\"]/form/div[3]/button[3]"));
    	
    	//Select option for DropDown list
    	Select dropdown=new Select(driver.findElement(By.xpath("//*[@id=\"method\"]")));
    	
    	//Wait the Browser to Locate the Button
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    	WebElement donateitems=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"donation-form\"]/form/label[4]")));
    	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",donateitems);

    	WebElement checkbox6=driver.findElement(By.xpath("//*[@id=\"donation-form\"]/form/div[5]/label[2]/input"));
    	WebElement otheritems6=driver.findElement(By.xpath("//*[@id=\"other-resources\"]"));
    	WebElement submitbtn6=driver.findElement(By.xpath("//*[@id=\"donation-form\"]/form/button"));
    	
    	//Enter Inputs and Click Button
    	Name6.sendKeys("kevin");
    	email6.sendKeys("");
    	cashbtn6.click();
    	dropdown.selectByIndex(4);
    	checkbox6.click();
    	otheritems6.sendKeys("Bed Sheets");
    	submitbtn6.click();
    	
    	//Pause the Browser
    	Thread.sleep(2000);
    	
    	// Get validation message
    	String TestCase6=email6.getAttribute("validationMessage");
    	
    	//Print the Result in Console
    	if(TestCase6.equals("Please fill out this field.")) {
    		System.out.println("TestCase 6 is Passed");
    	} else {
    		System.out.println("TestCase 6 is Failed");
    	}
	}
	
	@Test(priority=7)
	public void TestCase7() throws InterruptedException {
		
		//Verify that the Donate page is Redirecting the user to Download Receipt page
		WebElement donatenowbtn=driver.findElement(By.xpath("/html/body/header/div/a"));
		donatenowbtn.click();
		
		//Wait the Browser
		Thread.sleep(2000);
		
    	//Locate the Fields 
    	WebElement Name7=driver.findElement(By.xpath("//*[@id=\"id_name\"]"));
    	WebElement email7=driver.findElement(By.xpath("//*[@id=\"id_email\"]"));
    	WebElement cashbtn7=driver.findElement(By.xpath("//*[@id=\"donation-form\"]/form/div[3]/button[3]"));
    	
    	//Select option for DropDown list
    	Select dropdown=new Select(driver.findElement(By.xpath("//*[@id=\"method\"]")));
    	
    	//Wait the Browser to Locate the Button
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    	WebElement donateitems=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"donation-form\"]/form/label[4]")));
    	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",donateitems);

    	WebElement checkbox7=driver.findElement(By.xpath("//*[@id=\"donation-form\"]/form/div[5]/label[2]/input"));
    	WebElement otheritems7=driver.findElement(By.xpath("//*[@id=\"other-resources\"]"));
    	WebElement submitbtn7=driver.findElement(By.xpath("//*[@id=\"donation-form\"]/form/button"));
    	
    	//Enter Inputs and Click Button
    	Name7.sendKeys("Kevin");
    	email7.sendKeys("Admin@gmail.com");
    	cashbtn7.click();
    	dropdown.selectByIndex(2);
    	checkbox7.click();
    	otheritems7.sendKeys("Bed Sheets");
    	submitbtn7.click();
    	
    	//Pause the Browser
    	Thread.sleep(2000);
    	
    	//Verify that the Registration Page accepts the Input
    	boolean TestCase7=driver.getCurrentUrl().equals("http://127.0.0.1:8000/donate/#donation-form");
    	
    	//Print the Result in Console
    	if(TestCase7) {
    		System.out.println("TestCase 7 is Passed");
    	} else {
    		System.out.println("TestCase 7 is Failed");
    	}
	}
	
	@AfterTest
    public void CloseWindow() {
    	driver.close();
    }
}
