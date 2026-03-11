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

public class EmergencyResourcesPage {

	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void BeforeTest() {
		
		//Set the Instance
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		
		//Set the Path
		driver=new ChromeDriver();
		
		//Open the Window
		driver.get("http://127.0.0.1:8000/emergency_resources/");
		
		//Maximize the Window
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void TestCase1() {
		
		//Locate the Emergency Resource Page Button
		WebElement pagebtn=driver.findElement(By.xpath("/html/body/div/div/a"));
		pagebtn.click();
		
		//Print the Title in Console
		String Title=driver.getTitle();
		System.out.println("Page Title is: "+Title);
				
		//Check whether the TestCase is fail or Pass in console
		if (Title.equals("Emergency Resources")) {
			  System.out.println("TestCase 1 is Passed");
		} else {
		      System.out.println("TestCase 1 is Failed");
		}
	}
	
	@Test(priority=2)
	public void TestCase2() throws InterruptedException {
		
		//Select option for DropDown list
    	Select dropdown=new Select(driver.findElement(By.xpath("//*[@id=\"filter\"]")));
    	dropdown.selectByIndex(0);
    	
    	//Wait the Browser to Locate the Button
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    	WebElement donateitems=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section[1]/div/div[3]/div/div[2]/p[3]/strong")));
    	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",donateitems);
    	
    	//Locate the Get Direction Button
    	WebElement directionbtn=driver.findElement(By.xpath("/html/body/section[1]/div/div[1]/div/div[3]/a"));
    	directionbtn.click();
    	
    	//Wait the Browser
    	Thread.sleep(5000);
    	
    	//Verify that the Emergency Resource Page accepts the Input
    	boolean TestCase2=driver.getCurrentUrl().contains("google.com");
    	
    	//Print the Result in Console
    	if(TestCase2) {
    		System.out.println("TestCase 2 is Passed");
    	} else {
    		System.out.println("TestCase 2 is Failed");
    	}
	}
	
	@Test(priority=3)
	public void TestCase3() throws InterruptedException {
		
		//Verify that the input fields are accepting valid inputs
		//Wait the Browser to Locate the Button
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    	WebElement donateitems=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section[2]/h2")));
    	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",donateitems);
    	
    	//Locate the Fields 
    	WebElement Name3=driver.findElement(By.xpath("/html/body/section[2]/form/div[1]/input"));
    	WebElement number3=driver.findElement(By.xpath("/html/body/section[2]/form/div[2]/input"));
    	WebElement location3=driver.findElement(By.xpath("/html/body/section[2]/form/div[3]/input"));
    	
    	//Select option for DropDown list
    	Select resourcedropdown=new Select(driver.findElement(By.xpath("//*[@id=\"helpTypeSelect\"]")));
    	Select disasterdropdown=new Select(driver.findElement(By.xpath("/html/body/section[2]/form/div[5]/select")));
    	WebElement submitbtn3=driver.findElement(By.xpath("/html/body/section[2]/form/button"));
    	
    	//Give the Inputs
    	Name3.sendKeys("Kevin");
    	number3.sendKeys("1234567890");
    	location3.sendKeys("Trivandrum");
    	resourcedropdown.selectByIndex(2);
    	disasterdropdown.selectByIndex(2);
    	submitbtn3.click();
    	
    	//Wait the Browser
    	Thread.sleep(2000);
    	
    	//Read the Success Message
    	WebElement message=driver.findElement(By.xpath("/html/body/div/h2"));
    	String actualtext=message.getText();

    	//Print the Result in Console
    	if(actualtext.contains("🚨 SOS Request Sent Successfully!")) {
    		System.out.println("TestCase 3 is Passed");
    	} else {
    		System.out.println("TestCase 3 is Failed");
    	}
	}
	
	@Test(priority=4)
	public void TestCase() throws InterruptedException {
		
		//Verify that the input fields are not accepting invalid inputs
		//Wait the Browser to Locate the Button
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    	WebElement donateitems=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section[2]/h2")));
    	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",donateitems);
    	
    	//Locate the Fields 
    	WebElement Name4=driver.findElement(By.xpath("/html/body/section[2]/form/div[1]/input"));
    	WebElement number4=driver.findElement(By.xpath("/html/body/section[2]/form/div[2]/input"));
    	WebElement location4=driver.findElement(By.xpath("/html/body/section[2]/form/div[3]/input"));
    	
    	//Select option for DropDown list
    	Select resourcedropdown=new Select(driver.findElement(By.xpath("//*[@id=\"helpTypeSelect\"]")));
    	Select disasterdropdown=new Select(driver.findElement(By.xpath("/html/body/section[2]/form/div[5]/select")));
    	WebElement submitbtn4=driver.findElement(By.xpath("/html/body/section[2]/form/button"));
    	
    	//Give the Inputs
    	Name4.sendKeys("Kevin");
    	number4.sendKeys("12345");
    	location4.sendKeys("Trivandrum");
    	resourcedropdown.selectByIndex(2);
    	disasterdropdown.selectByIndex(2);
    	submitbtn4.click();
    	
    	//Wait the Browser
    	Thread.sleep(2000);
    	
    	//Get validation message
    	String TestCase4=number4.getAttribute("validationMessage");
    	
    	//Print the Result in Console
    	if(TestCase4.equals("Invalid Input")) {
    		System.out.println("TestCase 4 is Passed");
    	} else {
    		System.out.println("TestCase 4 is Failed");
    	}
	}
	
	@Test(priority=5)
	public void TestCase5() throws InterruptedException {
		
		//Verify that the input fields are showing alert message when the user leave the field blank
		//Wait the Browser to Locate the Button
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    	WebElement donateitems=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section[2]/h2")));
    	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",donateitems);
    	
    	//Locate the Fields 
    	WebElement Name5=driver.findElement(By.xpath("/html/body/section[2]/form/div[1]/input"));
    	WebElement number5=driver.findElement(By.xpath("/html/body/section[2]/form/div[2]/input"));
    	WebElement location5=driver.findElement(By.xpath("/html/body/section[2]/form/div[3]/input"));
    	
    	//Select option for DropDown list
    	Select resourcedropdown=new Select(driver.findElement(By.xpath("//*[@id=\"helpTypeSelect\"]")));
    	Select disasterdropdown=new Select(driver.findElement(By.xpath("/html/body/section[2]/form/div[5]/select")));
    	WebElement submitbtn5=driver.findElement(By.xpath("/html/body/section[2]/form/button"));
    	
    	//Give the Inputs
    	Name5.sendKeys("Kevin");
    	number5.sendKeys("");
    	location5.sendKeys("Trivandrum");
    	resourcedropdown.selectByIndex(2);
    	disasterdropdown.selectByIndex(2);
    	submitbtn5.click();
    	
    	//Wait the Browser
    	Thread.sleep(2000);
    	
    	//Get validation message
    	String TestCase5=number5.getAttribute("validationMessage");
    	
    	//Print the Result in Console
    	if(TestCase5.equals("Please fill out this field.")) {
    		System.out.println("TestCase 5 is Passed");
    	} else {
    		System.out.println("TestCase 5 is Failed");
    	}
	}
	
	@Test(priority=6)
    public void TestCase6() {

		//Verify that the Phone number is showing dialer PopUp
        //Locate phone link
        WebElement phone=driver.findElement(By.xpath("/html/body/section[3]/div/div[2]/div/div/p[1]/a"));

        //Get href value
        String href6=phone.getAttribute("href");

        //heck tel protocol
        if (href6.startsWith("tel:")) {
            System.out.println("TestCase 6 is Passed");
        } else {
            System.out.println("TestCase 6 is Failed");
        }
    }
	
	 @Test(priority=7)
     public void TestCase7() {
    	 
    	 //Verify that the Download Button is enabled
    	 WebElement downloadbtn7=driver.findElement(By.xpath("/html/body/section[4]/a"));
 		 boolean TestCase7=downloadbtn7.isEnabled();
 		 if(TestCase7) {
 			System.out.println("TestCase 7 is Passed");
 		 }else {
 			System.out.println("TestCase 7 is Failed");
 		 }
     }
	 
	 @Test(priority=8)
	 public void TestCase8() throws InterruptedException {
		 
		//Verify that the Share button is Redirecting the user to Desired Page
		//Locate the Button
	    WebElement sharebtn=driver.findElement(By.xpath("/html/body/section[5]/a"));
	    sharebtn.click();
	    
	    //Wait the Browser
	    Thread.sleep(3000);
	    
	    //Verify that the Registration Page accepts the Input
    	boolean TestCase8=driver.getTitle().equals("Share on WhatsApp");
    	
    	//Print the Result in Console
    	if(TestCase8) {
    		System.out.println("TestCase 8 is Passed");
    	} else {
    		System.out.println("TestCase 8 is Failed");
    	}
	 }
	 
	 @Test(priority=6)
	 public void TestCase9() {

	     //Verify that the Phone number is showing dialer PopUp
	     //Locate phone link
	     WebElement phone=driver.findElement(By.xpath("/html/body/section[7]/ul/li[3]/a"));

	     //Get href value
	     String href9=phone.getAttribute("href");

	     //heck tel protocol
	     if (href9.startsWith("tel:")) {
	         System.out.println("TestCase 9 is Passed");
	     } else {
	         System.out.println("TestCase 9 is Failed");
	     }
	 }
	 
	 @AfterTest
	 public void CloseWindow() {
	  driver.close();
	 }
}
