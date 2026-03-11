package SafeHands_Packages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPage {
	
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void BeforeTest() {
		
		//Set the Instance
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		
		//Set the Path
		driver=new ChromeDriver();
		
		//Open the Window
		driver.get("http://127.0.0.1:8000/verify/");
		
		//Maximize the Window
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void TestCase1() {
		
		//Print the Title in Console
		String Title=driver.getTitle();
		System.out.println("Page Title is: "+Title);
				
		//Check whether the TestCase is fail or Pass in console
		if (Title.equals("Login - SafeHands")) {
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
	public void TestCase11() {
		
		//Give Invalid Input to UserName Field
    	WebElement UserName11=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
    	UserName11.sendKeys("kevin123");
        
    	//Give valid Password
    	WebElement Password11=driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
    	Password11.sendKeys("Kevin@123");
    	
    	//Click the Login Button
    	WebElement LoginButton11=driver.findElement(By.xpath("/html/body/main/div/form/button"));
    	LoginButton11.click();
    	
    	//Wait to Answer
    	WebDriverWait wait11=new WebDriverWait(driver, Duration.ofSeconds(3));
    	
    	//Check whether the Input field accept valid input or not
    	boolean TestCase11=wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/div/form/ul"))).isDisplayed();
    	
    	//Check whether the TestCase is fail or Pass in console
    	if (TestCase11) {
    			System.out.println("TestCase 11 is Passed");
    	} else {
    			    System.out.println("TestCase 11 is Failed");
    	}
	}
	
	@Test(priority=12)
	public void TestCase12() {
		
	//Give Valid UserName
	WebElement UserName12=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
	UserName12.sendKeys("Kevinn");
	
	//Give Invalid Password
	WebElement Password12=driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
	Password12.sendKeys("Kevin");
	
	//Click the LoginButton
	WebElement LoginButton12=driver.findElement(By.xpath("/html/body/main/div/form/button"));
	LoginButton12.click();
	
	//Wait to Answer
	WebDriverWait wait12=new WebDriverWait(driver, Duration.ofSeconds(3));
	
	//Check whether the Input field accept valid input or not
	boolean TestCase12=wait12.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/div/form/ul"))).isDisplayed();
	
	//Check whether the TestCase is fail or Pass in console
	if (TestCase12) {
			System.out.println("TestCase 12 is Passed");
	} else {
			    System.out.println("TestCase 12 is Failed");
	}
	}
	
	@Test(priority=13)
	public void TestCase13() {
		
		//Verify that the UserName field is showing alert message when the field is left blank
    	//Left the UserName field blank
    	WebElement UserName13=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
    	UserName13.sendKeys("");
    	
    	//Enter valid Password
    	WebElement Password13=driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
    	Password13.sendKeys("Kevin@123");
    	
    	//Click the Login Button
    	WebElement LoginButton13=driver.findElement(By.xpath("/html/body/main/div/form/button"));
    	LoginButton13.click();
    	
    	//Locate the error message
    	WebElement UserNameError=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
    	boolean isRequired=UserNameError.getAttribute("required") != null;
    	
    	//Print the Result
    	if(isRequired) {
    		System.out.println("TestCase 13 is Passed");
    	} else {
    		System.out.println("TestCase 13 is Failed");
    	}
	}
	
	@Test(priority=14)
	public void TestCase14() {
		
		//Verify that the Password field is showing error message when the user left the field blank
    	//Give Valid Input to UserName Field
    	WebElement UserName14=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
    	UserName14.sendKeys("Kevinn");
    	
    	//Left the Password Field Blank
    	WebElement Password14=driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
    	Password14.sendKeys("");
    	
    	//Click the Login Button
    	WebElement LoginButton14=driver.findElement(By.xpath("/html/body/main/div/form/button"));
    	LoginButton14.click();
    	
    	//Locate the error message
    	WebElement PasswordError=driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
    	boolean isRequired=PasswordError.getAttribute("required") != null;
    	
    	//Print the Result in Console
    	if(isRequired) {
    		System.out.println("TestCase 14 is Passed");
    	} else {
    		System.out.println("TestCase 14 is Failed");
    	}
	}
	
	@Test(priority=15)
	public void TestCase15() {
		
		//Give the Input to UserName Field
    	WebElement UserName15=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
    	UserName15.sendKeys("Kevinn");
    	
    	//Give the Input to Password field
    	WebElement Password15=driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
    	Password15.sendKeys("Kevin@123");
    	
        //Click the Login Button
    	WebElement LoginButton15=driver.findElement(By.xpath("/html/body/main/div/form/button"));
    	LoginButton15.click();

    	//Check whether the Input field accept valid input or not
    	boolean TestCase15=driver.getCurrentUrl().equals("http://127.0.0.1:8000/home/");
    	
    	//Check whether the TestCase is fail or Pass in console
    	if (TestCase15) {
    			System.out.println("TestCase 15 is Passed");
    	} else {
    			    System.out.println("TestCase 15 is Failed");
    	}
	}
	
	@Test(priority=16)
	public void TestCase16() throws InterruptedException {
		
		//Verify that the Forgot Password Button is redirecting the user to Desired Page
		WebElement forgotpassbtn=driver.findElement(By.xpath("/html/body/main/div/form/div[3]/a"));
    	forgotpassbtn.click();
    	
    	//Wait the Browser
    	Thread.sleep(2000);
  
    	//Give the Input to Forgot Email field
    	WebElement forgotemail=driver.findElement(By.xpath("//*[@id=\"id_email\"]"));
    	forgotemail.sendKeys("Admin@gmail.com");
    	
    	//Click the Reset Button
    	WebElement Button=driver.findElement(By.xpath("/html/body/div/div/div/form/button"));
    	Button.click();
    	
    	//Check whether the Input field accept valid input or not
    	boolean TestCase16=driver.getCurrentUrl().equals("http://127.0.0.1:8000/password_reset/");
    	
    	//Check whether the TestCase is fail or Pass in console
    	if (TestCase16) {
    			System.out.println("TestCase 16 is Passed");
    	} else {
    			    System.out.println("TestCase 16 is Failed");
    	}
	}
	
	@Test(priority=17)
	public void TestCase17() {
		
		//Verify that the user is able to login using Google Account
		WebElement Button=driver.findElement(By.xpath("/html/body/main/div/form/a"));
    	Button.click();
    	
    	//Check whether the Input field accept valid input or not
    	boolean TestCase17=driver.getCurrentUrl().equals("https://accounts.google.com/v3/signin/identifier?opparams=%253F&dsh=S1010386969%3A1772179295291112&client_id=854550519096-ta6mktcemi3hus6keaqgdfn7jti9018m.apps.googleusercontent.com&o2v=1&redirect_uri=http%3A%2F%2F127.0.0.1%3A8000%2Fauth%2Fcomplete%2Fgoogle-oauth2%2F&response_type=code&scope=openid+email+profile&service=lso&state=e2J5imjVYtEwnOUcT3YfFDeQxyOkNIXk&flowName=GeneralOAuthFlow&continue=https%3A%2F%2Faccounts.google.com%2Fsignin%2Foauth%2Fconsent%3Fauthuser%3Dunknown%26part%3DAJi8hAMi5USkRTCP-F_nGmbHSIcRIiU9p1qgPP9-5mHL1R1OvTMX4LmdXYcfFPi2j-ipGPMH7C_5o0wqjSjwE2n5kskuCLf7MERDkGfw7hkkhL4ha8xDeaNp-X7uu2r7avmycegzeOUx521_t_iu_HDY-eh7A-NsGfEj8ibwE_QPadLBqjoMmYnnrki6YnFF717cdeatxQffka398v4D5BOl96xjpF-Ko_edw4aNlDHSv6r9NdcDovh8JdcBvaJdcozoJVq70D22ACIqPhfCnQDPvSWL2ZCwwoRMQWNoA63k0u1Dj_q5x7qjowav-SjxGh7-ubwmDxQmeX3WyY49hWf5JOtl4yo4R4kMlTPmeZMD9rER9ZHu0WePxz50g-xVw0v0C-kBVDxoAhBPs6s6r_epCnb2m3DNffmgKOlBd_y2erTkMzVpe0eerIXtQp_2ZDFE9gedj5GWT23GswcCVgfSVWIeAifhtA%26flowName%3DGeneralOAuthFlow%26as%3DS1010386969%253A1772179295291112%26client_id%3D854550519096-ta6mktcemi3hus6keaqgdfn7jti9018m.apps.googleusercontent.com%26requestPath%3D%252Fsignin%252Foauth%252Fconsent%23&app_domain=http%3A%2F%2F127.0.0.1%3A8000&rart=ANgoxcfxxJpp8PZe5z6dsSYkCAFG-LXy5t33k4DVyDUfXkvu8BcOLMnvTtB2PZX7AtsVJiqRIfxeD77dDcoZpoLzIC6NB2kj0zXE7yJowvslIaxKn7kWA6c");
    	
    	//Check whether the TestCase is fail or Pass in console
    	if (TestCase17) {
    			System.out.println("TestCase 17 is Passed");
    	} else {
    			    System.out.println("TestCase 17 is Failed");
    	}
	}
	
	@Test(priority=18)
	public void TestCase18() {
		
		//Verify that the user is able to Redirect to Register Page
		WebElement Button=driver.findElement(By.xpath("/html/body/main/div/form/p/a"));
		Button.click();
		
		//Check whether the Input field accept valid input or not
    	boolean TestCase18=driver.getCurrentUrl().equals("http://127.0.0.1:8000/register/");
    	
    	//Check whether the TestCase is fail or Pass in console
    	if (TestCase18) {
    			System.out.println("TestCase 18 is Passed");
    	} else {
    			    System.out.println("TestCase 18 is Failed");
    	}
	}
	
	@Test(priority=19)
	public void TestCase19() throws InterruptedException {
		
		//Wait the Browser to Locate the Button
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement twitterfooterbutton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/footer/div/p[2]/a[2]")));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",twitterfooterbutton);

		// Wait for scroll settle
		Thread.sleep(1000);

		// Click normally
		wait.until(ExpectedConditions.elementToBeClickable(twitterfooterbutton)).click();
						
		//Check whether the Page is Opened or Not
		boolean TestCase19=driver.getCurrentUrl().equals("https://x.com/TeamSafehands");
				    	
		//Check whether the TestCase is fail or Pass in console
		if (TestCase19) {
			System.out.println("TestCase 19 is Passed");
		} else {
			System.out.println("TestCase 19 is Failed");
		}
				    	
		//Return back to previous page
		driver.navigate().back();
	}
	
	@Test(priority=20)
	public void TestCase20() throws InterruptedException {
		
		//Wait the Browser to Locate the Button
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement instafooterbutton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/footer/div/p[2]/a[3]")));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",instafooterbutton);

		// Wait for scroll settle
		Thread.sleep(1000);

		// Click normally
		wait.until(ExpectedConditions.elementToBeClickable(instafooterbutton)).click();
						
		//Check whether the Page is Opened or Not
		boolean TestCase20=driver.getCurrentUrl().equals("https://www.instagram.com/team.safehands/");
				    	
		//Check whether the TestCase is fail or Pass in console
		if (TestCase20) {
			System.out.println("TestCase 20 is Passed");
		} else {
			System.out.println("TestCase 20 is Failed");
		}
				    	
		//Return back to previous page
		driver.navigate().back();
	}
	
	@Test(priority=21)
	public void TestCase21() throws InterruptedException {
		
		//Wait the Browser to Locate the Button
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement linkedinfooterbutton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/footer/div/p[2]/a[4]")));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",linkedinfooterbutton);

		// Wait for scroll settle
		Thread.sleep(1000);

		// Click normally
		wait.until(ExpectedConditions.elementToBeClickable(linkedinfooterbutton)).click();
						
		//Check whether the Page is Opened or Not
		boolean TestCase21=driver.getCurrentUrl().equals("https://www.linkedin.com/feed/");
				    	
		//Check whether the TestCase is fail or Pass in console
		if (TestCase21) {
			System.out.println("TestCase 21 is Passed");
		} else {
			System.out.println("TestCase 21 is Failed");
		}
				    	
		//Return back to previous page
		driver.navigate().back();
	}
	
	@AfterTest
	public void tearDown() {
	    driver.quit();
	}
}

