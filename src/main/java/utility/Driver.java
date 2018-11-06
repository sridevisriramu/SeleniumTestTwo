package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {

	
	public static WebDriver Instance = null;

	
	public static void initialize()
	{
		System.out.println("---------------------Inializing driver--------------");
		if(Instance == null)
		{
			if(configuration.Browser.browser.equalsIgnoreCase("ff"))
			{
				Instance = new FirefoxDriver();
			}
			else if(configuration.Browser.browser.equalsIgnoreCase("ie"))
			{
				System.setProperty("webdriver.ie.driver", "C:\\SeleniumExplore\\IEDriverServer.exe");
				Instance = new InternetExplorerDriver();
			}
			else if(configuration.Browser.browser.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\SeleniumExplore\\chromedriver.exe");
				Instance = new ChromeDriver();
			}
		}
		
		Instance.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Instance.manage().window().maximize();
		
	}
	
	
	
	
	public static void closeDriver()
	{
		System.out.println("---------------------closing driver--------------");
		Instance.close();
		Instance = null;
		
	}
	
	
	public static void quitDriver()
	{
		System.out.println("---------------------quitting driver--------------");
		Instance.quit();
		Instance = null;
	}
	
	
}
