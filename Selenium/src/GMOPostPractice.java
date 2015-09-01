import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GMOPostPractice{
	private WebDriver driver;

	@Before
	public void setUP() throws Exception {
		  driver = new FirefoxDriver();
	}
	
	@After
	public void tearDown() throws Exception{
		//driver.quit();
	}
	/**
	 * Go to http://demo.borland.com
	 * click on Enetr Gmo online
	 * Enter 10 sunglasses
	 * Click place an order button
	 * @throws InterruptedException
	 */
	@Test
	public void test() throws InterruptedException {
		driver.get("http://demo.borland.com/gmopost/");
		Thread.sleep(1000);
		
		//Click on button "Enter GMO online 
		driver.findElement(By.name("bSubmit")).click();
		assertEquals("Title check failed for online catalog"  , "OnLine Catalog" ,driver.getTitle());
		System.out.println("URL after clicking 'Enter GMO button':" +driver.getCurrentUrl());
		driver.findElement(By.name("QTY_BOOTS")).sendKeys("10");
		
		//Go back
		driver.navigate().back();
		System.out.println("Title after back action :" +driver.getTitle());
        System.out.println("Title after back action :" +driver.getCurrentUrl());
        
        //go forward
        driver.navigate().forward();
		System.out.println("Title after back action :" +driver.getCurrentUrl());
		System.out.println("Title after back action :" +driver.getTitle());
        System.out.println("Title after back action :" +driver.getCurrentUrl());
        
        //Creating the WebElement helps to execute more than one command as clear and sendkeys
        WebElement InputHikingBoots = driver.findElement(By.name("QTY_BOOTS"));
        InputHikingBoots.clear();
        InputHikingBoots.sendKeys("5");
        Thread.sleep(1000);
        
        //Click button reset form
        driver.findElement(By.name("bReset")).click();
        
        
        
        

		
		
		}
		
	}

//}
