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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomePage {
	
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void BeforeTest() {
		
		//Set the Instance
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		
		//Set the Path
		driver=new ChromeDriver();
		
		//Open the Window
		driver.get("http://127.0.0.1:8000/home/");
		
		//Maximize the Window
		driver.manage().window().maximize();
	}
    
	@Test(priority=1)
	public void TestCase1() {
		
		//Print the Title in Console
		String Title=driver.getTitle();
		System.out.println("Page Title is: "+Title);
				
		//Check whether the TestCase is fail or Pass in console
		if (Title.equals("SafeHands - Disaster Relief")) {
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
		
		//Verify that the Home Button is Zooming when the cursor moves near it Properly
	    WebElement homebutton=driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[1]/a"));
	    
	    //Move the Cursor near the Home Button
	    Actions actions = new Actions(driver);
	    actions.moveToElement(homebutton).perform();

	    String first=homebutton.getCssValue("transform");
	    Thread.sleep(500);
	    String second=homebutton.getCssValue("transform");

	    
	    //Print the Result in Console
	    if(!first.equals(second)) {
		   	System.out.println("TestCase 3 is Passed");
	    } else {
	    	System.out.println("TestCase 3 is Failed");
	    }
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
		
		//Click the Get Started Button
    	WebElement getstartedbutton=driver.findElement(By.xpath("/html/body/div[2]/a"));
    	getstartedbutton.click();
    	
    	//Wait the Browser
    	Thread.sleep(2000);

    	//Check whether the Page is Opened or Not
    	boolean TestCase11=driver.getCurrentUrl().equals("http://127.0.0.1:8000/verify/");
    	
    	//Check whether the TestCase is fail or Pass in console
    	if (TestCase11) {
    			System.out.println("TestCase 11 is Passed");
    	} else {
    			    System.out.println("TestCase 11 is Failed");
    	}
    	
    	//Return back to previous page
    	driver.navigate().back();
	}
	
	@Test(priority=12)
	public void TestCase12() throws InterruptedException {
		
		//Click the Twitter SideBar Button
    	WebElement twittersidebarbutton=driver.findElement(By.xpath("/html/body/div[1]/a[2]/i"));
    	twittersidebarbutton.click();
    	
    	//Wait the Browser
    	Thread.sleep(2000);

    	//Check whether the Page is Opened or Not
    	boolean TestCase12=driver.getCurrentUrl().equals("https://x.com/TeamSafehands");
    	
    	//Check whether the TestCase is fail or Pass in console
    	if (TestCase12) {
    			System.out.println("TestCase 12 is Passed");
    	} else {
    			    System.out.println("TestCase 12 is Failed");
    	}
    	
    	//Return back to previous page
    	driver.navigate().back();
	}
	
	@Test(priority=13)
	public void TestCase13() throws InterruptedException {
		
		//Click the FaceBook SideBar Button
    	WebElement fbsidebarbutton=driver.findElement(By.xpath("/html/body/div[1]/a[3]"));
    	fbsidebarbutton.click();
    	
    	//Wait the Browser
    	Thread.sleep(2000);

    	//Check whether the Page is Opened or Not
    	boolean TestCase13=driver.getCurrentUrl().equals("https://www.facebook.com/people/Safe-Hands/pfbid02dUU6fDpne62WmQ9FdV3rSGwha1pSDdcHefZVuQzRGQceHSxwUw7ca2EAwUaN5DJkl/");
    	
    	//Check whether the TestCase is fail or Pass in console
    	if (TestCase13) {
    			System.out.println("TestCase 13 is Passed");
    	} else {
    			    System.out.println("TestCase 13 is Failed");
    	}
    	
    	//Return back to previous page
    	driver.navigate().back();
	}
	
	@Test(priority=14)
	public void TestCase14() throws InterruptedException {
		
		//Click the InstaGram SideBar Button
    	WebElement instasidebarbutton=driver.findElement(By.xpath("/html/body/div[1]/a[4]"));
    	instasidebarbutton.click();
    	
    	//Wait the Browser
    	Thread.sleep(2000);

    	//Check whether the Page is Opened or Not
    	boolean TestCase14=driver.getCurrentUrl().equals("https://www.instagram.com/team.safehands/");
    	
    	//Check whether the TestCase is fail or Pass in console
    	if (TestCase14) {
    			System.out.println("TestCase 14 is Passed");
    	} else {
    			    System.out.println("TestCase 14 is Failed");
    	}
    	
    	//Return back to previous page
    	driver.navigate().back();
	}
	
	@Test(priority=15)
	public void TestCase15() throws InterruptedException {
		
		//Click the LinkedIn SideBar Button
    	WebElement linkedinsidebarbutton=driver.findElement(By.xpath("/html/body/div[1]/a[5]"));
    	linkedinsidebarbutton.click();
    	
    	//Wait the Browser
    	Thread.sleep(2000);

    	//Check whether the Page is Opened or Not
    	boolean TestCase15=driver.getCurrentUrl().equals("https://www.linkedin.com/feed/");
    	
    	//Check whether the TestCase is fail or Pass in console
    	if (TestCase15) {
    			System.out.println("TestCase 15 is Passed");
    	} else {
    			    System.out.println("TestCase 15 is Failed");
    	}
    	
    	//Return back to previous page
    	driver.navigate().back();
	}
	
	@Test(priority=16)
	public void TestCase16() throws InterruptedException {
		
		//Wait the Browser to Locate the Button
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement viewCampaignBtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='View Campaigns']")));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",viewCampaignBtn);

		// Wait for scroll settle
		Thread.sleep(1000);

		// Click normally
		wait.until(ExpectedConditions.elementToBeClickable(viewCampaignBtn)).click();
		
		//Check whether the Page is Opened or Not
    	boolean TestCase16=driver.getCurrentUrl().equals("http://127.0.0.1:8000/campaigns/");
    	
    	//Check whether the TestCase is fail or Pass in console
    	if (TestCase16) {
    			System.out.println("TestCase 16 is Passed");
    	} else {
    			    System.out.println("TestCase 16 is Failed");
    	}
    	
    	//Return back to previous page
    	driver.navigate().back();
	}
	
	@Test(priority=17)
	public void TestCase17() throws InterruptedException {
		
		//Wait the Browser to Locate the Button
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement donatenowcardbutton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Donate Now']")));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",donatenowcardbutton);

		// Wait for scroll settle
		Thread.sleep(1000);

		// Click normally
		wait.until(ExpectedConditions.elementToBeClickable(donatenowcardbutton)).click();
				
		//Check whether the Page is Opened or Not
		boolean TestCase17=driver.getCurrentUrl().equals("http://127.0.0.1:8000/donate/");
		    	
		//Check whether the TestCase is fail or Pass in console
		if (TestCase17) {
		   		System.out.println("TestCase 17 is Passed");
		} else {
		 	   System.out.println("TestCase 17 is Failed");
	   }
		    	
		 //Return back to previous page
		  driver.navigate().back();
	}
	
	@Test(priority=18)
	public void TestCase18() throws InterruptedException {
		
		//Wait the Browser to Locate the Button
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement joinuscardbutton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Join Us']")));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",joinuscardbutton);

		// Wait for scroll settle
		Thread.sleep(1000);

		// Click normally
		wait.until(ExpectedConditions.elementToBeClickable(joinuscardbutton)).click();
				
		//Check whether the Page is Opened or Not
		boolean TestCase18=driver.getCurrentUrl().equals("http://127.0.0.1:8000/volunteer/");
		    	
		//Check whether the TestCase is fail or Pass in console
		if (TestCase18) {
		   		System.out.println("TestCase 18 is Passed");
		} else {
		 	   System.out.println("TestCase 18 is Failed");
	   }
		    	
		 //Return back to previous page
		  driver.navigate().back();
	}
	@Test(priority=19)
	public void TestCase19() throws InterruptedException {
		
		//Wait the Browser to Locate the Button
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement reportnowcardbutton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Report Now']")));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",reportnowcardbutton);

		//Wait for scroll settle
		Thread.sleep(1000);

		//Click normally
		wait.until(ExpectedConditions.elementToBeClickable(reportnowcardbutton)).click();
						
		//Check whether the Page is Opened or Not
		boolean TestCase19=driver.getCurrentUrl().equals("http://127.0.0.1:8000/report/");
				    	
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
		WebElement resourcescardbutton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='View Resources']")));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",resourcescardbutton);

		//Wait for scroll settle
		Thread.sleep(1000);

		//Click normally
		wait.until(ExpectedConditions.elementToBeClickable(resourcescardbutton)).click();
						
		//Check whether the Page is Opened or Not
		boolean TestCase20=driver.getCurrentUrl().equals("http://127.0.0.1:8000/emergency/");
				    	
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
		WebElement twitterfooterbutton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/footer/div/div[1]/div[3]/div/a[2]")));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",twitterfooterbutton);

		//Wait for scroll settle
		Thread.sleep(1000);

		//Click normally
		wait.until(ExpectedConditions.elementToBeClickable(twitterfooterbutton)).click();
						
		//Check whether the Page is Opened or Not
		boolean TestCase21=driver.getCurrentUrl().equals("https://x.com/TeamSafehands");
				    	
		//Check whether the TestCase is fail or Pass in console
		if (TestCase21) {
			System.out.println("TestCase 21 is Passed");
		} else {
			System.out.println("TestCase 21 is Failed");
		}
				    	
		//Return back to previous page
		driver.navigate().back();
	}
	
	@Test(priority=22)
	public void TestCase22() throws InterruptedException {
		
		//Wait the Browser to Locate the Button
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement fbfooterbutton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/footer/div/div[1]/div[3]/div/a[3]")));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",fbfooterbutton);

		//Wait for scroll settle
		Thread.sleep(1000);

		//Click normally
		wait.until(ExpectedConditions.elementToBeClickable(fbfooterbutton)).click();
						
		//Check whether the Page is Opened or Not
		boolean TestCase22=driver.getCurrentUrl().equals("https://www.facebook.com/people/Safe-Hands/pfbid02dUU6fDpne62WmQ9FdV3rSGwha1pSDdcHefZVuQzRGQceHSxwUw7ca2EAwUaN5DJkl/");
				    	
		//Check whether the TestCase is fail or Pass in console
		if (TestCase22) {
			System.out.println("TestCase 22 is Passed");
		} else {
			System.out.println("TestCase 22 is Failed");
		}
				    	
		//Return back to previous page
		driver.navigate().back();
	}
	
	@Test(priority=23)
	public void TestCase() throws InterruptedException {
		
		//Wait the Browser to Locate the Button
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement instafooterbutton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/footer/div/div[1]/div[3]/div/a[4]")));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",instafooterbutton);

		//Wait for scroll settle
		Thread.sleep(1000);

		//Click normally
		wait.until(ExpectedConditions.elementToBeClickable(instafooterbutton)).click();
						
		//Check whether the Page is Opened or Not
		boolean TestCase23=driver.getCurrentUrl().equals("https://www.instagram.com/team.safehands/");
				    	
		//Check whether the TestCase is fail or Pass in console
		if (TestCase23) {
			System.out.println("TestCase 23 is Passed");
		} else {
			System.out.println("TestCase 23 is Failed");
		}
				    	
		//Return back to previous page
		driver.navigate().back();
	}
	
	@Test(priority=24)
	public void TestCase24() throws InterruptedException {
		
		//Wait the Browser to Locate the Button
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement linkedinfooterbutton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/footer/div/div[1]/div[3]/div/a[5]")));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 150);",linkedinfooterbutton);

		//Wait for scroll settle
		Thread.sleep(1000);

		//Click normally
		wait.until(ExpectedConditions.elementToBeClickable(linkedinfooterbutton)).click();
						
		//Check whether the Page is Opened or Not
		boolean TestCase24=driver.getCurrentUrl().equals("https://www.linkedin.com/feed/");
				    	
		//Check whether the TestCase is fail or Pass in console
		if (TestCase24) {
			System.out.println("TestCase 24 is Passed");
		} else {
			System.out.println("TestCase 24 is Failed");
		}
				    	
		//Return back to previous page
		driver.navigate().back();
	}
}