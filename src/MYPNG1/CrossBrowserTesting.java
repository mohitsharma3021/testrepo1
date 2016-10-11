package MYPNG1;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting {
	
	WebDriver driver;
	@Test
	@Parameters("browser")
	
	public void myCBT(String browsername){
		
		if(browsername.equalsIgnoreCase("FF")){
			
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
		}
		
		else if(browsername.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "D:\\software\\ForWork\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			
		}
		
		
	}

}
