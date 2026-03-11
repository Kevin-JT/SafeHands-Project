package SafeHands_Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegisterPage {
	
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void BeforeTest() {
		
		//Set the Instance
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		
		//Set the Path
		driver=new ChromeDriver();
		
		//Open the Window
		driver.get("http://127.0.0.1:8000/register/");
		
		//Maximize the Window
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void TestCase1() {
		
		//Print the Title in Console
		String Title=driver.getTitle();
		System.out.println("Page Title is: "+Title);
				
		//Check whether the TestCase is fail or Pass in console
		if (Title.equals("Register")) {
			  System.out.println(" TestCase 1 is Passed");
		} else {
		      System.out.println(" TestCase 1 is Failed");
		}
	}
	
	@Test(priority=2)
	public void TestCase2() throws InterruptedException {
		
		//Verify that the PageLogo is Spinning Properly
	    WebElement Spinner=driver.findElement(By.className("logo"));
	    
	    //Move the Cursor near the PageLogo
	    Actions actions = new Actions(driver);
	    actions.moveToElement(Spinner).perform();

	    String first=Spinner.getCssValue("transform");
	    Thread.sleep(500);
	    String second=Spinner.getCssValue("transform");

	    
	    //Print the Result in Console
	    if(!first.equals(second)) {
		   	System.out.println("TestCase 2 is Passed");
	    } else {
	    	System.out.println("TestCase 2 is Failed");
	    }
	}
	
	@Test(priority=3)
	public void TestCase3() throws InterruptedException {
		
		//Click the Campaigns Button
    	WebElement Homebutton=driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/li[1]/a"));
    	Homebutton.click();
    	
    	//Wait the Browser
    	Thread.sleep(2000);

    	//Check whether the Page is Opened or Not
    	boolean TestCase3=driver.getCurrentUrl().equals("http://127.0.0.1:8000/home/");
    	
    	//Check whether the TestCase is fail or Pass in console
    	if (TestCase3) {
    			System.out.println("TestCase 3 is Passed");
    	} else {
    			    System.out.println("TestCase 3 is Failed");
    	}
    	
    	//Return back to previous page
    	driver.navigate().back();
	}
	
	@Test(priority=4)
	public void TestCase4() throws InterruptedException {
		
		//Click the Campaigns Button
    	WebElement campaignsbutton=driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/li[2]/a"));
    	campaignsbutton.click();
    	
    	//Wait the Browser
    	Thread.sleep(2000);

    	//Check whether the Page is Opened or Not
    	boolean TestCase4=driver.getCurrentUrl().equals("http://127.0.0.1:8000/campaigns/");
    	
    	//Check whether the TestCase is fail or Pass in console
    	if (TestCase4) {
    			System.out.println("TestCase 4 is Passed");
    	} else {
    			    System.out.println("TestCase 4 is Failed");
    	}
    	
    	//Return back to previous page
    	driver.navigate().back();
	}
	
	@Test(priority=5)
	public void TestCase5() throws InterruptedException {
		
		//Click the Donate Button
    	WebElement donatebutton=driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[3]/a"));
    	donatebutton.click();
    	
    	//Wait the Browser
    	Thread.sleep(2000);

    	//Check whether the Page is Opened or Not
    	boolean TestCase5=driver.getCurrentUrl().equals("http://127.0.0.1:8000/donate/");
    	
    	//Check whether the TestCase is fail or Pass in console
    	if (TestCase5) {
    			System.out.println("TestCase 5 is Passed");
    	} else {
    			    System.out.println("TestCase 5 is Failed");
    	}
    	
    	//Return back to previous page
    	driver.navigate().back();
	}
	
	@Test(priority=6)
	public void TestCase6() throws InterruptedException {
		
		//Click the Volunteer Button
    	WebElement volunteerbutton=driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[4]/a"));
    	volunteerbutton.click();
    	
    	//Wait the Browser
    	Thread.sleep(2000);

    	//Check whether the Page is Opened or Not
    	boolean TestCase6=driver.getCurrentUrl().equals("http://127.0.0.1:8000/volunteer/");
    	
    	//Check whether the TestCase is fail or Pass in console
    	if (TestCase6) {
    			System.out.println("TestCase 6 is Passed");
    	} else {
    			    System.out.println("TestCase 6 is Failed");
    	}
    	
    	//Return back to previous page
    	driver.navigate().back();
	}
	
	@Test(priority=7)
	public void TestCase7() throws InterruptedException {
		
		//Click the Report Issue Button
    	WebElement reportbutton=driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[5]/a"));
    	reportbutton.click();
    	
    	//Wait the Browser
    	Thread.sleep(2000);

    	//Check whether the Page is Opened or Not
    	boolean TestCase7=driver.getCurrentUrl().equals("http://127.0.0.1:8000/report/");
    	
    	//Check whether the TestCase is fail or Pass in console
    	if (TestCase7) {
    			System.out.println("TestCase 7 is Passed");
    	} else {
    			    System.out.println("TestCase 7 is Failed");
    	}
    	
    	//Return back to previous page
    	driver.navigate().back();
	}
	
	@Test(priority=8)
	public void TestCase8() throws InterruptedException {
		
		//Click the Emergency Button
    	WebElement emergencybutton=driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[6]/a"));
    	emergencybutton.click();
    	
    	//Wait the Browser
    	Thread.sleep(2000);

    	//Check whether the Page is Opened or Not
    	boolean TestCase8=driver.getCurrentUrl().equals("http://127.0.0.1:8000/emergency/");
    	
    	//Check whether the TestCase is fail or Pass in console
    	if (TestCase8) {
    			System.out.println("TestCase 8 is Passed");
    	} else {
    			    System.out.println("TestCase 8 is Failed");
    	}
    	
    	//Return back to previous page
    	driver.navigate().back();
	}
	
	@Test(priority=9)
	public void TestCase9() throws InterruptedException {
		
		//Click the Menu Button
    	WebElement menubutton=driver.findElement(By.xpath("/html/body/nav/div/div[2]/button"));
        menubutton.click();
        
        //Click the Login Button
    	WebElement loginbutton=driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[1]/a"));
        loginbutton.click();
        
        //Wait the Browser
    	Thread.sleep(2000);

    	//Check whether the Page is Opened or Not
    	boolean TestCase9=driver.getCurrentUrl().equals("http://127.0.0.1:8000/verify/");
    	
    	//Check whether the TestCase is fail or Pass in console
    	if (TestCase9) {
    			System.out.println("TestCase 9 is Passed");
    	} else {
    			    System.out.println("TestCase 9 is Failed");
    	}
    	
    	//Return back to previous page
    	driver.navigate().back();
	}
	
	@Test(priority=10)
	public void TestCase10() throws InterruptedException {
		
		//Click the Menu Button
    	WebElement menubutton=driver.findElement(By.xpath("/html/body/nav/div/div[2]/button"));
        menubutton.click();
        
        //Click the Register Button
    	WebElement registerbutton=driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a"));
        registerbutton.click();
        
        //Wait the Browser
    	Thread.sleep(2000);

    	//Check whether the Page is Opened or Not
    	boolean TestCase10=driver.getCurrentUrl().equals("http://127.0.0.1:8000/register/");
    	
    	//Check whether the TestCase is fail or Pass in console
    	if (TestCase10) {
    			System.out.println("TestCase 10 is Passed");
    	} else {
    			    System.out.println("TestCase 10 is Failed");
    	}
    	
    	//Return back to previous page
    	driver.navigate().back();
	}
	
	@Test(priority=11)
	public void TestCase11() throws InterruptedException {
		
		//Verify that the input fields are accepting valid inputs
    	//Locate the Fields 
    	WebElement UserName11=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
    	WebElement email11=driver.findElement(By.xpath("//*[@id=\"id_email\"]"));
    	WebElement Password11=driver.findElement(By.xpath("//*[@id=\"id_password1\"]"));
    	WebElement confirmPassword11=driver.findElement(By.xpath("//*[@id=\"id_password2\"]"));
    	
    	//Select option for DropDown list
    	Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"id_role\"]")));
    	WebElement LoginButton11=driver.findElement(By.xpath("/html/body/main/section/div/form/button"));
    	
    	//Enter Inputs and Click Button
    	UserName11.sendKeys("Kevinjt");
    	email11.sendKeys("Admin@gmail.com");
    	Password11.sendKeys("Kichu@123");
    	confirmPassword11.sendKeys("Kichu@123");
    	dropdown.selectByIndex(2);
    	LoginButton11.click();
    	
    	//Pause the Browser
    	Thread.sleep(2000);
    	
    	//Verify that the Registration Page accepts the Input
    	boolean TestCase11=driver.getTitle().equals("TypeError at /register/");
    	
    	//Print the Result in Console
    	if(TestCase11) {
    		System.out.println("TestCase 11 is Passed");
    	} else {
    		System.out.println("TestCase 11 is Failed");
    	}
	}
	
	@Test(priority=12)
	public void TestCase12() throws InterruptedException {
		
		//Verify that the input fields are not accepting invalid inputs
    	//Locate the Fields 
    	WebElement UserName12=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
    	WebElement email12=driver.findElement(By.xpath("//*[@id=\"id_email\"]"));
    	WebElement Password12=driver.findElement(By.xpath("//*[@id=\"id_password1\"]"));
    	WebElement confirmPassword12=driver.findElement(By.xpath("//*[@id=\"id_password2\"]"));
    	
    	//Select option for DropDown list
    	Select dropdown12=new Select(driver.findElement(By.xpath("//*[@id=\"id_role\"]")));
    	WebElement LoginButton12=driver.findElement(By.xpath("/html/body/main/section/div/form/button"));
    	
    	//Enter Inputs and Click Button
    	UserName12.sendKeys("Kevin@*");
    	email12.sendKeys("Admin@gmail.com");
    	Password12.sendKeys("Kevin@6567");
    	confirmPassword12.sendKeys("Kevin@56567");
    	dropdown12.selectByIndex(2);
    	LoginButton12.click();
    	
    	//Pause the Browser
    	Thread.sleep(2000);
    	
    	//Verify that the Registration Page accepts the Input
    	boolean TestCase12=driver.getTitle().equals("Register");
    	
    	//Print the Result in Console
    	if(TestCase12) {
    		System.out.println("TestCase 12 is Passed");
    	} else {
    		System.out.println("TestCase 12 is Failed");
    	}
	}
	
	@Test(priority=13)
	public void TestCase13() throws InterruptedException {
		
		//Verify that the input fields are showing alert message when the field is left blank
    	//Locate the Fields 
    	WebElement UserName13=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
    	WebElement email13=driver.findElement(By.xpath("//*[@id=\"id_email\"]"));
    	WebElement Password13=driver.findElement(By.xpath("//*[@id=\"id_password1\"]"));
    	WebElement confirmPassword13=driver.findElement(By.xpath("//*[@id=\"id_password2\"]"));
    	
    	//Select option for DropDown list
    	Select dropdown13=new Select(driver.findElement(By.xpath("//*[@id=\"id_role\"]")));
    	WebElement LoginButton13=driver.findElement(By.xpath("/html/body/main/section/div/form/button"));
    	
    	//Enter Inputs and Click Button
    	UserName13.sendKeys("");
    	email13.sendKeys("Admin@gmail.com");
    	Password13.sendKeys("Kevin@6567");
    	confirmPassword13.sendKeys("Kevin@56567");
    	dropdown13.selectByIndex(2);
    	LoginButton13.click();
    	
    	//Pause the Browser
    	Thread.sleep(2000);
    	
    	//Verify that the Field is showing alert message
    	//Locate the error message
    	WebElement PasswordError=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
    	boolean isRequired=PasswordError.getAttribute("required") != null;
    	
    	//Print the Result in Console
    	if(isRequired) {
    		System.out.println("TestCase 13 is Passed");
    	} else {
    		System.out.println("TestCase 13 is Failed");
    	}
	}
	
	@Test(priority=14)
	public void TestCase14() {
		
		//Verify that the user is able to Redirect to Login Page
		WebElement Button=driver.findElement(By.xpath("/html/body/main/section/div/form/p/a"));
		Button.click();
		
		//Check whether the Input field accept valid input or not
    	boolean TestCase14=driver.getCurrentUrl().equals("http://127.0.0.1:8000/login/");
    	
    	//Check whether the TestCase is fail or Pass in console
    	if (TestCase14) {
    			System.out.println("TestCase 14 is Passed");
    	} else {
    			    System.out.println("TestCase 14 is Failed");
    	}
	}
	
	@AfterTest
	public void tearDown() {
	    driver.quit();
	}
}
