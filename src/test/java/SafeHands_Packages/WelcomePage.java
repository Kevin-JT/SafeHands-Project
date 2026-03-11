package SafeHands_Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WelcomePage {
	
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void BeforeTest() {
		
		//Set the Instance
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Automation\\chromedriver-win64\\chromedriver.exe");
		
		//Set the Path
		driver=new ChromeDriver();
		
		//Open the Window
		driver.get("http://127.0.0.1:8000/");
		
		//Maximize the Window
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=1)
	public void TestCase1() {
	    
		//Print the Title in Console
		String TestCase0=driver.getTitle();
		System.out.println("Page Title is: "+TestCase0);
		
		//Check whether the TestCase is fail or Pass in console
		if (TestCase0.equals("SafeHands - Welcome")) {
		    System.out.println(" TestCase 1 is Passed");
		} else {
		    System.out.println(" TestCase 1 is Failed");
		}
	}
	
	@Test(priority=2)
	public void TestCase2() throws InterruptedException {
		
		//Wait the Browser
		Thread.sleep(2000);
		//Verify that the WebPageLogo is visible 
		WebElement Logo=driver.findElement(By.className("logo"));
		if(Logo.isDisplayed()) {
			System.out.println("TestCase 2 is Failed");
		} else {
			System.out.println("TestCase 2 is Passed");
		}
	}

	@Test(priority=3)
	public void TestCase3() throws InterruptedException {
		
		//Wait the Browser
		Thread.sleep(2000);
		
		
		//Verify that the Heading is visible
	    WebElement text3=driver.findElement(By.className("welcome-text"));
	    String Heading3=text3.getText();
	    System.out.println("Message is: "+Heading3);
	    
	    //Print the Result in Console
	    if(Heading3.contains("Welcome to")) {
	    	System.out.println("TestCase 3 is Passed");
	    } else {
	    	System.out.println("TestCase 3 is Failed");
	    }
	    }
	
	@Test(priority=4)
	public void TestCase4() throws InterruptedException {
		
		//Wait the Browser
		Thread.sleep(4000);
		
		//Verify that the Heading is visible
	    WebElement text4=driver.findElement(By.className("title"));
	    String Heading4=text4.getText();
	    System.out.println("Page Name is: "+Heading4);
	    
	    //Print the Result in Console
	    if(Heading4.contains("SafeHands")) {
		   	System.out.println("TestCase 4 is Passed");
	    } else {
	    	System.out.println("TestCase 4 is Failed");
	    }
	}
	
	@Test(priority=5)
	public void TestCase5() throws InterruptedException {
		
		//Wait the Browser
		Thread.sleep(4000);
		
		//Verify that the SubHeading is visible
	    WebElement text5=driver.findElement(By.className("subtitle"));
	    String Heading5=text5.getText();
	    System.out.println("Page Name is: "+Heading5);
	    
	    //Print the Result in Console
	    if(Heading5.contains("Empowering Disaster Relief Together")) {
		   	System.out.println("TestCase 5 is Passed");
	    } else {
	    	System.out.println("TestCase 5 is Failed");
	    }
	}
	
	@Test(priority=6)
	public void TestCase6() throws InterruptedException {
		
	//Verify that the Spinner is Spinning Properly
    WebElement Spinner=driver.findElement(By.className("spinner"));
    String first=Spinner.getCssValue("transform");
    Thread.sleep(500);
    String second=Spinner.getCssValue("transform");

    
    //Print the Result in Console
    if(!first.equals(second)) {
	   	System.out.println("TestCase 6 is Passed");
    } else {
    	System.out.println("TestCase 6 is Failed");
    }
    }
	
	@Test(priority=7)
	public void TestCase7() throws InterruptedException {
		
		//Verify that the Page is Redirecting to Home page
		//Wait the Browser to Redirect
		Thread.sleep(6000);
		
		//Print the Title in Console
		String Title=driver.getTitle();
		System.out.println("Page Title is: "+Title);
				
		//Print the Result in Console
		if (Title.equals("SafeHands - Disaster Relief")) {
			  System.out.println("TestCase 7 is Passed");
		} else {
		    System.out.println("TestCase 7 is Failed");
		}
	}
	
	@AfterTest
	public void tearDown() {
	    driver.quit();
	}
}
