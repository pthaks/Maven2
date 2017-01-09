package org.pthaks.Maven2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class AppTest
{
	@Test
	public void pfunc()
	{
		
		String projectPath = System.getProperty("user.dir"); //+ "\" + "utility\geckodriver.exe";
		String FFdriverPath = projectPath.replaceAll("\\\\", "//");
		FFdriverPath = FFdriverPath + "//utility//geckodriver.exe";
		
		System.out.println("FFdriverPath - " + FFdriverPath);
		
		System.setProperty("webdriver.gecko.driver", FFdriverPath);
		WebDriver driver = new FirefoxDriver();
		
		try
		{
			driver.get("http://www.google.com");
			
			//Assert.assertEquals(driver.getTitle(), "Not google");
			
			System.out.println(driver.getTitle());
			
			System.out.println("Google opened..........Priya");

		}
		catch (Exception e)
		{
			System.out.println(e.getStackTrace());
		}
				
		driver.close();
		driver.quit();
	}
}
