package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import utility.Driver;
import utility.TestBase;
import utility.configuration;

public class TestClass1  extends TestBase{


	
	@Test
	public void test1() throws InterruptedException
	{
		logger = extent.startTest("Opening google and search selenium");
		
		Driver.Instance.navigate().to(configuration.url.app_url);
		Thread.sleep(3000);
		Driver.Instance.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(5);
		
		Assert.assertEquals(true, true);
		
		logger.log(LogStatus.PASS, "Google open page test passed");
	}
	
	
	@Test
	public void test2() throws InterruptedException
	{
		logger = extent.startTest("Search selenium and verify search results");
		
		Driver.Instance.navigate().to(configuration.url.app_url);
		Thread.sleep(3000);
		Driver.Instance.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		
		Actions ac = new Actions(Driver.Instance);
		ac.sendKeys(Driver.Instance.findElement(By.name("q")), Keys.ENTER);
		
		
	
		//Driver.Instance.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		//Assert.assertEquals(true, Driver.Instance.findElement(By.xpath("//div[@classname='r'])")));
		
    	logger.log(LogStatus.PASS, "Search result test passed");
	}
	
}
